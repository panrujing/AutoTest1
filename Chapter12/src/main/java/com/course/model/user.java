package com.course.model;


import lombok.Data;

@Data
public class user {
    private int id;
    private String username;
    private String password;
    private String age;
    private String sex;

    @Override
    public String toString() {
        return (
                "{id:" + id + "," +
                "username:" + username + "," +
                "password:" + password + "," +
                "age:" + age + "," +
                "sex:" + sex + "}"
        );
    }
}
