package com.example.providerdemo.controller;/*
 * @author p78o2
 * @date 2020/6/9
 */

import com.example.api.domain.User;
import com.example.api.service.IDemoApi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DempProviderController implements IDemoApi {
    @Override
    public String test(String test) {
        return "test: " + test;
    }

    @Override
    public User user(User user) {
        if (user == null) {
            user = new User(10, "Joab-Y");
        }
        return user;
    }
}