package cc.greenit.cms.common.dto.score;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class GetScoreMemberRequestDTO {
    @NotBlank(message = "companyId는 필수입니다.")
    private String companyId;

    @NotBlank(message = "dateId는 필수입니다.")
    @Pattern(
            regexp = "\\d{8}",
            message = "dateId는 yyyyMMdd 형식의 숫자여야 합니다."
    )
    private String dateId;

    @NotEmpty(message = "checkIds는 필수입니다.")
    @Size(min = 1, message = "checkIds는 최소 1개 이상이어야 합니다.")
    private List<@NotBlank(message = "checkId는 비어 있을 수 없습니다.") String> checkIds;
}
