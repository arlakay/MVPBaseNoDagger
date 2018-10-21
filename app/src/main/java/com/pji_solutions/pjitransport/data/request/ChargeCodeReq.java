package com.pji_solutions.pjitransport.data.request;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tunggul.jati on 16/08/2018.
 */

public class ChargeCodeReq {
    @SerializedName("activeStatus")
    private Integer activeStatus;
    @SerializedName("code")
    private String code;
    @SerializedName("createdBy")
    private String createdBy;
    @SerializedName("createdTime")
    private String createdTime;
    @SerializedName("description")
    private String description;
    @SerializedName("id")
    private String id;
    @SerializedName("imageUrl")
    private String imageUrl;
    @SerializedName("owner")
    private String owner;
    @SerializedName("updatedBy")
    private String updatedBy;
    @SerializedName("updatedTime")
    private String updatedTime;

    public Integer getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(Integer activeStatus) {
        this.activeStatus = activeStatus;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
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
}
