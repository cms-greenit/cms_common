package cc.greenit.cms.common.dto.realtime;

import lombok.Data;

import java.util.List;

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
    private String closeAgencyCode;
    private Integer part;
    private Integer hole;
    private Integer headcount;
    private String caddyType;
    private String caddyUseYn;
    private String bookingOpenStartDatetime;
    private String bookingOpenEndDatetime;
    private String bookingCancelStartDatetime;
    private String bookingCancelEndDatetime;
    private Integer cartFee;
    private Integer greenFeeOrigin;
    private Integer greenFee;
    private Integer greenFeeSale;
    private String prepaymentUseYn;
}
