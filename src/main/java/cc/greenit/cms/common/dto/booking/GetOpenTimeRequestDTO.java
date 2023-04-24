package cc.greenit.cms.common.dto.booking;

import lombok.Builder;
import lombok.Data;

/**
 * packageName    : cc.greenit.cms.common.dto.booking
 * fileName       : GetOpenTimeRequestDTO
 * author         : zaid
 * date           : 2023/04/24
 * description    :
 */
@Data
@Builder
public class GetOpenTimeRequestDTO {
    private String companyId;
}
