package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsOrderShippingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsOrderShippingExample() {
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

        public Criteria andShippingCustomerNameIsNull() {
            addCriterion("shipping_customer_name is null");
            return (Criteria) this;
        }

        public Criteria andShippingCustomerNameIsNotNull() {
            addCriterion("shipping_customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andShippingCustomerNameEqualTo(String value) {
            addCriterion("shipping_customer_name =", value, "shippingCustomerName");
            return (Criteria) this;
        }

        public Criteria andShippingCustomerNameNotEqualTo(String value) {
            addCriterion("shipping_customer_name <>", value, "shippingCustomerName");
            return (Criteria) this;
        }

        public Criteria andShippingCustomerNameGreaterThan(String value) {
            addCriterion("shipping_customer_name >", value, "shippingCustomerName");
            return (Criteria) this;
        }

        public Criteria andShippingCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_customer_name >=", value, "shippingCustomerName");
            return (Criteria) this;
        }

        public Criteria andShippingCustomerNameLessThan(String value) {
            addCriterion("shipping_customer_name <", value, "shippingCustomerName");
            return (Criteria) this;
        }

        public Criteria andShippingCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("shipping_customer_name <=", value, "shippingCustomerName");
            return (Criteria) this;
        }

        public Criteria andShippingCustomerNameLike(String value) {
            addCriterion("shipping_customer_name like", value, "shippingCustomerName");
            return (Criteria) this;
        }

        public Criteria andShippingCustomerNameNotLike(String value) {
            addCriterion("shipping_customer_name not like", value, "shippingCustomerName");
            return (Criteria) this;
        }

        public Criteria andShippingCustomerNameIn(List<String> values) {
            addCriterion("shipping_customer_name in", values, "shippingCustomerName");
            return (Criteria) this;
        }

        public Criteria andShippingCustomerNameNotIn(List<String> values) {
            addCriterion("shipping_customer_name not in", values, "shippingCustomerName");
            return (Criteria) this;
        }

        public Criteria andShippingCustomerNameBetween(String value1, String value2) {
            addCriterion("shipping_customer_name between", value1, value2, "shippingCustomerName");
            return (Criteria) this;
        }

        public Criteria andShippingCustomerNameNotBetween(String value1, String value2) {
            addCriterion("shipping_customer_name not between", value1, value2, "shippingCustomerName");
            return (Criteria) this;
        }

        public Criteria andShippingCustomerTelephoneIsNull() {
            addCriterion("shipping_customer_telephone is null");
            return (Criteria) this;
        }

        public Criteria andShippingCustomerTelephoneIsNotNull() {
            addCriterion("shipping_customer_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andShippingCustomerTelephoneEqualTo(String value) {
            addCriterion("shipping_customer_telephone =", value, "shippingCustomerTelephone");
            return (Criteria) this;
        }

        public Criteria andShippingCustomerTelephoneNotEqualTo(String value) {
            addCriterion("shipping_customer_telephone <>", value, "shippingCustomerTelephone");
            return (Criteria) this;
        }

        public Criteria andShippingCustomerTelephoneGreaterThan(String value) {
            addCriterion("shipping_customer_telephone >", value, "shippingCustomerTelephone");
            return (Criteria) this;
        }

        public Criteria andShippingCustomerTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_customer_telephone >=", value, "shippingCustomerTelephone");
            return (Criteria) this;
        }

        public Criteria andShippingCustomerTelephoneLessThan(String value) {
            addCriterion("shipping_customer_telephone <", value, "shippingCustomerTelephone");
            return (Criteria) this;
        }

        public Criteria andShippingCustomerTelephoneLessThanOrEqualTo(String value) {
            addCriterion("shipping_customer_telephone <=", value, "shippingCustomerTelephone");
            return (Criteria) this;
        }

        public Criteria andShippingCustomerTelephoneLike(String value) {
            addCriterion("shipping_customer_telephone like", value, "shippingCustomerTelephone");
            return (Criteria) this;
        }

        public Criteria andShippingCustomerTelephoneNotLike(String value) {
            addCriterion("shipping_customer_telephone not like", value, "shippingCustomerTelephone");
            return (Criteria) this;
        }

        public Criteria andShippingCustomerTelephoneIn(List<String> values) {
            addCriterion("shipping_customer_telephone in", values, "shippingCustomerTelephone");
            return (Criteria) this;
        }

        public Criteria andShippingCustomerTelephoneNotIn(List<String> values) {
            addCriterion("shipping_customer_telephone not in", values, "shippingCustomerTelephone");
            return (Criteria) this;
        }

        public Criteria andShippingCustomerTelephoneBetween(String value1, String value2) {
            addCriterion("shipping_customer_telephone between", value1, value2, "shippingCustomerTelephone");
            return (Criteria) this;
        }

        public Criteria andShippingCustomerTelephoneNotBetween(String value1, String value2) {
            addCriterion("shipping_customer_telephone not between", value1, value2, "shippingCustomerTelephone");
            return (Criteria) this;
        }

        public Criteria andShippingAreaDetailIsNull() {
            addCriterion("shipping_area_detail is null");
            return (Criteria) this;
        }

        public Criteria andShippingAreaDetailIsNotNull() {
            addCriterion("shipping_area_detail is not null");
            return (Criteria) this;
        }

        public Criteria andShippingAreaDetailEqualTo(String value) {
            addCriterion("shipping_area_detail =", value, "shippingAreaDetail");
            return (Criteria) this;
        }

        public Criteria andShippingAreaDetailNotEqualTo(String value) {
            addCriterion("shipping_area_detail <>", value, "shippingAreaDetail");
            return (Criteria) this;
        }

        public Criteria andShippingAreaDetailGreaterThan(String value) {
            addCriterion("shipping_area_detail >", value, "shippingAreaDetail");
            return (Criteria) this;
        }

        public Criteria andShippingAreaDetailGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_area_detail >=", value, "shippingAreaDetail");
            return (Criteria) this;
        }

        public Criteria andShippingAreaDetailLessThan(String value) {
            addCriterion("shipping_area_detail <", value, "shippingAreaDetail");
            return (Criteria) this;
        }

        public Criteria andShippingAreaDetailLessThanOrEqualTo(String value) {
            addCriterion("shipping_area_detail <=", value, "shippingAreaDetail");
            return (Criteria) this;
        }

        public Criteria andShippingAreaDetailLike(String value) {
            addCriterion("shipping_area_detail like", value, "shippingAreaDetail");
            return (Criteria) this;
        }

        public Criteria andShippingAreaDetailNotLike(String value) {
            addCriterion("shipping_area_detail not like", value, "shippingAreaDetail");
            return (Criteria) this;
        }

        public Criteria andShippingAreaDetailIn(List<String> values) {
            addCriterion("shipping_area_detail in", values, "shippingAreaDetail");
            return (Criteria) this;
        }

        public Criteria andShippingAreaDetailNotIn(List<String> values) {
            addCriterion("shipping_area_detail not in", values, "shippingAreaDetail");
            return (Criteria) this;
        }

        public Criteria andShippingAreaDetailBetween(String value1, String value2) {
            addCriterion("shipping_area_detail between", value1, value2, "shippingAreaDetail");
            return (Criteria) this;
        }

        public Criteria andShippingAreaDetailNotBetween(String value1, String value2) {
            addCriterion("shipping_area_detail not between", value1, value2, "shippingAreaDetail");
            return (Criteria) this;
        }

        public Criteria andShippingCreateTimeIsNull() {
            addCriterion("shipping_create_time is null");
            return (Criteria) this;
        }

        public Criteria andShippingCreateTimeIsNotNull() {
            addCriterion("shipping_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andShippingCreateTimeEqualTo(Date value) {
            addCriterion("shipping_create_time =", value, "shippingCreateTime");
            return (Criteria) this;
        }

        public Criteria andShippingCreateTimeNotEqualTo(Date value) {
            addCriterion("shipping_create_time <>", value, "shippingCreateTime");
            return (Criteria) this;
        }

        public Criteria andShippingCreateTimeGreaterThan(Date value) {
            addCriterion("shipping_create_time >", value, "shippingCreateTime");
            return (Criteria) this;
        }

        public Criteria andShippingCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("shipping_create_time >=", value, "shippingCreateTime");
            return (Criteria) this;
        }

        public Criteria andShippingCreateTimeLessThan(Date value) {
            addCriterion("shipping_create_time <", value, "shippingCreateTime");
            return (Criteria) this;
        }

        public Criteria andShippingCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("shipping_create_time <=", value, "shippingCreateTime");
            return (Criteria) this;
        }

        public Criteria andShippingCreateTimeIn(List<Date> values) {
            addCriterion("shipping_create_time in", values, "shippingCreateTime");
            return (Criteria) this;
        }

        public Criteria andShippingCreateTimeNotIn(List<Date> values) {
            addCriterion("shipping_create_time not in", values, "shippingCreateTime");
            return (Criteria) this;
        }

        public Criteria andShippingCreateTimeBetween(Date value1, Date value2) {
            addCriterion("shipping_create_time between", value1, value2, "shippingCreateTime");
            return (Criteria) this;
        }

        public Criteria andShippingCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("shipping_create_time not between", value1, value2, "shippingCreateTime");
            return (Criteria) this;
        }

        public Criteria andShippingUpdateTimeIsNull() {
            addCriterion("shipping_update_time is null");
            return (Criteria) this;
        }

        public Criteria andShippingUpdateTimeIsNotNull() {
            addCriterion("shipping_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andShippingUpdateTimeEqualTo(Date value) {
            addCriterion("shipping_update_time =", value, "shippingUpdateTime");
            return (Criteria) this;
        }

        public Criteria andShippingUpdateTimeNotEqualTo(Date value) {
            addCriterion("shipping_update_time <>", value, "shippingUpdateTime");
            return (Criteria) this;
        }

        public Criteria andShippingUpdateTimeGreaterThan(Date value) {
            addCriterion("shipping_update_time >", value, "shippingUpdateTime");
            return (Criteria) this;
        }

        public Criteria andShippingUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("shipping_update_time >=", value, "shippingUpdateTime");
            return (Criteria) this;
        }

        public Criteria andShippingUpdateTimeLessThan(Date value) {
            addCriterion("shipping_update_time <", value, "shippingUpdateTime");
            return (Criteria) this;
        }

        public Criteria andShippingUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("shipping_update_time <=", value, "shippingUpdateTime");
            return (Criteria) this;
        }

        public Criteria andShippingUpdateTimeIn(List<Date> values) {
            addCriterion("shipping_update_time in", values, "shippingUpdateTime");
            return (Criteria) this;
        }

        public Criteria andShippingUpdateTimeNotIn(List<Date> values) {
            addCriterion("shipping_update_time not in", values, "shippingUpdateTime");
            return (Criteria) this;
        }

        public Criteria andShippingUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("shipping_update_time between", value1, value2, "shippingUpdateTime");
            return (Criteria) this;
        }

        public Criteria andShippingUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("shipping_update_time not between", value1, value2, "shippingUpdateTime");
            return (Criteria) this;
        }

        public Criteria andShippingTypeIsNull() {
            addCriterion("shipping_type is null");
            return (Criteria) this;
        }

        public Criteria andShippingTypeIsNotNull() {
            addCriterion("shipping_type is not null");
            return (Criteria) this;
        }

        public Criteria andShippingTypeEqualTo(String value) {
            addCriterion("shipping_type =", value, "shippingType");
            return (Criteria) this;
        }

        public Criteria andShippingTypeNotEqualTo(String value) {
            addCriterion("shipping_type <>", value, "shippingType");
            return (Criteria) this;
        }

        public Criteria andShippingTypeGreaterThan(String value) {
            addCriterion("shipping_type >", value, "shippingType");
            return (Criteria) this;
        }

        public Criteria andShippingTypeGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_type >=", value, "shippingType");
            return (Criteria) this;
        }

        public Criteria andShippingTypeLessThan(String value) {
            addCriterion("shipping_type <", value, "shippingType");
            return (Criteria) this;
        }

        public Criteria andShippingTypeLessThanOrEqualTo(String value) {
            addCriterion("shipping_type <=", value, "shippingType");
            return (Criteria) this;
        }

        public Criteria andShippingTypeLike(String value) {
            addCriterion("shipping_type like", value, "shippingType");
            return (Criteria) this;
        }

        public Criteria andShippingTypeNotLike(String value) {
            addCriterion("shipping_type not like", value, "shippingType");
            return (Criteria) this;
        }

        public Criteria andShippingTypeIn(List<String> values) {
            addCriterion("shipping_type in", values, "shippingType");
            return (Criteria) this;
        }

        public Criteria andShippingTypeNotIn(List<String> values) {
            addCriterion("shipping_type not in", values, "shippingType");
            return (Criteria) this;
        }

        public Criteria andShippingTypeBetween(String value1, String value2) {
            addCriterion("shipping_type between", value1, value2, "shippingType");
            return (Criteria) this;
        }

        public Criteria andShippingTypeNotBetween(String value1, String value2) {
            addCriterion("shipping_type not between", value1, value2, "shippingType");
            return (Criteria) this;
        }

        public Criteria andShippingNameIsNull() {
            addCriterion("shipping_name is null");
            return (Criteria) this;
        }

        public Criteria andShippingNameIsNotNull() {
            addCriterion("shipping_name is not null");
            return (Criteria) this;
        }

        public Criteria andShippingNameEqualTo(String value) {
            addCriterion("shipping_name =", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameNotEqualTo(String value) {
            addCriterion("shipping_name <>", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameGreaterThan(String value) {
            addCriterion("shipping_name >", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_name >=", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameLessThan(String value) {
            addCriterion("shipping_name <", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameLessThanOrEqualTo(String value) {
            addCriterion("shipping_name <=", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameLike(String value) {
            addCriterion("shipping_name like", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameNotLike(String value) {
            addCriterion("shipping_name not like", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameIn(List<String> values) {
            addCriterion("shipping_name in", values, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameNotIn(List<String> values) {
            addCriterion("shipping_name not in", values, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameBetween(String value1, String value2) {
            addCriterion("shipping_name between", value1, value2, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameNotBetween(String value1, String value2) {
            addCriterion("shipping_name not between", value1, value2, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingCodeIsNull() {
            addCriterion("shipping_code is null");
            return (Criteria) this;
        }

        public Criteria andShippingCodeIsNotNull() {
            addCriterion("shipping_code is not null");
            return (Criteria) this;
        }

        public Criteria andShippingCodeEqualTo(String value) {
            addCriterion("shipping_code =", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeNotEqualTo(String value) {
            addCriterion("shipping_code <>", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeGreaterThan(String value) {
            addCriterion("shipping_code >", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_code >=", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeLessThan(String value) {
            addCriterion("shipping_code <", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeLessThanOrEqualTo(String value) {
            addCriterion("shipping_code <=", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeLike(String value) {
            addCriterion("shipping_code like", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeNotLike(String value) {
            addCriterion("shipping_code not like", value, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeIn(List<String> values) {
            addCriterion("shipping_code in", values, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeNotIn(List<String> values) {
            addCriterion("shipping_code not in", values, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeBetween(String value1, String value2) {
            addCriterion("shipping_code between", value1, value2, "shippingCode");
            return (Criteria) this;
        }

        public Criteria andShippingCodeNotBetween(String value1, String value2) {
            addCriterion("shipping_code not between", value1, value2, "shippingCode");
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