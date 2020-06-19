package com.example.consumerdemo.service.impl;/*
 * @author p78o2
 * @date 2020/6/12
 */

import com.example.commondemo.domain.po.Permissions;
import com.example.commondemo.domain.po.Role;
import com.example.commondemo.domain.po.User;
import com.example.consumerdemo.mapper.UserMapper;
import com.example.consumerdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Service
public class UserServiceImpl  implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByName(String getMapByName) {
//        return getMapByName(getMapByName);
        return  getMapBySqlName(getMapByName);
    }

    /**
     * sql数据库查询
     * @param userName
     * @return
     */
    public User getMapBySqlName(String userName){
        Set<Role> roleSet = userMapper.getRoles(userName);
        for(Role role : roleSet){
            role.setPermissions(userMapper.getPermissions(role.getId()));
        }
        User user = new User();
        user = userMapper.getByUsername(userName);
        user.setRoles(roleSet);
        return user;
    }


    /**
     * 模拟数据库查询
     * @param userName
     * @return
     */
    private User getMapByName(String userName){
        //共添加两个用户，两个用户都是admin一个角色，
        //wsl有query和add权限，zhangsan只有一个query权限
        Permissions permissions1 = new Permissions(1,"query");
        Permissions permissions2 = new Permissions(2,"add");
        Set<Permissions> permissionsSet = new HashSet<>();
        permissionsSet.add(permissions1);
        permissionsSet.add(permissions2);
        Role role = new Role(1,"admin",permissionsSet);
//        Role role2 = new Role("2","user",permissionsSet);
        Set<Role> roleSet = new HashSet<>();
        roleSet.add(role);
//        roleSet.add(role2);
        User user = new User(1,"wsl","123456",roleSet);
        Map<String ,User> map = new HashMap<>();
        map.put(user.getUserName(), user);

        Permissions permissions3 = new Permissions(3,"query");
        Set<Permissions> permissionsSet1 = new HashSet<>();
        permissionsSet1.add(permissions3);
        Role role1 = new Role(1,"user",permissionsSet1);
        Set<Role> roleSet1 = new HashSet<>();
        roleSet1.add(role1);
        User user1 = new User(2,"zhangsan","123456",roleSet1);
        map.put(user1.getUserName(), user1);
        return map.get(userName);
    }
}
