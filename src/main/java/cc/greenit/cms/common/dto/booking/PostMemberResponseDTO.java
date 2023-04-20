package cc.greenit.cms.common.dto.booking;

import lombok.Data;

/**
 * packageName    : cc.greenit.cms.domain.booking.dto
 * fileName       : PostMemberResponseDTO
 * author         : zaid
 * date           : 2023/04/19
 * description    : 동반자 등록 Response
 */
@Data
public class PostMemberResponseDTO {
    private String memberSeq;
    private String memberName;
    private String memberGender;
    private String golfMemberId;
    private String memberPhone;
}
