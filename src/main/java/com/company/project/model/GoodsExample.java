package com.company.project.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andGoodsShowIdIsNull() {
            addCriterion("goods_show_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsShowIdIsNotNull() {
            addCriterion("goods_show_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsShowIdEqualTo(String value) {
            addCriterion("goods_show_id =", value, "goodsShowId");
            return (Criteria) this;
        }

        public Criteria andGoodsShowIdNotEqualTo(String value) {
            addCriterion("goods_show_id <>", value, "goodsShowId");
            return (Criteria) this;
        }

        public Criteria andGoodsShowIdGreaterThan(String value) {
            addCriterion("goods_show_id >", value, "goodsShowId");
            return (Criteria) this;
        }

        public Criteria andGoodsShowIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_show_id >=", value, "goodsShowId");
            return (Criteria) this;
        }

        public Criteria andGoodsShowIdLessThan(String value) {
            addCriterion("goods_show_id <", value, "goodsShowId");
            return (Criteria) this;
        }

        public Criteria andGoodsShowIdLessThanOrEqualTo(String value) {
            addCriterion("goods_show_id <=", value, "goodsShowId");
            return (Criteria) this;
        }

        public Criteria andGoodsShowIdLike(String value) {
            addCriterion("goods_show_id like", value, "goodsShowId");
            return (Criteria) this;
        }

        public Criteria andGoodsShowIdNotLike(String value) {
            addCriterion("goods_show_id not like", value, "goodsShowId");
            return (Criteria) this;
        }

        public Criteria andGoodsShowIdIn(List<String> values) {
            addCriterion("goods_show_id in", values, "goodsShowId");
            return (Criteria) this;
        }

        public Criteria andGoodsShowIdNotIn(List<String> values) {
            addCriterion("goods_show_id not in", values, "goodsShowId");
            return (Criteria) this;
        }

        public Criteria andGoodsShowIdBetween(String value1, String value2) {
            addCriterion("goods_show_id between", value1, value2, "goodsShowId");
            return (Criteria) this;
        }

        public Criteria andGoodsShowIdNotBetween(String value1, String value2) {
            addCriterion("goods_show_id not between", value1, value2, "goodsShowId");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIsNull() {
            addCriterion("goods_img is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIsNotNull() {
            addCriterion("goods_img is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImgEqualTo(String value) {
            addCriterion("goods_img =", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotEqualTo(String value) {
            addCriterion("goods_img <>", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgGreaterThan(String value) {
            addCriterion("goods_img >", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgGreaterThanOrEqualTo(String value) {
            addCriterion("goods_img >=", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgLessThan(String value) {
            addCriterion("goods_img <", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgLessThanOrEqualTo(String value) {
            addCriterion("goods_img <=", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgLike(String value) {
            addCriterion("goods_img like", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotLike(String value) {
            addCriterion("goods_img not like", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIn(List<String> values) {
            addCriterion("goods_img in", values, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotIn(List<String> values) {
            addCriterion("goods_img not in", values, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgBetween(String value1, String value2) {
            addCriterion("goods_img between", value1, value2, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotBetween(String value1, String value2) {
            addCriterion("goods_img not between", value1, value2, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNull() {
            addCriterion("goods_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(BigDecimal value) {
            addCriterion("goods_price =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(BigDecimal value) {
            addCriterion("goods_price <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(BigDecimal value) {
            addCriterion("goods_price >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(BigDecimal value) {
            addCriterion("goods_price <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_price <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<BigDecimal> values) {
            addCriterion("goods_price in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<BigDecimal> values) {
            addCriterion("goods_price not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_price not between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIsNull() {
            addCriterion("goods_num is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIsNotNull() {
            addCriterion("goods_num is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumEqualTo(Integer value) {
            addCriterion("goods_num =", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotEqualTo(Integer value) {
            addCriterion("goods_num <>", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumGreaterThan(Integer value) {
            addCriterion("goods_num >", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_num >=", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLessThan(Integer value) {
            addCriterion("goods_num <", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLessThanOrEqualTo(Integer value) {
            addCriterion("goods_num <=", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIn(List<Integer> values) {
            addCriterion("goods_num in", values, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotIn(List<Integer> values) {
            addCriterion("goods_num not in", values, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumBetween(Integer value1, Integer value2) {
            addCriterion("goods_num between", value1, value2, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_num not between", value1, value2, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIsNull() {
            addCriterion("goods_sort is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIsNotNull() {
            addCriterion("goods_sort is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSortEqualTo(Integer value) {
            addCriterion("goods_sort =", value, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortNotEqualTo(Integer value) {
            addCriterion("goods_sort <>", value, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortGreaterThan(Integer value) {
            addCriterion("goods_sort >", value, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_sort >=", value, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortLessThan(Integer value) {
            addCriterion("goods_sort <", value, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortLessThanOrEqualTo(Integer value) {
            addCriterion("goods_sort <=", value, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortIn(List<Integer> values) {
            addCriterion("goods_sort in", values, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortNotIn(List<Integer> values) {
            addCriterion("goods_sort not in", values, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortBetween(Integer value1, Integer value2) {
            addCriterion("goods_sort between", value1, value2, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsSortNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_sort not between", value1, value2, "goodsSort");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateTimeIsNull() {
            addCriterion("goods_create_time is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateTimeIsNotNull() {
            addCriterion("goods_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateTimeEqualTo(Date value) {
            addCriterion("goods_create_time =", value, "goodsCreateTime");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateTimeNotEqualTo(Date value) {
            addCriterion("goods_create_time <>", value, "goodsCreateTime");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateTimeGreaterThan(Date value) {
            addCriterion("goods_create_time >", value, "goodsCreateTime");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("goods_create_time >=", value, "goodsCreateTime");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateTimeLessThan(Date value) {
            addCriterion("goods_create_time <", value, "goodsCreateTime");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("goods_create_time <=", value, "goodsCreateTime");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateTimeIn(List<Date> values) {
            addCriterion("goods_create_time in", values, "goodsCreateTime");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateTimeNotIn(List<Date> values) {
            addCriterion("goods_create_time not in", values, "goodsCreateTime");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateTimeBetween(Date value1, Date value2) {
            addCriterion("goods_create_time between", value1, value2, "goodsCreateTime");
            return (Criteria) this;
        }

        public Criteria andGoodsCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("goods_create_time not between", value1, value2, "goodsCreateTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpdateTimeIsNull() {
            addCriterion("goods_update_time is null");
            return (Criteria) this;
        }

        public Criteria andGoodsUpdateTimeIsNotNull() {
            addCriterion("goods_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsUpdateTimeEqualTo(Date value) {
            addCriterion("goods_update_time =", value, "goodsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpdateTimeNotEqualTo(Date value) {
            addCriterion("goods_update_time <>", value, "goodsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpdateTimeGreaterThan(Date value) {
            addCriterion("goods_update_time >", value, "goodsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("goods_update_time >=", value, "goodsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpdateTimeLessThan(Date value) {
            addCriterion("goods_update_time <", value, "goodsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("goods_update_time <=", value, "goodsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpdateTimeIn(List<Date> values) {
            addCriterion("goods_update_time in", values, "goodsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpdateTimeNotIn(List<Date> values) {
            addCriterion("goods_update_time not in", values, "goodsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("goods_update_time between", value1, value2, "goodsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("goods_update_time not between", value1, value2, "goodsUpdateTime");
            return (Criteria) this;
        }

        public Criteria andGoodsDelflagIsNull() {
            addCriterion("goods_delflag is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDelflagIsNotNull() {
            addCriterion("goods_delflag is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDelflagEqualTo(Byte value) {
            addCriterion("goods_delflag =", value, "goodsDelflag");
            return (Criteria) this;
        }

        public Criteria andGoodsDelflagNotEqualTo(Byte value) {
            addCriterion("goods_delflag <>", value, "goodsDelflag");
            return (Criteria) this;
        }

        public Criteria andGoodsDelflagGreaterThan(Byte value) {
            addCriterion("goods_delflag >", value, "goodsDelflag");
            return (Criteria) this;
        }

        public Criteria andGoodsDelflagGreaterThanOrEqualTo(Byte value) {
            addCriterion("goods_delflag >=", value, "goodsDelflag");
            return (Criteria) this;
        }

        public Criteria andGoodsDelflagLessThan(Byte value) {
            addCriterion("goods_delflag <", value, "goodsDelflag");
            return (Criteria) this;
        }

        public Criteria andGoodsDelflagLessThanOrEqualTo(Byte value) {
            addCriterion("goods_delflag <=", value, "goodsDelflag");
            return (Criteria) this;
        }

        public Criteria andGoodsDelflagIn(List<Byte> values) {
            addCriterion("goods_delflag in", values, "goodsDelflag");
            return (Criteria) this;
        }

        public Criteria andGoodsDelflagNotIn(List<Byte> values) {
            addCriterion("goods_delflag not in", values, "goodsDelflag");
            return (Criteria) this;
        }

        public Criteria andGoodsDelflagBetween(Byte value1, Byte value2) {
            addCriterion("goods_delflag between", value1, value2, "goodsDelflag");
            return (Criteria) this;
        }

        public Criteria andGoodsDelflagNotBetween(Byte value1, Byte value2) {
            addCriterion("goods_delflag not between", value1, value2, "goodsDelflag");
            return (Criteria) this;
        }

        public Criteria andGoodsDeltimeIsNull() {
            addCriterion("goods_deltime is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDeltimeIsNotNull() {
            addCriterion("goods_deltime is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDeltimeEqualTo(Date value) {
            addCriterion("goods_deltime =", value, "goodsDeltime");
            return (Criteria) this;
        }

        public Criteria andGoodsDeltimeNotEqualTo(Date value) {
            addCriterion("goods_deltime <>", value, "goodsDeltime");
            return (Criteria) this;
        }

        public Criteria andGoodsDeltimeGreaterThan(Date value) {
            addCriterion("goods_deltime >", value, "goodsDeltime");
            return (Criteria) this;
        }

        public Criteria andGoodsDeltimeGreaterThanOrEqualTo(Date value) {
            addCriterion("goods_deltime >=", value, "goodsDeltime");
            return (Criteria) this;
        }

        public Criteria andGoodsDeltimeLessThan(Date value) {
            addCriterion("goods_deltime <", value, "goodsDeltime");
            return (Criteria) this;
        }

        public Criteria andGoodsDeltimeLessThanOrEqualTo(Date value) {
            addCriterion("goods_deltime <=", value, "goodsDeltime");
            return (Criteria) this;
        }

        public Criteria andGoodsDeltimeIn(List<Date> values) {
            addCriterion("goods_deltime in", values, "goodsDeltime");
            return (Criteria) this;
        }

        public Criteria andGoodsDeltimeNotIn(List<Date> values) {
            addCriterion("goods_deltime not in", values, "goodsDeltime");
            return (Criteria) this;
        }

        public Criteria andGoodsDeltimeBetween(Date value1, Date value2) {
            addCriterion("goods_deltime between", value1, value2, "goodsDeltime");
            return (Criteria) this;
        }

        public Criteria andGoodsDeltimeNotBetween(Date value1, Date value2) {
            addCriterion("goods_deltime not between", value1, value2, "goodsDeltime");
            return (Criteria) this;
        }

        public Criteria andGoodsBriefIsNull() {
            addCriterion("goods_brief is null");
            return (Criteria) this;
        }

        public Criteria andGoodsBriefIsNotNull() {
            addCriterion("goods_brief is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsBriefEqualTo(String value) {
            addCriterion("goods_brief =", value, "goodsBrief");
            return (Criteria) this;
        }

        public Criteria andGoodsBriefNotEqualTo(String value) {
            addCriterion("goods_brief <>", value, "goodsBrief");
            return (Criteria) this;
        }

        public Criteria andGoodsBriefGreaterThan(String value) {
            addCriterion("goods_brief >", value, "goodsBrief");
            return (Criteria) this;
        }

        public Criteria andGoodsBriefGreaterThanOrEqualTo(String value) {
            addCriterion("goods_brief >=", value, "goodsBrief");
            return (Criteria) this;
        }

        public Criteria andGoodsBriefLessThan(String value) {
            addCriterion("goods_brief <", value, "goodsBrief");
            return (Criteria) this;
        }

        public Criteria andGoodsBriefLessThanOrEqualTo(String value) {
            addCriterion("goods_brief <=", value, "goodsBrief");
            return (Criteria) this;
        }

        public Criteria andGoodsBriefLike(String value) {
            addCriterion("goods_brief like", value, "goodsBrief");
            return (Criteria) this;
        }

        public Criteria andGoodsBriefNotLike(String value) {
            addCriterion("goods_brief not like", value, "goodsBrief");
            return (Criteria) this;
        }

        public Criteria andGoodsBriefIn(List<String> values) {
            addCriterion("goods_brief in", values, "goodsBrief");
            return (Criteria) this;
        }

        public Criteria andGoodsBriefNotIn(List<String> values) {
            addCriterion("goods_brief not in", values, "goodsBrief");
            return (Criteria) this;
        }

        public Criteria andGoodsBriefBetween(String value1, String value2) {
            addCriterion("goods_brief between", value1, value2, "goodsBrief");
            return (Criteria) this;
        }

        public Criteria andGoodsBriefNotBetween(String value1, String value2) {
            addCriterion("goods_brief not between", value1, value2, "goodsBrief");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(String value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(String value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(String value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(String value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(String value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLike(String value) {
            addCriterion("type_id like", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotLike(String value) {
            addCriterion("type_id not like", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<String> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<String> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(String value1, String value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(String value1, String value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(String value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(String value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(String value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(String value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(String value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(String value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLike(String value) {
            addCriterion("brand_id like", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotLike(String value) {
            addCriterion("brand_id not like", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<String> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<String> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(String value1, String value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(String value1, String value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIsNull() {
            addCriterion("goods_status is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIsNotNull() {
            addCriterion("goods_status is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusEqualTo(Byte value) {
            addCriterion("goods_status =", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotEqualTo(Byte value) {
            addCriterion("goods_status <>", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusGreaterThan(Byte value) {
            addCriterion("goods_status >", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("goods_status >=", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLessThan(Byte value) {
            addCriterion("goods_status <", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusLessThanOrEqualTo(Byte value) {
            addCriterion("goods_status <=", value, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusIn(List<Byte> values) {
            addCriterion("goods_status in", values, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotIn(List<Byte> values) {
            addCriterion("goods_status not in", values, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusBetween(Byte value1, Byte value2) {
            addCriterion("goods_status between", value1, value2, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("goods_status not between", value1, value2, "goodsStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsAddedTimeIsNull() {
            addCriterion("goods_added_time is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAddedTimeIsNotNull() {
            addCriterion("goods_added_time is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAddedTimeEqualTo(Date value) {
            addCriterion("goods_added_time =", value, "goodsAddedTime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddedTimeNotEqualTo(Date value) {
            addCriterion("goods_added_time <>", value, "goodsAddedTime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddedTimeGreaterThan(Date value) {
            addCriterion("goods_added_time >", value, "goodsAddedTime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("goods_added_time >=", value, "goodsAddedTime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddedTimeLessThan(Date value) {
            addCriterion("goods_added_time <", value, "goodsAddedTime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddedTimeLessThanOrEqualTo(Date value) {
            addCriterion("goods_added_time <=", value, "goodsAddedTime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddedTimeIn(List<Date> values) {
            addCriterion("goods_added_time in", values, "goodsAddedTime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddedTimeNotIn(List<Date> values) {
            addCriterion("goods_added_time not in", values, "goodsAddedTime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddedTimeBetween(Date value1, Date value2) {
            addCriterion("goods_added_time between", value1, value2, "goodsAddedTime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddedTimeNotBetween(Date value1, Date value2) {
            addCriterion("goods_added_time not between", value1, value2, "goodsAddedTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUnaddedTimeIsNull() {
            addCriterion("goods_unadded_time is null");
            return (Criteria) this;
        }

        public Criteria andGoodsUnaddedTimeIsNotNull() {
            addCriterion("goods_unadded_time is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsUnaddedTimeEqualTo(Date value) {
            addCriterion("goods_unadded_time =", value, "goodsUnaddedTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUnaddedTimeNotEqualTo(Date value) {
            addCriterion("goods_unadded_time <>", value, "goodsUnaddedTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUnaddedTimeGreaterThan(Date value) {
            addCriterion("goods_unadded_time >", value, "goodsUnaddedTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUnaddedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("goods_unadded_time >=", value, "goodsUnaddedTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUnaddedTimeLessThan(Date value) {
            addCriterion("goods_unadded_time <", value, "goodsUnaddedTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUnaddedTimeLessThanOrEqualTo(Date value) {
            addCriterion("goods_unadded_time <=", value, "goodsUnaddedTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUnaddedTimeIn(List<Date> values) {
            addCriterion("goods_unadded_time in", values, "goodsUnaddedTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUnaddedTimeNotIn(List<Date> values) {
            addCriterion("goods_unadded_time not in", values, "goodsUnaddedTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUnaddedTimeBetween(Date value1, Date value2) {
            addCriterion("goods_unadded_time between", value1, value2, "goodsUnaddedTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUnaddedTimeNotBetween(Date value1, Date value2) {
            addCriterion("goods_unadded_time not between", value1, value2, "goodsUnaddedTime");
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