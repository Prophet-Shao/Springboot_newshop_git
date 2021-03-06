package com.ss.springbootNewshop.bean;

import java.math.BigDecimal;
import java.util.Date;

public class StockOut {
    private Long stockInoutId;

    private String invoiceCode;

    private String refrence;

    private Long moveTypeId;

    private String moveTypeName;

    private Date createDate;

    private Long createBy;

    private Date modifiedDate;

    private Long modifiedBy;

    private String stockhouseCode;

    private String processStatus;

    private String processStatusName;

    private BigDecimal totalMoney;

    private BigDecimal totalQty;

    private String ext1;

    private String ext2;

    private String ext3;

    private String memo;

    private Long auditBy;

    private Date auditTime;

    private Long accountSetId;

    public Long getStockInoutId() {
        return stockInoutId;
    }

    public void setStockInoutId(Long stockInoutId) {
        this.stockInoutId = stockInoutId;
    }

    public String getInvoiceCode() {
        return invoiceCode;
    }

    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode == null ? null : invoiceCode.trim();
    }

    public String getRefrence() {
        return refrence;
    }

    public void setRefrence(String refrence) {
        this.refrence = refrence == null ? null : refrence.trim();
    }

    public Long getMoveTypeId() {
        return moveTypeId;
    }

    public void setMoveTypeId(Long moveTypeId) {
        this.moveTypeId = moveTypeId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Long getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Long modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getStockhouseCode() {
        return stockhouseCode;
    }

    public void setStockhouseCode(String stockhouseCode) {
        this.stockhouseCode = stockhouseCode == null ? null : stockhouseCode.trim();
    }

    public String getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus == null ? null : processStatus.trim();
    }

    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    public BigDecimal getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(BigDecimal totalQty) {
        this.totalQty = totalQty;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1 == null ? null : ext1.trim();
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2 == null ? null : ext2.trim();
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3 == null ? null : ext3.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Long getAuditBy() {
        return auditBy;
    }

    public void setAuditBy(Long auditBy) {
        this.auditBy = auditBy;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public Long getAccountSetId() {
        return accountSetId;
    }

    public void setAccountSetId(Long accountSetId) {
        this.accountSetId = accountSetId;
    }

    public String getMoveTypeName() {
        return moveTypeName;
    }

    public void setMoveTypeName(String moveTypeName) {
        this.moveTypeName = moveTypeName;
    }

    public String getProcessStatusName() {
        return processStatusName;
    }

    public void setProcessStatusName(String processStatusName) {
        this.processStatusName = processStatusName;
    }

    @Override
    public String toString() {
        return "StockOut{" +
                "stockInoutId=" + stockInoutId +
                ", invoiceCode='" + invoiceCode + '\'' +
                ", refrence='" + refrence + '\'' +
                ", moveTypeId=" + moveTypeId +
                ", moveTypeName='" + moveTypeName + '\'' +
                ", createDate=" + createDate +
                ", createBy=" + createBy +
                ", modifiedDate=" + modifiedDate +
                ", modifiedBy=" + modifiedBy +
                ", stockhouseCode='" + stockhouseCode + '\'' +
                ", processStatus='" + processStatus + '\'' +
                ", processStatusName='" + processStatusName + '\'' +
                ", totalMoney=" + totalMoney +
                ", totalQty=" + totalQty +
                ", ext1='" + ext1 + '\'' +
                ", ext2='" + ext2 + '\'' +
                ", ext3='" + ext3 + '\'' +
                ", memo='" + memo + '\'' +
                ", auditBy=" + auditBy +
                ", auditTime=" + auditTime +
                ", accountSetId=" + accountSetId +
                '}';
    }
}