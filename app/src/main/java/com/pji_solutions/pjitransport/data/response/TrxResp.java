package com.pji_solutions.pjitransport.data.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.pji_solutions.pjitransport.data.bean.TrxContent;
import com.pji_solutions.pjitransport.data.bean.TrxSort;

import java.util.List;

/**
 * Created by tunggul.jati on 16/08/2018.
 */

public class TrxResp {

    @SerializedName("content")
    @Expose
    public List<TrxContent> content = null;
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
    public List<TrxSort> sort = null;
    @SerializedName("numberOfElements")
    @Expose
    public Integer numberOfElements;
    @SerializedName("size")
    @Expose
    public Integer size;
    @SerializedName("number")
    @Expose
    public Integer number;






    @SerializedName("timestamp")
    @Expose
    public Integer timestamp;
    @SerializedName("status")
    @Expose
    public String status;
    @SerializedName("error")
    @Expose
    public String error;
    @SerializedName("exception")
    @Expose
    public String exception;
    @SerializedName("message")
    @Expose
    public String message;
    @SerializedName("path")
    @Expose
    public String path;






    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("requestedBy")
    @Expose
    public String requestedBy;
    @SerializedName("code")
    @Expose
    public String code;
    @SerializedName("pickUp")
    @Expose
    public String pickUp;
    @SerializedName("dropOff")
    @Expose
    public String dropOff;
    @SerializedName("pickCorLong")
    @Expose
    public double pickCorLong;
    @SerializedName("pickCorLat")
    @Expose
    public double pickCorLat;
    @SerializedName("dropCorLong")
    @Expose
    public double dropCorLong;
    @SerializedName("dropCorLat")
    @Expose
    public double dropCorLat;
    @SerializedName("transactionDate")
    @Expose
    public long transactionDate;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("voucherCode")
    @Expose
    public String voucherCode;
    @SerializedName("createdBy")
    @Expose
    public String createdBy;
    @SerializedName("createdTime")
    @Expose
    public long createdTime;
    @SerializedName("approvedBy")
    @Expose
    public String approvedBy;
    @SerializedName("approvedTime")
    @Expose
    public long approvedTime;
    @SerializedName("rejectedBy")
    @Expose
    public String rejectedBy;
    @SerializedName("rejectedTime")
    @Expose
    public long rejectedTime;
    @SerializedName("note")
    @Expose
    public String note;

    public List<TrxContent> getContent() {
        return content;
    }

    public void setContent(List<TrxContent> content) {
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

    public List<TrxSort> getSort() {
        return sort;
    }

    public void setSort(List<TrxSort> sort) {
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

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

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

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    public long getApprovedTime() {
        return approvedTime;
    }

    public void setApprovedTime(long approvedTime) {
        this.approvedTime = approvedTime;
    }

    public String getRejectedBy() {
        return rejectedBy;
    }

    public void setRejectedBy(String rejectedBy) {
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
