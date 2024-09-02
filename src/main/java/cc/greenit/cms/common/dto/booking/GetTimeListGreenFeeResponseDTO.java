package cc.greenit.cms.common.dto.booking;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

/**
 * packageName    : cc.greenit.cms.domain.booking.dto
 * fileName       : GetTimeListGreenFeeDTO
 * author         : neal
 * date           : 2024/08/29
 * description    :
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetTimeListGreenFeeResponseDTO {
    @NotEmpty
    private String dateId;
    @NotEmpty
    private String courseId;
    @NotEmpty
    private String timeId;
    private Integer greenFeeOrigin;
    private Integer greenFee;
    private Integer greenFeeSale;
    private Integer greenFeeNonMember;

}
