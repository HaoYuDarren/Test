package com.yh.bootdemo.service.impl;

import com.yh.bootdemo.dao.mapper.UserMapper;
import com.yh.bootdemo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    UserService userService;
    @Resource
    UserMapper userMapper;



    @Test
    public void selectList() {
        System.out.println(userService.selectList().toString());
    }
}