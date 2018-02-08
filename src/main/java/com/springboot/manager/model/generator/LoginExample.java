package com.springboot.manager.model.generator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoginExample {
    /**
     * This field was generated by MyBatis Generator, do not modify.
     * This field corresponds to the database table my_login
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator, do not modify.
     * This field corresponds to the database table my_login
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator, do not modify.
     * This field corresponds to the database table my_login
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    public LoginExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator, do not modify.
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *   my_login
     * @mbg.generated
     */
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

        public Criteria andLoginUserIdIsNull() {
            addCriterion("login_user_id is null");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdIsNotNull() {
            addCriterion("login_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdEqualTo(String value) {
            addCriterion("login_user_id =", value, "loginUserId");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdNotEqualTo(String value) {
            addCriterion("login_user_id <>", value, "loginUserId");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdGreaterThan(String value) {
            addCriterion("login_user_id >", value, "loginUserId");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("login_user_id >=", value, "loginUserId");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdLessThan(String value) {
            addCriterion("login_user_id <", value, "loginUserId");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdLessThanOrEqualTo(String value) {
            addCriterion("login_user_id <=", value, "loginUserId");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdLike(String value) {
            addCriterion("login_user_id like", value, "loginUserId");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdNotLike(String value) {
            addCriterion("login_user_id not like", value, "loginUserId");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdIn(List<String> values) {
            addCriterion("login_user_id in", values, "loginUserId");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdNotIn(List<String> values) {
            addCriterion("login_user_id not in", values, "loginUserId");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdBetween(String value1, String value2) {
            addCriterion("login_user_id between", value1, value2, "loginUserId");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdNotBetween(String value1, String value2) {
            addCriterion("login_user_id not between", value1, value2, "loginUserId");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNull() {
            addCriterion("login_name is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("login_name is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("login_name =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("login_name <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("login_name >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("login_name >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("login_name <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("login_name <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("login_name like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("login_name not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("login_name in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("login_name not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("login_name between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("login_name not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordIsNull() {
            addCriterion("login_password is null");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordIsNotNull() {
            addCriterion("login_password is not null");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordEqualTo(String value) {
            addCriterion("login_password =", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordNotEqualTo(String value) {
            addCriterion("login_password <>", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordGreaterThan(String value) {
            addCriterion("login_password >", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("login_password >=", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordLessThan(String value) {
            addCriterion("login_password <", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordLessThanOrEqualTo(String value) {
            addCriterion("login_password <=", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordLike(String value) {
            addCriterion("login_password like", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordNotLike(String value) {
            addCriterion("login_password not like", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordIn(List<String> values) {
            addCriterion("login_password in", values, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordNotIn(List<String> values) {
            addCriterion("login_password not in", values, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordBetween(String value1, String value2) {
            addCriterion("login_password between", value1, value2, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordNotBetween(String value1, String value2) {
            addCriterion("login_password not between", value1, value2, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginCreateTimeIsNull() {
            addCriterion("login_create_time is null");
            return (Criteria) this;
        }

        public Criteria andLoginCreateTimeIsNotNull() {
            addCriterion("login_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoginCreateTimeEqualTo(Date value) {
            addCriterion("login_create_time =", value, "loginCreateTime");
            return (Criteria) this;
        }

        public Criteria andLoginCreateTimeNotEqualTo(Date value) {
            addCriterion("login_create_time <>", value, "loginCreateTime");
            return (Criteria) this;
        }

        public Criteria andLoginCreateTimeGreaterThan(Date value) {
            addCriterion("login_create_time >", value, "loginCreateTime");
            return (Criteria) this;
        }

        public Criteria andLoginCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("login_create_time >=", value, "loginCreateTime");
            return (Criteria) this;
        }

        public Criteria andLoginCreateTimeLessThan(Date value) {
            addCriterion("login_create_time <", value, "loginCreateTime");
            return (Criteria) this;
        }

        public Criteria andLoginCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("login_create_time <=", value, "loginCreateTime");
            return (Criteria) this;
        }

        public Criteria andLoginCreateTimeIn(List<Date> values) {
            addCriterion("login_create_time in", values, "loginCreateTime");
            return (Criteria) this;
        }

        public Criteria andLoginCreateTimeNotIn(List<Date> values) {
            addCriterion("login_create_time not in", values, "loginCreateTime");
            return (Criteria) this;
        }

        public Criteria andLoginCreateTimeBetween(Date value1, Date value2) {
            addCriterion("login_create_time between", value1, value2, "loginCreateTime");
            return (Criteria) this;
        }

        public Criteria andLoginCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("login_create_time not between", value1, value2, "loginCreateTime");
            return (Criteria) this;
        }

        public Criteria andLoginUpdateTimeIsNull() {
            addCriterion("login_update_time is null");
            return (Criteria) this;
        }

        public Criteria andLoginUpdateTimeIsNotNull() {
            addCriterion("login_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoginUpdateTimeEqualTo(Date value) {
            addCriterion("login_update_time =", value, "loginUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLoginUpdateTimeNotEqualTo(Date value) {
            addCriterion("login_update_time <>", value, "loginUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLoginUpdateTimeGreaterThan(Date value) {
            addCriterion("login_update_time >", value, "loginUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLoginUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("login_update_time >=", value, "loginUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLoginUpdateTimeLessThan(Date value) {
            addCriterion("login_update_time <", value, "loginUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLoginUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("login_update_time <=", value, "loginUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLoginUpdateTimeIn(List<Date> values) {
            addCriterion("login_update_time in", values, "loginUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLoginUpdateTimeNotIn(List<Date> values) {
            addCriterion("login_update_time not in", values, "loginUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLoginUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("login_update_time between", value1, value2, "loginUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLoginUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("login_update_time not between", value1, value2, "loginUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLoginStatusIsNull() {
            addCriterion("login_status is null");
            return (Criteria) this;
        }

        public Criteria andLoginStatusIsNotNull() {
            addCriterion("login_status is not null");
            return (Criteria) this;
        }

        public Criteria andLoginStatusEqualTo(Integer value) {
            addCriterion("login_status =", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusNotEqualTo(Integer value) {
            addCriterion("login_status <>", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusGreaterThan(Integer value) {
            addCriterion("login_status >", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_status >=", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusLessThan(Integer value) {
            addCriterion("login_status <", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusLessThanOrEqualTo(Integer value) {
            addCriterion("login_status <=", value, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusIn(List<Integer> values) {
            addCriterion("login_status in", values, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusNotIn(List<Integer> values) {
            addCriterion("login_status not in", values, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusBetween(Integer value1, Integer value2) {
            addCriterion("login_status between", value1, value2, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("login_status not between", value1, value2, "loginStatus");
            return (Criteria) this;
        }

        public Criteria andLoginIsDeleteIsNull() {
            addCriterion("login_is_delete is null");
            return (Criteria) this;
        }

        public Criteria andLoginIsDeleteIsNotNull() {
            addCriterion("login_is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIsDeleteEqualTo(Boolean value) {
            addCriterion("login_is_delete =", value, "loginIsDelete");
            return (Criteria) this;
        }

        public Criteria andLoginIsDeleteNotEqualTo(Boolean value) {
            addCriterion("login_is_delete <>", value, "loginIsDelete");
            return (Criteria) this;
        }

        public Criteria andLoginIsDeleteGreaterThan(Boolean value) {
            addCriterion("login_is_delete >", value, "loginIsDelete");
            return (Criteria) this;
        }

        public Criteria andLoginIsDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("login_is_delete >=", value, "loginIsDelete");
            return (Criteria) this;
        }

        public Criteria andLoginIsDeleteLessThan(Boolean value) {
            addCriterion("login_is_delete <", value, "loginIsDelete");
            return (Criteria) this;
        }

        public Criteria andLoginIsDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("login_is_delete <=", value, "loginIsDelete");
            return (Criteria) this;
        }

        public Criteria andLoginIsDeleteIn(List<Boolean> values) {
            addCriterion("login_is_delete in", values, "loginIsDelete");
            return (Criteria) this;
        }

        public Criteria andLoginIsDeleteNotIn(List<Boolean> values) {
            addCriterion("login_is_delete not in", values, "loginIsDelete");
            return (Criteria) this;
        }

        public Criteria andLoginIsDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("login_is_delete between", value1, value2, "loginIsDelete");
            return (Criteria) this;
        }

        public Criteria andLoginIsDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("login_is_delete not between", value1, value2, "loginIsDelete");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator, do not modify.
     *   my_login
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *   my_login
     * @mbg.generated
     */
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