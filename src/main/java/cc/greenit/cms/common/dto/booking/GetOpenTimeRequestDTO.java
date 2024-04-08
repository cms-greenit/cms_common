package cc.greenit.cms.common.dto.booking;

import lombok.Builder;
import lombok.Data;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

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
    @Size(min = 8, max = 8)
    private String dateId;
    @Size(min = 8, max = 8)
    private String dateIdBetweenFrom;
    @Size(min = 8, max = 8)
    private String dateIdBetweenTo;
    @Size(min = 6, max = 8)
    private String dateIdLike;
}
