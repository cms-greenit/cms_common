package cc.greenit.cms.common.dto.master;

import lombok.Data;

/**
 * packageName    : cc.greenit.cms.domain.master.dto
 * fileName       : CartFeeResponseDTO
 * author         : zaid
 * date           : 2023/04/18
 * description    : 카트 요금 조회 Response
 */
@Data
public class GetCartFeeResponseDTO {
    private Integer hole;
    private Integer cartAmount;
    private Integer cartCost;
    private Integer cartVat;
}
