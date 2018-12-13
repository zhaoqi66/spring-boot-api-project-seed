package com.company.project.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GoodsOrderProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsOrderProductExample() {
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

        public Criteria andOrderProductIdIsNull() {
            addCriterion("order_product_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderProductIdIsNotNull() {
            addCriterion("order_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderProductIdEqualTo(String value) {
            addCriterion("order_product_id =", value, "orderProductId");
            return (Criteria) this;
        }

        public Criteria andOrderProductIdNotEqualTo(String value) {
            addCriterion("order_product_id <>", value, "orderProductId");
            return (Criteria) this;
        }

        public Criteria andOrderProductIdGreaterThan(String value) {
            addCriterion("order_product_id >", value, "orderProductId");
            return (Criteria) this;
        }

        public Criteria andOrderProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_product_id >=", value, "orderProductId");
            return (Criteria) this;
        }

        public Criteria andOrderProductIdLessThan(String value) {
            addCriterion("order_product_id <", value, "orderProductId");
            return (Criteria) this;
        }

        public Criteria andOrderProductIdLessThanOrEqualTo(String value) {
            addCriterion("order_product_id <=", value, "orderProductId");
            return (Criteria) this;
        }

        public Criteria andOrderProductIdLike(String value) {
            addCriterion("order_product_id like", value, "orderProductId");
            return (Criteria) this;
        }

        public Criteria andOrderProductIdNotLike(String value) {
            addCriterion("order_product_id not like", value, "orderProductId");
            return (Criteria) this;
        }

        public Criteria andOrderProductIdIn(List<String> values) {
            addCriterion("order_product_id in", values, "orderProductId");
            return (Criteria) this;
        }

        public Criteria andOrderProductIdNotIn(List<String> values) {
            addCriterion("order_product_id not in", values, "orderProductId");
            return (Criteria) this;
        }

        public Criteria andOrderProductIdBetween(String value1, String value2) {
            addCriterion("order_product_id between", value1, value2, "orderProductId");
            return (Criteria) this;
        }

        public Criteria andOrderProductIdNotBetween(String value1, String value2) {
            addCriterion("order_product_id not between", value1, value2, "orderProductId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(String value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(String value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(String value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(String value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLike(String value) {
            addCriterion("goods_id like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotLike(String value) {
            addCriterion("goods_id not like", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<String> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<String> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(String value1, String value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(String value1, String value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
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

        public Criteria andOrderGoodsNumberIsNull() {
            addCriterion("order_goods_number is null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumberIsNotNull() {
            addCriterion("order_goods_number is not null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumberEqualTo(Integer value) {
            addCriterion("order_goods_number =", value, "orderGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumberNotEqualTo(Integer value) {
            addCriterion("order_goods_number <>", value, "orderGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumberGreaterThan(Integer value) {
            addCriterion("order_goods_number >", value, "orderGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_goods_number >=", value, "orderGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumberLessThan(Integer value) {
            addCriterion("order_goods_number <", value, "orderGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumberLessThanOrEqualTo(Integer value) {
            addCriterion("order_goods_number <=", value, "orderGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumberIn(List<Integer> values) {
            addCriterion("order_goods_number in", values, "orderGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumberNotIn(List<Integer> values) {
            addCriterion("order_goods_number not in", values, "orderGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumberBetween(Integer value1, Integer value2) {
            addCriterion("order_goods_number between", value1, value2, "orderGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("order_goods_number not between", value1, value2, "orderGoodsNumber");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsTitleIsNull() {
            addCriterion("order_goods_title is null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsTitleIsNotNull() {
            addCriterion("order_goods_title is not null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsTitleEqualTo(String value) {
            addCriterion("order_goods_title =", value, "orderGoodsTitle");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsTitleNotEqualTo(String value) {
            addCriterion("order_goods_title <>", value, "orderGoodsTitle");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsTitleGreaterThan(String value) {
            addCriterion("order_goods_title >", value, "orderGoodsTitle");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("order_goods_title >=", value, "orderGoodsTitle");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsTitleLessThan(String value) {
            addCriterion("order_goods_title <", value, "orderGoodsTitle");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsTitleLessThanOrEqualTo(String value) {
            addCriterion("order_goods_title <=", value, "orderGoodsTitle");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsTitleLike(String value) {
            addCriterion("order_goods_title like", value, "orderGoodsTitle");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsTitleNotLike(String value) {
            addCriterion("order_goods_title not like", value, "orderGoodsTitle");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsTitleIn(List<String> values) {
            addCriterion("order_goods_title in", values, "orderGoodsTitle");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsTitleNotIn(List<String> values) {
            addCriterion("order_goods_title not in", values, "orderGoodsTitle");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsTitleBetween(String value1, String value2) {
            addCriterion("order_goods_title between", value1, value2, "orderGoodsTitle");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsTitleNotBetween(String value1, String value2) {
            addCriterion("order_goods_title not between", value1, value2, "orderGoodsTitle");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsPriceIsNull() {
            addCriterion("order_goods_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsPriceIsNotNull() {
            addCriterion("order_goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsPriceEqualTo(BigDecimal value) {
            addCriterion("order_goods_price =", value, "orderGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsPriceNotEqualTo(BigDecimal value) {
            addCriterion("order_goods_price <>", value, "orderGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsPriceGreaterThan(BigDecimal value) {
            addCriterion("order_goods_price >", value, "orderGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_goods_price >=", value, "orderGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsPriceLessThan(BigDecimal value) {
            addCriterion("order_goods_price <", value, "orderGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_goods_price <=", value, "orderGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsPriceIn(List<BigDecimal> values) {
            addCriterion("order_goods_price in", values, "orderGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsPriceNotIn(List<BigDecimal> values) {
            addCriterion("order_goods_price not in", values, "orderGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_goods_price between", value1, value2, "orderGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_goods_price not between", value1, value2, "orderGoodsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeIsNull() {
            addCriterion("order_total_fee is null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeIsNotNull() {
            addCriterion("order_total_fee is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeEqualTo(BigDecimal value) {
            addCriterion("order_total_fee =", value, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeNotEqualTo(BigDecimal value) {
            addCriterion("order_total_fee <>", value, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeGreaterThan(BigDecimal value) {
            addCriterion("order_total_fee >", value, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_total_fee >=", value, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeLessThan(BigDecimal value) {
            addCriterion("order_total_fee <", value, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_total_fee <=", value, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeIn(List<BigDecimal> values) {
            addCriterion("order_total_fee in", values, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeNotIn(List<BigDecimal> values) {
            addCriterion("order_total_fee not in", values, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_total_fee between", value1, value2, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_total_fee not between", value1, value2, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsImageIsNull() {
            addCriterion("order_goods_image is null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsImageIsNotNull() {
            addCriterion("order_goods_image is not null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsImageEqualTo(String value) {
            addCriterion("order_goods_image =", value, "orderGoodsImage");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsImageNotEqualTo(String value) {
            addCriterion("order_goods_image <>", value, "orderGoodsImage");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsImageGreaterThan(String value) {
            addCriterion("order_goods_image >", value, "orderGoodsImage");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsImageGreaterThanOrEqualTo(String value) {
            addCriterion("order_goods_image >=", value, "orderGoodsImage");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsImageLessThan(String value) {
            addCriterion("order_goods_image <", value, "orderGoodsImage");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsImageLessThanOrEqualTo(String value) {
            addCriterion("order_goods_image <=", value, "orderGoodsImage");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsImageLike(String value) {
            addCriterion("order_goods_image like", value, "orderGoodsImage");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsImageNotLike(String value) {
            addCriterion("order_goods_image not like", value, "orderGoodsImage");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsImageIn(List<String> values) {
            addCriterion("order_goods_image in", values, "orderGoodsImage");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsImageNotIn(List<String> values) {
            addCriterion("order_goods_image not in", values, "orderGoodsImage");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsImageBetween(String value1, String value2) {
            addCriterion("order_goods_image between", value1, value2, "orderGoodsImage");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsImageNotBetween(String value1, String value2) {
            addCriterion("order_goods_image not between", value1, value2, "orderGoodsImage");
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