package cc.greenit.cms.common.dto.booking;

import lombok.Data;

/**
 * packageName    : cc.greenit.cms.domain.booking.dto
 * fileName       : OpenTimeListResponseDTO
 * author         : zaid
 * date           : 2023/04/19
 * description    :
 */
@Data
public class OpenTimeListResponseDTO {
    private String companyId;
    private String dateId;
    private String timeId;
    private String courseId;
    private String agencyCode;
}
