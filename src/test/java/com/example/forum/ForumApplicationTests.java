package com.example.forum;

import com.example.forum.Mapper.UserMapper;
import com.example.forum.bean.user;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ForumApplicationTests {
@Autowired
    UserMapper userMapper;
    @Test
    void contextLoads() {
        user user= userMapper.getUserbyname("feng");
        System.out.println(user);

    }

}
