package com.dejie.community.community.dto;

import com.dejie.community.community.model.User;
import lombok.Data;

@Data
public class QuestionDTO {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer Creator;
    private Integer viewCount;
    private Integer likeCount;
    private Integer commentCount;
    private User user;

}
