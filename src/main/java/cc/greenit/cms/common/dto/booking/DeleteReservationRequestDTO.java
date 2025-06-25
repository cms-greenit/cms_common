package cc.greenit.cms.common.dto.booking;

import lombok.Builder;
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
    @NotEmpty
    private String courseId;
    private String timeSeq;
    private String rsvNo;
    @NotEmpty
    private String agencyCode;
    @Size(max = 50)
    private String reason;
    private String isAdmin;
    private String agencyName;

    @Builder
    public DeleteReservationRequestDTO(String companyId, String dateId, String timeId, String courseId, String timeSeq, String agencyCode, String rsvNo, String reason, String agencyName) {
        this.companyId = companyId;
        this.dateId = dateId;
        this.timeId = timeId;
        this.courseId = courseId;
        this.timeSeq = timeSeq;
        this.rsvNo = rsvNo;
        this.agencyCode = agencyCode;
        this.reason = reason;
        this.agencyName = agencyName;
    }
}
