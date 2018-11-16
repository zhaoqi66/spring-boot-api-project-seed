package com.company.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsTypeExample() {
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

        public Criteria andTypeNameIsNull() {
            addCriterion("type_name is null");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNotNull() {
            addCriterion("type_name is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNameEqualTo(String value) {
            addCriterion("type_name =", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotEqualTo(String value) {
            addCriterion("type_name <>", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThan(String value) {
            addCriterion("type_name >", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("type_name >=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThan(String value) {
            addCriterion("type_name <", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThanOrEqualTo(String value) {
            addCriterion("type_name <=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLike(String value) {
            addCriterion("type_name like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotLike(String value) {
            addCriterion("type_name not like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameIn(List<String> values) {
            addCriterion("type_name in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotIn(List<String> values) {
            addCriterion("type_name not in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameBetween(String value1, String value2) {
            addCriterion("type_name between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotBetween(String value1, String value2) {
            addCriterion("type_name not between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeDescIsNull() {
            addCriterion("type_desc is null");
            return (Criteria) this;
        }

        public Criteria andTypeDescIsNotNull() {
            addCriterion("type_desc is not null");
            return (Criteria) this;
        }

        public Criteria andTypeDescEqualTo(String value) {
            addCriterion("type_desc =", value, "typeDesc");
            return (Criteria) this;
        }

        public Criteria andTypeDescNotEqualTo(String value) {
            addCriterion("type_desc <>", value, "typeDesc");
            return (Criteria) this;
        }

        public Criteria andTypeDescGreaterThan(String value) {
            addCriterion("type_desc >", value, "typeDesc");
            return (Criteria) this;
        }

        public Criteria andTypeDescGreaterThanOrEqualTo(String value) {
            addCriterion("type_desc >=", value, "typeDesc");
            return (Criteria) this;
        }

        public Criteria andTypeDescLessThan(String value) {
            addCriterion("type_desc <", value, "typeDesc");
            return (Criteria) this;
        }

        public Criteria andTypeDescLessThanOrEqualTo(String value) {
            addCriterion("type_desc <=", value, "typeDesc");
            return (Criteria) this;
        }

        public Criteria andTypeDescLike(String value) {
            addCriterion("type_desc like", value, "typeDesc");
            return (Criteria) this;
        }

        public Criteria andTypeDescNotLike(String value) {
            addCriterion("type_desc not like", value, "typeDesc");
            return (Criteria) this;
        }

        public Criteria andTypeDescIn(List<String> values) {
            addCriterion("type_desc in", values, "typeDesc");
            return (Criteria) this;
        }

        public Criteria andTypeDescNotIn(List<String> values) {
            addCriterion("type_desc not in", values, "typeDesc");
            return (Criteria) this;
        }

        public Criteria andTypeDescBetween(String value1, String value2) {
            addCriterion("type_desc between", value1, value2, "typeDesc");
            return (Criteria) this;
        }

        public Criteria andTypeDescNotBetween(String value1, String value2) {
            addCriterion("type_desc not between", value1, value2, "typeDesc");
            return (Criteria) this;
        }

        public Criteria andTypeStatusIsNull() {
            addCriterion("type_status is null");
            return (Criteria) this;
        }

        public Criteria andTypeStatusIsNotNull() {
            addCriterion("type_status is not null");
            return (Criteria) this;
        }

        public Criteria andTypeStatusEqualTo(Byte value) {
            addCriterion("type_status =", value, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusNotEqualTo(Byte value) {
            addCriterion("type_status <>", value, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusGreaterThan(Byte value) {
            addCriterion("type_status >", value, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("type_status >=", value, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusLessThan(Byte value) {
            addCriterion("type_status <", value, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusLessThanOrEqualTo(Byte value) {
            addCriterion("type_status <=", value, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusIn(List<Byte> values) {
            addCriterion("type_status in", values, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusNotIn(List<Byte> values) {
            addCriterion("type_status not in", values, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusBetween(Byte value1, Byte value2) {
            addCriterion("type_status between", value1, value2, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("type_status not between", value1, value2, "typeStatus");
            return (Criteria) this;
        }

        public Criteria andTypeSortIsNull() {
            addCriterion("type_sort is null");
            return (Criteria) this;
        }

        public Criteria andTypeSortIsNotNull() {
            addCriterion("type_sort is not null");
            return (Criteria) this;
        }

        public Criteria andTypeSortEqualTo(Integer value) {
            addCriterion("type_sort =", value, "typeSort");
            return (Criteria) this;
        }

        public Criteria andTypeSortNotEqualTo(Integer value) {
            addCriterion("type_sort <>", value, "typeSort");
            return (Criteria) this;
        }

        public Criteria andTypeSortGreaterThan(Integer value) {
            addCriterion("type_sort >", value, "typeSort");
            return (Criteria) this;
        }

        public Criteria andTypeSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_sort >=", value, "typeSort");
            return (Criteria) this;
        }

        public Criteria andTypeSortLessThan(Integer value) {
            addCriterion("type_sort <", value, "typeSort");
            return (Criteria) this;
        }

        public Criteria andTypeSortLessThanOrEqualTo(Integer value) {
            addCriterion("type_sort <=", value, "typeSort");
            return (Criteria) this;
        }

        public Criteria andTypeSortIn(List<Integer> values) {
            addCriterion("type_sort in", values, "typeSort");
            return (Criteria) this;
        }

        public Criteria andTypeSortNotIn(List<Integer> values) {
            addCriterion("type_sort not in", values, "typeSort");
            return (Criteria) this;
        }

        public Criteria andTypeSortBetween(Integer value1, Integer value2) {
            addCriterion("type_sort between", value1, value2, "typeSort");
            return (Criteria) this;
        }

        public Criteria andTypeSortNotBetween(Integer value1, Integer value2) {
            addCriterion("type_sort not between", value1, value2, "typeSort");
            return (Criteria) this;
        }

        public Criteria andTypeCreateTimeIsNull() {
            addCriterion("type_create_time is null");
            return (Criteria) this;
        }

        public Criteria andTypeCreateTimeIsNotNull() {
            addCriterion("type_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andTypeCreateTimeEqualTo(Date value) {
            addCriterion("type_create_time =", value, "typeCreateTime");
            return (Criteria) this;
        }

        public Criteria andTypeCreateTimeNotEqualTo(Date value) {
            addCriterion("type_create_time <>", value, "typeCreateTime");
            return (Criteria) this;
        }

        public Criteria andTypeCreateTimeGreaterThan(Date value) {
            addCriterion("type_create_time >", value, "typeCreateTime");
            return (Criteria) this;
        }

        public Criteria andTypeCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("type_create_time >=", value, "typeCreateTime");
            return (Criteria) this;
        }

        public Criteria andTypeCreateTimeLessThan(Date value) {
            addCriterion("type_create_time <", value, "typeCreateTime");
            return (Criteria) this;
        }

        public Criteria andTypeCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("type_create_time <=", value, "typeCreateTime");
            return (Criteria) this;
        }

        public Criteria andTypeCreateTimeIn(List<Date> values) {
            addCriterion("type_create_time in", values, "typeCreateTime");
            return (Criteria) this;
        }

        public Criteria andTypeCreateTimeNotIn(List<Date> values) {
            addCriterion("type_create_time not in", values, "typeCreateTime");
            return (Criteria) this;
        }

        public Criteria andTypeCreateTimeBetween(Date value1, Date value2) {
            addCriterion("type_create_time between", value1, value2, "typeCreateTime");
            return (Criteria) this;
        }

        public Criteria andTypeCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("type_create_time not between", value1, value2, "typeCreateTime");
            return (Criteria) this;
        }

        public Criteria andTypeUpdateTimeIsNull() {
            addCriterion("type_update_time is null");
            return (Criteria) this;
        }

        public Criteria andTypeUpdateTimeIsNotNull() {
            addCriterion("type_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andTypeUpdateTimeEqualTo(Date value) {
            addCriterion("type_update_time =", value, "typeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTypeUpdateTimeNotEqualTo(Date value) {
            addCriterion("type_update_time <>", value, "typeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTypeUpdateTimeGreaterThan(Date value) {
            addCriterion("type_update_time >", value, "typeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTypeUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("type_update_time >=", value, "typeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTypeUpdateTimeLessThan(Date value) {
            addCriterion("type_update_time <", value, "typeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTypeUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("type_update_time <=", value, "typeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTypeUpdateTimeIn(List<Date> values) {
            addCriterion("type_update_time in", values, "typeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTypeUpdateTimeNotIn(List<Date> values) {
            addCriterion("type_update_time not in", values, "typeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTypeUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("type_update_time between", value1, value2, "typeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTypeUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("type_update_time not between", value1, value2, "typeUpdateTime");
            return (Criteria) this;
        }

        public Criteria andTypeDelflagIsNull() {
            addCriterion("type_delflag is null");
            return (Criteria) this;
        }

        public Criteria andTypeDelflagIsNotNull() {
            addCriterion("type_delflag is not null");
            return (Criteria) this;
        }

        public Criteria andTypeDelflagEqualTo(Byte value) {
            addCriterion("type_delflag =", value, "typeDelflag");
            return (Criteria) this;
        }

        public Criteria andTypeDelflagNotEqualTo(Byte value) {
            addCriterion("type_delflag <>", value, "typeDelflag");
            return (Criteria) this;
        }

        public Criteria andTypeDelflagGreaterThan(Byte value) {
            addCriterion("type_delflag >", value, "typeDelflag");
            return (Criteria) this;
        }

        public Criteria andTypeDelflagGreaterThanOrEqualTo(Byte value) {
            addCriterion("type_delflag >=", value, "typeDelflag");
            return (Criteria) this;
        }

        public Criteria andTypeDelflagLessThan(Byte value) {
            addCriterion("type_delflag <", value, "typeDelflag");
            return (Criteria) this;
        }

        public Criteria andTypeDelflagLessThanOrEqualTo(Byte value) {
            addCriterion("type_delflag <=", value, "typeDelflag");
            return (Criteria) this;
        }

        public Criteria andTypeDelflagIn(List<Byte> values) {
            addCriterion("type_delflag in", values, "typeDelflag");
            return (Criteria) this;
        }

        public Criteria andTypeDelflagNotIn(List<Byte> values) {
            addCriterion("type_delflag not in", values, "typeDelflag");
            return (Criteria) this;
        }

        public Criteria andTypeDelflagBetween(Byte value1, Byte value2) {
            addCriterion("type_delflag between", value1, value2, "typeDelflag");
            return (Criteria) this;
        }

        public Criteria andTypeDelflagNotBetween(Byte value1, Byte value2) {
            addCriterion("type_delflag not between", value1, value2, "typeDelflag");
            return (Criteria) this;
        }

        public Criteria andTypeDelTimeIsNull() {
            addCriterion("type_del_time is null");
            return (Criteria) this;
        }

        public Criteria andTypeDelTimeIsNotNull() {
            addCriterion("type_del_time is not null");
            return (Criteria) this;
        }

        public Criteria andTypeDelTimeEqualTo(Date value) {
            addCriterion("type_del_time =", value, "typeDelTime");
            return (Criteria) this;
        }

        public Criteria andTypeDelTimeNotEqualTo(Date value) {
            addCriterion("type_del_time <>", value, "typeDelTime");
            return (Criteria) this;
        }

        public Criteria andTypeDelTimeGreaterThan(Date value) {
            addCriterion("type_del_time >", value, "typeDelTime");
            return (Criteria) this;
        }

        public Criteria andTypeDelTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("type_del_time >=", value, "typeDelTime");
            return (Criteria) this;
        }

        public Criteria andTypeDelTimeLessThan(Date value) {
            addCriterion("type_del_time <", value, "typeDelTime");
            return (Criteria) this;
        }

        public Criteria andTypeDelTimeLessThanOrEqualTo(Date value) {
            addCriterion("type_del_time <=", value, "typeDelTime");
            return (Criteria) this;
        }

        public Criteria andTypeDelTimeIn(List<Date> values) {
            addCriterion("type_del_time in", values, "typeDelTime");
            return (Criteria) this;
        }

        public Criteria andTypeDelTimeNotIn(List<Date> values) {
            addCriterion("type_del_time not in", values, "typeDelTime");
            return (Criteria) this;
        }

        public Criteria andTypeDelTimeBetween(Date value1, Date value2) {
            addCriterion("type_del_time between", value1, value2, "typeDelTime");
            return (Criteria) this;
        }

        public Criteria andTypeDelTimeNotBetween(Date value1, Date value2) {
            addCriterion("type_del_time not between", value1, value2, "typeDelTime");
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