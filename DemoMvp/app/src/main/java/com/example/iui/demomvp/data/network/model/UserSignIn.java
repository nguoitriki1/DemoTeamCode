package com.example.iui.demomvp.data.network.model;

/**
 * Created by Admin on 12/25/2017.
 */

public class UserSignIn {
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserSignIn(String email, String password) {

        this.email = email;
        this.password = password;
    }
}
