package com.xiang.springbootmall.service.impl;

import com.xiang.springbootmall.dao.UserDao;
import com.xiang.springbootmall.dto.UserRegisterRequest;
import com.xiang.springbootmall.model.User;
import com.xiang.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }


}
