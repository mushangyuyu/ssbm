package com.yh.controller;

import com.yh.entity.User;
import com.yh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/getAllUser")
    @ResponseBody
    private List<User> getAllUser() {
        List<User> users =  userService.getAllUser();

        return users;

    }

}