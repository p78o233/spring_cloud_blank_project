package com.example.consumerdemo.controller;/*
 * @author p78o2
 * @date 2020/6/9
 */

import com.example.commondemo.domain.po.User;
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


    @GetMapping("/test1")
    public Object test1() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "dbToEs";
    }

    @GetMapping("/test2")
    public Object test2() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "dbToEs";
    }

    @GetMapping("/test3")
    public Object test3() {
        try {
            Thread.sleep(5500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "dbToEs";
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
