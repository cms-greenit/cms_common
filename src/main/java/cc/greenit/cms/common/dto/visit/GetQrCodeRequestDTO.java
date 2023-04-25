package cc.greenit.cms.common.dto.visit;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * packageName    : cc.greenit.cms.domain.visit.dto
 * fileName       : GetQrCodeRequestDTO
 * author         : zaid
 * date           : 2023/04/18
 * description    : QR코드 생성 Request
 */
@Data
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
    private String memberGender;
    @NotEmpty
    private String memberPhone;
    private String bagName;
}
