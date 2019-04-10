package com.csvideo.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UserFansExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserFansExample() {
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

        public Criteria andUserFansIdIsNull() {
            addCriterion("user_fans_id is null");
            return (Criteria) this;
        }

        public Criteria andUserFansIdIsNotNull() {
            addCriterion("user_fans_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserFansIdEqualTo(String value) {
            addCriterion("user_fans_id =", value, "userFansId");
            return (Criteria) this;
        }

        public Criteria andUserFansIdNotEqualTo(String value) {
            addCriterion("user_fans_id <>", value, "userFansId");
            return (Criteria) this;
        }

        public Criteria andUserFansIdGreaterThan(String value) {
            addCriterion("user_fans_id >", value, "userFansId");
            return (Criteria) this;
        }

        public Criteria andUserFansIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_fans_id >=", value, "userFansId");
            return (Criteria) this;
        }

        public Criteria andUserFansIdLessThan(String value) {
            addCriterion("user_fans_id <", value, "userFansId");
            return (Criteria) this;
        }

        public Criteria andUserFansIdLessThanOrEqualTo(String value) {
            addCriterion("user_fans_id <=", value, "userFansId");
            return (Criteria) this;
        }

        public Criteria andUserFansIdLike(String value) {
            addCriterion("user_fans_id like", value, "userFansId");
            return (Criteria) this;
        }

        public Criteria andUserFansIdNotLike(String value) {
            addCriterion("user_fans_id not like", value, "userFansId");
            return (Criteria) this;
        }

        public Criteria andUserFansIdIn(List<String> values) {
            addCriterion("user_fans_id in", values, "userFansId");
            return (Criteria) this;
        }

        public Criteria andUserFansIdNotIn(List<String> values) {
            addCriterion("user_fans_id not in", values, "userFansId");
            return (Criteria) this;
        }

        public Criteria andUserFansIdBetween(String value1, String value2) {
            addCriterion("user_fans_id between", value1, value2, "userFansId");
            return (Criteria) this;
        }

        public Criteria andUserFansIdNotBetween(String value1, String value2) {
            addCriterion("user_fans_id not between", value1, value2, "userFansId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andFansIdIsNull() {
            addCriterion("fans_id is null");
            return (Criteria) this;
        }

        public Criteria andFansIdIsNotNull() {
            addCriterion("fans_id is not null");
            return (Criteria) this;
        }

        public Criteria andFansIdEqualTo(String value) {
            addCriterion("fans_id =", value, "fansId");
            return (Criteria) this;
        }

        public Criteria andFansIdNotEqualTo(String value) {
            addCriterion("fans_id <>", value, "fansId");
            return (Criteria) this;
        }

        public Criteria andFansIdGreaterThan(String value) {
            addCriterion("fans_id >", value, "fansId");
            return (Criteria) this;
        }

        public Criteria andFansIdGreaterThanOrEqualTo(String value) {
            addCriterion("fans_id >=", value, "fansId");
            return (Criteria) this;
        }

        public Criteria andFansIdLessThan(String value) {
            addCriterion("fans_id <", value, "fansId");
            return (Criteria) this;
        }

        public Criteria andFansIdLessThanOrEqualTo(String value) {
            addCriterion("fans_id <=", value, "fansId");
            return (Criteria) this;
        }

        public Criteria andFansIdLike(String value) {
            addCriterion("fans_id like", value, "fansId");
            return (Criteria) this;
        }

        public Criteria andFansIdNotLike(String value) {
            addCriterion("fans_id not like", value, "fansId");
            return (Criteria) this;
        }

        public Criteria andFansIdIn(List<String> values) {
            addCriterion("fans_id in", values, "fansId");
            return (Criteria) this;
        }

        public Criteria andFansIdNotIn(List<String> values) {
            addCriterion("fans_id not in", values, "fansId");
            return (Criteria) this;
        }

        public Criteria andFansIdBetween(String value1, String value2) {
            addCriterion("fans_id between", value1, value2, "fansId");
            return (Criteria) this;
        }

        public Criteria andFansIdNotBetween(String value1, String value2) {
            addCriterion("fans_id not between", value1, value2, "fansId");
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