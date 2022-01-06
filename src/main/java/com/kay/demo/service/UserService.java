package com.kay.demo.service;

import com.kay.demo.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @author kay
 * @create 2022 - 01 - 04-16:05
 */

public interface UserService {
    User findById(Integer id);
    List<User> getUserAll();
    void addUser(User user);
    void deleteById(Integer id);
    void updateById(User user);
}
