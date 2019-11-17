package com.dejie.community.community.mapper;

import com.dejie.community.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface QuestionMapper {
    @Insert("insert into QUESTION (title,description,gmt_create,gmt_modified,comment_count,view_count,like_count,tag) values (#{title},#{description},#{gmtCreate},#{gmtModified},#{commentCount},#{viewCount},#{likeCount},#{tag})")
  void create(Question question);
    @Select("select * from question")
    List<Question> list();
}
