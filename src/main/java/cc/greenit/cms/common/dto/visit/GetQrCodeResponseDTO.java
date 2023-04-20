package cc.greenit.cms.common.dto.visit;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * packageName    : cc.greenit.cms.domain.visit.dto
 * fileName       : GetQrCodeResponseDTO
 * author         : zaid
 * date           : 2023/04/18
 * description    :
 */
/** QR코드 생성 Response */
@Data
public class GetQrCodeResponseDTO {
    private String qrCode;
    private LocalDateTime limitDateTime;
}
