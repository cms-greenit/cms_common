package cc.greenit.cms.common.dto.booking;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * packageName    : cc.greenit.cms.common.dto.booking
 * fileName       : PostBookingRemarkRequestDTO
 * author         : jinpyo
 * date           : 10/24/24
 * description    :
 */
@Data
@Builder
public class PostBookingRemarkRequestDTO {
    @NotEmpty
    private String companyId;
    @NotEmpty
    private String dateId;
    @NotEmpty
    private String timeId;
    @NotEmpty
    private String courseId;
    @NotEmpty
    private String remark;
    @NotEmpty
    private String agencyCode;
}
