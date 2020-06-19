package com.example.commondemo.domain.po;/*
 * @author p78o2
 * @date 2020/6/19
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "用户角色关联表")
public class UserRole {
    @ApiModelProperty(value = "自增主键id")
    private int id;
    @ApiModelProperty(value = "角色id")
    private int roleId;
    @ApiModelProperty(value = "用户id")
    private int userId;

    @Override
    public String toString() {
        return "UserRole{" +
                "id=" + id +
                ", roleId=" + roleId +
                ", userId=" + userId +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public UserRole() {
    }

    public UserRole(int id, int roleId, int userId) {
        this.id = id;
        this.roleId = roleId;
        this.userId = userId;
    }
}
