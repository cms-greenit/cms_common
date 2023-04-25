package cc.greenit.cms.common.dto.booking;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * packageName    : cc.greenit.cms.common.dto.booking
 * fileName       : GetOpenTimeRequestDTO
 * author         : zaid
 * date           : 2023/04/24
 * description    :
 */
@Data
public class GetOpenTimeRequestDTO {
    @NotEmpty
    private String companyId;
}
