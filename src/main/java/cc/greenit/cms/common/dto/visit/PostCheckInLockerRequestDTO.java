package cc.greenit.cms.common.dto.visit;

import lombok.Data;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

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
