package com.erd.pjitransport.model.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QuestionDetail {

    @SerializedName("choice")
    @Expose
    private String choice;
    @SerializedName("votes")
    @Expose
    private Integer votes;

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }
}
