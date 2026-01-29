package cc.greenit.cms.common.dto.score;

import lombok.Data;

/**
 * packageName    : cc.greenit.cms.common.dto.score
 * fileName       : GetCourseHoleResponseDTO
 * author         : neal
 * date           : 2026. 1. 28.
 * description    :
 */
@Data
public class GetCourseHoleResponseDTO {
    private String courseId;
    private Integer holeNumber;
    private Integer par;
}
