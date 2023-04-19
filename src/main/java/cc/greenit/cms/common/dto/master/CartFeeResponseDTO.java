package cc.greenit.cms.common.dto.master;

import lombok.Data;

/**
 * packageName    : cc.greenit.cms.domain.master.dto
 * fileName       : CartFeeResponseDTO
 * author         : zaid
 * date           : 2023/04/18
 * description    :
 */
@Data
public class CartFeeResponseDTO {
    private Integer hole;
    private Integer cartAmount;
    private Integer cartCost;
    private Integer cartVat;
}
