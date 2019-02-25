package com.yh.bootdemo.service.impl;

import com.yh.bootdemo.dao.mapper.UserMapper;
import com.yh.bootdemo.model.TUser;
import com.yh.bootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public void insert(TUser user) {
        userMapper.insert(user);
    }

    @Override
    public void update(TUser user) {
//        userMapper.update(user);
    }

    @Override
    public TUser selectById(Integer id) {
        return userMapper.selectById(id);
    }

    @Override
    public void deleteById(Integer id) {
        userMapper.deleteById(id);
    }

    @Override
    public List<TUser> selectList() {

        return userMapper.selectList(null);
    }

}
