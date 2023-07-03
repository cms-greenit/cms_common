package cc.greenit.cms.common.error;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * packageName    : cc.greenit.cms.common
 * fileName       : ErrorCode
 * author         : soonhyeong
 * date           : 2023/04/12
 * description    : cms error
 */
public enum ErrorCode {
    INVALID_INPUT_VALUE(400, "C001", "유효하지 않은 파라미터"),
    INVALID_TYPE_VALUE(400, "C002", "유효하지 않은 파라미터 타입"),
    WRONG_APPROACH(401, "C008", "잘못된 접근"),
    HANDLE_ACCESS_DENIED(403, "C003", "API 인증 실패"),
    NOT_SUPPORTED_API(403, "C004", "제공하지 않는 API 입니다."),
    METHOD_NOT_ALLOWED(405, "C005", "허용되지 않은 메소드 입니다."),
    API_SERVER_ERROR(406, "C006", "골프장 API 통신 오류"),
    ENTITY_NOT_FOUND(400, "C007", "데이터 조회 실패"),
    INTERNAL_SERVER_ERROR(500, "C100", "Server Error"),

    TIME_NOT_FOUND(400, "B001", "예약 타임이 존재하지 않습니다."),
    BOOKING_NOT_POSSIBLE(400, "B002", "예약할 수 없는 타임입니다."),
    TIME_NOT_OPEN(400, "B003", "오픈되지 않은 예약입니다."),
    OVER_PERSONNEL(400, "B004", "예약인원을 확인하세요."),
    ALREADY_BOOKING(400, "B005", "이미 예약된 타임입니다."),
    BOOKING_NOT_FOUND(400, "B006", "예약이 존재하지 않습니다."),
    CANCEL_NOT_POSSIBLE(400, "B007", "취소할 수 없는 예약입니다."),
    BOOKING_MEMBER_NOT_FOUND(400, "B008", "예약자(동반자)가 존재하지 않습니다."),
    OTHER_AGENCY_RESERVATION(400, "B009", "다른 에이전시의 예약입니다."),
    RESERVATION_PERSONNEL_EXCEEDED(400, "B010", "라운드 인원이 초과되었습니다."),
    COURSE_NOT_FOUND(400, "B011", "코스 정보가 존재하지 않습니다."),
    COMPANY_NOT_FOUND(400, "B012", "골프장 정보가 존재하지 않습니다."),
    LOCK_TIME(400, "B013", "예약 진행중인 타임입니다."),
    PLACEBO_PERIOD_RESERVATION(400, "B014", "위약기간에 포함되어 취소가 불가능합니다."),
    COMPANY_BLOCK_TIME(400, "B015", "해당 골프장에서 블록한 타임입니다."),
    DUPLICATION_MEMBER(400, "B016", "이미 등록된 동반자 입니다."),
    MEMBER_SETTING_ERROR(400, "B017", "동반자 설정 오류"),
    PRICE_NOT_FOUND(400, "B018", "요금정보가 존재하지 않습니다."),
    MEMBER_NOT_FOUND(400, "B019", "회원정보를 찾을 수 없습니다"),
    RESERVATION_SETTING_ERROR(400, "B020", "예약 설정 오류"),
    AGENCY_NOT_OPEN(400, "B021", "오픈되지 않은 타임입니다."),
    PLACEBO_PERIOD_MEMBER(400, "B022", "위약기간에 포함되어있는 회원입니다."),
    DUPLICATION_BOOKING_SAME_DAY(400, "B023", "같은날 예약이 존재합니다."),
    WEEKEND_RESERVATION_EXCEEDED(400, "B024", "주말 예약횟수를 초과하였습니다."),
    WEEKDAY_RESERVATION_EXCEEDED(400, "B025", "주중 예약횟수를 초과하였습니다."),
    VISIT_PROHIBITED_MEMBER(400, "B026", "내장 금지 회원입니다."),
    BOOKING_PROHIBITED_MEMBER(400, "B027", "예약 금지 회원입니다."),
    AGENCY_NOT_FOUND(400, "B028", "존재하지 않는 에이전시입니다."),
    RESERVATION_CANCEL_ERROR(400, "B029", "예약 취소 오류"),
    ALREADY_CHECKIN_BOOKING(400, "B030", "이미 체크인 된 예약입니다."),
    BOOKING_OWNER_NOT_DELETE(400, "B031", "예약자는 삭제할 수 없습니다."),

    CHECKIN_SETTING_ERROR(400, "V001", "체크인 설정 오류"),
    LOCKER_SETTING_ERROR(400, "V002", "락커 설정 오류"),
    QRCODE_SETTING_ERROR(400, "V003", "QRCode 설정 오류"),
    CHECKIN_NOT_FOUND(400, "V004", "체크인 정보가 없습니다."),
    ALREADY_CHECKIN(400, "V005", "이미 체크인 된 고객입니다."),
    CHECKIN_ONLY_TODAY(400, "V006", "체크인은 당일만 가능합니다."),
    QRCODE_NOT_FOUND(400, "V007", "없는 qrcode 입니다."),
    GET_CHECKIN_ONLY_TODAY(400, "V008", "체크인 조회는 당일만 가능합니다."),
    ;

    private int status;
    private String code;
    private String message;

    ErrorCode(int status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    private static final Map<String, String> codeMap = Collections
            .unmodifiableMap(
                    Stream.of(values()).collect(Collectors.toMap(ErrorCode::getCode, ErrorCode::name))
            );

    public static ErrorCode of(final String code) {
        return ErrorCode.valueOf(codeMap.get(code));
    }
}
