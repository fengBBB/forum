package com.example.forum.Mapper;

import com.example.forum.bean.user;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user where name= #{name}")
    public user getUserbyname(String name);
}
