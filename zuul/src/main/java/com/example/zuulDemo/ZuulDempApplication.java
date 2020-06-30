package com.example.zuulDemo;/*
 * @author p78o2
 * @date 2020/6/30
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulDempApplication {
    public static void main(String [] arggs){
        SpringApplication.run(ZuulDempApplication.class);
    }
}
