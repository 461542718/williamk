package com.dejie.community.community.service;

import com.dejie.community.community.mapper.UserMapper;
import com.dejie.community.community.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public void createOrUpdate(User user) {
     User dbuser = userMapper.findByAccountId(user.getAccountId());
     if(dbuser==null){
         //插入
         user.setGmtCreate(System.currentTimeMillis());
         user.setGmtModified(user.getGmtCreate());
         userMapper.insert(user);
     }else{
         dbuser.setGmtModified(System.currentTimeMillis());
         dbuser.setAvatarUrl(user.getAvatarUrl());
         dbuser.setName(user.getName());
         dbuser.setToken(user.getToken());
         dbuser.setGmtCreate(user.getGmtCreate());
         userMapper.update(user);
         //更新
     }
    }
}
