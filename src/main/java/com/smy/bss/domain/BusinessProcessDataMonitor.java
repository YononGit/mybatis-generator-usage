package com.smy.bss.domain;

import java.io.Serializable;
import java.util.Date;

public class BusinessProcessDataMonitor extends BusinessProcessDataMonitorKey implements Serializable {
    //最近一次数据时间
    private Date lastDataDatetime;

    //成功笔数
    private Integer successNum;

    //失败笔数
    private Integer failedNum;

    //描述说明
    private String remark;

    //创建日期时间
    private Date createDatetime;

    //更新日期时间
    private Date updateDatetime;

    private static final long serialVersionUID = 1L;

    public Date getLastDataDatetime() {
        return lastDataDatetime;
    }

    public void setLastDataDatetime(Date lastDataDatetime) {
        this.lastDataDatetime = lastDataDatetime;
    }

    public Integer getSuccessNum() {
        return successNum;
    }

    public void setSuccessNum(Integer successNum) {
        this.successNum = successNum;
    }

    public Integer getFailedNum() {
        return failedNum;
    }

    public void setFailedNum(Integer failedNum) {
        this.failedNum = failedNum;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }
}