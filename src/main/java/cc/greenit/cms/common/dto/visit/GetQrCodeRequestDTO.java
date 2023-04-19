package cc.greenit.cms.common.dto.visit;

import cc.greenit.cms.common.dto.common.Gender;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * packageName    : cc.greenit.cms.domain.visit.dto
 * fileName       : GetQrCodeRequestDTO
 * author         : zaid
 * date           : 2023/04/18
 * description    :
 */
@Data
@Builder
public class GetQrCodeRequestDTO {
    @NotEmpty
    private String companyId;
    @NotEmpty
    private String dateId;
    @NotEmpty
    private String timeId;
    @NotEmpty
    private String courseId;
    @NotEmpty
    private String memberName;
    private Gender memberGender;
    @NotEmpty
    private String memberPhone;
    private String bagName;
}
