package com.smy.bss.domain;

import java.io.Serializable;
import java.util.Date;

public class ComCardActivity implements Serializable {
    //主键ID
    private String id;

    //发卡行ID
    private String cardBankId;

    //发卡行名称
    private String cardBankName;

    //卡组织ID
    private String cardIssueId;

    //卡组织名称
    private String cardIssueName;

    //活动ID
    private String activityId;

    //活动标题
    private String activityTitle;

    //图片URL(大规格)
    private String imgUrlL;

    //图片URL(小规格)
    private String imgUrlS;

    //是否上线：Y-是，N-否
    private String isOnline;

    //备注
    private String remark;

    //创建人
    private String createUsr;

    //创建日期
    private Date createDatetime;

    //修改人
    private String updateUsr;

    //修改日期
    private Date updateDatetime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCardBankId() {
        return cardBankId;
    }

    public void setCardBankId(String cardBankId) {
        this.cardBankId = cardBankId;
    }

    public String getCardBankName() {
        return cardBankName;
    }

    public void setCardBankName(String cardBankName) {
        this.cardBankName = cardBankName;
    }

    public String getCardIssueId() {
        return cardIssueId;
    }

    public void setCardIssueId(String cardIssueId) {
        this.cardIssueId = cardIssueId;
    }

    public String getCardIssueName() {
        return cardIssueName;
    }

    public void setCardIssueName(String cardIssueName) {
        this.cardIssueName = cardIssueName;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getActivityTitle() {
        return activityTitle;
    }

    public void setActivityTitle(String activityTitle) {
        this.activityTitle = activityTitle;
    }

    public String getImgUrlL() {
        return imgUrlL;
    }

    public void setImgUrlL(String imgUrlL) {
        this.imgUrlL = imgUrlL;
    }

    public String getImgUrlS() {
        return imgUrlS;
    }

    public void setImgUrlS(String imgUrlS) {
        this.imgUrlS = imgUrlS;
    }

    public String getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(String isOnline) {
        this.isOnline = isOnline;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreateUsr() {
        return createUsr;
    }

    public void setCreateUsr(String createUsr) {
        this.createUsr = createUsr;
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public String getUpdateUsr() {
        return updateUsr;
    }

    public void setUpdateUsr(String updateUsr) {
        this.updateUsr = updateUsr;
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }
}