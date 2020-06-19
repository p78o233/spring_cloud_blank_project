package com.example.commondemo.domain.po;/*
 * @author p78o2
 * @date 2020/6/11
 */

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;

@ApiModel(value = "权限表")
public class Permissions {
    @ApiModelProperty("主键id")
    private int id;
    @ApiModelProperty("权限名")
    private String permissionsName;

    @Override
    public String toString() {
        return "Permissions{" +
                "id=" + id +
                ", permissionsName='" + permissionsName + '\'' +
                '}';
    }

    public Permissions() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPermissionsName() {
        return permissionsName;
    }

    public void setPermissionsName(String permissionsName) {
        this.permissionsName = permissionsName;
    }

    public Permissions(int id, String permissionsName) {
        this.id = id;
        this.permissionsName = permissionsName;
    }
}
