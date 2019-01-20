package com.yh.bootdemo.service.impl;

import com.yh.bootdemo.model.User;
import com.yh.bootdemo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    User user;
    @Autowired
    UserService userService;

    @Test
    public void insert() {
        user.setUsername("yh");
        user.setPassword("123456");
        userService.insert(user);
    }

    @Test
    public void update() {
        user.setId(3);
        user.setUsername("yh");
        user.setPassword("654321");
        userService.update(user);

    }

    @Test
    public void selectById() {
        System.out.println( userService.selectById(1).toString());

    }

    @Test
    public void deleteById() {
        userService.deleteById(2);
    }
}