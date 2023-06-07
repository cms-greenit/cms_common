package cc.greenit.cms.common.dto.booking;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * packageName    : cc.greenit.cms.domain.booking.dto
 * fileName       : TimeCancelPossibilityRequestDTO
 * author         : zaid
 * date           : 2023/04/18
 * description    : 예약 취소 가능 여부 조회 Request
 */
@Data
public class GetTimeCancelPossibilityRequestDTO {
    @NotEmpty
    private String companyId;
    @NotEmpty
    private String dateId;
    @NotEmpty
    private String courseId;
    @NotEmpty
    private String timeId;
    private String timeSeq;
    @NotEmpty
    private String agencyCode;
    private String rsvNo;

    @Builder
    public GetTimeCancelPossibilityRequestDTO(String companyId, String dateId, String courseId, String timeId, String rsvNo, String agencyCode){
        this.companyId = companyId;
        this.dateId = dateId;
        this.courseId = courseId;
        this.timeId = timeId;
        this.rsvNo = rsvNo;
        this.agencyCode = agencyCode;
    }
}
