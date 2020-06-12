package com.example.commondemo.domain;/*
 * @author p78o2
 * @date 2020/6/11
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "权限表")
public class Permissions {
    @ApiModelProperty(value = "自增主键id")
    private Integer id;
    @ApiModelProperty(value = "权限名称")
    private String permissionsName;

    public Permissions() {
    }

    @Override
    public String toString() {
        return "Permissions{" +
                "id=" + id +
                ", permissionsName='" + permissionsName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermissionsName() {
        return permissionsName;
    }

    public void setPermissionsName(String permissionsName) {
        this.permissionsName = permissionsName;
    }

    public Permissions(Integer id, String permissionsName) {
        this.id = id;
        this.permissionsName = permissionsName;
    }
}
