package com.example.providerdemo.serviceImpl;/*
 * @author p78o2
 * @date 2020/6/9
 */

import com.example.commondemo.domain.po.User;
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
            user = new User();
            user.setAge(1);
        }
        return user;
    }
}
