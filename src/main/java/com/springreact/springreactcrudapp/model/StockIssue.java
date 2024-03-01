package com.springreact.springreactcrudapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class StockIssue {
    @Id
    @SequenceGenerator(
        name = "user_id_sequence",
        sequenceName = "user_id_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "user_id_sequence"
    )
    private Long id;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    private String dscrCd;
    private String dscrSubCd;
    private String dscrNm;
    private String branchCd;
    private String clientCd;
    private String purchaserName;
    private String purchaserAgentName;
    private String purchaserPlanKbn; // 1: "Continue listing", 2: "Delisting scheduled", 3:3: If "free entry" [ post-purchase schedule (comments) from the TOB stocks list screen will be displayed.]
    private String purchaserPlan; // value will depend on the value of purchaserPlanKbn
    private String ofrTermDateFrom;
    private String ofrTermTimeFrom;
    private String ofrTermDateTo;
    private String ofrTermTimeTo;
    private String tradeDay;
    private String tradeProcessDay;
    private String payStartDay;
    private String ofrPrice;
    private String purchaseCount;
    private String agreeNumberMax;
    private String maxPurchaseCount; // if not null, display the value // if null, checkbox checkboxCheckedMax = true
    private String minPurchaseCount; // // if not null, display the value // if null, checkbox checkboxCheckedMin = true
    private String purchaseType;  // if partial, the ff 3 checkboxes should be checked
    private String applicantsNet;
    private String applicantsIfa;
    private String applicantsCorporation;
    private String stockCertificateType;
    private String applicationsCountTotal;
    private String purchaseCountTotal;
    private String conversionCountTotal;
    private String compensationSecurities;
    private String dscrSts; // not displayed in ui
    private String instructionsUploadFlag; // not displayed in ui
    private String notificationUploadFlag; // not displayed in ui
    private String zeroShareFlag; //not displayed in ui
    private String revocationDay;
    private String revocationReason;
    private String updateDt;
    private String updateUser;
    public String getDscrCd() {
        return dscrCd;
    }
    public void setDscrCd(String dscrCd) {
        this.dscrCd = dscrCd;
    }
    public String getDscrSubCd() {
        return dscrSubCd;
    }
    public void setDscrSubCd(String dscrSubCd) {
        this.dscrSubCd = dscrSubCd;
    }
    public String getDscrNm() {
        return dscrNm;
    }
    public void setDscrNm(String dscrNm) {
        this.dscrNm = dscrNm;
    }
    public String getBranchCd() {
        return branchCd;
    }
    public void setBranchCd(String branchCd) {
        this.branchCd = branchCd;
    }
    public String getClientCd() {
        return clientCd;
    }
    public void setClientCd(String clientCd) {
        this.clientCd = clientCd;
    }
    public String getPurchaserName() {
        return purchaserName;
    }
    public void setPurchaserName(String purchaserName) {
        this.purchaserName = purchaserName;
    }
    public String getPurchaserAgentName() {
        return purchaserAgentName;
    }
    public void setPurchaserAgentName(String purchaserAgentName) {
        this.purchaserAgentName = purchaserAgentName;
    }
    public String getPurchaserPlanKbn() {
        return purchaserPlanKbn;
    }
    public void setPurchaserPlanKbn(String purchaserPlanKbn) {
        this.purchaserPlanKbn = purchaserPlanKbn;
    }
    public String getPurchaserPlan() {
        return purchaserPlan;
    }
    public void setPurchaserPlan(String purchaserPlan) {
        this.purchaserPlan = purchaserPlan;
    }
    public String getOfrTermDateFrom() {
        return ofrTermDateFrom;
    }
    public void setOfrTermDateFrom(String ofrTermDateFrom) {
        this.ofrTermDateFrom = ofrTermDateFrom;
    }
    public String getOfrTermTimeFrom() {
        return ofrTermTimeFrom;
    }
    public void setOfrTermTimeFrom(String ofrTermTimeFrom) {
        this.ofrTermTimeFrom = ofrTermTimeFrom;
    }
    public String getOfrTermDateTo() {
        return ofrTermDateTo;
    }
    public void setOfrTermDateTo(String ofrTermDateTo) {
        this.ofrTermDateTo = ofrTermDateTo;
    }
    public String getOfrTermTimeTo() {
        return ofrTermTimeTo;
    }
    public void setOfrTermTimeTo(String ofrTermTimeTo) {
        this.ofrTermTimeTo = ofrTermTimeTo;
    }
    public String getTradeDay() {
        return tradeDay;
    }
    public void setTradeDay(String tradeDay) {
        this.tradeDay = tradeDay;
    }
    public String getTradeProcessDay() {
        return tradeProcessDay;
    }
    public void setTradeProcessDay(String tradeProcessDay) {
        this.tradeProcessDay = tradeProcessDay;
    }
    public String getPayStartDay() {
        return payStartDay;
    }
    public void setPayStartDay(String payStartDay) {
        this.payStartDay = payStartDay;
    }
    public String getOfrPrice() {
        return ofrPrice;
    }
    public void setOfrPrice(String ofrPrice) {
        this.ofrPrice = ofrPrice;
    }
    public String getPurchaseCount() {
        return purchaseCount;
    }
    public void setPurchaseCount(String purchaseCount) {
        this.purchaseCount = purchaseCount;
    }
    public String getAgreeNumberMax() {
        return agreeNumberMax;
    }
    public void setAgreeNumberMax(String agreeNumberMax) {
        this.agreeNumberMax = agreeNumberMax;
    }
    public String getMaxPurchaseCount() {
        return maxPurchaseCount;
    }
    public void setMaxPurchaseCount(String maxPurchaseCount) {
        this.maxPurchaseCount = maxPurchaseCount;
    }
    public String getMinPurchaseCount() {
        return minPurchaseCount;
    }
    public void setMinPurchaseCount(String minPurchaseCount) {
        this.minPurchaseCount = minPurchaseCount;
    }
    public String getPurchaseType() {
        return purchaseType;
    }
    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
    }
    public String getApplicantsNet() {
        return applicantsNet;
    }
    public void setApplicantsNet(String applicantsNet) {
        this.applicantsNet = applicantsNet;
    }
    public String getApplicantsIfa() {
        return applicantsIfa;
    }
    public void setApplicantsIfa(String applicantsIfa) {
        this.applicantsIfa = applicantsIfa;
    }
    public String getApplicantsCorporation() {
        return applicantsCorporation;
    }
    public void setApplicantsCorporation(String applicantsCorporation) {
        this.applicantsCorporation = applicantsCorporation;
    }
    public String getStockCertificateType() {
        return stockCertificateType;
    }
    public void setStockCertificateType(String stockCertificateType) {
        this.stockCertificateType = stockCertificateType;
    }
    public String getApplicationsCountTotal() {
        return applicationsCountTotal;
    }
    public void setApplicationsCountTotal(String applicationsCountTotal) {
        this.applicationsCountTotal = applicationsCountTotal;
    }
    public String getPurchaseCountTotal() {
        return purchaseCountTotal;
    }
    public void setPurchaseCountTotal(String purchaseCountTotal) {
        this.purchaseCountTotal = purchaseCountTotal;
    }
    public String getConversionCountTotal() {
        return conversionCountTotal;
    }
    public void setConversionCountTotal(String conversionCountTotal) {
        this.conversionCountTotal = conversionCountTotal;
    }
    public String getCompensationSecurities() {
        return compensationSecurities;
    }
    public void setCompensationSecurities(String compensationSecurities) {
        this.compensationSecurities = compensationSecurities;
    }
    public String getDscrSts() {
        return dscrSts;
    }
    public void setDscrSts(String dscrSts) {
        this.dscrSts = dscrSts;
    }
    public String getInstructionsUploadFlag() {
        return instructionsUploadFlag;
    }
    public void setInstructionsUploadFlag(String instructionsUploadFlag) {
        this.instructionsUploadFlag = instructionsUploadFlag;
    }
    public String getNotificationUploadFlag() {
        return notificationUploadFlag;
    }
    public void setNotificationUploadFlag(String notificationUploadFlag) {
        this.notificationUploadFlag = notificationUploadFlag;
    }
    public String getZeroShareFlag() {
        return zeroShareFlag;
    }
    public void setZeroShareFlag(String zeroShareFlag) {
        this.zeroShareFlag = zeroShareFlag;
    }
    public String getRevocationDay() {
        return revocationDay;
    }
    public void setRevocationDay(String revocationDay) {
        this.revocationDay = revocationDay;
    }
    public String getRevocationReason() {
        return revocationReason;
    }
    public void setRevocationReason(String revocationReason) {
        this.revocationReason = revocationReason;
    }
    public String getUpdateDt() {
        return updateDt;
    }
    public void setUpdateDt(String updateDt) {
        this.updateDt = updateDt;
    }
    public String getUpdateUser() {
        return updateUser;
    }
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }



    

    
}
