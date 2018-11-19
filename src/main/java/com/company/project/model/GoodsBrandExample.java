package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsBrandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsBrandExample() {
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

        public Criteria andBrandShowIdIsNull() {
            addCriterion("brand_show_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandShowIdIsNotNull() {
            addCriterion("brand_show_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandShowIdEqualTo(String value) {
            addCriterion("brand_show_id =", value, "brandShowId");
            return (Criteria) this;
        }

        public Criteria andBrandShowIdNotEqualTo(String value) {
            addCriterion("brand_show_id <>", value, "brandShowId");
            return (Criteria) this;
        }

        public Criteria andBrandShowIdGreaterThan(String value) {
            addCriterion("brand_show_id >", value, "brandShowId");
            return (Criteria) this;
        }

        public Criteria andBrandShowIdGreaterThanOrEqualTo(String value) {
            addCriterion("brand_show_id >=", value, "brandShowId");
            return (Criteria) this;
        }

        public Criteria andBrandShowIdLessThan(String value) {
            addCriterion("brand_show_id <", value, "brandShowId");
            return (Criteria) this;
        }

        public Criteria andBrandShowIdLessThanOrEqualTo(String value) {
            addCriterion("brand_show_id <=", value, "brandShowId");
            return (Criteria) this;
        }

        public Criteria andBrandShowIdLike(String value) {
            addCriterion("brand_show_id like", value, "brandShowId");
            return (Criteria) this;
        }

        public Criteria andBrandShowIdNotLike(String value) {
            addCriterion("brand_show_id not like", value, "brandShowId");
            return (Criteria) this;
        }

        public Criteria andBrandShowIdIn(List<String> values) {
            addCriterion("brand_show_id in", values, "brandShowId");
            return (Criteria) this;
        }

        public Criteria andBrandShowIdNotIn(List<String> values) {
            addCriterion("brand_show_id not in", values, "brandShowId");
            return (Criteria) this;
        }

        public Criteria andBrandShowIdBetween(String value1, String value2) {
            addCriterion("brand_show_id between", value1, value2, "brandShowId");
            return (Criteria) this;
        }

        public Criteria andBrandShowIdNotBetween(String value1, String value2) {
            addCriterion("brand_show_id not between", value1, value2, "brandShowId");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNull() {
            addCriterion("brand_name is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNotNull() {
            addCriterion("brand_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualTo(String value) {
            addCriterion("brand_name =", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualTo(String value) {
            addCriterion("brand_name <>", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThan(String value) {
            addCriterion("brand_name >", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("brand_name >=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThan(String value) {
            addCriterion("brand_name <", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualTo(String value) {
            addCriterion("brand_name <=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLike(String value) {
            addCriterion("brand_name like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotLike(String value) {
            addCriterion("brand_name not like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIn(List<String> values) {
            addCriterion("brand_name in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotIn(List<String> values) {
            addCriterion("brand_name not in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameBetween(String value1, String value2) {
            addCriterion("brand_name between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotBetween(String value1, String value2) {
            addCriterion("brand_name not between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandSortIsNull() {
            addCriterion("brand_sort is null");
            return (Criteria) this;
        }

        public Criteria andBrandSortIsNotNull() {
            addCriterion("brand_sort is not null");
            return (Criteria) this;
        }

        public Criteria andBrandSortEqualTo(Integer value) {
            addCriterion("brand_sort =", value, "brandSort");
            return (Criteria) this;
        }

        public Criteria andBrandSortNotEqualTo(Integer value) {
            addCriterion("brand_sort <>", value, "brandSort");
            return (Criteria) this;
        }

        public Criteria andBrandSortGreaterThan(Integer value) {
            addCriterion("brand_sort >", value, "brandSort");
            return (Criteria) this;
        }

        public Criteria andBrandSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_sort >=", value, "brandSort");
            return (Criteria) this;
        }

        public Criteria andBrandSortLessThan(Integer value) {
            addCriterion("brand_sort <", value, "brandSort");
            return (Criteria) this;
        }

        public Criteria andBrandSortLessThanOrEqualTo(Integer value) {
            addCriterion("brand_sort <=", value, "brandSort");
            return (Criteria) this;
        }

        public Criteria andBrandSortIn(List<Integer> values) {
            addCriterion("brand_sort in", values, "brandSort");
            return (Criteria) this;
        }

        public Criteria andBrandSortNotIn(List<Integer> values) {
            addCriterion("brand_sort not in", values, "brandSort");
            return (Criteria) this;
        }

        public Criteria andBrandSortBetween(Integer value1, Integer value2) {
            addCriterion("brand_sort between", value1, value2, "brandSort");
            return (Criteria) this;
        }

        public Criteria andBrandSortNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_sort not between", value1, value2, "brandSort");
            return (Criteria) this;
        }

        public Criteria andBrandDescIsNull() {
            addCriterion("brand_desc is null");
            return (Criteria) this;
        }

        public Criteria andBrandDescIsNotNull() {
            addCriterion("brand_desc is not null");
            return (Criteria) this;
        }

        public Criteria andBrandDescEqualTo(String value) {
            addCriterion("brand_desc =", value, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescNotEqualTo(String value) {
            addCriterion("brand_desc <>", value, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescGreaterThan(String value) {
            addCriterion("brand_desc >", value, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescGreaterThanOrEqualTo(String value) {
            addCriterion("brand_desc >=", value, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescLessThan(String value) {
            addCriterion("brand_desc <", value, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescLessThanOrEqualTo(String value) {
            addCriterion("brand_desc <=", value, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescLike(String value) {
            addCriterion("brand_desc like", value, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescNotLike(String value) {
            addCriterion("brand_desc not like", value, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescIn(List<String> values) {
            addCriterion("brand_desc in", values, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescNotIn(List<String> values) {
            addCriterion("brand_desc not in", values, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescBetween(String value1, String value2) {
            addCriterion("brand_desc between", value1, value2, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandDescNotBetween(String value1, String value2) {
            addCriterion("brand_desc not between", value1, value2, "brandDesc");
            return (Criteria) this;
        }

        public Criteria andBrandStatusIsNull() {
            addCriterion("brand_status is null");
            return (Criteria) this;
        }

        public Criteria andBrandStatusIsNotNull() {
            addCriterion("brand_status is not null");
            return (Criteria) this;
        }

        public Criteria andBrandStatusEqualTo(Byte value) {
            addCriterion("brand_status =", value, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandStatusNotEqualTo(Byte value) {
            addCriterion("brand_status <>", value, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandStatusGreaterThan(Byte value) {
            addCriterion("brand_status >", value, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("brand_status >=", value, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandStatusLessThan(Byte value) {
            addCriterion("brand_status <", value, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandStatusLessThanOrEqualTo(Byte value) {
            addCriterion("brand_status <=", value, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandStatusIn(List<Byte> values) {
            addCriterion("brand_status in", values, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandStatusNotIn(List<Byte> values) {
            addCriterion("brand_status not in", values, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandStatusBetween(Byte value1, Byte value2) {
            addCriterion("brand_status between", value1, value2, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("brand_status not between", value1, value2, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandCreateTimeIsNull() {
            addCriterion("brand_create_time is null");
            return (Criteria) this;
        }

        public Criteria andBrandCreateTimeIsNotNull() {
            addCriterion("brand_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andBrandCreateTimeEqualTo(Date value) {
            addCriterion("brand_create_time =", value, "brandCreateTime");
            return (Criteria) this;
        }

        public Criteria andBrandCreateTimeNotEqualTo(Date value) {
            addCriterion("brand_create_time <>", value, "brandCreateTime");
            return (Criteria) this;
        }

        public Criteria andBrandCreateTimeGreaterThan(Date value) {
            addCriterion("brand_create_time >", value, "brandCreateTime");
            return (Criteria) this;
        }

        public Criteria andBrandCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("brand_create_time >=", value, "brandCreateTime");
            return (Criteria) this;
        }

        public Criteria andBrandCreateTimeLessThan(Date value) {
            addCriterion("brand_create_time <", value, "brandCreateTime");
            return (Criteria) this;
        }

        public Criteria andBrandCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("brand_create_time <=", value, "brandCreateTime");
            return (Criteria) this;
        }

        public Criteria andBrandCreateTimeIn(List<Date> values) {
            addCriterion("brand_create_time in", values, "brandCreateTime");
            return (Criteria) this;
        }

        public Criteria andBrandCreateTimeNotIn(List<Date> values) {
            addCriterion("brand_create_time not in", values, "brandCreateTime");
            return (Criteria) this;
        }

        public Criteria andBrandCreateTimeBetween(Date value1, Date value2) {
            addCriterion("brand_create_time between", value1, value2, "brandCreateTime");
            return (Criteria) this;
        }

        public Criteria andBrandCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("brand_create_time not between", value1, value2, "brandCreateTime");
            return (Criteria) this;
        }

        public Criteria andBrandModifiedTimeIsNull() {
            addCriterion("brand_modified_time is null");
            return (Criteria) this;
        }

        public Criteria andBrandModifiedTimeIsNotNull() {
            addCriterion("brand_modified_time is not null");
            return (Criteria) this;
        }

        public Criteria andBrandModifiedTimeEqualTo(Date value) {
            addCriterion("brand_modified_time =", value, "brandModifiedTime");
            return (Criteria) this;
        }

        public Criteria andBrandModifiedTimeNotEqualTo(Date value) {
            addCriterion("brand_modified_time <>", value, "brandModifiedTime");
            return (Criteria) this;
        }

        public Criteria andBrandModifiedTimeGreaterThan(Date value) {
            addCriterion("brand_modified_time >", value, "brandModifiedTime");
            return (Criteria) this;
        }

        public Criteria andBrandModifiedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("brand_modified_time >=", value, "brandModifiedTime");
            return (Criteria) this;
        }

        public Criteria andBrandModifiedTimeLessThan(Date value) {
            addCriterion("brand_modified_time <", value, "brandModifiedTime");
            return (Criteria) this;
        }

        public Criteria andBrandModifiedTimeLessThanOrEqualTo(Date value) {
            addCriterion("brand_modified_time <=", value, "brandModifiedTime");
            return (Criteria) this;
        }

        public Criteria andBrandModifiedTimeIn(List<Date> values) {
            addCriterion("brand_modified_time in", values, "brandModifiedTime");
            return (Criteria) this;
        }

        public Criteria andBrandModifiedTimeNotIn(List<Date> values) {
            addCriterion("brand_modified_time not in", values, "brandModifiedTime");
            return (Criteria) this;
        }

        public Criteria andBrandModifiedTimeBetween(Date value1, Date value2) {
            addCriterion("brand_modified_time between", value1, value2, "brandModifiedTime");
            return (Criteria) this;
        }

        public Criteria andBrandModifiedTimeNotBetween(Date value1, Date value2) {
            addCriterion("brand_modified_time not between", value1, value2, "brandModifiedTime");
            return (Criteria) this;
        }

        public Criteria andBrandDelflagIsNull() {
            addCriterion("brand_delflag is null");
            return (Criteria) this;
        }

        public Criteria andBrandDelflagIsNotNull() {
            addCriterion("brand_delflag is not null");
            return (Criteria) this;
        }

        public Criteria andBrandDelflagEqualTo(Byte value) {
            addCriterion("brand_delflag =", value, "brandDelflag");
            return (Criteria) this;
        }

        public Criteria andBrandDelflagNotEqualTo(Byte value) {
            addCriterion("brand_delflag <>", value, "brandDelflag");
            return (Criteria) this;
        }

        public Criteria andBrandDelflagGreaterThan(Byte value) {
            addCriterion("brand_delflag >", value, "brandDelflag");
            return (Criteria) this;
        }

        public Criteria andBrandDelflagGreaterThanOrEqualTo(Byte value) {
            addCriterion("brand_delflag >=", value, "brandDelflag");
            return (Criteria) this;
        }

        public Criteria andBrandDelflagLessThan(Byte value) {
            addCriterion("brand_delflag <", value, "brandDelflag");
            return (Criteria) this;
        }

        public Criteria andBrandDelflagLessThanOrEqualTo(Byte value) {
            addCriterion("brand_delflag <=", value, "brandDelflag");
            return (Criteria) this;
        }

        public Criteria andBrandDelflagIn(List<Byte> values) {
            addCriterion("brand_delflag in", values, "brandDelflag");
            return (Criteria) this;
        }

        public Criteria andBrandDelflagNotIn(List<Byte> values) {
            addCriterion("brand_delflag not in", values, "brandDelflag");
            return (Criteria) this;
        }

        public Criteria andBrandDelflagBetween(Byte value1, Byte value2) {
            addCriterion("brand_delflag between", value1, value2, "brandDelflag");
            return (Criteria) this;
        }

        public Criteria andBrandDelflagNotBetween(Byte value1, Byte value2) {
            addCriterion("brand_delflag not between", value1, value2, "brandDelflag");
            return (Criteria) this;
        }

        public Criteria andBrandDelTimeIsNull() {
            addCriterion("brand_del_time is null");
            return (Criteria) this;
        }

        public Criteria andBrandDelTimeIsNotNull() {
            addCriterion("brand_del_time is not null");
            return (Criteria) this;
        }

        public Criteria andBrandDelTimeEqualTo(Date value) {
            addCriterion("brand_del_time =", value, "brandDelTime");
            return (Criteria) this;
        }

        public Criteria andBrandDelTimeNotEqualTo(Date value) {
            addCriterion("brand_del_time <>", value, "brandDelTime");
            return (Criteria) this;
        }

        public Criteria andBrandDelTimeGreaterThan(Date value) {
            addCriterion("brand_del_time >", value, "brandDelTime");
            return (Criteria) this;
        }

        public Criteria andBrandDelTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("brand_del_time >=", value, "brandDelTime");
            return (Criteria) this;
        }

        public Criteria andBrandDelTimeLessThan(Date value) {
            addCriterion("brand_del_time <", value, "brandDelTime");
            return (Criteria) this;
        }

        public Criteria andBrandDelTimeLessThanOrEqualTo(Date value) {
            addCriterion("brand_del_time <=", value, "brandDelTime");
            return (Criteria) this;
        }

        public Criteria andBrandDelTimeIn(List<Date> values) {
            addCriterion("brand_del_time in", values, "brandDelTime");
            return (Criteria) this;
        }

        public Criteria andBrandDelTimeNotIn(List<Date> values) {
            addCriterion("brand_del_time not in", values, "brandDelTime");
            return (Criteria) this;
        }

        public Criteria andBrandDelTimeBetween(Date value1, Date value2) {
            addCriterion("brand_del_time between", value1, value2, "brandDelTime");
            return (Criteria) this;
        }

        public Criteria andBrandDelTimeNotBetween(Date value1, Date value2) {
            addCriterion("brand_del_time not between", value1, value2, "brandDelTime");
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