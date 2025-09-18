package cc.greenit.cms.common.dto.booking;

import cc.greenit.cms.common.adapter.TimeListRequestAdapter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;

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
public class GetTimeListGreenFeeRequestDTO implements TimeListRequestAdapter {

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
    @Size(min = 14, max = 14)
    private String datetimeGoe;
    private String batchType;
}
