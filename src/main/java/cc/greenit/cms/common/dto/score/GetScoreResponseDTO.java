package cc.greenit.cms.common.dto.score;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * packageName    : cc.greenit.cms.common.dto.score
 * fileName       : GetScoreResponseDTO
 * author         : jinpyo
 * date           : 2026. 1. 13.
 * description    :
 */
@Data
public class GetScoreResponseDTO {
    private String dateId;
    private String timeId;
    private String courseId;
    private String outCourseId;
    private String inCourseId;
    private String bookingId;
    private String hole;
    private List<Score> scoreCardList;

    @Data
    @AllArgsConstructor
    @Builder
    public static class Score {
        private String checkinId;
        private String name;
        private String phone;
        private String teeingGround;
        private Integer score1;
        private Integer score2;
        private Integer score3;
        private Integer score4;
        private Integer score5;
        private Integer score6;
        private Integer score7;
        private Integer score8;
        private Integer score9;
        private Integer score10;
        private Integer score11;
        private Integer score12;
        private Integer score13;
        private Integer score14;
        private Integer score15;
        private Integer score16;
        private Integer score17;
        private Integer score18;
        private Integer outScore;
        private Integer inScore;
        private Integer totalScore;
    }


}
