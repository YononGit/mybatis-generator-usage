package com.smy.bss.domain;

import java.io.Serializable;
import java.util.Date;

public class ShareInfo implements Serializable {
    //序号
    private String id;

    //显示页面 01:首页,02:授信等待页,03:借款成功页
    private String showPage;

    //标题
    private String title;

    //内容
    private String content;

    //详情URL
    private String detailUrl;

    //图片URL
    private String imgUrl;

    //创建日期时间
    private Date createDatetime;

    //更新日期时间
    private Date updateDatetime;

    //是否活动页  0  不是   1  是 
    private String isEventPage;

    //开关状态  0  关闭  1 开启
    private String isOn;

    //APP版本信息
    private String appVersion;

    //活动标题
    private String eventTitle;

    //活动连接
    private String eventUrl;

    //MGM图片url
    private String mgmImgUrl;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShowPage() {
        return showPage;
    }

    public void setShowPage(String showPage) {
        this.showPage = showPage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
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

    public String getIsEventPage() {
        return isEventPage;
    }

    public void setIsEventPage(String isEventPage) {
        this.isEventPage = isEventPage;
    }

    public String getIsOn() {
        return isOn;
    }

    public void setIsOn(String isOn) {
        this.isOn = isOn;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public String getEventUrl() {
        return eventUrl;
    }

    public void setEventUrl(String eventUrl) {
        this.eventUrl = eventUrl;
    }

    public String getMgmImgUrl() {
        return mgmImgUrl;
    }

    public void setMgmImgUrl(String mgmImgUrl) {
        this.mgmImgUrl = mgmImgUrl;
    }
}