package cc.greenit.cms.common.dto.master;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * packageName    : cc.greenit.cms.domain.master.dto
 * fileName       : GolfMemberRequestDTO
 * author         : zaid
 * date           : 2023/04/18
 * description    :
 */
/** 골프장 회원 여부 조회 RequestDTO */
@Data
public class GetGolfMemberRequestDTO {
    @NotEmpty
    private String companyId;
    @NotEmpty
    private String memberName;
    @NotEmpty
    private String memberPhone;
    @Builder
    public GetGolfMemberRequestDTO(String companyId, String memberName, String memberPhone){
        this.companyId = companyId;
        this.memberName = memberName;
        this.memberPhone = memberPhone;
    }
}
