package cc.greenit.cms.common.dto.score;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * packageName    : cc.greenit.cms.common.dto.score
 * fileName       : GetCourseHoleRequestDTO
 * author         : neal
 * date           : 2026. 1. 28.
 * description    :
 */
@Data
public class GetCourseHoleRequestDTO {
    @NotBlank
    private String companyId;
}
