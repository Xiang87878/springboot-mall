package com.xiang.springbootmall.service;

import com.xiang.springbootmall.dto.UserRegisterRequest;
import com.xiang.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

}
