package com.example.consumerdemo.controller;/*
 * @author p78o2
 * @date 2020/6/12
 */

import com.example.commondemo.domain.po.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/shiro")
public class UserController {
//    @GetMapping("/login/{userName}/{password}")
//    public String login(@PathVariable("userName")String userName,@PathVariable("password")String password) {
    @PostMapping("/login")
    public String login(@RequestBody User user) {
        //添加用户认证信息
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(
                user.getUserName(),
                user.getPassword()
        );
//        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(
//                userName,
//                password
//        );
        try {
            //进行验证，这里可以捕获异常，然后返回对应信息
            subject.login(usernamePasswordToken);
//            subject.checkRole("admin");
//            subject.checkPermissions("query", "add");
        } catch (AuthenticationException e) {
            e.printStackTrace();
            return "账号或密码错误！";
        } catch (AuthorizationException e) {
            e.printStackTrace();
            return "没有权限";
        }
        return "login success";
    }
    //注解验角色和权限
//    可以单独使用
//    写的是角色名称
    @RequiresRoles("admin")
//    配置多个默认且关系,logical = Logical.OR 这个是或,logical = Logical.AND 这个是且
//    @RequiresRoles(value = {"admin","user"},logical = Logical.OR)
//    写的是权限名称
    @RequiresPermissions("add")
    @GetMapping("/index")
    public String index() {
        return "index!";
    }
}
