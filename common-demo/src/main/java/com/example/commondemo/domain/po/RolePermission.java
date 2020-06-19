package com.example.commondemo.domain.po;/*
 * @author p78o2
 * @date 2020/6/19
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "角色权限关联表")
public class RolePermission {
    @ApiModelProperty(value = "主键自增id")
    private int id;
    @ApiModelProperty(value = "角色id")
    private int roleId;
    @ApiModelProperty(value = "权限id")
    private int permissionId;

    @Override
    public String toString() {
        return "RolePermission{" +
                "id=" + id +
                ", roleId=" + roleId +
                ", permissionId=" + permissionId +
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

    public int getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
    }

    public RolePermission() {
    }

    public RolePermission(int id, int roleId, int permissionId) {
        this.id = id;
        this.roleId = roleId;
        this.permissionId = permissionId;
    }
}
