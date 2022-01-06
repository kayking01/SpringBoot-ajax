package com.kay.demo.mapper;

import com.kay.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author kay
 * @create 2022 - 01 - 04-15:48
 */
@Mapper
@Repository
public interface UserMapper {
    User findById(Integer id);
    List<User> getUserAll();
    void addUser(User user);
    void deleteById(Integer id);
    void updateById(User user);

}
