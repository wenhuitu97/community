package life.majiang.community.dto;

import life.majiang.community.model.User;
import lombok.Data;

@Data // LomBok注解
public class QuestionDTO {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer commentCount;
    private Integer viewCount;
    private Integer likeCount;
    private User user;
}
