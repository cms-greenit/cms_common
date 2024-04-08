package cc.greenit.cms.common.dto.booking;

import lombok.Data;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : cc.greenit.cms.domain.booking.dto
 * fileName       : PostMemberRequestDTO
 * author         : zaid
 * date           : 2023/04/19
 * description    : 동반자 등록 Request
 */
@Data
public class PostMemberRequestDTO {
    @NotEmpty
    private String companyId;
    @NotEmpty
    private String dateId;
    @NotEmpty
    private String timeId;
    @NotEmpty
    private String courseId;
    private String timeSeq;
    private String rsvNo;
    @NotEmpty
    private String agencyCode;
    private List<Member> memberList = new ArrayList<>();
    @Data
    public static class Member{
        @NotEmpty
        private String memberName;
        @NotEmpty
        @Size(min = 11, max = 11)
        private String memberPhone;
        @NotNull
        private String memberGender;
    }
}
