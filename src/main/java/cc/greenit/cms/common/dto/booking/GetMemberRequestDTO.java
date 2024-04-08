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
    private String courseId;
    @Size(min = 4, max = 4)
    private String timeId;
    private String timeSeq;
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
