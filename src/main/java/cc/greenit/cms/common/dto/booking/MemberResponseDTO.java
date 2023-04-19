package cc.greenit.cms.common.dto.booking;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * packageName    : cc.greenit.cms.domain.booking.dto
 * fileName       : MemberResponseDTO
 * author         : zaid
 * date           : 2023/04/18
 * description    :
 */
@Data
public class MemberResponseDTO {
    private String dateId;
    private String courseId;
    private String timeId;
    private String rsvNo;
    private String memberSeq;
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
