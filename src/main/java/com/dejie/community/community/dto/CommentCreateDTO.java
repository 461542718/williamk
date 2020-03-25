package com.dejie.community.community.dto;

import lombok.Data;

@Data
public class CommentCreateDTO {
    private Integer parentID;
    private String content;
    private Integer type;
}
