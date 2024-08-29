package cc.greenit.cms.common.dto.booking;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * packageName    : cc.greenit.cms.common.dto.booking
 * fileName       : PatchReservationRequestDTO
 * author         : jinpyo
 * date           : 8/29/24
 * description    :
 */
@Data
public class PatchReservationRequestDTO {
    @NotEmpty
    private String companyId;
    @NotEmpty
    private String dateId;
    @NotEmpty
    private String courseId;
    @NotEmpty
    private String timeId;
    private String rsvNo;
    @NotEmpty
    private String patchDateId;
    @NotEmpty
    private String patchCourseId;
    @NotEmpty
    private String patchTimeId;
    private String patchTimeSeq;
    @NotEmpty
    private String agencyCode;
    @NotNull
    private Integer patchPerson;
    @Size(max = 50)
    private String remark;
}
