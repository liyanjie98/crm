package com.sf.model;

import java.util.Date;

public class BusinessDetail {
    private Integer id;

    private Integer headId;

    private Integer payActNo;

    private String payActName;

    private String payBankName;

    private Integer payBankNo;

    private String payMoney;

    private String summary;

    private Integer status;

    private Date dealDate;

    private Date dealTime;

    private String dealRtnCode;

    private String dealRtnMsg;

    private Integer relMainId;

    private Integer seqNo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHeadId() {
        return headId;
    }

    public void setHeadId(Integer headId) {
        this.headId = headId;
    }

    public Integer getPayActNo() {
        return payActNo;
    }

    public void setPayActNo(Integer payActNo) {
        this.payActNo = payActNo;
    }

    public String getPayActName() {
        return payActName;
    }

    public void setPayActName(String payActName) {
        this.payActName = payActName;
    }

    public String getPayBankName() {
        return payBankName;
    }

    public void setPayBankName(String payBankName) {
        this.payBankName = payBankName;
    }

    public Integer getPayBankNo() {
        return payBankNo;
    }

    public void setPayBankNo(Integer payBankNo) {
        this.payBankNo = payBankNo;
    }

    public String getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(String payMoney) {
        this.payMoney = payMoney;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getDealDate() {
        return dealDate;
    }

    public void setDealDate(Date dealDate) {
        this.dealDate = dealDate;
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public String getDealRtnCode() {
        return dealRtnCode;
    }

    public void setDealRtnCode(String dealRtnCode) {
        this.dealRtnCode = dealRtnCode;
    }

    public String getDealRtnMsg() {
        return dealRtnMsg;
    }

    public void setDealRtnMsg(String dealRtnMsg) {
        this.dealRtnMsg = dealRtnMsg;
    }

    public Integer getRelMainId() {
        return relMainId;
    }

    public void setRelMainId(Integer relMainId) {
        this.relMainId = relMainId;
    }

    public Integer getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }
}