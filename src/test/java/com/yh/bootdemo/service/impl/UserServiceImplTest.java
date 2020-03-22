package com.yh.bootdemo.service.impl;

import com.yh.bootdemo.model.User;
import com.yh.bootdemo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    User user;
    @Autowired
    UserService userService;

    @Test
    public void insert() {
        user.setUserName("yh");
        user.setUserPassWord("123456");
        user.setUserEmail("yuhao@xiaomi.com");
        user.setUserInfo("test info");
        user.setHeadImg(new byte[]{1,2,3});
        user.setCreateTime(new Date());
        int result = userService.insert(user);
        System.out.println("result+========"+result);
    }

    @Test
    public void update() {

        userService.update(user);

    }

    @Test
    public void selectById() {
        System.out.println( userService.selectById(2).toString());

    }

    @Test
    public void deleteById() {
        userService.deleteById(2);
    }
}