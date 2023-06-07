package cc.greenit.cms.common.dto.booking;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : cc.greenit.cms.domain.booking.dto
 * fileName       : DeleteMemberRequestDTO
 * author         : zaid
 * date           : 2023/04/19
 * description    : 동반자 삭제 Request
 */
@Data
public class DeleteMemberRequestDTO {
    @NotEmpty
    private String companyId;
    @NotEmpty
    private String dateId;
    @NotEmpty
    private String courseId;
    @NotEmpty
    private String timeId;
    private String timeSeq;
    private String rsvNo;
    @NotEmpty
    private String agencyCode;
    private List<Member> memberList = new ArrayList<>();
    @Data
    public static class Member{
        @NotNull
        private Integer memberSeq;
    }
}
