package com.pji_solutions.pjitransport.data.request;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tunggul.jati on 16/08/2018.
 */

public class LoginReq {

    @SerializedName("email")
    public String email;
    @SerializedName("password")
    public String password;
    @SerializedName("username")
    public String username;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
