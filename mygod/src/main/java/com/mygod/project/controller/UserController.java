package com.mygod.project.controller;

import com.mygod.project.entity.User;
import com.mygod.project.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getList")
    @ResponseBody
    public User getList(){
        System.out.println(123456);
        User user = userService.getList();
        System.out.println(user);

        return user;
    }
}
