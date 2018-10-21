package com.pji_solutions.pjitransport.data.bean;

import java.io.Serializable;

/**
 * Created by tunggul.jati on 16/08/2018.
 */

public class TrxContent implements Serializable {

    public String id;
    public String requestedBy;
    public String code;
    public String pickUp;
    public String dropOff;
    public double pickCorLong;
    public double pickCorLat;
    public double dropCorLong;
    public double dropCorLat;
    public long transactionDate;
    public String description;
    public String status;
    public String voucherCode;
    public String createdBy;
    public long createdTime;
    public Object approvedBy;
    public long approvedTime;
    public Object rejectedBy;
    public long rejectedTime;
    public String note;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public long getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(long transactionDate) {
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

    public long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(long createdTime) {
        this.createdTime = createdTime;
    }

    public Object getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(Object approvedBy) {
        this.approvedBy = approvedBy;
    }

    public long getApprovedTime() {
        return approvedTime;
    }

    public void setApprovedTime(long approvedTime) {
        this.approvedTime = approvedTime;
    }

    public Object getRejectedBy() {
        return rejectedBy;
    }

    public void setRejectedBy(Object rejectedBy) {
        this.rejectedBy = rejectedBy;
    }

    public long getRejectedTime() {
        return rejectedTime;
    }

    public void setRejectedTime(long rejectedTime) {
        this.rejectedTime = rejectedTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
