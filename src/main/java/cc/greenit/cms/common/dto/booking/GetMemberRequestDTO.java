package cc.greenit.cms.common.dto.booking;

import lombok.Data;

import javax.validation.constraints.Size;

/**
 * packageName    : cc.greenit.cms.domain.booking.dto
 * fileName       : MemberRequestDTO
 * author         : zaid
 * date           : 2023/04/18
 * description    : 동반자 조회 Request
 */
/**   */
@Data
public class GetMemberRequestDTO {
    private String companyId;
    @Size(min = 8, max = 8)
    private String dateId;
    @Size(min = 1, max = 1)
    private String courseId;
    @Size(min = 4, max = 4)
    private String timeId;
    @Size(min = 5, max = 5)
    private String timeSeq;
    @Size(min = 6, max = 12)
    private String rsvNo;
    @Size(min = 8, max = 8)
    private String dateIdBetweenFrom;
    @Size(min = 8, max = 8)
    private String dateIdBetweenTo;
    @Size(min = 4, max = 8)
    private String dateIdLike;
    @Size(min = 14, max = 14)
    private String datetimeGoe;
    private Option option;

    public enum Option {
        FLAT, LIST
    }
}
