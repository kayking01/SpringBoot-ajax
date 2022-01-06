package com.kay.demo.service;

import com.kay.demo.entity.User;
import com.kay.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kay
 * @create 2022 - 01 - 04-16:06
 */
@Service

public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public List<User> getUserAll() {
        return userMapper.getUserAll();
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public void deleteById(Integer id) {
        userMapper.deleteById(id);
    }

    @Override
    public void updateById(User user) {
        userMapper.updateById(user);
    }
}
