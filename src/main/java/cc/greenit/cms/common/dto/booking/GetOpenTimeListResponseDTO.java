package cc.greenit.cms.common.dto.booking;

import lombok.Data;

/**
 * packageName    : cc.greenit.cms.domain.booking.dto
 * fileName       : OpenTimeListResponseDTO
 * author         : zaid
 * date           : 2023/04/19
 * description    : 현재오픈타임 조회 Response
 */
@Data
public class GetOpenTimeListResponseDTO {
    private String companyId;
    private String dateId;
    private String courseId;
    private String timeId;
    private String timeSeq;
    /**
     * 모든 에이전시, 홈페이지 오픈이 같으면 ALL
     * 아니면 에이전시 관리 코드
     */
    private String agencyCode;

}
