package com.example.consumerdemo.breaker;/*
 * @author p78o2
 * @date 2020/6/9
 */

import com.example.commondemo.domain.User;
import com.example.consumerdemo.spring_cloud_service.DemoFeignService;
import org.springframework.stereotype.Component;

@Component
public class DemoServiceFallback implements DemoFeignService {
    @Override
    public String test(String test) {
        return "error";
    }

    @Override
    public User user(User user) {
        return null;
    }
}
