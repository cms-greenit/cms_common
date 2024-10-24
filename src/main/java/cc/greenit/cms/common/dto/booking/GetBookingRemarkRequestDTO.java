package cc.greenit.cms.common.dto.booking;

import javax.validation.constraints.NotEmpty;

/**
 * packageName    : cc.greenit.cms.common.dto.booking
 * fileName       : GetBookingRemarkRequestDTO
 * author         : jinpyo
 * date           : 10/24/24
 * description    :
 */
public class GetBookingRemarkRequestDTO {
    @NotEmpty
    private String companyId;
    @NotEmpty
    private String dateId;
    @NotEmpty
    private String timeId;
    @NotEmpty
    private String courseId;
}
