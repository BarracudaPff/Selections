package com.samsung.users;

public abstract class User {
    String login;
    String password;
    public String name;

    public User(String login, String password, String name) {
        this.login = login;
        this.password = password;
        this.name = name;
    }
}
