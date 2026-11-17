package cc.greenit.cms.common.remark;

import cc.greenit.cms.common.dto.booking.PostReservationRequestDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CentralRemarkSupportTest {

    private static final Map<String, String> LABELS = new HashMap<String, String>() {{
        put("SELF", "셀프라운드(노캐디)");
        put("DRIVING", "드라이빙캐디");
    }};

    @Test
    void null_은_칸을_건드리지_않는다() {
        CentralRemarkSupport.Result r = CentralRemarkSupport.resolve(null, null, null, null);
        assertNull(r.getValue());
        assertFalse(r.isRejected());
    }

    @Test
    void 빈값은_빈값으로_기록한다() {
        assertEquals("", CentralRemarkSupport.resolve("", null, null, null).getValue());
    }

    @Test
    void 토큰_치환() {
        CentralRemarkSupport.Result r = CentralRemarkSupport.resolve("{node:agencyTitle}(인터넷예약)/{node:caddy}",
                LABELS, () -> "CMS", () -> "SELF");
        assertEquals("CMS(인터넷예약)/셀프라운드(노캐디)", r.getValue());
    }

    @Test
    void 대행사명_없거나_캐디값이_표에_없으면_빈값() {
        assertEquals("()/", CentralRemarkSupport.resolve("{node:agencyTitle}()/{node:caddy}",
                LABELS, () -> null, () -> "CADDY").getValue());
    }

    @Test
    void 남은_central_문법은_거절() {
        assertTrue(CentralRemarkSupport.resolve("CMS(${agencyName})", null, null, null).isRejected());
    }

    @Test
    void 모르는_node_토큰은_거절() {
        assertTrue(CentralRemarkSupport.resolve("{node:foo}", null, null, null).isRejected());
        assertTrue(CentralRemarkSupport.resolve("{node:caddy", LABELS, null, () -> "SELF").isRejected());
    }

    @Test
    void 캐디_원천이나_문구표가_없으면_거절() {
        assertTrue(CentralRemarkSupport.resolve("{node:caddy}", LABELS, null, null).isRejected());
        assertTrue(CentralRemarkSupport.resolve("{node:caddy}", null, null, () -> "SELF").isRejected());
    }

    @Test
    void 두_칸을_풀고_거절된_칸만_null() {
        PostReservationRequestDTO p = new PostReservationRequestDTO(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        p.setRemarkAuthority("CENTRAL");
        p.setRemarkMain("CMS(a)/{node:caddy}");
        p.setRemarkSub("{node:agencyTitle}(인터넷예약)");
        p.setRemarkCaddyLabels(LABELS);
        CentralRemarkSupport.Cells c = CentralRemarkSupport.resolveCells(p, () -> "CMS", null);
        assertNull(c.getMain());
        assertEquals("CMS(인터넷예약)", c.getSub());
    }

    @Test
    void JSON_새_필드는_setter_로_채워지고_기존_필드는_그대로() throws Exception {
        ObjectMapper om = new ObjectMapper().registerModule(new ParameterNamesModule());
        String json = "{\"companyId\":\"1\",\"dateId\":\"20261113\",\"courseId\":\"A\",\"timeId\":\"0700\",\"agencyCode\":\"X\","
                + "\"person\":4,\"memberName\":\"홍\",\"memberPhone\":\"01012345678\",\"memberGender\":\"M\",\"remark\":\"CMS(a)/1만\","
                + "\"remarkAuthority\":\"CENTRAL\",\"remarkMain\":\"M\",\"remarkSub\":\"\",\"remarkCaddyLabels\":{\"SELF\":\"노캐디\"}}";
        PostReservationRequestDTO dto = om.readValue(json, PostReservationRequestDTO.class);
        assertEquals("CMS(a)/1만", dto.getRemark());
        assertEquals(4, dto.getPerson());
        assertTrue(CentralRemarkSupport.isCentral(dto));
        assertEquals("M", dto.getRemarkMain());
        assertEquals("", dto.getRemarkSub());
        assertEquals(Collections.singletonMap("SELF", "노캐디"), dto.getRemarkCaddyLabels());

        PostReservationRequestDTO legacy = om.readValue("{\"companyId\":\"1\",\"remark\":\"r\"}", PostReservationRequestDTO.class);
        assertFalse(CentralRemarkSupport.isCentral(legacy));
        assertNull(legacy.getRemarkMain());
    }
}
