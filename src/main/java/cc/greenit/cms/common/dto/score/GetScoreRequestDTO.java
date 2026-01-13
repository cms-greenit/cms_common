package cc.greenit.cms.common.dto.score;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * packageName    : cc.greenit.cms.common.dto.score
 * fileName       : GetScoreRequestDTO
 * author         : jinpyo
 * date           : 2026. 1. 13.
 * description    :
 */
@Data
public class GetScoreRequestDTO {
    @NotEmpty
    private String companyId;
    @Size(min = 8, max = 8)
    private String dateIdBetweenFrom;
    @Size(min = 8, max = 8)
    private String dateIdBetweenTo;
    @Size(min = 6, max = 8)
    private String dateIdLike;
    @Size(min = 14, max = 14)
    private String datetimeGoe;
}
