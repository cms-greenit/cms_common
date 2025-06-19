package cc.greenit.cms.common.dto.booking;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * packageName    : cc.greenit.cms.common.dto.booking
 * fileName       : PatchBookingBookerInfoRequestDTO
 * author         : jinpyo
 * date           : 6/13/25
 * description    :
 */
@Data
@Builder
public class PatchBookingBookerInfoRequestDTO {
    @NotEmpty
    private String companyId;
    @NotEmpty
    private String dateId;
    @NotEmpty
    private String timeId;
    @NotEmpty
    private String courseId;

    private String memberName;

    private String memberPhone;
    @NotEmpty
    private String agencyCode;

}
