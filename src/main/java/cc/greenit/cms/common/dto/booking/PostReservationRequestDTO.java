package cc.greenit.cms.common.dto.booking;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * packageName    : cc.greenit.cms.domain.booking.dto
 * fileName       : PostReservationRequestDTO
 * author         : zaid
 * date           : 2023/04/18
 * description    : 예약 등록 Request
 */
@Data
public class PostReservationRequestDTO {
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
    @NotNull
    private Integer person;
    @NotEmpty
    private String memberName;
    @NotEmpty
    @Size(min = 11, max = 11)
    private String memberPhone;
    @NotEmpty
    private String memberGender;
    @Size(max = 50)
    private String remark;
    private String agencyName;
    private Integer reservationGreenFee;

    @Builder
    public PostReservationRequestDTO(String companyId, String dateId, String courseId, String timeId, String timeSeq, String agencyCode, Integer person, String memberName, String memberPhone, String memberGender, String remark, String agencyName, Integer reservationGreenFee) {
        this.companyId           = companyId;
        this.dateId              = dateId;
        this.courseId            = courseId;
        this.timeId              = timeId;
        this.timeSeq             = timeSeq;
        this.agencyCode          = agencyCode;
        this.person              = person;
        this.memberName          = memberName;
        this.memberPhone         = memberPhone;
        this.memberGender        = memberGender;
        this.remark              = remark;
        this.agencyName          = agencyName;
        this.reservationGreenFee = reservationGreenFee;
    }
}
