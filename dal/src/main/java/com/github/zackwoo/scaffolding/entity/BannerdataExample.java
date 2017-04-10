package com.github.zackwoo.scaffolding.entity;

import java.util.ArrayList;
import java.util.List;

public class BannerdataExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table BANNERDATA
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table BANNERDATA
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table BANNERDATA
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BANNERDATA
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public BannerdataExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BANNERDATA
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BANNERDATA
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BANNERDATA
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BANNERDATA
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BANNERDATA
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BANNERDATA
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BANNERDATA
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BANNERDATA
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BANNERDATA
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BANNERDATA
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table BANNERDATA
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
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

        public Criteria andFavcategoryIsNull() {
            addCriterion("FAVCATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andFavcategoryIsNotNull() {
            addCriterion("FAVCATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andFavcategoryEqualTo(String value) {
            addCriterion("FAVCATEGORY =", value, "favcategory");
            return (Criteria) this;
        }

        public Criteria andFavcategoryNotEqualTo(String value) {
            addCriterion("FAVCATEGORY <>", value, "favcategory");
            return (Criteria) this;
        }

        public Criteria andFavcategoryGreaterThan(String value) {
            addCriterion("FAVCATEGORY >", value, "favcategory");
            return (Criteria) this;
        }

        public Criteria andFavcategoryGreaterThanOrEqualTo(String value) {
            addCriterion("FAVCATEGORY >=", value, "favcategory");
            return (Criteria) this;
        }

        public Criteria andFavcategoryLessThan(String value) {
            addCriterion("FAVCATEGORY <", value, "favcategory");
            return (Criteria) this;
        }

        public Criteria andFavcategoryLessThanOrEqualTo(String value) {
            addCriterion("FAVCATEGORY <=", value, "favcategory");
            return (Criteria) this;
        }

        public Criteria andFavcategoryLike(String value) {
            addCriterion("FAVCATEGORY like", value, "favcategory");
            return (Criteria) this;
        }

        public Criteria andFavcategoryNotLike(String value) {
            addCriterion("FAVCATEGORY not like", value, "favcategory");
            return (Criteria) this;
        }

        public Criteria andFavcategoryIn(List<String> values) {
            addCriterion("FAVCATEGORY in", values, "favcategory");
            return (Criteria) this;
        }

        public Criteria andFavcategoryNotIn(List<String> values) {
            addCriterion("FAVCATEGORY not in", values, "favcategory");
            return (Criteria) this;
        }

        public Criteria andFavcategoryBetween(String value1, String value2) {
            addCriterion("FAVCATEGORY between", value1, value2, "favcategory");
            return (Criteria) this;
        }

        public Criteria andFavcategoryNotBetween(String value1, String value2) {
            addCriterion("FAVCATEGORY not between", value1, value2, "favcategory");
            return (Criteria) this;
        }

        public Criteria andBannernameIsNull() {
            addCriterion("BANNERNAME is null");
            return (Criteria) this;
        }

        public Criteria andBannernameIsNotNull() {
            addCriterion("BANNERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andBannernameEqualTo(String value) {
            addCriterion("BANNERNAME =", value, "bannername");
            return (Criteria) this;
        }

        public Criteria andBannernameNotEqualTo(String value) {
            addCriterion("BANNERNAME <>", value, "bannername");
            return (Criteria) this;
        }

        public Criteria andBannernameGreaterThan(String value) {
            addCriterion("BANNERNAME >", value, "bannername");
            return (Criteria) this;
        }

        public Criteria andBannernameGreaterThanOrEqualTo(String value) {
            addCriterion("BANNERNAME >=", value, "bannername");
            return (Criteria) this;
        }

        public Criteria andBannernameLessThan(String value) {
            addCriterion("BANNERNAME <", value, "bannername");
            return (Criteria) this;
        }

        public Criteria andBannernameLessThanOrEqualTo(String value) {
            addCriterion("BANNERNAME <=", value, "bannername");
            return (Criteria) this;
        }

        public Criteria andBannernameLike(String value) {
            addCriterion("BANNERNAME like", value, "bannername");
            return (Criteria) this;
        }

        public Criteria andBannernameNotLike(String value) {
            addCriterion("BANNERNAME not like", value, "bannername");
            return (Criteria) this;
        }

        public Criteria andBannernameIn(List<String> values) {
            addCriterion("BANNERNAME in", values, "bannername");
            return (Criteria) this;
        }

        public Criteria andBannernameNotIn(List<String> values) {
            addCriterion("BANNERNAME not in", values, "bannername");
            return (Criteria) this;
        }

        public Criteria andBannernameBetween(String value1, String value2) {
            addCriterion("BANNERNAME between", value1, value2, "bannername");
            return (Criteria) this;
        }

        public Criteria andBannernameNotBetween(String value1, String value2) {
            addCriterion("BANNERNAME not between", value1, value2, "bannername");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table BANNERDATA
     *
     * @mbg.generated do_not_delete_during_merge Mon Apr 10 18:49:55 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table BANNERDATA
     *
     * @mbg.generated Mon Apr 10 18:49:55 CST 2017
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