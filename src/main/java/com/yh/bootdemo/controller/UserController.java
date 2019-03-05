package com.yh.bootdemo.controller;

import com.yh.bootdemo.model.TUser;
import com.yh.bootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("users")
    public List<TUser> getAllUsers(){
        return userService.selectList();
    }


}
