package com.company.project.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsOrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderShowIdIsNull() {
            addCriterion("order_show_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderShowIdIsNotNull() {
            addCriterion("order_show_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderShowIdEqualTo(String value) {
            addCriterion("order_show_id =", value, "orderShowId");
            return (Criteria) this;
        }

        public Criteria andOrderShowIdNotEqualTo(String value) {
            addCriterion("order_show_id <>", value, "orderShowId");
            return (Criteria) this;
        }

        public Criteria andOrderShowIdGreaterThan(String value) {
            addCriterion("order_show_id >", value, "orderShowId");
            return (Criteria) this;
        }

        public Criteria andOrderShowIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_show_id >=", value, "orderShowId");
            return (Criteria) this;
        }

        public Criteria andOrderShowIdLessThan(String value) {
            addCriterion("order_show_id <", value, "orderShowId");
            return (Criteria) this;
        }

        public Criteria andOrderShowIdLessThanOrEqualTo(String value) {
            addCriterion("order_show_id <=", value, "orderShowId");
            return (Criteria) this;
        }

        public Criteria andOrderShowIdLike(String value) {
            addCriterion("order_show_id like", value, "orderShowId");
            return (Criteria) this;
        }

        public Criteria andOrderShowIdNotLike(String value) {
            addCriterion("order_show_id not like", value, "orderShowId");
            return (Criteria) this;
        }

        public Criteria andOrderShowIdIn(List<String> values) {
            addCriterion("order_show_id in", values, "orderShowId");
            return (Criteria) this;
        }

        public Criteria andOrderShowIdNotIn(List<String> values) {
            addCriterion("order_show_id not in", values, "orderShowId");
            return (Criteria) this;
        }

        public Criteria andOrderShowIdBetween(String value1, String value2) {
            addCriterion("order_show_id between", value1, value2, "orderShowId");
            return (Criteria) this;
        }

        public Criteria andOrderShowIdNotBetween(String value1, String value2) {
            addCriterion("order_show_id not between", value1, value2, "orderShowId");
            return (Criteria) this;
        }

        public Criteria andOrderOldPriceIsNull() {
            addCriterion("order_old_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderOldPriceIsNotNull() {
            addCriterion("order_old_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderOldPriceEqualTo(BigDecimal value) {
            addCriterion("order_old_price =", value, "orderOldPrice");
            return (Criteria) this;
        }

        public Criteria andOrderOldPriceNotEqualTo(BigDecimal value) {
            addCriterion("order_old_price <>", value, "orderOldPrice");
            return (Criteria) this;
        }

        public Criteria andOrderOldPriceGreaterThan(BigDecimal value) {
            addCriterion("order_old_price >", value, "orderOldPrice");
            return (Criteria) this;
        }

        public Criteria andOrderOldPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_old_price >=", value, "orderOldPrice");
            return (Criteria) this;
        }

        public Criteria andOrderOldPriceLessThan(BigDecimal value) {
            addCriterion("order_old_price <", value, "orderOldPrice");
            return (Criteria) this;
        }

        public Criteria andOrderOldPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_old_price <=", value, "orderOldPrice");
            return (Criteria) this;
        }

        public Criteria andOrderOldPriceIn(List<BigDecimal> values) {
            addCriterion("order_old_price in", values, "orderOldPrice");
            return (Criteria) this;
        }

        public Criteria andOrderOldPriceNotIn(List<BigDecimal> values) {
            addCriterion("order_old_price not in", values, "orderOldPrice");
            return (Criteria) this;
        }

        public Criteria andOrderOldPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_old_price between", value1, value2, "orderOldPrice");
            return (Criteria) this;
        }

        public Criteria andOrderOldPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_old_price not between", value1, value2, "orderOldPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPrePriceIsNull() {
            addCriterion("order_pre_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderPrePriceIsNotNull() {
            addCriterion("order_pre_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPrePriceEqualTo(BigDecimal value) {
            addCriterion("order_pre_price =", value, "orderPrePrice");
            return (Criteria) this;
        }

        public Criteria andOrderPrePriceNotEqualTo(BigDecimal value) {
            addCriterion("order_pre_price <>", value, "orderPrePrice");
            return (Criteria) this;
        }

        public Criteria andOrderPrePriceGreaterThan(BigDecimal value) {
            addCriterion("order_pre_price >", value, "orderPrePrice");
            return (Criteria) this;
        }

        public Criteria andOrderPrePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_pre_price >=", value, "orderPrePrice");
            return (Criteria) this;
        }

        public Criteria andOrderPrePriceLessThan(BigDecimal value) {
            addCriterion("order_pre_price <", value, "orderPrePrice");
            return (Criteria) this;
        }

        public Criteria andOrderPrePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_pre_price <=", value, "orderPrePrice");
            return (Criteria) this;
        }

        public Criteria andOrderPrePriceIn(List<BigDecimal> values) {
            addCriterion("order_pre_price in", values, "orderPrePrice");
            return (Criteria) this;
        }

        public Criteria andOrderPrePriceNotIn(List<BigDecimal> values) {
            addCriterion("order_pre_price not in", values, "orderPrePrice");
            return (Criteria) this;
        }

        public Criteria andOrderPrePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_pre_price between", value1, value2, "orderPrePrice");
            return (Criteria) this;
        }

        public Criteria andOrderPrePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_pre_price not between", value1, value2, "orderPrePrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNull() {
            addCriterion("order_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNotNull() {
            addCriterion("order_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceEqualTo(BigDecimal value) {
            addCriterion("order_price =", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotEqualTo(BigDecimal value) {
            addCriterion("order_price <>", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThan(BigDecimal value) {
            addCriterion("order_price >", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_price >=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThan(BigDecimal value) {
            addCriterion("order_price <", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_price <=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIn(List<BigDecimal> values) {
            addCriterion("order_price in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotIn(List<BigDecimal> values) {
            addCriterion("order_price not in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_price between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_price not between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNull() {
            addCriterion("order_number is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNotNull() {
            addCriterion("order_number is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberEqualTo(Integer value) {
            addCriterion("order_number =", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotEqualTo(Integer value) {
            addCriterion("order_number <>", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThan(Integer value) {
            addCriterion("order_number >", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_number >=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThan(Integer value) {
            addCriterion("order_number <", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThanOrEqualTo(Integer value) {
            addCriterion("order_number <=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIn(List<Integer> values) {
            addCriterion("order_number in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotIn(List<Integer> values) {
            addCriterion("order_number not in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberBetween(Integer value1, Integer value2) {
            addCriterion("order_number between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("order_number not between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderLinePayIsNull() {
            addCriterion("order_line_pay is null");
            return (Criteria) this;
        }

        public Criteria andOrderLinePayIsNotNull() {
            addCriterion("order_line_pay is not null");
            return (Criteria) this;
        }

        public Criteria andOrderLinePayEqualTo(String value) {
            addCriterion("order_line_pay =", value, "orderLinePay");
            return (Criteria) this;
        }

        public Criteria andOrderLinePayNotEqualTo(String value) {
            addCriterion("order_line_pay <>", value, "orderLinePay");
            return (Criteria) this;
        }

        public Criteria andOrderLinePayGreaterThan(String value) {
            addCriterion("order_line_pay >", value, "orderLinePay");
            return (Criteria) this;
        }

        public Criteria andOrderLinePayGreaterThanOrEqualTo(String value) {
            addCriterion("order_line_pay >=", value, "orderLinePay");
            return (Criteria) this;
        }

        public Criteria andOrderLinePayLessThan(String value) {
            addCriterion("order_line_pay <", value, "orderLinePay");
            return (Criteria) this;
        }

        public Criteria andOrderLinePayLessThanOrEqualTo(String value) {
            addCriterion("order_line_pay <=", value, "orderLinePay");
            return (Criteria) this;
        }

        public Criteria andOrderLinePayLike(String value) {
            addCriterion("order_line_pay like", value, "orderLinePay");
            return (Criteria) this;
        }

        public Criteria andOrderLinePayNotLike(String value) {
            addCriterion("order_line_pay not like", value, "orderLinePay");
            return (Criteria) this;
        }

        public Criteria andOrderLinePayIn(List<String> values) {
            addCriterion("order_line_pay in", values, "orderLinePay");
            return (Criteria) this;
        }

        public Criteria andOrderLinePayNotIn(List<String> values) {
            addCriterion("order_line_pay not in", values, "orderLinePay");
            return (Criteria) this;
        }

        public Criteria andOrderLinePayBetween(String value1, String value2) {
            addCriterion("order_line_pay between", value1, value2, "orderLinePay");
            return (Criteria) this;
        }

        public Criteria andOrderLinePayNotBetween(String value1, String value2) {
            addCriterion("order_line_pay not between", value1, value2, "orderLinePay");
            return (Criteria) this;
        }

        public Criteria andExpressPriceIsNull() {
            addCriterion("express_price is null");
            return (Criteria) this;
        }

        public Criteria andExpressPriceIsNotNull() {
            addCriterion("express_price is not null");
            return (Criteria) this;
        }

        public Criteria andExpressPriceEqualTo(BigDecimal value) {
            addCriterion("express_price =", value, "expressPrice");
            return (Criteria) this;
        }

        public Criteria andExpressPriceNotEqualTo(BigDecimal value) {
            addCriterion("express_price <>", value, "expressPrice");
            return (Criteria) this;
        }

        public Criteria andExpressPriceGreaterThan(BigDecimal value) {
            addCriterion("express_price >", value, "expressPrice");
            return (Criteria) this;
        }

        public Criteria andExpressPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("express_price >=", value, "expressPrice");
            return (Criteria) this;
        }

        public Criteria andExpressPriceLessThan(BigDecimal value) {
            addCriterion("express_price <", value, "expressPrice");
            return (Criteria) this;
        }

        public Criteria andExpressPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("express_price <=", value, "expressPrice");
            return (Criteria) this;
        }

        public Criteria andExpressPriceIn(List<BigDecimal> values) {
            addCriterion("express_price in", values, "expressPrice");
            return (Criteria) this;
        }

        public Criteria andExpressPriceNotIn(List<BigDecimal> values) {
            addCriterion("express_price not in", values, "expressPrice");
            return (Criteria) this;
        }

        public Criteria andExpressPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("express_price between", value1, value2, "expressPrice");
            return (Criteria) this;
        }

        public Criteria andExpressPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("express_price not between", value1, value2, "expressPrice");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("order_status like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("order_status not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIsNull() {
            addCriterion("order_create_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIsNotNull() {
            addCriterion("order_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeEqualTo(Date value) {
            addCriterion("order_create_time =", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotEqualTo(Date value) {
            addCriterion("order_create_time <>", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeGreaterThan(Date value) {
            addCriterion("order_create_time >", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_create_time >=", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeLessThan(Date value) {
            addCriterion("order_create_time <", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_create_time <=", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIn(List<Date> values) {
            addCriterion("order_create_time in", values, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotIn(List<Date> values) {
            addCriterion("order_create_time not in", values, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeBetween(Date value1, Date value2) {
            addCriterion("order_create_time between", value1, value2, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_create_time not between", value1, value2, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateTimeIsNull() {
            addCriterion("order_update_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateTimeIsNotNull() {
            addCriterion("order_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateTimeEqualTo(Date value) {
            addCriterion("order_update_time =", value, "orderUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateTimeNotEqualTo(Date value) {
            addCriterion("order_update_time <>", value, "orderUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateTimeGreaterThan(Date value) {
            addCriterion("order_update_time >", value, "orderUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_update_time >=", value, "orderUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateTimeLessThan(Date value) {
            addCriterion("order_update_time <", value, "orderUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_update_time <=", value, "orderUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateTimeIn(List<Date> values) {
            addCriterion("order_update_time in", values, "orderUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateTimeNotIn(List<Date> values) {
            addCriterion("order_update_time not in", values, "orderUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("order_update_time between", value1, value2, "orderUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_update_time not between", value1, value2, "orderUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeIsNull() {
            addCriterion("order_pay_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeIsNotNull() {
            addCriterion("order_pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeEqualTo(Date value) {
            addCriterion("order_pay_time =", value, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeNotEqualTo(Date value) {
            addCriterion("order_pay_time <>", value, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeGreaterThan(Date value) {
            addCriterion("order_pay_time >", value, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_pay_time >=", value, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeLessThan(Date value) {
            addCriterion("order_pay_time <", value, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_pay_time <=", value, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeIn(List<Date> values) {
            addCriterion("order_pay_time in", values, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeNotIn(List<Date> values) {
            addCriterion("order_pay_time not in", values, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeBetween(Date value1, Date value2) {
            addCriterion("order_pay_time between", value1, value2, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_pay_time not between", value1, value2, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andSendExpressIsNull() {
            addCriterion("send_express is null");
            return (Criteria) this;
        }

        public Criteria andSendExpressIsNotNull() {
            addCriterion("send_express is not null");
            return (Criteria) this;
        }

        public Criteria andSendExpressEqualTo(Date value) {
            addCriterion("send_express =", value, "sendExpress");
            return (Criteria) this;
        }

        public Criteria andSendExpressNotEqualTo(Date value) {
            addCriterion("send_express <>", value, "sendExpress");
            return (Criteria) this;
        }

        public Criteria andSendExpressGreaterThan(Date value) {
            addCriterion("send_express >", value, "sendExpress");
            return (Criteria) this;
        }

        public Criteria andSendExpressGreaterThanOrEqualTo(Date value) {
            addCriterion("send_express >=", value, "sendExpress");
            return (Criteria) this;
        }

        public Criteria andSendExpressLessThan(Date value) {
            addCriterion("send_express <", value, "sendExpress");
            return (Criteria) this;
        }

        public Criteria andSendExpressLessThanOrEqualTo(Date value) {
            addCriterion("send_express <=", value, "sendExpress");
            return (Criteria) this;
        }

        public Criteria andSendExpressIn(List<Date> values) {
            addCriterion("send_express in", values, "sendExpress");
            return (Criteria) this;
        }

        public Criteria andSendExpressNotIn(List<Date> values) {
            addCriterion("send_express not in", values, "sendExpress");
            return (Criteria) this;
        }

        public Criteria andSendExpressBetween(Date value1, Date value2) {
            addCriterion("send_express between", value1, value2, "sendExpress");
            return (Criteria) this;
        }

        public Criteria andSendExpressNotBetween(Date value1, Date value2) {
            addCriterion("send_express not between", value1, value2, "sendExpress");
            return (Criteria) this;
        }

        public Criteria andGetGoodsTimeIsNull() {
            addCriterion("get_goods_time is null");
            return (Criteria) this;
        }

        public Criteria andGetGoodsTimeIsNotNull() {
            addCriterion("get_goods_time is not null");
            return (Criteria) this;
        }

        public Criteria andGetGoodsTimeEqualTo(Date value) {
            addCriterion("get_goods_time =", value, "getGoodsTime");
            return (Criteria) this;
        }

        public Criteria andGetGoodsTimeNotEqualTo(Date value) {
            addCriterion("get_goods_time <>", value, "getGoodsTime");
            return (Criteria) this;
        }

        public Criteria andGetGoodsTimeGreaterThan(Date value) {
            addCriterion("get_goods_time >", value, "getGoodsTime");
            return (Criteria) this;
        }

        public Criteria andGetGoodsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("get_goods_time >=", value, "getGoodsTime");
            return (Criteria) this;
        }

        public Criteria andGetGoodsTimeLessThan(Date value) {
            addCriterion("get_goods_time <", value, "getGoodsTime");
            return (Criteria) this;
        }

        public Criteria andGetGoodsTimeLessThanOrEqualTo(Date value) {
            addCriterion("get_goods_time <=", value, "getGoodsTime");
            return (Criteria) this;
        }

        public Criteria andGetGoodsTimeIn(List<Date> values) {
            addCriterion("get_goods_time in", values, "getGoodsTime");
            return (Criteria) this;
        }

        public Criteria andGetGoodsTimeNotIn(List<Date> values) {
            addCriterion("get_goods_time not in", values, "getGoodsTime");
            return (Criteria) this;
        }

        public Criteria andGetGoodsTimeBetween(Date value1, Date value2) {
            addCriterion("get_goods_time between", value1, value2, "getGoodsTime");
            return (Criteria) this;
        }

        public Criteria andGetGoodsTimeNotBetween(Date value1, Date value2) {
            addCriterion("get_goods_time not between", value1, value2, "getGoodsTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancelTimeIsNull() {
            addCriterion("order_cancel_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderCancelTimeIsNotNull() {
            addCriterion("order_cancel_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCancelTimeEqualTo(Date value) {
            addCriterion("order_cancel_time =", value, "orderCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancelTimeNotEqualTo(Date value) {
            addCriterion("order_cancel_time <>", value, "orderCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancelTimeGreaterThan(Date value) {
            addCriterion("order_cancel_time >", value, "orderCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancelTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_cancel_time >=", value, "orderCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancelTimeLessThan(Date value) {
            addCriterion("order_cancel_time <", value, "orderCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancelTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_cancel_time <=", value, "orderCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancelTimeIn(List<Date> values) {
            addCriterion("order_cancel_time in", values, "orderCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancelTimeNotIn(List<Date> values) {
            addCriterion("order_cancel_time not in", values, "orderCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancelTimeBetween(Date value1, Date value2) {
            addCriterion("order_cancel_time between", value1, value2, "orderCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancelTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_cancel_time not between", value1, value2, "orderCancelTime");
            return (Criteria) this;
        }

        public Criteria andShippingIdIsNull() {
            addCriterion("shipping_id is null");
            return (Criteria) this;
        }

        public Criteria andShippingIdIsNotNull() {
            addCriterion("shipping_id is not null");
            return (Criteria) this;
        }

        public Criteria andShippingIdEqualTo(String value) {
            addCriterion("shipping_id =", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdNotEqualTo(String value) {
            addCriterion("shipping_id <>", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdGreaterThan(String value) {
            addCriterion("shipping_id >", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_id >=", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdLessThan(String value) {
            addCriterion("shipping_id <", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdLessThanOrEqualTo(String value) {
            addCriterion("shipping_id <=", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdLike(String value) {
            addCriterion("shipping_id like", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdNotLike(String value) {
            addCriterion("shipping_id not like", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdIn(List<String> values) {
            addCriterion("shipping_id in", values, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdNotIn(List<String> values) {
            addCriterion("shipping_id not in", values, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdBetween(String value1, String value2) {
            addCriterion("shipping_id between", value1, value2, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdNotBetween(String value1, String value2) {
            addCriterion("shipping_id not between", value1, value2, "shippingId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("open_id is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("open_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("open_id =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("open_id <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("open_id >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("open_id >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("open_id <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("open_id <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("open_id like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("open_id not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("open_id in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("open_id not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("open_id between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("open_id not between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOrderBuyerMessageIsNull() {
            addCriterion("order_buyer_message is null");
            return (Criteria) this;
        }

        public Criteria andOrderBuyerMessageIsNotNull() {
            addCriterion("order_buyer_message is not null");
            return (Criteria) this;
        }

        public Criteria andOrderBuyerMessageEqualTo(String value) {
            addCriterion("order_buyer_message =", value, "orderBuyerMessage");
            return (Criteria) this;
        }

        public Criteria andOrderBuyerMessageNotEqualTo(String value) {
            addCriterion("order_buyer_message <>", value, "orderBuyerMessage");
            return (Criteria) this;
        }

        public Criteria andOrderBuyerMessageGreaterThan(String value) {
            addCriterion("order_buyer_message >", value, "orderBuyerMessage");
            return (Criteria) this;
        }

        public Criteria andOrderBuyerMessageGreaterThanOrEqualTo(String value) {
            addCriterion("order_buyer_message >=", value, "orderBuyerMessage");
            return (Criteria) this;
        }

        public Criteria andOrderBuyerMessageLessThan(String value) {
            addCriterion("order_buyer_message <", value, "orderBuyerMessage");
            return (Criteria) this;
        }

        public Criteria andOrderBuyerMessageLessThanOrEqualTo(String value) {
            addCriterion("order_buyer_message <=", value, "orderBuyerMessage");
            return (Criteria) this;
        }

        public Criteria andOrderBuyerMessageLike(String value) {
            addCriterion("order_buyer_message like", value, "orderBuyerMessage");
            return (Criteria) this;
        }

        public Criteria andOrderBuyerMessageNotLike(String value) {
            addCriterion("order_buyer_message not like", value, "orderBuyerMessage");
            return (Criteria) this;
        }

        public Criteria andOrderBuyerMessageIn(List<String> values) {
            addCriterion("order_buyer_message in", values, "orderBuyerMessage");
            return (Criteria) this;
        }

        public Criteria andOrderBuyerMessageNotIn(List<String> values) {
            addCriterion("order_buyer_message not in", values, "orderBuyerMessage");
            return (Criteria) this;
        }

        public Criteria andOrderBuyerMessageBetween(String value1, String value2) {
            addCriterion("order_buyer_message between", value1, value2, "orderBuyerMessage");
            return (Criteria) this;
        }

        public Criteria andOrderBuyerMessageNotBetween(String value1, String value2) {
            addCriterion("order_buyer_message not between", value1, value2, "orderBuyerMessage");
            return (Criteria) this;
        }

        public Criteria andPrepayIdIsNull() {
            addCriterion("prepay_id is null");
            return (Criteria) this;
        }

        public Criteria andPrepayIdIsNotNull() {
            addCriterion("prepay_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrepayIdEqualTo(String value) {
            addCriterion("prepay_id =", value, "prepayId");
            return (Criteria) this;
        }

        public Criteria andPrepayIdNotEqualTo(String value) {
            addCriterion("prepay_id <>", value, "prepayId");
            return (Criteria) this;
        }

        public Criteria andPrepayIdGreaterThan(String value) {
            addCriterion("prepay_id >", value, "prepayId");
            return (Criteria) this;
        }

        public Criteria andPrepayIdGreaterThanOrEqualTo(String value) {
            addCriterion("prepay_id >=", value, "prepayId");
            return (Criteria) this;
        }

        public Criteria andPrepayIdLessThan(String value) {
            addCriterion("prepay_id <", value, "prepayId");
            return (Criteria) this;
        }

        public Criteria andPrepayIdLessThanOrEqualTo(String value) {
            addCriterion("prepay_id <=", value, "prepayId");
            return (Criteria) this;
        }

        public Criteria andPrepayIdLike(String value) {
            addCriterion("prepay_id like", value, "prepayId");
            return (Criteria) this;
        }

        public Criteria andPrepayIdNotLike(String value) {
            addCriterion("prepay_id not like", value, "prepayId");
            return (Criteria) this;
        }

        public Criteria andPrepayIdIn(List<String> values) {
            addCriterion("prepay_id in", values, "prepayId");
            return (Criteria) this;
        }

        public Criteria andPrepayIdNotIn(List<String> values) {
            addCriterion("prepay_id not in", values, "prepayId");
            return (Criteria) this;
        }

        public Criteria andPrepayIdBetween(String value1, String value2) {
            addCriterion("prepay_id between", value1, value2, "prepayId");
            return (Criteria) this;
        }

        public Criteria andPrepayIdNotBetween(String value1, String value2) {
            addCriterion("prepay_id not between", value1, value2, "prepayId");
            return (Criteria) this;
        }

        public Criteria andOrderDescIsNull() {
            addCriterion("order_desc is null");
            return (Criteria) this;
        }

        public Criteria andOrderDescIsNotNull() {
            addCriterion("order_desc is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDescEqualTo(String value) {
            addCriterion("order_desc =", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescNotEqualTo(String value) {
            addCriterion("order_desc <>", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescGreaterThan(String value) {
            addCriterion("order_desc >", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescGreaterThanOrEqualTo(String value) {
            addCriterion("order_desc >=", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescLessThan(String value) {
            addCriterion("order_desc <", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescLessThanOrEqualTo(String value) {
            addCriterion("order_desc <=", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescLike(String value) {
            addCriterion("order_desc like", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescNotLike(String value) {
            addCriterion("order_desc not like", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescIn(List<String> values) {
            addCriterion("order_desc in", values, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescNotIn(List<String> values) {
            addCriterion("order_desc not in", values, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescBetween(String value1, String value2) {
            addCriterion("order_desc between", value1, value2, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescNotBetween(String value1, String value2) {
            addCriterion("order_desc not between", value1, value2, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNull() {
            addCriterion("transaction_id is null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNotNull() {
            addCriterion("transaction_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdEqualTo(String value) {
            addCriterion("transaction_id =", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotEqualTo(String value) {
            addCriterion("transaction_id <>", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThan(String value) {
            addCriterion("transaction_id >", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_id >=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThan(String value) {
            addCriterion("transaction_id <", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThanOrEqualTo(String value) {
            addCriterion("transaction_id <=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLike(String value) {
            addCriterion("transaction_id like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotLike(String value) {
            addCriterion("transaction_id not like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIn(List<String> values) {
            addCriterion("transaction_id in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotIn(List<String> values) {
            addCriterion("transaction_id not in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdBetween(String value1, String value2) {
            addCriterion("transaction_id between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotBetween(String value1, String value2) {
            addCriterion("transaction_id not between", value1, value2, "transactionId");
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