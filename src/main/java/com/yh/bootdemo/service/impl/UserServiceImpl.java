package com.yh.bootdemo.service.impl;

import com.yh.bootdemo.dao.mapper.UserMapper;
import com.yh.bootdemo.model.User;
import com.yh.bootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public User selectById(Integer id) {
        return userMapper.selectById(id);
    }

    @Override
    public void deleteById(Integer id) {
        userMapper.deleteById(id);
    }
}
