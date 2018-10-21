package com.hhxx.spring.mybatis.dao;

import com.hhxx.spring.mybatis.entity.UserMapper;
import org.springframework.stereotype.Repository;

public interface UserDao {
    UserMapper findById(Long id);

    Long save(UserMapper user);

    void update(UserMapper user);
}
