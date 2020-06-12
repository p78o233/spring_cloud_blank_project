package com.example.commondemo.domain;/*
 * @author p78o2
 * @date 2020/6/11
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

//shiro 用户表
@ApiModel("shiro用户表")
public class UserShiro {
    @ApiModelProperty(value = "主键自增id")
    private int id;
    @ApiModelProperty(value = "用户名")
    private String userName;
    @ApiModelProperty(value = "用户密码")
    private String password;
    @ApiModelProperty(value = "不存数据库，角色列表")
    private List<Role> roleList;

    public UserShiro() {
    }

    @Override
    public String toString() {
        return "UserShiro{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", roleList=" + roleList +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public UserShiro(int id, String userName, String password, List<Role> roleList) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.roleList = roleList;
    }
}
