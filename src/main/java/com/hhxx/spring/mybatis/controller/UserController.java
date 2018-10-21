package com.hhxx.spring.mybatis.controller;

import com.hhxx.spring.mybatis.entity.UserMapper;
import com.hhxx.spring.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/{id}")
    public UserMapper findById(HttpServletRequest request, HttpServletResponse response, @PathVariable Long id){
        UserMapper user = userService.findById(id);
        return user;
    }

    @PostMapping(value = "")
    public UserMapper add(HttpServletResponse response, HttpServletRequest request, @RequestBody UserMapper user){
        return userService.save(user);
    }

    @PutMapping(value = "")
    public UserMapper update(HttpServletRequest request, HttpServletResponse response, @RequestBody UserMapper user){
        return userService.update(user);
    }
}
