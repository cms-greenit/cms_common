package cc.greenit.cms.common.dto.visit;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * packageName    : cc.greenit.cms.domain.visit.dto
 * fileName       : CheckInRequestDTO
 * author         : zaid
 * date           : 2023/04/18
 * description    : 체크인 Request
 */
@Data
public class PostCheckInRequestDTO {
    @NotEmpty
    private String companyId;
    @NotEmpty
    private String dateId;
    @NotEmpty
    private String courseId;
    @NotEmpty
    private String timeId;
    private String timeSeq;
    private String rsvNo;
    private String agencyCode;
    private String memberSeq;
    @NotEmpty
    private String memberName;
    @NotEmpty
    @Size(min = 11, max = 11)
    private String memberPhone;
    private String memberGender;
    private String bagName;
    private boolean useLocker;
}
