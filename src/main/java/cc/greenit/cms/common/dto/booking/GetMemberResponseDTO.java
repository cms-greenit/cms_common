package cc.greenit.cms.common.dto.booking;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * packageName    : cc.greenit.cms.domain.booking.dto
 * fileName       : MemberResponseDTO
 * author         : zaid
 * date           : 2023/04/18
 * description    :
 */
/** 동반자 조회 Response  */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetMemberResponseDTO {
    private String dateId;
    private String courseId;
    private String timeId;
    private String rsvNo;
    private Integer memberSeq;
    private String memberName;
    private String golfMemberNum;
    private String memberGender;
    private String memberPhone;
    private List<Member> memberList;

    @Data
    @Builder
    public static class Member{
        private Integer memberSeq;
        private String memberName;
        private String golfMemberNum;
        private String memberGender;
        private String memberPhone;
    }

}
