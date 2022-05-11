package com.sms.jwttokens.service;

import com.sms.jwttokens.dao.UserDto;
import com.sms.jwttokens.model.User;

import java.util.List;

public interface UserService {
    User save(UserDto user);
    List<User> findAll();
    User findOne(String username);
}

