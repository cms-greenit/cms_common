package cc.greenit.cms.common.dto.realtime;

import lombok.Data;

/**
 * packageName    : cc.greenit.cms.common.dto.realtime
 * fileName       : GetRealTimeListResponseDTO
 * author         : zaid
 * date           : 2024. 11. 13.
 * description    :
 */
@Data
public class GetRealTimeListResponseDTO {
    private String companyId;
    private String dateId;
    private String timeSeq;
    private String timeId;
    private String courseId;
    private String agencyOpenYn;
    private String openAgencyCode;
    private Integer part;
    private Integer headcount;
    private String caddyType;
    private Integer greenFee;
}
