package com.mygod.project.server.impl;

import com.mygod.project.entity.User;
import com.mygod.project.mapper.UserMapper;
import com.mygod.project.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User getList() {
        User user = userMapper.selectList();
        return user;
    }

}
