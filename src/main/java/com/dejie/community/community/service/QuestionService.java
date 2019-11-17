package com.dejie.community.community.service;

import com.dejie.community.community.dto.QuestionDTO;
import com.dejie.community.community.mapper.QuestionMapper;
import com.dejie.community.community.mapper.UserMapper;
import com.dejie.community.community.model.Question;
import com.dejie.community.community.model.User;
import org.graalvm.compiler.lir.LIRInstruction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class QuestionService {

    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private UserMapper userMapper;

    public List<QuestionDTO> list() {
        List<Question> questions =questionMapper.list();
        for (Question question : questions){
            User user = userMapper.findById(question.getCreator());
        }
        return null;
    }
}
