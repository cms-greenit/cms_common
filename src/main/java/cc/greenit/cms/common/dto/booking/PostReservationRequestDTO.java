package cc.greenit.cms.common.dto.booking;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Map;

/**
 * packageName    : cc.greenit.cms.domain.booking.dto
 * fileName       : PostReservationRequestDTO
 * author         : zaid
 * date           : 2023/04/18
 * description    : 예약 등록 Request
 */
@Data
public class PostReservationRequestDTO {
    @NotEmpty
    private String companyId;
    @NotEmpty
    private String dateId;
    @NotEmpty
    private String courseId;
    @NotEmpty
    private String timeId;
    private String timeSeq;
    @NotEmpty
    private String agencyCode;
    @NotNull
    private Integer person;
    @NotEmpty
    private String memberName;
    @NotEmpty
    @Size(min = 11, max = 11)
    private String memberPhone;
    @NotEmpty
    private String memberGender;
    @Size(max = 50)
    private String remark;
    private String agencyName;
    private Integer reservationGreenFee;
    private String isPrePayment;
    private String visitPolicy;

    /*
     * central 비고 권한(remark-central-authority-adr). 생성자에 넣지 않는다 — 기존 호출부와 JSON 역직렬화가
     * 그대로 유지되고, 값은 setter 로 채워진다. remarkAuthority 가 "CENTRAL" 일 때만 쓴다(CentralRemarkSupport).
     * remarkMain/remarkSub: null = 그 칸을 건드리지 않음, "" = 빈값 기록.
     */
    private String remarkAuthority;
    private String remarkMain;
    private String remarkSub;
    private Map<String, String> remarkCaddyLabels;

    @Builder
    public PostReservationRequestDTO(String companyId, String dateId, String courseId, String timeId, String timeSeq, String agencyCode, Integer person, String memberName, String memberPhone, String memberGender, String remark, String agencyName, Integer reservationGreenFee, String isPrePayment, String visitPolicy) {
        this.companyId           = companyId;
        this.dateId              = dateId;
        this.courseId            = courseId;
        this.timeId              = timeId;
        this.timeSeq             = timeSeq;
        this.agencyCode          = agencyCode;
        this.person              = person;
        this.memberName          = memberName;
        this.memberPhone         = memberPhone;
        this.memberGender        = memberGender;
        this.remark              = remark;
        this.agencyName          = agencyName;
        this.reservationGreenFee = reservationGreenFee;
        this.isPrePayment        = isPrePayment;
        this.visitPolicy         = visitPolicy;
    }
}
