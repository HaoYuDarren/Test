package com.yh.bootdemo.service.impl;

import com.yh.bootdemo.dao.master.UserMapper;
import com.yh.bootdemo.dao.slave.UserReadMapper;
import com.yh.bootdemo.model.User;
import com.yh.bootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    UserReadMapper userReadMapper;


    @Override
    public int insert(User user) {
       return userMapper.insert(user);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public User selectById(Integer id) {
        return userReadMapper.selectById(id);
    }

    @Override
    public void deleteById(Integer id) {
        userMapper.deleteById(id);
    }
}
