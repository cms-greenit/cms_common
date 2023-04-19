package cc.greenit.cms.common.dto.visit;

import cc.greenit.cms.common.dto.common.Gender;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * packageName    : cc.greenit.cms.domain.visit.dto
 * fileName       : CheckInRequestDTO
 * author         : zaid
 * date           : 2023/04/18
 * description    :
 */
@Data
public class CheckInRequestDTO {
    @NotEmpty
    private String companyId;
    @NotEmpty
    private String dateId;
    @NotEmpty
    private String courseId;
    @NotEmpty
    private String timeId;
    @NotEmpty
    private String agencyCode;
    @NotEmpty
    private String memberName;
    @NotEmpty
    @Size(min = 11, max = 11)
    private String memberPhone;
    private Gender memberGender;
    private String bagName;
    private boolean useLocker;
}
