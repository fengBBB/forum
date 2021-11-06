package com.example.forum.service;

import com.example.forum.Mapper.UserMapper;
import com.example.forum.bean.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class loginService {


    @Autowired
    UserMapper userMapper;
    public user login(String name ,String password){
        user user =userMapper.getUserbyname(name);
        if(user.getPassword().equals(password)){
            return user;
        }else{
            return null;
        }
    }
}
