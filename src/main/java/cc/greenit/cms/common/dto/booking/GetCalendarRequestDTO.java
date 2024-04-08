package cc.greenit.cms.common.dto.booking;

import lombok.Data;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

/**
 * packageName    : cc.greenit.cms.domain.booking.dto
 * fileName       : CalendarRequestDTO
 * author         : zaid
 * date           : 2023/04/18
 * description    :예약가능 날짜 조회 Request
 */
@Data
public class GetCalendarRequestDTO {
    @NotEmpty
    private String companyId;
    @Size(min = 8, max = 8)
    private String dateId;
    @Size(min = 8, max = 8)
    private String dateIdBetweenFrom;
    @Size(min = 8, max = 8)
    private String dateIdBetweenTo;
    @Size(min = 4, max = 8)
    private String dateIdLike;
    @Size(min = 14, max = 14)
    private String datetimeGoe;
}
