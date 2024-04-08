package cc.greenit.cms.common.dto.visit;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * packageName    : cc.greenit.cms.common.dto.visit
 * fileName       : PostCheckInLockerRequestDTO
 * author         : zaid
 * date           : 2023/08/09
 * description    :
 */
@Data
public class PostCheckInLockerRequestDTO {
    @NotEmpty
    private String companyId;
    @NotEmpty
    private String checkinId;
    @NotEmpty
    private String gender;
}
