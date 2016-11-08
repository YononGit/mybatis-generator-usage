package com.smy.bss.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShareInfoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ShareInfoCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setPageSize(int pageSize) {
        this.pageSize=pageSize;
    }

    public int getPageSize() {
        return pageSize;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andShowPageIsNull() {
            addCriterion("SHOW_PAGE is null");
            return (Criteria) this;
        }

        public Criteria andShowPageIsNotNull() {
            addCriterion("SHOW_PAGE is not null");
            return (Criteria) this;
        }

        public Criteria andShowPageEqualTo(String value) {
            addCriterion("SHOW_PAGE =", value, "showPage");
            return (Criteria) this;
        }

        public Criteria andShowPageNotEqualTo(String value) {
            addCriterion("SHOW_PAGE <>", value, "showPage");
            return (Criteria) this;
        }

        public Criteria andShowPageGreaterThan(String value) {
            addCriterion("SHOW_PAGE >", value, "showPage");
            return (Criteria) this;
        }

        public Criteria andShowPageGreaterThanOrEqualTo(String value) {
            addCriterion("SHOW_PAGE >=", value, "showPage");
            return (Criteria) this;
        }

        public Criteria andShowPageLessThan(String value) {
            addCriterion("SHOW_PAGE <", value, "showPage");
            return (Criteria) this;
        }

        public Criteria andShowPageLessThanOrEqualTo(String value) {
            addCriterion("SHOW_PAGE <=", value, "showPage");
            return (Criteria) this;
        }

        public Criteria andShowPageLike(String value) {
            addCriterion("SHOW_PAGE like", value, "showPage");
            return (Criteria) this;
        }

        public Criteria andShowPageNotLike(String value) {
            addCriterion("SHOW_PAGE not like", value, "showPage");
            return (Criteria) this;
        }

        public Criteria andShowPageIn(List<String> values) {
            addCriterion("SHOW_PAGE in", values, "showPage");
            return (Criteria) this;
        }

        public Criteria andShowPageNotIn(List<String> values) {
            addCriterion("SHOW_PAGE not in", values, "showPage");
            return (Criteria) this;
        }

        public Criteria andShowPageBetween(String value1, String value2) {
            addCriterion("SHOW_PAGE between", value1, value2, "showPage");
            return (Criteria) this;
        }

        public Criteria andShowPageNotBetween(String value1, String value2) {
            addCriterion("SHOW_PAGE not between", value1, value2, "showPage");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andDetailUrlIsNull() {
            addCriterion("detail_url is null");
            return (Criteria) this;
        }

        public Criteria andDetailUrlIsNotNull() {
            addCriterion("detail_url is not null");
            return (Criteria) this;
        }

        public Criteria andDetailUrlEqualTo(String value) {
            addCriterion("detail_url =", value, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlNotEqualTo(String value) {
            addCriterion("detail_url <>", value, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlGreaterThan(String value) {
            addCriterion("detail_url >", value, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlGreaterThanOrEqualTo(String value) {
            addCriterion("detail_url >=", value, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlLessThan(String value) {
            addCriterion("detail_url <", value, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlLessThanOrEqualTo(String value) {
            addCriterion("detail_url <=", value, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlLike(String value) {
            addCriterion("detail_url like", value, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlNotLike(String value) {
            addCriterion("detail_url not like", value, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlIn(List<String> values) {
            addCriterion("detail_url in", values, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlNotIn(List<String> values) {
            addCriterion("detail_url not in", values, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlBetween(String value1, String value2) {
            addCriterion("detail_url between", value1, value2, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlNotBetween(String value1, String value2) {
            addCriterion("detail_url not between", value1, value2, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNull() {
            addCriterion("img_url is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNotNull() {
            addCriterion("img_url is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlEqualTo(String value) {
            addCriterion("img_url =", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotEqualTo(String value) {
            addCriterion("img_url <>", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThan(String value) {
            addCriterion("img_url >", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("img_url >=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThan(String value) {
            addCriterion("img_url <", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThanOrEqualTo(String value) {
            addCriterion("img_url <=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLike(String value) {
            addCriterion("img_url like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotLike(String value) {
            addCriterion("img_url not like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlIn(List<String> values) {
            addCriterion("img_url in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotIn(List<String> values) {
            addCriterion("img_url not in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlBetween(String value1, String value2) {
            addCriterion("img_url between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotBetween(String value1, String value2) {
            addCriterion("img_url not between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIsNull() {
            addCriterion("CREATE_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIsNotNull() {
            addCriterion("CREATE_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeEqualTo(Date value) {
            addCriterion("CREATE_DATETIME =", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotEqualTo(Date value) {
            addCriterion("CREATE_DATETIME <>", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeGreaterThan(Date value) {
            addCriterion("CREATE_DATETIME >", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATETIME >=", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeLessThan(Date value) {
            addCriterion("CREATE_DATETIME <", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATETIME <=", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIn(List<Date> values) {
            addCriterion("CREATE_DATETIME in", values, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotIn(List<Date> values) {
            addCriterion("CREATE_DATETIME not in", values, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATETIME between", value1, value2, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATETIME not between", value1, value2, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIsNull() {
            addCriterion("UPDATE_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIsNotNull() {
            addCriterion("UPDATE_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeEqualTo(Date value) {
            addCriterion("UPDATE_DATETIME =", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotEqualTo(Date value) {
            addCriterion("UPDATE_DATETIME <>", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeGreaterThan(Date value) {
            addCriterion("UPDATE_DATETIME >", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATETIME >=", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLessThan(Date value) {
            addCriterion("UPDATE_DATETIME <", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATETIME <=", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIn(List<Date> values) {
            addCriterion("UPDATE_DATETIME in", values, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotIn(List<Date> values) {
            addCriterion("UPDATE_DATETIME not in", values, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATETIME between", value1, value2, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATETIME not between", value1, value2, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andIsEventPageIsNull() {
            addCriterion("IS_EVENT_PAGE is null");
            return (Criteria) this;
        }

        public Criteria andIsEventPageIsNotNull() {
            addCriterion("IS_EVENT_PAGE is not null");
            return (Criteria) this;
        }

        public Criteria andIsEventPageEqualTo(String value) {
            addCriterion("IS_EVENT_PAGE =", value, "isEventPage");
            return (Criteria) this;
        }

        public Criteria andIsEventPageNotEqualTo(String value) {
            addCriterion("IS_EVENT_PAGE <>", value, "isEventPage");
            return (Criteria) this;
        }

        public Criteria andIsEventPageGreaterThan(String value) {
            addCriterion("IS_EVENT_PAGE >", value, "isEventPage");
            return (Criteria) this;
        }

        public Criteria andIsEventPageGreaterThanOrEqualTo(String value) {
            addCriterion("IS_EVENT_PAGE >=", value, "isEventPage");
            return (Criteria) this;
        }

        public Criteria andIsEventPageLessThan(String value) {
            addCriterion("IS_EVENT_PAGE <", value, "isEventPage");
            return (Criteria) this;
        }

        public Criteria andIsEventPageLessThanOrEqualTo(String value) {
            addCriterion("IS_EVENT_PAGE <=", value, "isEventPage");
            return (Criteria) this;
        }

        public Criteria andIsEventPageLike(String value) {
            addCriterion("IS_EVENT_PAGE like", value, "isEventPage");
            return (Criteria) this;
        }

        public Criteria andIsEventPageNotLike(String value) {
            addCriterion("IS_EVENT_PAGE not like", value, "isEventPage");
            return (Criteria) this;
        }

        public Criteria andIsEventPageIn(List<String> values) {
            addCriterion("IS_EVENT_PAGE in", values, "isEventPage");
            return (Criteria) this;
        }

        public Criteria andIsEventPageNotIn(List<String> values) {
            addCriterion("IS_EVENT_PAGE not in", values, "isEventPage");
            return (Criteria) this;
        }

        public Criteria andIsEventPageBetween(String value1, String value2) {
            addCriterion("IS_EVENT_PAGE between", value1, value2, "isEventPage");
            return (Criteria) this;
        }

        public Criteria andIsEventPageNotBetween(String value1, String value2) {
            addCriterion("IS_EVENT_PAGE not between", value1, value2, "isEventPage");
            return (Criteria) this;
        }

        public Criteria andIsOnIsNull() {
            addCriterion("IS_ON is null");
            return (Criteria) this;
        }

        public Criteria andIsOnIsNotNull() {
            addCriterion("IS_ON is not null");
            return (Criteria) this;
        }

        public Criteria andIsOnEqualTo(String value) {
            addCriterion("IS_ON =", value, "isOn");
            return (Criteria) this;
        }

        public Criteria andIsOnNotEqualTo(String value) {
            addCriterion("IS_ON <>", value, "isOn");
            return (Criteria) this;
        }

        public Criteria andIsOnGreaterThan(String value) {
            addCriterion("IS_ON >", value, "isOn");
            return (Criteria) this;
        }

        public Criteria andIsOnGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ON >=", value, "isOn");
            return (Criteria) this;
        }

        public Criteria andIsOnLessThan(String value) {
            addCriterion("IS_ON <", value, "isOn");
            return (Criteria) this;
        }

        public Criteria andIsOnLessThanOrEqualTo(String value) {
            addCriterion("IS_ON <=", value, "isOn");
            return (Criteria) this;
        }

        public Criteria andIsOnLike(String value) {
            addCriterion("IS_ON like", value, "isOn");
            return (Criteria) this;
        }

        public Criteria andIsOnNotLike(String value) {
            addCriterion("IS_ON not like", value, "isOn");
            return (Criteria) this;
        }

        public Criteria andIsOnIn(List<String> values) {
            addCriterion("IS_ON in", values, "isOn");
            return (Criteria) this;
        }

        public Criteria andIsOnNotIn(List<String> values) {
            addCriterion("IS_ON not in", values, "isOn");
            return (Criteria) this;
        }

        public Criteria andIsOnBetween(String value1, String value2) {
            addCriterion("IS_ON between", value1, value2, "isOn");
            return (Criteria) this;
        }

        public Criteria andIsOnNotBetween(String value1, String value2) {
            addCriterion("IS_ON not between", value1, value2, "isOn");
            return (Criteria) this;
        }

        public Criteria andAppVersionIsNull() {
            addCriterion("APP_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andAppVersionIsNotNull() {
            addCriterion("APP_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andAppVersionEqualTo(String value) {
            addCriterion("APP_VERSION =", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotEqualTo(String value) {
            addCriterion("APP_VERSION <>", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionGreaterThan(String value) {
            addCriterion("APP_VERSION >", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionGreaterThanOrEqualTo(String value) {
            addCriterion("APP_VERSION >=", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionLessThan(String value) {
            addCriterion("APP_VERSION <", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionLessThanOrEqualTo(String value) {
            addCriterion("APP_VERSION <=", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionLike(String value) {
            addCriterion("APP_VERSION like", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotLike(String value) {
            addCriterion("APP_VERSION not like", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionIn(List<String> values) {
            addCriterion("APP_VERSION in", values, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotIn(List<String> values) {
            addCriterion("APP_VERSION not in", values, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionBetween(String value1, String value2) {
            addCriterion("APP_VERSION between", value1, value2, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotBetween(String value1, String value2) {
            addCriterion("APP_VERSION not between", value1, value2, "appVersion");
            return (Criteria) this;
        }

        public Criteria andEventTitleIsNull() {
            addCriterion("EVENT_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andEventTitleIsNotNull() {
            addCriterion("EVENT_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andEventTitleEqualTo(String value) {
            addCriterion("EVENT_TITLE =", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleNotEqualTo(String value) {
            addCriterion("EVENT_TITLE <>", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleGreaterThan(String value) {
            addCriterion("EVENT_TITLE >", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleGreaterThanOrEqualTo(String value) {
            addCriterion("EVENT_TITLE >=", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleLessThan(String value) {
            addCriterion("EVENT_TITLE <", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleLessThanOrEqualTo(String value) {
            addCriterion("EVENT_TITLE <=", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleLike(String value) {
            addCriterion("EVENT_TITLE like", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleNotLike(String value) {
            addCriterion("EVENT_TITLE not like", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleIn(List<String> values) {
            addCriterion("EVENT_TITLE in", values, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleNotIn(List<String> values) {
            addCriterion("EVENT_TITLE not in", values, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleBetween(String value1, String value2) {
            addCriterion("EVENT_TITLE between", value1, value2, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleNotBetween(String value1, String value2) {
            addCriterion("EVENT_TITLE not between", value1, value2, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventUrlIsNull() {
            addCriterion("EVENT_URL is null");
            return (Criteria) this;
        }

        public Criteria andEventUrlIsNotNull() {
            addCriterion("EVENT_URL is not null");
            return (Criteria) this;
        }

        public Criteria andEventUrlEqualTo(String value) {
            addCriterion("EVENT_URL =", value, "eventUrl");
            return (Criteria) this;
        }

        public Criteria andEventUrlNotEqualTo(String value) {
            addCriterion("EVENT_URL <>", value, "eventUrl");
            return (Criteria) this;
        }

        public Criteria andEventUrlGreaterThan(String value) {
            addCriterion("EVENT_URL >", value, "eventUrl");
            return (Criteria) this;
        }

        public Criteria andEventUrlGreaterThanOrEqualTo(String value) {
            addCriterion("EVENT_URL >=", value, "eventUrl");
            return (Criteria) this;
        }

        public Criteria andEventUrlLessThan(String value) {
            addCriterion("EVENT_URL <", value, "eventUrl");
            return (Criteria) this;
        }

        public Criteria andEventUrlLessThanOrEqualTo(String value) {
            addCriterion("EVENT_URL <=", value, "eventUrl");
            return (Criteria) this;
        }

        public Criteria andEventUrlLike(String value) {
            addCriterion("EVENT_URL like", value, "eventUrl");
            return (Criteria) this;
        }

        public Criteria andEventUrlNotLike(String value) {
            addCriterion("EVENT_URL not like", value, "eventUrl");
            return (Criteria) this;
        }

        public Criteria andEventUrlIn(List<String> values) {
            addCriterion("EVENT_URL in", values, "eventUrl");
            return (Criteria) this;
        }

        public Criteria andEventUrlNotIn(List<String> values) {
            addCriterion("EVENT_URL not in", values, "eventUrl");
            return (Criteria) this;
        }

        public Criteria andEventUrlBetween(String value1, String value2) {
            addCriterion("EVENT_URL between", value1, value2, "eventUrl");
            return (Criteria) this;
        }

        public Criteria andEventUrlNotBetween(String value1, String value2) {
            addCriterion("EVENT_URL not between", value1, value2, "eventUrl");
            return (Criteria) this;
        }

        public Criteria andMgmImgUrlIsNull() {
            addCriterion("MGM_IMG_URL is null");
            return (Criteria) this;
        }

        public Criteria andMgmImgUrlIsNotNull() {
            addCriterion("MGM_IMG_URL is not null");
            return (Criteria) this;
        }

        public Criteria andMgmImgUrlEqualTo(String value) {
            addCriterion("MGM_IMG_URL =", value, "mgmImgUrl");
            return (Criteria) this;
        }

        public Criteria andMgmImgUrlNotEqualTo(String value) {
            addCriterion("MGM_IMG_URL <>", value, "mgmImgUrl");
            return (Criteria) this;
        }

        public Criteria andMgmImgUrlGreaterThan(String value) {
            addCriterion("MGM_IMG_URL >", value, "mgmImgUrl");
            return (Criteria) this;
        }

        public Criteria andMgmImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("MGM_IMG_URL >=", value, "mgmImgUrl");
            return (Criteria) this;
        }

        public Criteria andMgmImgUrlLessThan(String value) {
            addCriterion("MGM_IMG_URL <", value, "mgmImgUrl");
            return (Criteria) this;
        }

        public Criteria andMgmImgUrlLessThanOrEqualTo(String value) {
            addCriterion("MGM_IMG_URL <=", value, "mgmImgUrl");
            return (Criteria) this;
        }

        public Criteria andMgmImgUrlLike(String value) {
            addCriterion("MGM_IMG_URL like", value, "mgmImgUrl");
            return (Criteria) this;
        }

        public Criteria andMgmImgUrlNotLike(String value) {
            addCriterion("MGM_IMG_URL not like", value, "mgmImgUrl");
            return (Criteria) this;
        }

        public Criteria andMgmImgUrlIn(List<String> values) {
            addCriterion("MGM_IMG_URL in", values, "mgmImgUrl");
            return (Criteria) this;
        }

        public Criteria andMgmImgUrlNotIn(List<String> values) {
            addCriterion("MGM_IMG_URL not in", values, "mgmImgUrl");
            return (Criteria) this;
        }

        public Criteria andMgmImgUrlBetween(String value1, String value2) {
            addCriterion("MGM_IMG_URL between", value1, value2, "mgmImgUrl");
            return (Criteria) this;
        }

        public Criteria andMgmImgUrlNotBetween(String value1, String value2) {
            addCriterion("MGM_IMG_URL not between", value1, value2, "mgmImgUrl");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}