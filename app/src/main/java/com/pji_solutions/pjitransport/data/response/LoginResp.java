package com.pji_solutions.pjitransport.data.response;

import com.pji_solutions.pjitransport.data.bean.LoginResponseBody;
import com.pji_solutions.pjitransport.data.bean.LoginResponseStatus;

import java.io.Serializable;

/**
 * Created by tunggul.jati on 16/08/2018.
 */

public class LoginResp implements Serializable {

    private LoginResponseStatus status;
    private LoginResponseBody body;
    private String token;

    public LoginResponseStatus getStatus() {
        return status;
    }

    public void setStatus(LoginResponseStatus status) {
        this.status = status;
    }

    public LoginResponseBody getBody() {
        return body;
    }

    public void setBody(LoginResponseBody body) {
        this.body = body;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
