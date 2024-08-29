package cc.greenit.cms.common.dto.booking;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * packageName    : cc.greenit.cms.common.dto.booking
 * fileName       : PatchReservationMemberRequestDTO
 * author         : jinpyo
 * date           : 8/29/24
 * description    :
 */
@Data
public class PatchReservationMemberRequestDTO {
    @NotEmpty
    private String companyId;
    @NotEmpty
    private String dateId;
    @NotEmpty
    private String timeId;
    @NotEmpty
    private String courseId;
    private String timeSeq;
    @NotEmpty
    private String agencyCode;
    @NotEmpty
    private String memberName;
    @NotEmpty
    private String memberPhone;
}
