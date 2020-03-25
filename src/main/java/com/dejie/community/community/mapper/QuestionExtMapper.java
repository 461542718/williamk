package com.dejie.community.community.mapper;

import com.dejie.community.community.model.Question;


public interface QuestionExtMapper {
    int incView(Question record);
    int incCommentCount(Question record);
}