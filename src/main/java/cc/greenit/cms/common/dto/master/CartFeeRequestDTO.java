package cc.greenit.cms.common.dto.master;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * packageName    : cc.greenit.cms.domain.master.dto
 * fileName       : CartFeeRequestDTO
 * author         : zaid
 * date           : 2023/04/18
 * description    :
 */
@Data
public class CartFeeRequestDTO {
    @NotEmpty
    private String companyId;
}
