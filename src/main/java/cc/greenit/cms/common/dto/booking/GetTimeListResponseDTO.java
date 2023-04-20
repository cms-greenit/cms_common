package cc.greenit.cms.common.dto.booking;

import lombok.Data;

/**
 * packageName    : cc.greenit.cms.domain.booking.dto
 * fileName       : TimeListResponseDTO
 * author         : zaid
 * date           : 2023/04/18
 * description    :
 */
/** 예약가능 날짜 조회 Request  */
@Data
public class GetTimeListResponseDTO {
    private String dateId;
    private String courseId;
    private String timeId;
    private Integer part;
    private Integer hole;
    private Integer minPersonnel;
    private String caddyType;
    private String greenFee;
    private String erpRsvName;
    private String erpRsvNo;
    private String erpRsvPhone;
    private String isErpBlock;
    private String agencyType;
    private String agencyName;
}
