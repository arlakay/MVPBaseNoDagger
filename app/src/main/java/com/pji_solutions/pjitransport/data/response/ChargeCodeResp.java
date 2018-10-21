package com.pji_solutions.pjitransport.data.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.pji_solutions.pjitransport.data.bean.ChargeCodeContent;
import com.pji_solutions.pjitransport.data.bean.ChargeCodeSort;

import java.util.List;

/**
 * Created by tunggul.jati on 16/08/2018.
 */

public class ChargeCodeResp {

    //Get All Success Response (Charge Code & Trx)
    @SerializedName("content")
    @Expose
    public List<ChargeCodeContent> content = null;
    @SerializedName("last")
    @Expose
    public Boolean last;
    @SerializedName("totalPages")
    @Expose
    public Integer totalPages;
    @SerializedName("totalElements")
    @Expose
    public Integer totalElements;
    @SerializedName("first")
    @Expose
    public Boolean first;
    @SerializedName("sort")
    @Expose
    public List<ChargeCodeSort> sort = null;
    @SerializedName("numberOfElements")
    @Expose
    public Integer numberOfElements;
    @SerializedName("size")
    @Expose
    public Integer size;
    @SerializedName("number")
    @Expose
    public Integer number;

    public List<ChargeCodeContent> getContent() {
        return content;
    }

    public void setContent(List<ChargeCodeContent> content) {
        this.content = content;
    }

    public Boolean getLast() {
        return last;
    }

    public void setLast(Boolean last) {
        this.last = last;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
    }

    public Boolean getFirst() {
        return first;
    }

    public void setFirst(Boolean first) {
        this.first = first;
    }

    public List<ChargeCodeSort> getSort() {
        return sort;
    }

    public void setSort(List<ChargeCodeSort> sort) {
        this.sort = sort;
    }

    public Integer getNumberOfElements() {
        return numberOfElements;
    }

    public void setNumberOfElements(Integer numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
