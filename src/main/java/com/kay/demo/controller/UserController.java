package com.kay.demo.controller;

import com.kay.demo.entity.User;
import com.kay.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author kay
 * @create 2022 - 01 - 04-16:08
 */
@RestController
@RequestMapping("/test")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/findById")
    public User findById(Integer id){
        return userService.findById(id);
    }

    @PostMapping("/addUser")
    public void addUser(User user){
        userService.addUser(user);
    }

    @PostMapping("/deleteById")
    public void deleteById(Integer id){
        userService.deleteById(id);
    }

    @PostMapping("/updateById")
    public void updateById(User user){
        userService.updateById(user);
    }

    @GetMapping("/getUserAll")
    public ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView("showUser");
        List<User> users = userService.getUserAll();
        modelAndView.addObject("users",users);
        return modelAndView;
    }

    @GetMapping("/toShowUser")
    public ModelAndView toShowUser(){
        ModelAndView modelAndView = new ModelAndView("showUser");
        return modelAndView;
    }

    @GetMapping("/toUpdateUser")
    public ModelAndView toUpdateUser(){
        ModelAndView modelAndView = new ModelAndView("updateUser");
        return modelAndView;
    }

    @GetMapping("/toAddUser")
    public ModelAndView toAddUser(){
        ModelAndView modelAndView = new ModelAndView("addUser");
        return modelAndView;
    }
}
