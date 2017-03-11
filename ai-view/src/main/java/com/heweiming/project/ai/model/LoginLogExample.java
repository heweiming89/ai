package com.heweiming.project.ai.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoginLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoginLogExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNull() {
            addCriterion("login_time is null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNotNull() {
            addCriterion("login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeEqualTo(Date value) {
            addCriterion("login_time =", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotEqualTo(Date value) {
            addCriterion("login_time <>", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThan(Date value) {
            addCriterion("login_time >", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("login_time >=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThan(Date value) {
            addCriterion("login_time <", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("login_time <=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIn(List<Date> values) {
            addCriterion("login_time in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotIn(List<Date> values) {
            addCriterion("login_time not in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeBetween(Date value1, Date value2) {
            addCriterion("login_time between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("login_time not between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginIpIsNull() {
            addCriterion("login_ip is null");
            return (Criteria) this;
        }

        public Criteria andLoginIpIsNotNull() {
            addCriterion("login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIpEqualTo(String value) {
            addCriterion("login_ip =", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotEqualTo(String value) {
            addCriterion("login_ip <>", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpGreaterThan(String value) {
            addCriterion("login_ip >", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("login_ip >=", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLessThan(String value) {
            addCriterion("login_ip <", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLessThanOrEqualTo(String value) {
            addCriterion("login_ip <=", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpLike(String value) {
            addCriterion("login_ip like", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotLike(String value) {
            addCriterion("login_ip not like", value, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpIn(List<String> values) {
            addCriterion("login_ip in", values, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotIn(List<String> values) {
            addCriterion("login_ip not in", values, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpBetween(String value1, String value2) {
            addCriterion("login_ip between", value1, value2, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginIpNotBetween(String value1, String value2) {
            addCriterion("login_ip not between", value1, value2, "loginIp");
            return (Criteria) this;
        }

        public Criteria andLoginStateIsNull() {
            addCriterion("login_state is null");
            return (Criteria) this;
        }

        public Criteria andLoginStateIsNotNull() {
            addCriterion("login_state is not null");
            return (Criteria) this;
        }

        public Criteria andLoginStateEqualTo(Boolean value) {
            addCriterion("login_state =", value, "loginState");
            return (Criteria) this;
        }

        public Criteria andLoginStateNotEqualTo(Boolean value) {
            addCriterion("login_state <>", value, "loginState");
            return (Criteria) this;
        }

        public Criteria andLoginStateGreaterThan(Boolean value) {
            addCriterion("login_state >", value, "loginState");
            return (Criteria) this;
        }

        public Criteria andLoginStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("login_state >=", value, "loginState");
            return (Criteria) this;
        }

        public Criteria andLoginStateLessThan(Boolean value) {
            addCriterion("login_state <", value, "loginState");
            return (Criteria) this;
        }

        public Criteria andLoginStateLessThanOrEqualTo(Boolean value) {
            addCriterion("login_state <=", value, "loginState");
            return (Criteria) this;
        }

        public Criteria andLoginStateIn(List<Boolean> values) {
            addCriterion("login_state in", values, "loginState");
            return (Criteria) this;
        }

        public Criteria andLoginStateNotIn(List<Boolean> values) {
            addCriterion("login_state not in", values, "loginState");
            return (Criteria) this;
        }

        public Criteria andLoginStateBetween(Boolean value1, Boolean value2) {
            addCriterion("login_state between", value1, value2, "loginState");
            return (Criteria) this;
        }

        public Criteria andLoginStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("login_state not between", value1, value2, "loginState");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserIsNull() {
            addCriterion("login_browser is null");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserIsNotNull() {
            addCriterion("login_browser is not null");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserEqualTo(String value) {
            addCriterion("login_browser =", value, "loginBrowser");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserNotEqualTo(String value) {
            addCriterion("login_browser <>", value, "loginBrowser");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserGreaterThan(String value) {
            addCriterion("login_browser >", value, "loginBrowser");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserGreaterThanOrEqualTo(String value) {
            addCriterion("login_browser >=", value, "loginBrowser");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserLessThan(String value) {
            addCriterion("login_browser <", value, "loginBrowser");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserLessThanOrEqualTo(String value) {
            addCriterion("login_browser <=", value, "loginBrowser");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserLike(String value) {
            addCriterion("login_browser like", value, "loginBrowser");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserNotLike(String value) {
            addCriterion("login_browser not like", value, "loginBrowser");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserIn(List<String> values) {
            addCriterion("login_browser in", values, "loginBrowser");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserNotIn(List<String> values) {
            addCriterion("login_browser not in", values, "loginBrowser");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserBetween(String value1, String value2) {
            addCriterion("login_browser between", value1, value2, "loginBrowser");
            return (Criteria) this;
        }

        public Criteria andLoginBrowserNotBetween(String value1, String value2) {
            addCriterion("login_browser not between", value1, value2, "loginBrowser");
            return (Criteria) this;
        }

        public Criteria andScreenResolutionIsNull() {
            addCriterion("screen_resolution is null");
            return (Criteria) this;
        }

        public Criteria andScreenResolutionIsNotNull() {
            addCriterion("screen_resolution is not null");
            return (Criteria) this;
        }

        public Criteria andScreenResolutionEqualTo(String value) {
            addCriterion("screen_resolution =", value, "screenResolution");
            return (Criteria) this;
        }

        public Criteria andScreenResolutionNotEqualTo(String value) {
            addCriterion("screen_resolution <>", value, "screenResolution");
            return (Criteria) this;
        }

        public Criteria andScreenResolutionGreaterThan(String value) {
            addCriterion("screen_resolution >", value, "screenResolution");
            return (Criteria) this;
        }

        public Criteria andScreenResolutionGreaterThanOrEqualTo(String value) {
            addCriterion("screen_resolution >=", value, "screenResolution");
            return (Criteria) this;
        }

        public Criteria andScreenResolutionLessThan(String value) {
            addCriterion("screen_resolution <", value, "screenResolution");
            return (Criteria) this;
        }

        public Criteria andScreenResolutionLessThanOrEqualTo(String value) {
            addCriterion("screen_resolution <=", value, "screenResolution");
            return (Criteria) this;
        }

        public Criteria andScreenResolutionLike(String value) {
            addCriterion("screen_resolution like", value, "screenResolution");
            return (Criteria) this;
        }

        public Criteria andScreenResolutionNotLike(String value) {
            addCriterion("screen_resolution not like", value, "screenResolution");
            return (Criteria) this;
        }

        public Criteria andScreenResolutionIn(List<String> values) {
            addCriterion("screen_resolution in", values, "screenResolution");
            return (Criteria) this;
        }

        public Criteria andScreenResolutionNotIn(List<String> values) {
            addCriterion("screen_resolution not in", values, "screenResolution");
            return (Criteria) this;
        }

        public Criteria andScreenResolutionBetween(String value1, String value2) {
            addCriterion("screen_resolution between", value1, value2, "screenResolution");
            return (Criteria) this;
        }

        public Criteria andScreenResolutionNotBetween(String value1, String value2) {
            addCriterion("screen_resolution not between", value1, value2, "screenResolution");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemIsNull() {
            addCriterion("operating_system is null");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemIsNotNull() {
            addCriterion("operating_system is not null");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemEqualTo(String value) {
            addCriterion("operating_system =", value, "operatingSystem");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemNotEqualTo(String value) {
            addCriterion("operating_system <>", value, "operatingSystem");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemGreaterThan(String value) {
            addCriterion("operating_system >", value, "operatingSystem");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemGreaterThanOrEqualTo(String value) {
            addCriterion("operating_system >=", value, "operatingSystem");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemLessThan(String value) {
            addCriterion("operating_system <", value, "operatingSystem");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemLessThanOrEqualTo(String value) {
            addCriterion("operating_system <=", value, "operatingSystem");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemLike(String value) {
            addCriterion("operating_system like", value, "operatingSystem");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemNotLike(String value) {
            addCriterion("operating_system not like", value, "operatingSystem");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemIn(List<String> values) {
            addCriterion("operating_system in", values, "operatingSystem");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemNotIn(List<String> values) {
            addCriterion("operating_system not in", values, "operatingSystem");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemBetween(String value1, String value2) {
            addCriterion("operating_system between", value1, value2, "operatingSystem");
            return (Criteria) this;
        }

        public Criteria andOperatingSystemNotBetween(String value1, String value2) {
            addCriterion("operating_system not between", value1, value2, "operatingSystem");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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