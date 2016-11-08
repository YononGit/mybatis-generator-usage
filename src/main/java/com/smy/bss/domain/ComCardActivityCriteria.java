package com.smy.bss.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ComCardActivityCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ComCardActivityCriteria() {
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

        public Criteria andCardBankIdIsNull() {
            addCriterion("CARD_BANK_ID is null");
            return (Criteria) this;
        }

        public Criteria andCardBankIdIsNotNull() {
            addCriterion("CARD_BANK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCardBankIdEqualTo(String value) {
            addCriterion("CARD_BANK_ID =", value, "cardBankId");
            return (Criteria) this;
        }

        public Criteria andCardBankIdNotEqualTo(String value) {
            addCriterion("CARD_BANK_ID <>", value, "cardBankId");
            return (Criteria) this;
        }

        public Criteria andCardBankIdGreaterThan(String value) {
            addCriterion("CARD_BANK_ID >", value, "cardBankId");
            return (Criteria) this;
        }

        public Criteria andCardBankIdGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_BANK_ID >=", value, "cardBankId");
            return (Criteria) this;
        }

        public Criteria andCardBankIdLessThan(String value) {
            addCriterion("CARD_BANK_ID <", value, "cardBankId");
            return (Criteria) this;
        }

        public Criteria andCardBankIdLessThanOrEqualTo(String value) {
            addCriterion("CARD_BANK_ID <=", value, "cardBankId");
            return (Criteria) this;
        }

        public Criteria andCardBankIdLike(String value) {
            addCriterion("CARD_BANK_ID like", value, "cardBankId");
            return (Criteria) this;
        }

        public Criteria andCardBankIdNotLike(String value) {
            addCriterion("CARD_BANK_ID not like", value, "cardBankId");
            return (Criteria) this;
        }

        public Criteria andCardBankIdIn(List<String> values) {
            addCriterion("CARD_BANK_ID in", values, "cardBankId");
            return (Criteria) this;
        }

        public Criteria andCardBankIdNotIn(List<String> values) {
            addCriterion("CARD_BANK_ID not in", values, "cardBankId");
            return (Criteria) this;
        }

        public Criteria andCardBankIdBetween(String value1, String value2) {
            addCriterion("CARD_BANK_ID between", value1, value2, "cardBankId");
            return (Criteria) this;
        }

        public Criteria andCardBankIdNotBetween(String value1, String value2) {
            addCriterion("CARD_BANK_ID not between", value1, value2, "cardBankId");
            return (Criteria) this;
        }

        public Criteria andCardBankNameIsNull() {
            addCriterion("CARD_BANK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCardBankNameIsNotNull() {
            addCriterion("CARD_BANK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCardBankNameEqualTo(String value) {
            addCriterion("CARD_BANK_NAME =", value, "cardBankName");
            return (Criteria) this;
        }

        public Criteria andCardBankNameNotEqualTo(String value) {
            addCriterion("CARD_BANK_NAME <>", value, "cardBankName");
            return (Criteria) this;
        }

        public Criteria andCardBankNameGreaterThan(String value) {
            addCriterion("CARD_BANK_NAME >", value, "cardBankName");
            return (Criteria) this;
        }

        public Criteria andCardBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_BANK_NAME >=", value, "cardBankName");
            return (Criteria) this;
        }

        public Criteria andCardBankNameLessThan(String value) {
            addCriterion("CARD_BANK_NAME <", value, "cardBankName");
            return (Criteria) this;
        }

        public Criteria andCardBankNameLessThanOrEqualTo(String value) {
            addCriterion("CARD_BANK_NAME <=", value, "cardBankName");
            return (Criteria) this;
        }

        public Criteria andCardBankNameLike(String value) {
            addCriterion("CARD_BANK_NAME like", value, "cardBankName");
            return (Criteria) this;
        }

        public Criteria andCardBankNameNotLike(String value) {
            addCriterion("CARD_BANK_NAME not like", value, "cardBankName");
            return (Criteria) this;
        }

        public Criteria andCardBankNameIn(List<String> values) {
            addCriterion("CARD_BANK_NAME in", values, "cardBankName");
            return (Criteria) this;
        }

        public Criteria andCardBankNameNotIn(List<String> values) {
            addCriterion("CARD_BANK_NAME not in", values, "cardBankName");
            return (Criteria) this;
        }

        public Criteria andCardBankNameBetween(String value1, String value2) {
            addCriterion("CARD_BANK_NAME between", value1, value2, "cardBankName");
            return (Criteria) this;
        }

        public Criteria andCardBankNameNotBetween(String value1, String value2) {
            addCriterion("CARD_BANK_NAME not between", value1, value2, "cardBankName");
            return (Criteria) this;
        }

        public Criteria andCardIssueIdIsNull() {
            addCriterion("CARD_ISSUE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCardIssueIdIsNotNull() {
            addCriterion("CARD_ISSUE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCardIssueIdEqualTo(String value) {
            addCriterion("CARD_ISSUE_ID =", value, "cardIssueId");
            return (Criteria) this;
        }

        public Criteria andCardIssueIdNotEqualTo(String value) {
            addCriterion("CARD_ISSUE_ID <>", value, "cardIssueId");
            return (Criteria) this;
        }

        public Criteria andCardIssueIdGreaterThan(String value) {
            addCriterion("CARD_ISSUE_ID >", value, "cardIssueId");
            return (Criteria) this;
        }

        public Criteria andCardIssueIdGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_ISSUE_ID >=", value, "cardIssueId");
            return (Criteria) this;
        }

        public Criteria andCardIssueIdLessThan(String value) {
            addCriterion("CARD_ISSUE_ID <", value, "cardIssueId");
            return (Criteria) this;
        }

        public Criteria andCardIssueIdLessThanOrEqualTo(String value) {
            addCriterion("CARD_ISSUE_ID <=", value, "cardIssueId");
            return (Criteria) this;
        }

        public Criteria andCardIssueIdLike(String value) {
            addCriterion("CARD_ISSUE_ID like", value, "cardIssueId");
            return (Criteria) this;
        }

        public Criteria andCardIssueIdNotLike(String value) {
            addCriterion("CARD_ISSUE_ID not like", value, "cardIssueId");
            return (Criteria) this;
        }

        public Criteria andCardIssueIdIn(List<String> values) {
            addCriterion("CARD_ISSUE_ID in", values, "cardIssueId");
            return (Criteria) this;
        }

        public Criteria andCardIssueIdNotIn(List<String> values) {
            addCriterion("CARD_ISSUE_ID not in", values, "cardIssueId");
            return (Criteria) this;
        }

        public Criteria andCardIssueIdBetween(String value1, String value2) {
            addCriterion("CARD_ISSUE_ID between", value1, value2, "cardIssueId");
            return (Criteria) this;
        }

        public Criteria andCardIssueIdNotBetween(String value1, String value2) {
            addCriterion("CARD_ISSUE_ID not between", value1, value2, "cardIssueId");
            return (Criteria) this;
        }

        public Criteria andCardIssueNameIsNull() {
            addCriterion("CARD_ISSUE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCardIssueNameIsNotNull() {
            addCriterion("CARD_ISSUE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCardIssueNameEqualTo(String value) {
            addCriterion("CARD_ISSUE_NAME =", value, "cardIssueName");
            return (Criteria) this;
        }

        public Criteria andCardIssueNameNotEqualTo(String value) {
            addCriterion("CARD_ISSUE_NAME <>", value, "cardIssueName");
            return (Criteria) this;
        }

        public Criteria andCardIssueNameGreaterThan(String value) {
            addCriterion("CARD_ISSUE_NAME >", value, "cardIssueName");
            return (Criteria) this;
        }

        public Criteria andCardIssueNameGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_ISSUE_NAME >=", value, "cardIssueName");
            return (Criteria) this;
        }

        public Criteria andCardIssueNameLessThan(String value) {
            addCriterion("CARD_ISSUE_NAME <", value, "cardIssueName");
            return (Criteria) this;
        }

        public Criteria andCardIssueNameLessThanOrEqualTo(String value) {
            addCriterion("CARD_ISSUE_NAME <=", value, "cardIssueName");
            return (Criteria) this;
        }

        public Criteria andCardIssueNameLike(String value) {
            addCriterion("CARD_ISSUE_NAME like", value, "cardIssueName");
            return (Criteria) this;
        }

        public Criteria andCardIssueNameNotLike(String value) {
            addCriterion("CARD_ISSUE_NAME not like", value, "cardIssueName");
            return (Criteria) this;
        }

        public Criteria andCardIssueNameIn(List<String> values) {
            addCriterion("CARD_ISSUE_NAME in", values, "cardIssueName");
            return (Criteria) this;
        }

        public Criteria andCardIssueNameNotIn(List<String> values) {
            addCriterion("CARD_ISSUE_NAME not in", values, "cardIssueName");
            return (Criteria) this;
        }

        public Criteria andCardIssueNameBetween(String value1, String value2) {
            addCriterion("CARD_ISSUE_NAME between", value1, value2, "cardIssueName");
            return (Criteria) this;
        }

        public Criteria andCardIssueNameNotBetween(String value1, String value2) {
            addCriterion("CARD_ISSUE_NAME not between", value1, value2, "cardIssueName");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNull() {
            addCriterion("ACTIVITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("ACTIVITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(String value) {
            addCriterion("ACTIVITY_ID =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(String value) {
            addCriterion("ACTIVITY_ID <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(String value) {
            addCriterion("ACTIVITY_ID >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_ID >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(String value) {
            addCriterion("ACTIVITY_ID <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_ID <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLike(String value) {
            addCriterion("ACTIVITY_ID like", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotLike(String value) {
            addCriterion("ACTIVITY_ID not like", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<String> values) {
            addCriterion("ACTIVITY_ID in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<String> values) {
            addCriterion("ACTIVITY_ID not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(String value1, String value2) {
            addCriterion("ACTIVITY_ID between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(String value1, String value2) {
            addCriterion("ACTIVITY_ID not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityTitleIsNull() {
            addCriterion("ACTIVITY_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andActivityTitleIsNotNull() {
            addCriterion("ACTIVITY_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andActivityTitleEqualTo(String value) {
            addCriterion("ACTIVITY_TITLE =", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleNotEqualTo(String value) {
            addCriterion("ACTIVITY_TITLE <>", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleGreaterThan(String value) {
            addCriterion("ACTIVITY_TITLE >", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_TITLE >=", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleLessThan(String value) {
            addCriterion("ACTIVITY_TITLE <", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_TITLE <=", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleLike(String value) {
            addCriterion("ACTIVITY_TITLE like", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleNotLike(String value) {
            addCriterion("ACTIVITY_TITLE not like", value, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleIn(List<String> values) {
            addCriterion("ACTIVITY_TITLE in", values, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleNotIn(List<String> values) {
            addCriterion("ACTIVITY_TITLE not in", values, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleBetween(String value1, String value2) {
            addCriterion("ACTIVITY_TITLE between", value1, value2, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andActivityTitleNotBetween(String value1, String value2) {
            addCriterion("ACTIVITY_TITLE not between", value1, value2, "activityTitle");
            return (Criteria) this;
        }

        public Criteria andImgUrlLIsNull() {
            addCriterion("IMG_URL_L is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlLIsNotNull() {
            addCriterion("IMG_URL_L is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlLEqualTo(String value) {
            addCriterion("IMG_URL_L =", value, "imgUrlL");
            return (Criteria) this;
        }

        public Criteria andImgUrlLNotEqualTo(String value) {
            addCriterion("IMG_URL_L <>", value, "imgUrlL");
            return (Criteria) this;
        }

        public Criteria andImgUrlLGreaterThan(String value) {
            addCriterion("IMG_URL_L >", value, "imgUrlL");
            return (Criteria) this;
        }

        public Criteria andImgUrlLGreaterThanOrEqualTo(String value) {
            addCriterion("IMG_URL_L >=", value, "imgUrlL");
            return (Criteria) this;
        }

        public Criteria andImgUrlLLessThan(String value) {
            addCriterion("IMG_URL_L <", value, "imgUrlL");
            return (Criteria) this;
        }

        public Criteria andImgUrlLLessThanOrEqualTo(String value) {
            addCriterion("IMG_URL_L <=", value, "imgUrlL");
            return (Criteria) this;
        }

        public Criteria andImgUrlLLike(String value) {
            addCriterion("IMG_URL_L like", value, "imgUrlL");
            return (Criteria) this;
        }

        public Criteria andImgUrlLNotLike(String value) {
            addCriterion("IMG_URL_L not like", value, "imgUrlL");
            return (Criteria) this;
        }

        public Criteria andImgUrlLIn(List<String> values) {
            addCriterion("IMG_URL_L in", values, "imgUrlL");
            return (Criteria) this;
        }

        public Criteria andImgUrlLNotIn(List<String> values) {
            addCriterion("IMG_URL_L not in", values, "imgUrlL");
            return (Criteria) this;
        }

        public Criteria andImgUrlLBetween(String value1, String value2) {
            addCriterion("IMG_URL_L between", value1, value2, "imgUrlL");
            return (Criteria) this;
        }

        public Criteria andImgUrlLNotBetween(String value1, String value2) {
            addCriterion("IMG_URL_L not between", value1, value2, "imgUrlL");
            return (Criteria) this;
        }

        public Criteria andImgUrlSIsNull() {
            addCriterion("IMG_URL_S is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlSIsNotNull() {
            addCriterion("IMG_URL_S is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlSEqualTo(String value) {
            addCriterion("IMG_URL_S =", value, "imgUrlS");
            return (Criteria) this;
        }

        public Criteria andImgUrlSNotEqualTo(String value) {
            addCriterion("IMG_URL_S <>", value, "imgUrlS");
            return (Criteria) this;
        }

        public Criteria andImgUrlSGreaterThan(String value) {
            addCriterion("IMG_URL_S >", value, "imgUrlS");
            return (Criteria) this;
        }

        public Criteria andImgUrlSGreaterThanOrEqualTo(String value) {
            addCriterion("IMG_URL_S >=", value, "imgUrlS");
            return (Criteria) this;
        }

        public Criteria andImgUrlSLessThan(String value) {
            addCriterion("IMG_URL_S <", value, "imgUrlS");
            return (Criteria) this;
        }

        public Criteria andImgUrlSLessThanOrEqualTo(String value) {
            addCriterion("IMG_URL_S <=", value, "imgUrlS");
            return (Criteria) this;
        }

        public Criteria andImgUrlSLike(String value) {
            addCriterion("IMG_URL_S like", value, "imgUrlS");
            return (Criteria) this;
        }

        public Criteria andImgUrlSNotLike(String value) {
            addCriterion("IMG_URL_S not like", value, "imgUrlS");
            return (Criteria) this;
        }

        public Criteria andImgUrlSIn(List<String> values) {
            addCriterion("IMG_URL_S in", values, "imgUrlS");
            return (Criteria) this;
        }

        public Criteria andImgUrlSNotIn(List<String> values) {
            addCriterion("IMG_URL_S not in", values, "imgUrlS");
            return (Criteria) this;
        }

        public Criteria andImgUrlSBetween(String value1, String value2) {
            addCriterion("IMG_URL_S between", value1, value2, "imgUrlS");
            return (Criteria) this;
        }

        public Criteria andImgUrlSNotBetween(String value1, String value2) {
            addCriterion("IMG_URL_S not between", value1, value2, "imgUrlS");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIsNull() {
            addCriterion("IS_ONLINE is null");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIsNotNull() {
            addCriterion("IS_ONLINE is not null");
            return (Criteria) this;
        }

        public Criteria andIsOnlineEqualTo(String value) {
            addCriterion("IS_ONLINE =", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotEqualTo(String value) {
            addCriterion("IS_ONLINE <>", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineGreaterThan(String value) {
            addCriterion("IS_ONLINE >", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ONLINE >=", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineLessThan(String value) {
            addCriterion("IS_ONLINE <", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineLessThanOrEqualTo(String value) {
            addCriterion("IS_ONLINE <=", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineLike(String value) {
            addCriterion("IS_ONLINE like", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotLike(String value) {
            addCriterion("IS_ONLINE not like", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIn(List<String> values) {
            addCriterion("IS_ONLINE in", values, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotIn(List<String> values) {
            addCriterion("IS_ONLINE not in", values, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineBetween(String value1, String value2) {
            addCriterion("IS_ONLINE between", value1, value2, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotBetween(String value1, String value2) {
            addCriterion("IS_ONLINE not between", value1, value2, "isOnline");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreateUsrIsNull() {
            addCriterion("CREATE_USR is null");
            return (Criteria) this;
        }

        public Criteria andCreateUsrIsNotNull() {
            addCriterion("CREATE_USR is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUsrEqualTo(String value) {
            addCriterion("CREATE_USR =", value, "createUsr");
            return (Criteria) this;
        }

        public Criteria andCreateUsrNotEqualTo(String value) {
            addCriterion("CREATE_USR <>", value, "createUsr");
            return (Criteria) this;
        }

        public Criteria andCreateUsrGreaterThan(String value) {
            addCriterion("CREATE_USR >", value, "createUsr");
            return (Criteria) this;
        }

        public Criteria andCreateUsrGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USR >=", value, "createUsr");
            return (Criteria) this;
        }

        public Criteria andCreateUsrLessThan(String value) {
            addCriterion("CREATE_USR <", value, "createUsr");
            return (Criteria) this;
        }

        public Criteria andCreateUsrLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USR <=", value, "createUsr");
            return (Criteria) this;
        }

        public Criteria andCreateUsrLike(String value) {
            addCriterion("CREATE_USR like", value, "createUsr");
            return (Criteria) this;
        }

        public Criteria andCreateUsrNotLike(String value) {
            addCriterion("CREATE_USR not like", value, "createUsr");
            return (Criteria) this;
        }

        public Criteria andCreateUsrIn(List<String> values) {
            addCriterion("CREATE_USR in", values, "createUsr");
            return (Criteria) this;
        }

        public Criteria andCreateUsrNotIn(List<String> values) {
            addCriterion("CREATE_USR not in", values, "createUsr");
            return (Criteria) this;
        }

        public Criteria andCreateUsrBetween(String value1, String value2) {
            addCriterion("CREATE_USR between", value1, value2, "createUsr");
            return (Criteria) this;
        }

        public Criteria andCreateUsrNotBetween(String value1, String value2) {
            addCriterion("CREATE_USR not between", value1, value2, "createUsr");
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

        public Criteria andUpdateUsrIsNull() {
            addCriterion("UPDATE_USR is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUsrIsNotNull() {
            addCriterion("UPDATE_USR is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUsrEqualTo(String value) {
            addCriterion("UPDATE_USR =", value, "updateUsr");
            return (Criteria) this;
        }

        public Criteria andUpdateUsrNotEqualTo(String value) {
            addCriterion("UPDATE_USR <>", value, "updateUsr");
            return (Criteria) this;
        }

        public Criteria andUpdateUsrGreaterThan(String value) {
            addCriterion("UPDATE_USR >", value, "updateUsr");
            return (Criteria) this;
        }

        public Criteria andUpdateUsrGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_USR >=", value, "updateUsr");
            return (Criteria) this;
        }

        public Criteria andUpdateUsrLessThan(String value) {
            addCriterion("UPDATE_USR <", value, "updateUsr");
            return (Criteria) this;
        }

        public Criteria andUpdateUsrLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_USR <=", value, "updateUsr");
            return (Criteria) this;
        }

        public Criteria andUpdateUsrLike(String value) {
            addCriterion("UPDATE_USR like", value, "updateUsr");
            return (Criteria) this;
        }

        public Criteria andUpdateUsrNotLike(String value) {
            addCriterion("UPDATE_USR not like", value, "updateUsr");
            return (Criteria) this;
        }

        public Criteria andUpdateUsrIn(List<String> values) {
            addCriterion("UPDATE_USR in", values, "updateUsr");
            return (Criteria) this;
        }

        public Criteria andUpdateUsrNotIn(List<String> values) {
            addCriterion("UPDATE_USR not in", values, "updateUsr");
            return (Criteria) this;
        }

        public Criteria andUpdateUsrBetween(String value1, String value2) {
            addCriterion("UPDATE_USR between", value1, value2, "updateUsr");
            return (Criteria) this;
        }

        public Criteria andUpdateUsrNotBetween(String value1, String value2) {
            addCriterion("UPDATE_USR not between", value1, value2, "updateUsr");
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