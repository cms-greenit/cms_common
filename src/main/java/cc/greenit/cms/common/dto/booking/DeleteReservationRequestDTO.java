package cc.greenit.cms.common.dto.booking;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * packageName    : cc.greenit.cms.domain.booking.dto
 * fileName       : DeleteReservationRequestDTO
 * author         : zaid
 * date           : 2023/04/18
 * description    : 예약 취소 Request
 */
@Data
public class DeleteReservationRequestDTO {
    @NotEmpty
    private String companyId;
    @NotEmpty
    private String dateId;
    @NotEmpty
    private String timeId;
    private String timeSeq;
    @NotEmpty
    private String courseId;
    private String rsvNo;
    private String agencyCode;
    @Size(max = 50)
    private String reason;
}
