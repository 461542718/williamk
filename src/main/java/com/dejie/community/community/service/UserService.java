package com.dejie.community.community.service;

import com.dejie.community.community.mapper.UserMapper;
import com.dejie.community.community.model.User;
import com.dejie.community.community.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public void createOrUpdate(User user) {
        UserExample userExample = new UserExample();
        userExample.createCriteria()
                .andAccountIdEqualTo(user.getAccountId());
        List<User> users = userMapper.selectByExample(userExample);

     if(users.size()==0){
         //插入
         user.setGmtCreate(System.currentTimeMillis());
         user.setGmtModified(user.getGmtCreate());
         userMapper.insert(user);
     }else{
         User dbuser = users.get(0);
         User updateuser = new User();
         updateuser.setGmtModified(System.currentTimeMillis());
         updateuser.setAvatarUrl(user.getAvatarUrl());
         updateuser.setName(user.getName());
         updateuser.setToken(user.getToken());
         updateuser.setGmtCreate(user.getGmtCreate());
         userExample.createCriteria()
                 .andIdEqualTo(dbuser.getId());
         userMapper.updateByExampleSelective(updateuser,new UserExample());

         //更新
     }
    }
}
