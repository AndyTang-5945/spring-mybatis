package com.hhxx.spring.mybatis.service;

import com.hhxx.spring.mybatis.entity.UserMapper;
import org.springframework.stereotype.Service;


public interface UserService {

    UserMapper findById(long id);

    UserMapper save(UserMapper user);

    UserMapper update(UserMapper user);
}
