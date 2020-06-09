package com.example.consumerdemo.controller;/*
 * @author p78o2
 * @date 2020/6/9
 */

import com.example.api.domain.User;
import com.example.consumerdemo.service.DemoFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    public DemoFeignService demoFeignService;

    @GetMapping("/test")
    public String test() {
        return demoFeignService.test("test");
    }

    @PostMapping("/user")
    public User user() {
        User user = new User();
        user.setAge(10);
        user.setName("Joab-Y");
        return demoFeignService.user(user);
    }

}
