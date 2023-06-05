package cc.greenit.cms.common.dto.booking;

import lombok.Data;

/**
 * packageName    : cc.greenit.cms.domain.booking.dto
 * fileName       : CalendarResponseDTO
 * author         : zaid
 * date           : 2023/04/18
 * description    : 예약가능 날짜 조회 Response
 */
@Data
public class GetCalendarResponseDTO {
    private String dateId;
    private String weekdayType;
    private String bookingOpenStartDate;
    private String bookingOpenStartTime;
    private String bookingOpenEndDate;
    private String bookingOpenEndTime;
    private String homepageOpenStartDate;
    private String homepageOpenStartTime;
    private String homepageOpenEndDate;
    private String homepageOpenEndTime;
    private String bookingCancelStartDate;
    private String bookingCancelStartTime;
    private String bookingCancelEndDate;
    private String bookingCancelEndTime;
    private String homepageCancelStartDate;
    private String homepageCancelStartTime;
    private String homepageCancelEndDate;
    private String homepageCancelEndTime;
}
