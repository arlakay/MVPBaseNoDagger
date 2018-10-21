package com.pji_solutions.pjitransport.data.request;

import com.google.gson.annotations.SerializedName;

/**
 * Created by tunggul.jati on 16/08/2018.
 */

public class TransactionReq {
    @SerializedName("requestedBy")
    private String requestedBy;
    @SerializedName("code")
    private String code;
    @SerializedName("pickUp")
    private String pickUp;
    @SerializedName("dropOff")
    private String dropOff;

    @SerializedName("pickCorLong")
    private double pickCorLong;
    @SerializedName("pickCorLat")
    private double pickCorLat;
    @SerializedName("dropCorLong")
    private double dropCorLong;
    @SerializedName("dropCorLat")
    private double dropCorLat;

    @SerializedName("transactionDate")
    private String transactionDate;
    @SerializedName("description")
    private String description;
    @SerializedName("status")
    private String status;
    @SerializedName("voucherCode")
    private String voucherCode;
    @SerializedName("createdBy")
    private String createdBy;
    @SerializedName("createdTime")
    private String createdTime;
    @SerializedName("approvedBy")
    private String approvedBy;
    @SerializedName("approvedTime")
    private String approvedTime;
    @SerializedName("rejectedBy")
    private String rejectedBy;
    @SerializedName("rejectedTime")
    private String rejectedTime;
    @SerializedName("note")
    private String note;

    public String getRequestedBy() {
        return requestedBy;
    }

    public void setRequestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPickUp() {
        return pickUp;
    }

    public void setPickUp(String pickUp) {
        this.pickUp = pickUp;
    }

    public String getDropOff() {
        return dropOff;
    }

    public void setDropOff(String dropOff) {
        this.dropOff = dropOff;
    }

    public double getPickCorLong() {
        return pickCorLong;
    }

    public void setPickCorLong(double pickCorLong) {
        this.pickCorLong = pickCorLong;
    }

    public double getPickCorLat() {
        return pickCorLat;
    }

    public void setPickCorLat(double pickCorLat) {
        this.pickCorLat = pickCorLat;
    }

    public double getDropCorLong() {
        return dropCorLong;
    }

    public void setDropCorLong(double dropCorLong) {
        this.dropCorLong = dropCorLong;
    }

    public double getDropCorLat() {
        return dropCorLat;
    }

    public void setDropCorLat(double dropCorLat) {
        this.dropCorLat = dropCorLat;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVoucherCode() {
        return voucherCode;
    }

    public void setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode;
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

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    public String getApprovedTime() {
        return approvedTime;
    }

    public void setApprovedTime(String approvedTime) {
        this.approvedTime = approvedTime;
    }

    public String getRejectedBy() {
        return rejectedBy;
    }

    public void setRejectedBy(String rejectedBy) {
        this.rejectedBy = rejectedBy;
    }

    public String getRejectedTime() {
        return rejectedTime;
    }

    public void setRejectedTime(String rejectedTime) {
        this.rejectedTime = rejectedTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
