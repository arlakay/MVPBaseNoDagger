package com.erd.pjitransport.model.resp;

import com.erd.pjitransport.model.bean.QuestionDetail;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class QuestionResp {
    @SerializedName("choices")
    @Expose
    private List<QuestionDetail> choices = null;

    public List<QuestionDetail> getChoices() {
        return choices;
    }

    public void setChoices(List<QuestionDetail> choices) {
        this.choices = choices;
    }

}
