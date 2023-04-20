package cc.greenit.cms.common.dto.booking;

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
    @NotEmpty
    private String agencyCode;
    @NotNull
    private Integer person;
    @NotEmpty
    private String memberName;
    @NotEmpty
    @Size(min = 11, max = 11)
    private String memberPhone;
    @Size(max = 50)
    private String remark;
}
