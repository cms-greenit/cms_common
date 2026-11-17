package cc.greenit.cms.common.remark;

import cc.greenit.cms.common.dto.booking.PostReservationRequestDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

/**
 * central 이 확정한 비고(remarkAuthority=CENTRAL)의 node 토큰 치환과 방어 규칙 — 레거시 노드 공용.
 * node_api 의 CentralRemarkResolver 와 같은 규칙이다. 칸을 거절하면 [비고 미기록] 에러 로그를 남긴다.
 *
 * <ul>
 *   <li>허용 토큰은 {node:agencyTitle}, {node:caddy} 둘뿐이다.</li>
 *   <li>${ 가 남았거나, 모르는 {node:…} 가 있거나, {node:caddy} 를 풀 수 없으면 그 칸은 기록하지 않는다
 *       ({@link Result#value} = null, {@link Result#rejectReason} 에 사유). 예약은 막지 않는다.</li>
 *   <li>{node:agencyTitle} 조회값이 없으면 "" 로 치환한다.</li>
 *   <li>{node:caddy} 는 공통 캐디값(SELF/DRIVING/CADDY…)을 remarkCaddyLabels 에서 찾고, 표에 없으면 "".</li>
 * </ul>
 */
public final class CentralRemarkSupport {

    private static final Logger log = LoggerFactory.getLogger(CentralRemarkSupport.class);

    public static final String AUTHORITY_CENTRAL = "CENTRAL";
    public static final String AGENCY_TITLE = "{node:agencyTitle}";
    public static final String CADDY = "{node:caddy}";
    private static final String NODE_PREFIX = "{node:";
    private static final Set<String> ALLOWED = new HashSet<>(Arrays.asList(AGENCY_TITLE, CADDY));

    private CentralRemarkSupport() {
    }

    public static boolean isCentral(PostReservationRequestDTO params) {
        return params != null && AUTHORITY_CENTRAL.equals(params.getRemarkAuthority());
    }

    /**
     * @param text        central 이 보낸 칸 문구(remarkMain / remarkSub). null = 칸을 건드리지 않음
     * @param caddyLabels 요청의 remarkCaddyLabels
     * @param agencyTitle {node:agencyTitle} 원천. 토큰이 있을 때만 호출한다. 원천이 없는 업장은 null
     * @param caddyCode   {node:caddy} 원천 — 공통 캐디값. 원천이 없는 업장은 null
     */
    public static Result resolve(String text, Map<String, String> caddyLabels,
                                 Supplier<String> agencyTitle, Supplier<String> caddyCode) {
        if (text == null) {
            return Result.skip();
        }
        if (text.contains("${")) {
            return Result.reject("central 템플릿 문법이 남아 있음");
        }
        String unknown = firstUnknownToken(text);
        if (unknown != null) {
            return Result.reject("허용 목록 밖 node 토큰 " + unknown);
        }

        String out = text;
        if (out.contains(CADDY)) {
            if (caddyCode == null || caddyLabels == null) {
                return Result.reject("{node:caddy} 를 풀 수 없음(캐디 원천 또는 문구표 없음)");
            }
            String code = caddyCode.get();
            String label = code == null ? null : caddyLabels.get(code);
            out = out.replace(CADDY, label == null ? "" : label);
        }
        if (out.contains(AGENCY_TITLE)) {
            String title = agencyTitle == null ? null : agencyTitle.get();
            out = out.replace(AGENCY_TITLE, title == null ? "" : title);
        }
        return Result.write(out);
    }

    /**
     * MAIN·SUB 두 칸을 한 번에 푼다. 거절된 칸은 null(기록 안 함)로 돌려주고 [비고 미기록] 에러 로그를 남긴다.
     * 레거시 노드는 이 결과를 매퍼 파라미터에 실어 MAIN/SUB 칸을 조건부로 기록한다.
     *
     * @param agencyTitle {node:agencyTitle} 원천. 원천이 없는 업장은 null
     * @param caddyCode   {node:caddy} 원천 — 공통 캐디값. 원천이 없는 업장은 null
     */
    public static Cells resolveCells(PostReservationRequestDTO params,
                                     Supplier<String> agencyTitle, Supplier<String> caddyCode) {
        String main = cell(params, "MAIN", params.getRemarkMain(), agencyTitle, caddyCode);
        String sub = cell(params, "SUB", params.getRemarkSub(), agencyTitle, caddyCode);
        return new Cells(main, sub);
    }

    private static String cell(PostReservationRequestDTO params, String name, String text,
                               Supplier<String> agencyTitle, Supplier<String> caddyCode) {
        Result r = resolve(text, params.getRemarkCaddyLabels(), agencyTitle, caddyCode);
        if (r.isRejected()) {
            log.error("[비고 미기록] 예약은 진행, 비고 칸만 비움 {}", alarmDetail(params, name, text, r.getRejectReason()));
        }
        return r.getValue();
    }

    /** 레포가 남기는 경보 문구(로그·슬랙 공용). */
    public static String alarmDetail(PostReservationRequestDTO params, String cell, String text, String reason) {
        return String.format("companyId=%s date=%s course=%s time=%s cell=%s%nreason=%s%ntext=%s",
                params.getCompanyId(), params.getDateId(), params.getCourseId(), params.getTimeId(), cell, reason, text);
    }

    private static String firstUnknownToken(String text) {
        int cursor = 0;
        while (true) {
            int start = text.indexOf(NODE_PREFIX, cursor);
            if (start < 0) return null;
            int end = text.indexOf('}', start);
            if (end < 0) return text.substring(start);
            String token = text.substring(start, end + 1);
            if (!ALLOWED.contains(token)) return token;
            cursor = end + 1;
        }
    }

    /** 기록할 MAIN·SUB. null = 그 칸을 기록하지 않음. */
    public static final class Cells {
        private final String main;
        private final String sub;

        Cells(String main, String sub) {
            this.main = main;
            this.sub = sub;
        }

        public String getMain() { return main; }
        public String getSub() { return sub; }
    }

    /** value: 기록할 문자열(null = 그 칸을 기록하지 않음). rejectReason: 방어 규칙에 걸린 사유(걸리지 않았으면 null). */
    public static final class Result {
        private final String value;
        private final String rejectReason;

        private Result(String value, String rejectReason) {
            this.value = value;
            this.rejectReason = rejectReason;
        }

        static Result skip() { return new Result(null, null); }
        static Result write(String value) { return new Result(value, null); }
        static Result reject(String reason) { return new Result(null, reason); }

        public String getValue() { return value; }
        public String getRejectReason() { return rejectReason; }
        public boolean isRejected() { return rejectReason != null; }
    }
}
