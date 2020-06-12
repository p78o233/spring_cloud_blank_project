package com.example.consumerdemo.service;/*
 * @author p78o2
 * @date 2020/6/12
 */

import com.example.commondemo.domain.UserShiro;

import java.util.List;
import java.util.Set;

public interface UserService {
    public Set<String> getRoles(String username);

    public Set<String> getPermissions(String name);

    public UserShiro getByUsername (String name);
}
