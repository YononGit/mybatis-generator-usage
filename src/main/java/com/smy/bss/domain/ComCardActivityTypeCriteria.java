package com.smy.bss.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ComCardActivityTypeCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public ComCardActivityTypeCriteria() {
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

        public Criteria andActivityTypeIsNull() {
            addCriterion("ACTIVITY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIsNotNull() {
            addCriterion("ACTIVITY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andActivityTypeEqualTo(String value) {
            addCriterion("ACTIVITY_TYPE =", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotEqualTo(String value) {
            addCriterion("ACTIVITY_TYPE <>", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeGreaterThan(String value) {
            addCriterion("ACTIVITY_TYPE >", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_TYPE >=", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLessThan(String value) {
            addCriterion("ACTIVITY_TYPE <", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_TYPE <=", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeLike(String value) {
            addCriterion("ACTIVITY_TYPE like", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotLike(String value) {
            addCriterion("ACTIVITY_TYPE not like", value, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeIn(List<String> values) {
            addCriterion("ACTIVITY_TYPE in", values, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotIn(List<String> values) {
            addCriterion("ACTIVITY_TYPE not in", values, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeBetween(String value1, String value2) {
            addCriterion("ACTIVITY_TYPE between", value1, value2, "activityType");
            return (Criteria) this;
        }

        public Criteria andActivityTypeNotBetween(String value1, String value2) {
            addCriterion("ACTIVITY_TYPE not between", value1, value2, "activityType");
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

        public Criteria andActivitySubtitleIsNull() {
            addCriterion("ACTIVITY_SUBTITLE is null");
            return (Criteria) this;
        }

        public Criteria andActivitySubtitleIsNotNull() {
            addCriterion("ACTIVITY_SUBTITLE is not null");
            return (Criteria) this;
        }

        public Criteria andActivitySubtitleEqualTo(String value) {
            addCriterion("ACTIVITY_SUBTITLE =", value, "activitySubtitle");
            return (Criteria) this;
        }

        public Criteria andActivitySubtitleNotEqualTo(String value) {
            addCriterion("ACTIVITY_SUBTITLE <>", value, "activitySubtitle");
            return (Criteria) this;
        }

        public Criteria andActivitySubtitleGreaterThan(String value) {
            addCriterion("ACTIVITY_SUBTITLE >", value, "activitySubtitle");
            return (Criteria) this;
        }

        public Criteria andActivitySubtitleGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_SUBTITLE >=", value, "activitySubtitle");
            return (Criteria) this;
        }

        public Criteria andActivitySubtitleLessThan(String value) {
            addCriterion("ACTIVITY_SUBTITLE <", value, "activitySubtitle");
            return (Criteria) this;
        }

        public Criteria andActivitySubtitleLessThanOrEqualTo(String value) {
            addCriterion("ACTIVITY_SUBTITLE <=", value, "activitySubtitle");
            return (Criteria) this;
        }

        public Criteria andActivitySubtitleLike(String value) {
            addCriterion("ACTIVITY_SUBTITLE like", value, "activitySubtitle");
            return (Criteria) this;
        }

        public Criteria andActivitySubtitleNotLike(String value) {
            addCriterion("ACTIVITY_SUBTITLE not like", value, "activitySubtitle");
            return (Criteria) this;
        }

        public Criteria andActivitySubtitleIn(List<String> values) {
            addCriterion("ACTIVITY_SUBTITLE in", values, "activitySubtitle");
            return (Criteria) this;
        }

        public Criteria andActivitySubtitleNotIn(List<String> values) {
            addCriterion("ACTIVITY_SUBTITLE not in", values, "activitySubtitle");
            return (Criteria) this;
        }

        public Criteria andActivitySubtitleBetween(String value1, String value2) {
            addCriterion("ACTIVITY_SUBTITLE between", value1, value2, "activitySubtitle");
            return (Criteria) this;
        }

        public Criteria andActivitySubtitleNotBetween(String value1, String value2) {
            addCriterion("ACTIVITY_SUBTITLE not between", value1, value2, "activitySubtitle");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNull() {
            addCriterion("IMG_URL is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNotNull() {
            addCriterion("IMG_URL is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlEqualTo(String value) {
            addCriterion("IMG_URL =", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotEqualTo(String value) {
            addCriterion("IMG_URL <>", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThan(String value) {
            addCriterion("IMG_URL >", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("IMG_URL >=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThan(String value) {
            addCriterion("IMG_URL <", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThanOrEqualTo(String value) {
            addCriterion("IMG_URL <=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLike(String value) {
            addCriterion("IMG_URL like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotLike(String value) {
            addCriterion("IMG_URL not like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlIn(List<String> values) {
            addCriterion("IMG_URL in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotIn(List<String> values) {
            addCriterion("IMG_URL not in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlBetween(String value1, String value2) {
            addCriterion("IMG_URL between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotBetween(String value1, String value2) {
            addCriterion("IMG_URL not between", value1, value2, "imgUrl");
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