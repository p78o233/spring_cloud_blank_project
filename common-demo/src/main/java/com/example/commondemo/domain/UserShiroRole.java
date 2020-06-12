package com.example.commondemo.domain;/*
 * @author p78o2
 * @date 2020/6/11
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("用户角色关联表")
public class UserShiroRole {
    @ApiModelProperty(value = "自增主键id")
    private int id;
    @ApiModelProperty(value = "用户id")
    private int userId;
    @ApiModelProperty(value = "角色id")
    private int roleId;

    @Override
    public String toString() {
        return "UserShiroRole{" +
                "id=" + id +
                ", userId=" + userId +
                ", roleId=" + roleId +
                '}';
    }

    public UserShiroRole() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public UserShiroRole(int id, int userId, int roleId) {
        this.id = id;
        this.userId = userId;
        this.roleId = roleId;
    }
}
