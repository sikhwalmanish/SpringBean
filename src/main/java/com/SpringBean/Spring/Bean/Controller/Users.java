package com.SpringBean.Spring.Bean.Controller;

import org.springframework.stereotype.Component;

@Component
public class Users {

    String name;
    int age;

    public Users() {
    }

    public Users(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
