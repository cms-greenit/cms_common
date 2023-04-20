package cc.greenit.cms.common.dto.booking;

import lombok.Data;

/**
 * packageName    : cc.greenit.cms.domain.booking.dto
 * fileName       : CalendarResponseDTO
 * author         : zaid
 * date           : 2023/04/18
 * description    :
 */
/** 예약가능 날짜 조회 Response  */
@Data
public class GetCalendarResponseDTO {
    private String dateId;
    private String weekdayType;
    private String bookingOpenDate;
    private String bookingOpenTime;
    private String homepageOpenDate;
    private String homepageOpenTime;
    private String cancelableDateTime;
}
