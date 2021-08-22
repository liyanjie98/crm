package com.sf.model;

import java.util.Date;

public class AccountingDetail {
    private Integer seqNo;

    private Integer headId;

    private Integer payActNo;

    private String payActName;

    private String payBankName;

    private Integer payBankNo;

    private Integer payeeActNo;

    private String payeeActName;

    private String payMoney;

    private String summary;

    private Date dealDate;

    private Date dealTime;

    private String dealRtnCode;

    private String dealRtnMsg;

    public Integer getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
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

    public Integer getPayeeActNo() {
        return payeeActNo;
    }

    public void setPayeeActNo(Integer payeeActNo) {
        this.payeeActNo = payeeActNo;
    }

    public String getPayeeActName() {
        return payeeActName;
    }

    public void setPayeeActName(String payeeActName) {
        this.payeeActName = payeeActName;
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
}