package com.hhxx.spring.mybatis.service.impl;

import com.hhxx.spring.mybatis.dao.UserDao;
import com.hhxx.spring.mybatis.entity.UserMapper;
import com.hhxx.spring.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserMapper findById(long id){
        return userDao.findById(id);
    }

    @Override
    public UserMapper save(UserMapper user) {
        userDao.save(user);
        return user;
    }

    @Override
    public UserMapper update(UserMapper user) {
        userDao.update(user);
        return user;
    }
}
