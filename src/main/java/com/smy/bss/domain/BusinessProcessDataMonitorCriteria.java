package com.smy.bss.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusinessProcessDataMonitorCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public BusinessProcessDataMonitorCriteria() {
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

        public Criteria andMonitorDateIsNull() {
            addCriterion("MONITOR_DATE is null");
            return (Criteria) this;
        }

        public Criteria andMonitorDateIsNotNull() {
            addCriterion("MONITOR_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorDateEqualTo(Integer value) {
            addCriterion("MONITOR_DATE =", value, "monitorDate");
            return (Criteria) this;
        }

        public Criteria andMonitorDateNotEqualTo(Integer value) {
            addCriterion("MONITOR_DATE <>", value, "monitorDate");
            return (Criteria) this;
        }

        public Criteria andMonitorDateGreaterThan(Integer value) {
            addCriterion("MONITOR_DATE >", value, "monitorDate");
            return (Criteria) this;
        }

        public Criteria andMonitorDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("MONITOR_DATE >=", value, "monitorDate");
            return (Criteria) this;
        }

        public Criteria andMonitorDateLessThan(Integer value) {
            addCriterion("MONITOR_DATE <", value, "monitorDate");
            return (Criteria) this;
        }

        public Criteria andMonitorDateLessThanOrEqualTo(Integer value) {
            addCriterion("MONITOR_DATE <=", value, "monitorDate");
            return (Criteria) this;
        }

        public Criteria andMonitorDateIn(List<Integer> values) {
            addCriterion("MONITOR_DATE in", values, "monitorDate");
            return (Criteria) this;
        }

        public Criteria andMonitorDateNotIn(List<Integer> values) {
            addCriterion("MONITOR_DATE not in", values, "monitorDate");
            return (Criteria) this;
        }

        public Criteria andMonitorDateBetween(Integer value1, Integer value2) {
            addCriterion("MONITOR_DATE between", value1, value2, "monitorDate");
            return (Criteria) this;
        }

        public Criteria andMonitorDateNotBetween(Integer value1, Integer value2) {
            addCriterion("MONITOR_DATE not between", value1, value2, "monitorDate");
            return (Criteria) this;
        }

        public Criteria andMonitorPeriodIsNull() {
            addCriterion("MONITOR_PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andMonitorPeriodIsNotNull() {
            addCriterion("MONITOR_PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorPeriodEqualTo(String value) {
            addCriterion("MONITOR_PERIOD =", value, "monitorPeriod");
            return (Criteria) this;
        }

        public Criteria andMonitorPeriodNotEqualTo(String value) {
            addCriterion("MONITOR_PERIOD <>", value, "monitorPeriod");
            return (Criteria) this;
        }

        public Criteria andMonitorPeriodGreaterThan(String value) {
            addCriterion("MONITOR_PERIOD >", value, "monitorPeriod");
            return (Criteria) this;
        }

        public Criteria andMonitorPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("MONITOR_PERIOD >=", value, "monitorPeriod");
            return (Criteria) this;
        }

        public Criteria andMonitorPeriodLessThan(String value) {
            addCriterion("MONITOR_PERIOD <", value, "monitorPeriod");
            return (Criteria) this;
        }

        public Criteria andMonitorPeriodLessThanOrEqualTo(String value) {
            addCriterion("MONITOR_PERIOD <=", value, "monitorPeriod");
            return (Criteria) this;
        }

        public Criteria andMonitorPeriodLike(String value) {
            addCriterion("MONITOR_PERIOD like", value, "monitorPeriod");
            return (Criteria) this;
        }

        public Criteria andMonitorPeriodNotLike(String value) {
            addCriterion("MONITOR_PERIOD not like", value, "monitorPeriod");
            return (Criteria) this;
        }

        public Criteria andMonitorPeriodIn(List<String> values) {
            addCriterion("MONITOR_PERIOD in", values, "monitorPeriod");
            return (Criteria) this;
        }

        public Criteria andMonitorPeriodNotIn(List<String> values) {
            addCriterion("MONITOR_PERIOD not in", values, "monitorPeriod");
            return (Criteria) this;
        }

        public Criteria andMonitorPeriodBetween(String value1, String value2) {
            addCriterion("MONITOR_PERIOD between", value1, value2, "monitorPeriod");
            return (Criteria) this;
        }

        public Criteria andMonitorPeriodNotBetween(String value1, String value2) {
            addCriterion("MONITOR_PERIOD not between", value1, value2, "monitorPeriod");
            return (Criteria) this;
        }

        public Criteria andCapCodeIsNull() {
            addCriterion("CAP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCapCodeIsNotNull() {
            addCriterion("CAP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCapCodeEqualTo(String value) {
            addCriterion("CAP_CODE =", value, "capCode");
            return (Criteria) this;
        }

        public Criteria andCapCodeNotEqualTo(String value) {
            addCriterion("CAP_CODE <>", value, "capCode");
            return (Criteria) this;
        }

        public Criteria andCapCodeGreaterThan(String value) {
            addCriterion("CAP_CODE >", value, "capCode");
            return (Criteria) this;
        }

        public Criteria andCapCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CAP_CODE >=", value, "capCode");
            return (Criteria) this;
        }

        public Criteria andCapCodeLessThan(String value) {
            addCriterion("CAP_CODE <", value, "capCode");
            return (Criteria) this;
        }

        public Criteria andCapCodeLessThanOrEqualTo(String value) {
            addCriterion("CAP_CODE <=", value, "capCode");
            return (Criteria) this;
        }

        public Criteria andCapCodeLike(String value) {
            addCriterion("CAP_CODE like", value, "capCode");
            return (Criteria) this;
        }

        public Criteria andCapCodeNotLike(String value) {
            addCriterion("CAP_CODE not like", value, "capCode");
            return (Criteria) this;
        }

        public Criteria andCapCodeIn(List<String> values) {
            addCriterion("CAP_CODE in", values, "capCode");
            return (Criteria) this;
        }

        public Criteria andCapCodeNotIn(List<String> values) {
            addCriterion("CAP_CODE not in", values, "capCode");
            return (Criteria) this;
        }

        public Criteria andCapCodeBetween(String value1, String value2) {
            addCriterion("CAP_CODE between", value1, value2, "capCode");
            return (Criteria) this;
        }

        public Criteria andCapCodeNotBetween(String value1, String value2) {
            addCriterion("CAP_CODE not between", value1, value2, "capCode");
            return (Criteria) this;
        }

        public Criteria andLastDataDatetimeIsNull() {
            addCriterion("LAST_DATA_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andLastDataDatetimeIsNotNull() {
            addCriterion("LAST_DATA_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastDataDatetimeEqualTo(Date value) {
            addCriterion("LAST_DATA_DATETIME =", value, "lastDataDatetime");
            return (Criteria) this;
        }

        public Criteria andLastDataDatetimeNotEqualTo(Date value) {
            addCriterion("LAST_DATA_DATETIME <>", value, "lastDataDatetime");
            return (Criteria) this;
        }

        public Criteria andLastDataDatetimeGreaterThan(Date value) {
            addCriterion("LAST_DATA_DATETIME >", value, "lastDataDatetime");
            return (Criteria) this;
        }

        public Criteria andLastDataDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_DATA_DATETIME >=", value, "lastDataDatetime");
            return (Criteria) this;
        }

        public Criteria andLastDataDatetimeLessThan(Date value) {
            addCriterion("LAST_DATA_DATETIME <", value, "lastDataDatetime");
            return (Criteria) this;
        }

        public Criteria andLastDataDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_DATA_DATETIME <=", value, "lastDataDatetime");
            return (Criteria) this;
        }

        public Criteria andLastDataDatetimeIn(List<Date> values) {
            addCriterion("LAST_DATA_DATETIME in", values, "lastDataDatetime");
            return (Criteria) this;
        }

        public Criteria andLastDataDatetimeNotIn(List<Date> values) {
            addCriterion("LAST_DATA_DATETIME not in", values, "lastDataDatetime");
            return (Criteria) this;
        }

        public Criteria andLastDataDatetimeBetween(Date value1, Date value2) {
            addCriterion("LAST_DATA_DATETIME between", value1, value2, "lastDataDatetime");
            return (Criteria) this;
        }

        public Criteria andLastDataDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_DATA_DATETIME not between", value1, value2, "lastDataDatetime");
            return (Criteria) this;
        }

        public Criteria andSuccessNumIsNull() {
            addCriterion("SUCCESS_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSuccessNumIsNotNull() {
            addCriterion("SUCCESS_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSuccessNumEqualTo(Integer value) {
            addCriterion("SUCCESS_NUM =", value, "successNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumNotEqualTo(Integer value) {
            addCriterion("SUCCESS_NUM <>", value, "successNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumGreaterThan(Integer value) {
            addCriterion("SUCCESS_NUM >", value, "successNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("SUCCESS_NUM >=", value, "successNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumLessThan(Integer value) {
            addCriterion("SUCCESS_NUM <", value, "successNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumLessThanOrEqualTo(Integer value) {
            addCriterion("SUCCESS_NUM <=", value, "successNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumIn(List<Integer> values) {
            addCriterion("SUCCESS_NUM in", values, "successNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumNotIn(List<Integer> values) {
            addCriterion("SUCCESS_NUM not in", values, "successNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumBetween(Integer value1, Integer value2) {
            addCriterion("SUCCESS_NUM between", value1, value2, "successNum");
            return (Criteria) this;
        }

        public Criteria andSuccessNumNotBetween(Integer value1, Integer value2) {
            addCriterion("SUCCESS_NUM not between", value1, value2, "successNum");
            return (Criteria) this;
        }

        public Criteria andFailedNumIsNull() {
            addCriterion("FAILED_NUM is null");
            return (Criteria) this;
        }

        public Criteria andFailedNumIsNotNull() {
            addCriterion("FAILED_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andFailedNumEqualTo(Integer value) {
            addCriterion("FAILED_NUM =", value, "failedNum");
            return (Criteria) this;
        }

        public Criteria andFailedNumNotEqualTo(Integer value) {
            addCriterion("FAILED_NUM <>", value, "failedNum");
            return (Criteria) this;
        }

        public Criteria andFailedNumGreaterThan(Integer value) {
            addCriterion("FAILED_NUM >", value, "failedNum");
            return (Criteria) this;
        }

        public Criteria andFailedNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("FAILED_NUM >=", value, "failedNum");
            return (Criteria) this;
        }

        public Criteria andFailedNumLessThan(Integer value) {
            addCriterion("FAILED_NUM <", value, "failedNum");
            return (Criteria) this;
        }

        public Criteria andFailedNumLessThanOrEqualTo(Integer value) {
            addCriterion("FAILED_NUM <=", value, "failedNum");
            return (Criteria) this;
        }

        public Criteria andFailedNumIn(List<Integer> values) {
            addCriterion("FAILED_NUM in", values, "failedNum");
            return (Criteria) this;
        }

        public Criteria andFailedNumNotIn(List<Integer> values) {
            addCriterion("FAILED_NUM not in", values, "failedNum");
            return (Criteria) this;
        }

        public Criteria andFailedNumBetween(Integer value1, Integer value2) {
            addCriterion("FAILED_NUM between", value1, value2, "failedNum");
            return (Criteria) this;
        }

        public Criteria andFailedNumNotBetween(Integer value1, Integer value2) {
            addCriterion("FAILED_NUM not between", value1, value2, "failedNum");
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