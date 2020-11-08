package com.mygod.project.mapper;


import com.mygod.project.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User selectList();
}
