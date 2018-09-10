package com.company.project.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysActivityExample() {
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

        public Criteria andActivityIdIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(Integer value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(Integer value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(Integer value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(Integer value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<Integer> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<Integer> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityNameIsNull() {
            addCriterion("activity_name is null");
            return (Criteria) this;
        }

        public Criteria andActivityNameIsNotNull() {
            addCriterion("activity_name is not null");
            return (Criteria) this;
        }

        public Criteria andActivityNameEqualTo(String value) {
            addCriterion("activity_name =", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotEqualTo(String value) {
            addCriterion("activity_name <>", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThan(String value) {
            addCriterion("activity_name >", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameGreaterThanOrEqualTo(String value) {
            addCriterion("activity_name >=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThan(String value) {
            addCriterion("activity_name <", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLessThanOrEqualTo(String value) {
            addCriterion("activity_name <=", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameLike(String value) {
            addCriterion("activity_name like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotLike(String value) {
            addCriterion("activity_name not like", value, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameIn(List<String> values) {
            addCriterion("activity_name in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotIn(List<String> values) {
            addCriterion("activity_name not in", values, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameBetween(String value1, String value2) {
            addCriterion("activity_name between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityNameNotBetween(String value1, String value2) {
            addCriterion("activity_name not between", value1, value2, "activityName");
            return (Criteria) this;
        }

        public Criteria andActivityTakeCountIsNull() {
            addCriterion("activity_take_count is null");
            return (Criteria) this;
        }

        public Criteria andActivityTakeCountIsNotNull() {
            addCriterion("activity_take_count is not null");
            return (Criteria) this;
        }

        public Criteria andActivityTakeCountEqualTo(Integer value) {
            addCriterion("activity_take_count =", value, "activityTakeCount");
            return (Criteria) this;
        }

        public Criteria andActivityTakeCountNotEqualTo(Integer value) {
            addCriterion("activity_take_count <>", value, "activityTakeCount");
            return (Criteria) this;
        }

        public Criteria andActivityTakeCountGreaterThan(Integer value) {
            addCriterion("activity_take_count >", value, "activityTakeCount");
            return (Criteria) this;
        }

        public Criteria andActivityTakeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_take_count >=", value, "activityTakeCount");
            return (Criteria) this;
        }

        public Criteria andActivityTakeCountLessThan(Integer value) {
            addCriterion("activity_take_count <", value, "activityTakeCount");
            return (Criteria) this;
        }

        public Criteria andActivityTakeCountLessThanOrEqualTo(Integer value) {
            addCriterion("activity_take_count <=", value, "activityTakeCount");
            return (Criteria) this;
        }

        public Criteria andActivityTakeCountIn(List<Integer> values) {
            addCriterion("activity_take_count in", values, "activityTakeCount");
            return (Criteria) this;
        }

        public Criteria andActivityTakeCountNotIn(List<Integer> values) {
            addCriterion("activity_take_count not in", values, "activityTakeCount");
            return (Criteria) this;
        }

        public Criteria andActivityTakeCountBetween(Integer value1, Integer value2) {
            addCriterion("activity_take_count between", value1, value2, "activityTakeCount");
            return (Criteria) this;
        }

        public Criteria andActivityTakeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_take_count not between", value1, value2, "activityTakeCount");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(Byte value) {
            addCriterion("delete_flag =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Byte value) {
            addCriterion("delete_flag <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Byte value) {
            addCriterion("delete_flag >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("delete_flag >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Byte value) {
            addCriterion("delete_flag <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Byte value) {
            addCriterion("delete_flag <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Byte> values) {
            addCriterion("delete_flag in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Byte> values) {
            addCriterion("delete_flag not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Byte value1, Byte value2) {
            addCriterion("delete_flag between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("delete_flag not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIsNull() {
            addCriterion("modified_time is null");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIsNotNull() {
            addCriterion("modified_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeEqualTo(Date value) {
            addCriterion("modified_time =", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotEqualTo(Date value) {
            addCriterion("modified_time <>", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeGreaterThan(Date value) {
            addCriterion("modified_time >", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modified_time >=", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLessThan(Date value) {
            addCriterion("modified_time <", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLessThanOrEqualTo(Date value) {
            addCriterion("modified_time <=", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIn(List<Date> values) {
            addCriterion("modified_time in", values, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotIn(List<Date> values) {
            addCriterion("modified_time not in", values, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeBetween(Date value1, Date value2) {
            addCriterion("modified_time between", value1, value2, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotBetween(Date value1, Date value2) {
            addCriterion("modified_time not between", value1, value2, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andPicIsNull() {
            addCriterion("pic is null");
            return (Criteria) this;
        }

        public Criteria andPicIsNotNull() {
            addCriterion("pic is not null");
            return (Criteria) this;
        }

        public Criteria andPicEqualTo(String value) {
            addCriterion("pic =", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotEqualTo(String value) {
            addCriterion("pic <>", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThan(String value) {
            addCriterion("pic >", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThanOrEqualTo(String value) {
            addCriterion("pic >=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThan(String value) {
            addCriterion("pic <", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThanOrEqualTo(String value) {
            addCriterion("pic <=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLike(String value) {
            addCriterion("pic like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotLike(String value) {
            addCriterion("pic not like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicIn(List<String> values) {
            addCriterion("pic in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotIn(List<String> values) {
            addCriterion("pic not in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicBetween(String value1, String value2) {
            addCriterion("pic between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotBetween(String value1, String value2) {
            addCriterion("pic not between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andActivityStatusIsNull() {
            addCriterion("activity_status is null");
            return (Criteria) this;
        }

        public Criteria andActivityStatusIsNotNull() {
            addCriterion("activity_status is not null");
            return (Criteria) this;
        }

        public Criteria andActivityStatusEqualTo(Byte value) {
            addCriterion("activity_status =", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusNotEqualTo(Byte value) {
            addCriterion("activity_status <>", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusGreaterThan(Byte value) {
            addCriterion("activity_status >", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("activity_status >=", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusLessThan(Byte value) {
            addCriterion("activity_status <", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusLessThanOrEqualTo(Byte value) {
            addCriterion("activity_status <=", value, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusIn(List<Byte> values) {
            addCriterion("activity_status in", values, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusNotIn(List<Byte> values) {
            addCriterion("activity_status not in", values, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusBetween(Byte value1, Byte value2) {
            addCriterion("activity_status between", value1, value2, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andActivityStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("activity_status not between", value1, value2, "activityStatus");
            return (Criteria) this;
        }

        public Criteria andFirstMoneyIsNull() {
            addCriterion("first_money is null");
            return (Criteria) this;
        }

        public Criteria andFirstMoneyIsNotNull() {
            addCriterion("first_money is not null");
            return (Criteria) this;
        }

        public Criteria andFirstMoneyEqualTo(BigDecimal value) {
            addCriterion("first_money =", value, "firstMoney");
            return (Criteria) this;
        }

        public Criteria andFirstMoneyNotEqualTo(BigDecimal value) {
            addCriterion("first_money <>", value, "firstMoney");
            return (Criteria) this;
        }

        public Criteria andFirstMoneyGreaterThan(BigDecimal value) {
            addCriterion("first_money >", value, "firstMoney");
            return (Criteria) this;
        }

        public Criteria andFirstMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("first_money >=", value, "firstMoney");
            return (Criteria) this;
        }

        public Criteria andFirstMoneyLessThan(BigDecimal value) {
            addCriterion("first_money <", value, "firstMoney");
            return (Criteria) this;
        }

        public Criteria andFirstMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("first_money <=", value, "firstMoney");
            return (Criteria) this;
        }

        public Criteria andFirstMoneyIn(List<BigDecimal> values) {
            addCriterion("first_money in", values, "firstMoney");
            return (Criteria) this;
        }

        public Criteria andFirstMoneyNotIn(List<BigDecimal> values) {
            addCriterion("first_money not in", values, "firstMoney");
            return (Criteria) this;
        }

        public Criteria andFirstMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_money between", value1, value2, "firstMoney");
            return (Criteria) this;
        }

        public Criteria andFirstMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_money not between", value1, value2, "firstMoney");
            return (Criteria) this;
        }

        public Criteria andFirstRatioIsNull() {
            addCriterion("first_ratio is null");
            return (Criteria) this;
        }

        public Criteria andFirstRatioIsNotNull() {
            addCriterion("first_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andFirstRatioEqualTo(Integer value) {
            addCriterion("first_ratio =", value, "firstRatio");
            return (Criteria) this;
        }

        public Criteria andFirstRatioNotEqualTo(Integer value) {
            addCriterion("first_ratio <>", value, "firstRatio");
            return (Criteria) this;
        }

        public Criteria andFirstRatioGreaterThan(Integer value) {
            addCriterion("first_ratio >", value, "firstRatio");
            return (Criteria) this;
        }

        public Criteria andFirstRatioGreaterThanOrEqualTo(Integer value) {
            addCriterion("first_ratio >=", value, "firstRatio");
            return (Criteria) this;
        }

        public Criteria andFirstRatioLessThan(Integer value) {
            addCriterion("first_ratio <", value, "firstRatio");
            return (Criteria) this;
        }

        public Criteria andFirstRatioLessThanOrEqualTo(Integer value) {
            addCriterion("first_ratio <=", value, "firstRatio");
            return (Criteria) this;
        }

        public Criteria andFirstRatioIn(List<Integer> values) {
            addCriterion("first_ratio in", values, "firstRatio");
            return (Criteria) this;
        }

        public Criteria andFirstRatioNotIn(List<Integer> values) {
            addCriterion("first_ratio not in", values, "firstRatio");
            return (Criteria) this;
        }

        public Criteria andFirstRatioBetween(Integer value1, Integer value2) {
            addCriterion("first_ratio between", value1, value2, "firstRatio");
            return (Criteria) this;
        }

        public Criteria andFirstRatioNotBetween(Integer value1, Integer value2) {
            addCriterion("first_ratio not between", value1, value2, "firstRatio");
            return (Criteria) this;
        }

        public Criteria andSecondMoneyIsNull() {
            addCriterion("second_money is null");
            return (Criteria) this;
        }

        public Criteria andSecondMoneyIsNotNull() {
            addCriterion("second_money is not null");
            return (Criteria) this;
        }

        public Criteria andSecondMoneyEqualTo(BigDecimal value) {
            addCriterion("second_money =", value, "secondMoney");
            return (Criteria) this;
        }

        public Criteria andSecondMoneyNotEqualTo(BigDecimal value) {
            addCriterion("second_money <>", value, "secondMoney");
            return (Criteria) this;
        }

        public Criteria andSecondMoneyGreaterThan(BigDecimal value) {
            addCriterion("second_money >", value, "secondMoney");
            return (Criteria) this;
        }

        public Criteria andSecondMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("second_money >=", value, "secondMoney");
            return (Criteria) this;
        }

        public Criteria andSecondMoneyLessThan(BigDecimal value) {
            addCriterion("second_money <", value, "secondMoney");
            return (Criteria) this;
        }

        public Criteria andSecondMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("second_money <=", value, "secondMoney");
            return (Criteria) this;
        }

        public Criteria andSecondMoneyIn(List<BigDecimal> values) {
            addCriterion("second_money in", values, "secondMoney");
            return (Criteria) this;
        }

        public Criteria andSecondMoneyNotIn(List<BigDecimal> values) {
            addCriterion("second_money not in", values, "secondMoney");
            return (Criteria) this;
        }

        public Criteria andSecondMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("second_money between", value1, value2, "secondMoney");
            return (Criteria) this;
        }

        public Criteria andSecondMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("second_money not between", value1, value2, "secondMoney");
            return (Criteria) this;
        }

        public Criteria andSecondRatioIsNull() {
            addCriterion("second_ratio is null");
            return (Criteria) this;
        }

        public Criteria andSecondRatioIsNotNull() {
            addCriterion("second_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andSecondRatioEqualTo(Integer value) {
            addCriterion("second_ratio =", value, "secondRatio");
            return (Criteria) this;
        }

        public Criteria andSecondRatioNotEqualTo(Integer value) {
            addCriterion("second_ratio <>", value, "secondRatio");
            return (Criteria) this;
        }

        public Criteria andSecondRatioGreaterThan(Integer value) {
            addCriterion("second_ratio >", value, "secondRatio");
            return (Criteria) this;
        }

        public Criteria andSecondRatioGreaterThanOrEqualTo(Integer value) {
            addCriterion("second_ratio >=", value, "secondRatio");
            return (Criteria) this;
        }

        public Criteria andSecondRatioLessThan(Integer value) {
            addCriterion("second_ratio <", value, "secondRatio");
            return (Criteria) this;
        }

        public Criteria andSecondRatioLessThanOrEqualTo(Integer value) {
            addCriterion("second_ratio <=", value, "secondRatio");
            return (Criteria) this;
        }

        public Criteria andSecondRatioIn(List<Integer> values) {
            addCriterion("second_ratio in", values, "secondRatio");
            return (Criteria) this;
        }

        public Criteria andSecondRatioNotIn(List<Integer> values) {
            addCriterion("second_ratio not in", values, "secondRatio");
            return (Criteria) this;
        }

        public Criteria andSecondRatioBetween(Integer value1, Integer value2) {
            addCriterion("second_ratio between", value1, value2, "secondRatio");
            return (Criteria) this;
        }

        public Criteria andSecondRatioNotBetween(Integer value1, Integer value2) {
            addCriterion("second_ratio not between", value1, value2, "secondRatio");
            return (Criteria) this;
        }

        public Criteria andThirdMoneyIsNull() {
            addCriterion("third_money is null");
            return (Criteria) this;
        }

        public Criteria andThirdMoneyIsNotNull() {
            addCriterion("third_money is not null");
            return (Criteria) this;
        }

        public Criteria andThirdMoneyEqualTo(BigDecimal value) {
            addCriterion("third_money =", value, "thirdMoney");
            return (Criteria) this;
        }

        public Criteria andThirdMoneyNotEqualTo(BigDecimal value) {
            addCriterion("third_money <>", value, "thirdMoney");
            return (Criteria) this;
        }

        public Criteria andThirdMoneyGreaterThan(BigDecimal value) {
            addCriterion("third_money >", value, "thirdMoney");
            return (Criteria) this;
        }

        public Criteria andThirdMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("third_money >=", value, "thirdMoney");
            return (Criteria) this;
        }

        public Criteria andThirdMoneyLessThan(BigDecimal value) {
            addCriterion("third_money <", value, "thirdMoney");
            return (Criteria) this;
        }

        public Criteria andThirdMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("third_money <=", value, "thirdMoney");
            return (Criteria) this;
        }

        public Criteria andThirdMoneyIn(List<BigDecimal> values) {
            addCriterion("third_money in", values, "thirdMoney");
            return (Criteria) this;
        }

        public Criteria andThirdMoneyNotIn(List<BigDecimal> values) {
            addCriterion("third_money not in", values, "thirdMoney");
            return (Criteria) this;
        }

        public Criteria andThirdMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("third_money between", value1, value2, "thirdMoney");
            return (Criteria) this;
        }

        public Criteria andThirdMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("third_money not between", value1, value2, "thirdMoney");
            return (Criteria) this;
        }

        public Criteria andThirdRatioIsNull() {
            addCriterion("third_ratio is null");
            return (Criteria) this;
        }

        public Criteria andThirdRatioIsNotNull() {
            addCriterion("third_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andThirdRatioEqualTo(Integer value) {
            addCriterion("third_ratio =", value, "thirdRatio");
            return (Criteria) this;
        }

        public Criteria andThirdRatioNotEqualTo(Integer value) {
            addCriterion("third_ratio <>", value, "thirdRatio");
            return (Criteria) this;
        }

        public Criteria andThirdRatioGreaterThan(Integer value) {
            addCriterion("third_ratio >", value, "thirdRatio");
            return (Criteria) this;
        }

        public Criteria andThirdRatioGreaterThanOrEqualTo(Integer value) {
            addCriterion("third_ratio >=", value, "thirdRatio");
            return (Criteria) this;
        }

        public Criteria andThirdRatioLessThan(Integer value) {
            addCriterion("third_ratio <", value, "thirdRatio");
            return (Criteria) this;
        }

        public Criteria andThirdRatioLessThanOrEqualTo(Integer value) {
            addCriterion("third_ratio <=", value, "thirdRatio");
            return (Criteria) this;
        }

        public Criteria andThirdRatioIn(List<Integer> values) {
            addCriterion("third_ratio in", values, "thirdRatio");
            return (Criteria) this;
        }

        public Criteria andThirdRatioNotIn(List<Integer> values) {
            addCriterion("third_ratio not in", values, "thirdRatio");
            return (Criteria) this;
        }

        public Criteria andThirdRatioBetween(Integer value1, Integer value2) {
            addCriterion("third_ratio between", value1, value2, "thirdRatio");
            return (Criteria) this;
        }

        public Criteria andThirdRatioNotBetween(Integer value1, Integer value2) {
            addCriterion("third_ratio not between", value1, value2, "thirdRatio");
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