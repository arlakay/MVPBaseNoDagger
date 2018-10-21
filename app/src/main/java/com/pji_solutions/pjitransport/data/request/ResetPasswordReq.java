package com.pji_solutions.pjitransport.data.request;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tunggul.jati on 16/08/2018.
 */

public class ResetPasswordReq {

    @SerializedName("email")
    public String email;
    @SerializedName("newPwd")
    public String newPwd;
    @SerializedName("oldPwd")
    public String oldPwd;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNewPwd() {
        return newPwd;
    }

    public void setNewPwd(String newPwd) {
        this.newPwd = newPwd;
    }

    public String getOldPwd() {
        return oldPwd;
    }

    public void setOldPwd(String oldPwd) {
        this.oldPwd = oldPwd;
    }
}
