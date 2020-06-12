package com.example.consumerdemo.mapper;/*
 * @author p78o2
 * @date 2020/6/12
 */

import com.example.commondemo.domain.UserShiro;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Set;

@Mapper
public interface UserMapper {
    @Select("select roleName from role where id in (select roleId from usershirorole where userId = (select id from usershiro where userName = #{userName}))")
    Set<String> getRoles(@Param("userName")String userName);

    @Select("select permissionsName from permissions where id in (select permissionId from rolepermission where roleId in (select roleId from usershirorole where userId = (select id from usershiro where userName = #{userName})))")
    Set<String> getPermissions(@Param("userName")String userName);

    @Select("select * from usershiro where userName = #{userName}")
    UserShiro getByUsername(@Param("userName")String userName);
}
