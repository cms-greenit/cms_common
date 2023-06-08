package cc.greenit.cms.common.dto.booking;

import lombok.Data;

/**
 * packageName    : cc.greenit.cms.domain.booking.dto
 * fileName       : TimeListResponseDTO
 * author         : zaid
 * date           : 2023/04/18
 * description    : 예약가능 날짜 조회 Request
 */
@Data
public class GetTimeListResponseDTO {
    private String dateId;
    private String courseId;
    private String timeId;
    private String timeSeq;
    private Integer part;
    private Integer hole;
    private Integer minPersonnel;
    // CADDY("캐디동반"), SELF("셀프라운드"), DRIVING("드라이빙캐디"), MARSHALL("마샬캐디"), INTERN("인턴캐디"), SMILE("미소지기캐디"), SPROUT("새싹캐디");
    private String caddyType;
    private String greenFee;
    private String cartFee;
    private String erpRsvName;
    private String erpRsvNo;
    private String erpRsvPhone;
    private String erpRsvAgencyCode;
    private String erpRsvPersonnel;
    private String erpRsvGreenFee;
    private String isErpBlock;
    private String isErpEmpty;
    // HOMEPAGE, TEL, GOLAGA, OTHER
    private String agencyType;
    private String agencyName;
}
