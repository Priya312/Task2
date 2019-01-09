package com.example.py.task2;

import com.google.firebase.database.IgnoreExtraProperties;


@IgnoreExtraProperties
public class User {

    public String name;
    public String age;


    public User() {
    }

    public User(String name, String email) {
        this.name = name;
        this.age = email;
    }
}
