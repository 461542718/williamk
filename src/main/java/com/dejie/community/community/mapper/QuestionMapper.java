package com.dejie.community.community.mapper;

import com.dejie.community.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface QuestionMapper {
    @Insert("insert into QUESTION (title,description,gmt_create,gmt_modified,comment_count,view_count,like_count,tag,creator) values (#{title},#{description},#{gmtCreate},#{gmtModified},#{commentCount},#{viewCount},#{likeCount},#{tag},#{creator})")
  void create(Question question);
    @Select("select * from QUESTION limit #{offset},#{size}")
    List<Question> list(@Param(value = "offset") Integer offset,@Param(value = "size") Integer size);
    @Select("select count(1) from QUESTION")
    Integer count();
}
