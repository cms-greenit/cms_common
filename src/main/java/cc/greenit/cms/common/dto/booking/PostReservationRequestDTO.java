package cc.greenit.cms.common.dto.booking;

import lombok.Data;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

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
}
