package com.smy.bss.domain;

import java.io.Serializable;

public class BusinessProcessDataMonitorKey implements Serializable {
    //监控日期
    private Integer monitorDate;

    //监控阶段：101 CRS人行申请
	// 102 资金方人行申请
	// 103 资金方返回
	//
	// 201 CRS授信申请
	// 202 资金方授信申请
	// 203 资金方授信返回
	//
	// 301 CTS借款申请
	// 302 资金方借款申请
	// 303 资金方借款返回


    private String monitorPeriod;

    //资金方
    private String capCode;

    private static final long serialVersionUID = 1L;

    public Integer getMonitorDate() {
        return monitorDate;
    }

    public void setMonitorDate(Integer monitorDate) {
        this.monitorDate = monitorDate;
    }

    public String getMonitorPeriod() {
        return monitorPeriod;
    }

    public void setMonitorPeriod(String monitorPeriod) {
        this.monitorPeriod = monitorPeriod;
    }

    public String getCapCode() {
        return capCode;
    }

    public void setCapCode(String capCode) {
        this.capCode = capCode;
    }
}