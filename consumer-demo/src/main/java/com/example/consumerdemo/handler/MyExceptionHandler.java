package com.example.consumerdemo.handler;/*
 * @author p78o2
 * @date 2020/6/22
 */

import com.example.consumerdemo.callback.R;
import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class MyExceptionHandler {
    @ExceptionHandler
    @ResponseBody
    public R ErrorHandler(AuthorizationException e) {
        System.out.println(e);
        return new R (false,503,null,"无权限操作");
    }
}
