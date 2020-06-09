package com.example.api.domain;/*
 * @author p78o2
 * @date 2020/6/8
 */

import java.io.Serializable;

public class User implements Serializable {
    private int age;
    private String name;

    public User(int age) {
        this.age = age;
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User() {
    }
}
