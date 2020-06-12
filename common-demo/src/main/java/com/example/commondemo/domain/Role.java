package com.example.commondemo.domain;/*
 * @author p78o2
 * @date 2020/6/11
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(value = "角色表")
public class Role {
    @ApiModelProperty(value = "自增主键id")
    private Integer id;
    @ApiModelProperty(value = "角色名")
    private String roleName;
    @ApiModelProperty(value = "不存数据库 权限列表")
    private List<Permissions> permissionsList;

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", permissionsList=" + permissionsList +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<Permissions> getPermissionsList() {
        return permissionsList;
    }

    public void setPermissionsList(List<Permissions> permissionsList) {
        this.permissionsList = permissionsList;
    }

    public Role() {
    }

    public Role(Integer id, String roleName, List<Permissions> permissionsList) {
        this.id = id;
        this.roleName = roleName;
        this.permissionsList = permissionsList;
    }
}
