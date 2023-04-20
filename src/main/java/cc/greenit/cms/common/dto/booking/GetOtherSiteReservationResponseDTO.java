package cc.greenit.cms.common.dto.booking;

import lombok.Data;

/**
 * packageName    : cc.greenit.cms.domain.booking.dto
 * fileName       : OtherStieReservationResponseDTO
 * author         : zaid
 * date           : 2023/04/19
 * description    : 예약 조회(홈페이지) Response
 */
@Data
public class GetOtherSiteReservationResponseDTO {
    private String rsvNo;
    private String companyId;
    private String dateId;
    private String courseId;
    private String timeId;
    private Integer person;
    private String agencyCode;
    private String agencyName;
}
