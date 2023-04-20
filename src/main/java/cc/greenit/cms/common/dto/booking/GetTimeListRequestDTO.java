package cc.greenit.cms.common.dto.booking;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * packageName    : cc.greenit.cms.domain.booking.dto
 * fileName       : TimeListRequestDTO
 * author         : zaid
 * date           : 2023/04/18
 * description    : 타임 리스트 조회 Request
 */
@Data
public class GetTimeListRequestDTO {
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
}
