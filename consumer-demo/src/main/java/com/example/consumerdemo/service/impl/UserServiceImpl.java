package com.example.consumerdemo.service.impl;/*
 * @author p78o2
 * @date 2020/6/12
 */

import com.example.commondemo.domain.UserShiro;
import com.example.consumerdemo.mapper.UserMapper;
import com.example.consumerdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl  implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public Set<String> getRoles(String username) {
        return userMapper.getRoles(username);
    }

    @Override
    public Set<String> getPermissions(String name) {
        return userMapper.getPermissions(name);
    }

    @Override
    public UserShiro getByUsername(String name) {
        return userMapper.getByUsername(name);
    }
}
