package com.sf.model;

import java.util.Date;

public class BusinessSummary {
    private String id;

    private Date procDate;

    private Integer totalCount;

    private Integer totalAmt;

    private Integer succCount;

    private Integer succAmt;

    private Integer failCount;

    private Integer failAmt;

    private Integer packNo;

    private Integer curPackNo;

    private Integer status;

    private String payeeActNo;

    private Date recvDate;

    private Date recvTime;

    private String relMainId;

    private String relMainKhId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getProcDate() {
        return procDate;
    }

    public void setProcDate(Date procDate) {
        this.procDate = procDate;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(Integer totalAmt) {
        this.totalAmt = totalAmt;
    }

    public Integer getSuccCount() {
        return succCount;
    }

    public void setSuccCount(Integer succCount) {
        this.succCount = succCount;
    }

    public Integer getSuccAmt() {
        return succAmt;
    }

    public void setSuccAmt(Integer succAmt) {
        this.succAmt = succAmt;
    }

    public Integer getFailCount() {
        return failCount;
    }

    public void setFailCount(Integer failCount) {
        this.failCount = failCount;
    }

    public Integer getFailAmt() {
        return failAmt;
    }

    public void setFailAmt(Integer failAmt) {
        this.failAmt = failAmt;
    }

    public Integer getPackNo() {
        return packNo;
    }

    public void setPackNo(Integer packNo) {
        this.packNo = packNo;
    }

    public Integer getCurPackNo() {
        return curPackNo;
    }

    public void setCurPackNo(Integer curPackNo) {
        this.curPackNo = curPackNo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPayeeActNo() {
        return payeeActNo;
    }

    public void setPayeeActNo(String payeeActNo) {
        this.payeeActNo = payeeActNo;
    }

    public Date getRecvDate() {
        return recvDate;
    }

    public void setRecvDate(Date recvDate) {
        this.recvDate = recvDate;
    }

    public Date getRecvTime() {
        return recvTime;
    }

    public void setRecvTime(Date recvTime) {
        this.recvTime = recvTime;
    }

    public String getRelMainId() {
        return relMainId;
    }

    public void setRelMainId(String relMainId) {
        this.relMainId = relMainId;
    }

    public String getRelMainKhId() {
        return relMainKhId;
    }

    public void setRelMainKhId(String relMainKhId) {
        this.relMainKhId = relMainKhId;
    }
}