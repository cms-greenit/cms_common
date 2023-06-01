package cc.greenit.cms.common.dto.booking;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * packageName    : cc.greenit.cms.domain.booking.dto
 * fileName       : MemberResponseDTO
 * author         : zaid
 * date           : 2023/04/18
 * description    : 동반자 조회 Response
 */
@Data
public class GetMemberResponseDTO<T> {
    private String dateId;
    private String courseId;
    private String timeId;
    private String rsvNo;
    private T data;

    @Data
    @AllArgsConstructor
    public static class Member {
        private Integer memberSeq;
        private String memberName;
        private String golfMemberNum;
        private String memberGender;
        private String memberPhone;
        // 날짜 + 시간 14자리로 리턴
        private String erpInputDateTime;
    }

    public GetMemberResponseDTO(String dateId, String courseId, String timeId, String rsvNo) {
        this.dateId = dateId;
        this.courseId = courseId;
        this.timeId = timeId;
        this.rsvNo = rsvNo;
    }

    public GetMemberResponseDTO(String dateId, String courseId, String timeId, String rsvNo, List<Member> memberList) {
        this.dateId = dateId;
        this.courseId = courseId;
        this.timeId = timeId;
        this.rsvNo = rsvNo;
        this.data = (T) memberList;
    }

    public GetMemberResponseDTO(String dateId, String courseId, String timeId, String rsvNo, Integer memberSeq, String memberName, String golfMemberNum, String memberGender, String memberPhone, String erpInputDateTime) {
        this.dateId = dateId;
        this.courseId = courseId;
        this.timeId = timeId;
        this.rsvNo = rsvNo;
        this.data = (T) new Member(memberSeq, memberName, golfMemberNum, memberGender, memberPhone, erpInputDateTime);
    }

}
