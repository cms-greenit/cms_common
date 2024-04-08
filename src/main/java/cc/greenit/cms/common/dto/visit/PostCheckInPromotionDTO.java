package cc.greenit.cms.common.dto.visit;

import lombok.Data;

import jakarta.validation.constraints.NotEmpty;

/**
 * packageName    : cc.greenit.cms.common.dto.visit
 * fileName       : PostCheckInPromotionDTO
 * author         : soonhyeong
 * date           : 2023/07/13
 * description    :
 */
@Data
public class PostCheckInPromotionDTO {
    @NotEmpty
    private String companyId;
    @NotEmpty
    private String checkinId;
}
