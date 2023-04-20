package cc.greenit.cms.common.dto.booking;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : cc.greenit.cms.domain.booking.dto
 * fileName       : OtherSiteReservationRequestDTO
 * author         : zaid
 * date           : 2023/04/19
 * description    :
 */
/** 예약 조회(홈페이지) Request  */
@Data
public class GetOtherSiteReservationRequestDTO {
    @NotEmpty
    private String companyId;
    @Size(min = 8, max = 8)
    private String dateIdBetweenFrom;
    @Size(min = 8, max = 8)
    private String dateIdBetweenTo;
    @NotEmpty
    private String memberName;
    @NotEmpty
    private String memberPhone;
    private List<legacyBookingId> legacyList = new ArrayList<>();
    @Data
    public static class legacyBookingId{
        @NotEmpty
        @Size(min = 8, max = 8)
        private String dateId;
        @NotEmpty
        private String timeId;
        @NotEmpty
        private String courseId;
    }
}
