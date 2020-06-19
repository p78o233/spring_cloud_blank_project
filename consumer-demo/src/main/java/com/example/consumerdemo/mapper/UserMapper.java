package com.example.consumerdemo.mapper;/*
 * @author p78o2
 * @date 2020/6/12
 */

import com.example.commondemo.domain.po.Permissions;
import com.example.commondemo.domain.po.Role;
import com.example.commondemo.domain.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Set;

@Mapper
public interface UserMapper {
    @Select("select * from role where id in (select roleId from userrole where userId = (select id from user where userName = #{userName}))")
    Set<Role> getRoles(@Param("userName")String userName);

    @Select("select * from permissions where id in (select permissionId from rolepermission where roleId = #{roleId})")
    Set<Permissions> getPermissions(@Param("roleId")int roleId);

    @Select("select * from user where userName = #{userName}")
    User getByUsername(@Param("userName")String userName);
}
