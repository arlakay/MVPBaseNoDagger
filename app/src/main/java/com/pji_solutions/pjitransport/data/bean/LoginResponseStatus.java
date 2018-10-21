package com.pji_solutions.pjitransport.data.bean;

import java.io.Serializable;

/**
 * Created by tunggul.jati on 16/08/2018.
 */

public class LoginResponseStatus implements Serializable {

    private String code;
    private String cause;
    private String message;
    private String description;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
