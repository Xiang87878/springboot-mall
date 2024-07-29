package com.xiang.springbootmall.dao;

import com.xiang.springbootmall.dto.UserRegisterRequest;
import com.xiang.springbootmall.model.User;

public interface UserDao {

    User getUserByEmail(String email);

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
