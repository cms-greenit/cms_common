package cc.greenit.cms.common.dto.booking;

import lombok.Data;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

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
    @NotEmpty
    private String courseId;
    private String timeSeq;
    private String rsvNo;
    @NotEmpty
    private String agencyCode;
    @Size(max = 50)
    private String reason;
}
