package com.example.consumerdemo.service;/*
 * @author p78o2
 * @date 2020/6/9
 */

import com.example.api.service.IDemoApi;
import com.example.consumerdemo.breaker.DemoServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="demo-provider", fallback = DemoServiceFallback.class)
public interface DemoFeignService extends IDemoApi {
}
