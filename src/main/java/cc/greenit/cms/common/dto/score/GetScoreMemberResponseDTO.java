package cc.greenit.cms.common.dto.score;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class GetScoreMemberResponseDTO {

    private String dateId;
    private String timeId;
    private String courseId;
    private String bookingId;
    private List<Player> playerList;

    @Data
    @AllArgsConstructor
    @Builder
    public static class Player {
        private String checkinId;
        private String name;
        private String phone;
    }
}