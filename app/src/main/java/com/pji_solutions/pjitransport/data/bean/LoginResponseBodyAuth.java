package com.pji_solutions.pjitransport.data.bean;

import java.io.Serializable;

/**
 * Created by tunggul.jati on 16/08/2018.
 */

public class LoginResponseBodyAuth implements Serializable{

    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
