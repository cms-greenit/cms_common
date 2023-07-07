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
    private String timeSeq;
    @NotEmpty
    private String memberName;
    private String memberGender;
    private String memberPhone;
    private String rsvNo;
    private String memberSeq;
    private String bagName;
}
