package cc.greenit.cms.common.dto.booking;

import lombok.Data;

/**
 * packageName    : cc.greenit.cms.domain.booking.dto
 * fileName       : OtherStieReservationResponseDTO
 * author         : zaid
 * date           : 2023/04/19
 * description    :
 */
@Data
public class OtherSiteReservationResponseDTO {
    private String rsvNo;
    private String companyId;
    private String dateId;
    private String courseId;
    private String timeId;
    private Integer person;
    private String agencyCode;
    private String agencyName;
}
