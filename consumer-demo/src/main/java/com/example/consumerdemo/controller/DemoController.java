package com.example.consumerdemo.controller;/*
 * @author p78o2
 * @date 2020/6/9
 */

import com.example.commondemo.domain.User;
import com.example.consumerdemo.spring_cloud_service.DemoFeignService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

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

//    @RequestMapping(value = "/my", method = RequestMethod.GET)
//    public void myDetail() {
//        Map curUser = (Map) SecurityContextHolder.getContext()
//                .getAuthentication()
//                .getPrincipal();
//
//        String userName = (String)curUser.get("username");
//        return ;
//    }

}
