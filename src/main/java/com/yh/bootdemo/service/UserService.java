package com.yh.bootdemo.service;

import com.yh.bootdemo.model.TUser;

import java.util.List;

public interface UserService {
    public void insert(TUser TUser);

    public void update(TUser TUser);

    public TUser selectById(Integer id);

    public void deleteById(Integer id);

    public List<TUser> selectList();
}
