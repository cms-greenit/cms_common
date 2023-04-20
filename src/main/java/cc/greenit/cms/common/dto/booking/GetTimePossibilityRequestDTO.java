package cc.greenit.cms.common.dto.booking;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * packageName    : cc.greenit.cms.domain.booking.dto
 * fileName       : TimePossibilityRequestDTO
 * author         : zaid
 * date           : 2023/04/18
 * description    :
 */
/** 예약 가능 여부 조회 Request  */
@Data
@Builder
public class GetTimePossibilityRequestDTO {
    @NotEmpty
    private String companyId;
    @NotEmpty
    private String dateId;
    @NotEmpty
    private String timeId;
    @NotEmpty
    private String courseId;
}
