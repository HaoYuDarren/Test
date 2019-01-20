package com.yh.bootdemo.service;

import com.yh.bootdemo.model.User;

public interface UserService {
    public void insert(User user);

    public void update(User user);

    public User selectById(Integer id);

    public void deleteById(Integer id);
}
