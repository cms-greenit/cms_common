package cc.greenit.cms.common.dto.booking;

import lombok.Data;

/**
 * packageName    : cc.greenit.cms.domain.booking.dto
 * fileName       : CalendarResponseDTO
 * author         : zaid
 * date           : 2023/04/18
 * description    :
 */
@Data
public class CalendarResponseDTO {
    private String dateId;
    private String weekDayType;
    private String bookingOpenDate;
    private String bookingOpenTime;
    private String homepageOpenDate;
    private String homepageOpenTime;
    private String cancelableDateTime;
}
