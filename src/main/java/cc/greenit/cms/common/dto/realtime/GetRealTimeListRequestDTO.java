package cc.greenit.cms.common.dto.realtime;

import lombok.Data;

/**
 * packageName    : cc.greenit.cms.common.dto.realtime
 * fileName       : GetRealTimeListRequestDTO
 * author         : zaid
 * date           : 2024. 11. 6.
 * description    :
 */
@Data
public class GetRealTimeListRequestDTO {
    private String companyId;
    private String from;
    private String to;
    private String datetimeGoe;
}
