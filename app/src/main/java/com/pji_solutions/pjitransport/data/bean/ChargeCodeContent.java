package com.pji_solutions.pjitransport.data.bean;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tunggul.jati on 16/08/2018.
 */

public class ChargeCodeContent {

    @SerializedName("id")
    public String id;
    @SerializedName("code")
    public String code;
    @SerializedName("description")
    public String description;
    @SerializedName("activeStatus")
    public Integer activeStatus;
    @SerializedName("owner")
    public String owner;
    @SerializedName("createdBy")
    public String createdBy;
    @SerializedName("createdTime")
    public String createdTime;
    @SerializedName("updatedBy")
    public String updatedBy;
    @SerializedName("updatedTime")
    public String updatedTime;
    @SerializedName("imageUrl")
    public String imageUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(Integer activeStatus) {
        this.activeStatus = activeStatus;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
