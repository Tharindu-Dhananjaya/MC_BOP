package mc.kurunegala.bop.model;

import java.util.ArrayList;
import java.util.List;

public class AreaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AreaExample() {
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

        public Criteria andIdareaIsNull() {
            addCriterion("idArea is null");
            return (Criteria) this;
        }

        public Criteria andIdareaIsNotNull() {
            addCriterion("idArea is not null");
            return (Criteria) this;
        }

        public Criteria andIdareaEqualTo(Integer value) {
            addCriterion("idArea =", value, "idarea");
            return (Criteria) this;
        }

        public Criteria andIdareaNotEqualTo(Integer value) {
            addCriterion("idArea <>", value, "idarea");
            return (Criteria) this;
        }

        public Criteria andIdareaGreaterThan(Integer value) {
            addCriterion("idArea >", value, "idarea");
            return (Criteria) this;
        }

        public Criteria andIdareaGreaterThanOrEqualTo(Integer value) {
            addCriterion("idArea >=", value, "idarea");
            return (Criteria) this;
        }

        public Criteria andIdareaLessThan(Integer value) {
            addCriterion("idArea <", value, "idarea");
            return (Criteria) this;
        }

        public Criteria andIdareaLessThanOrEqualTo(Integer value) {
            addCriterion("idArea <=", value, "idarea");
            return (Criteria) this;
        }

        public Criteria andIdareaIn(List<Integer> values) {
            addCriterion("idArea in", values, "idarea");
            return (Criteria) this;
        }

        public Criteria andIdareaNotIn(List<Integer> values) {
            addCriterion("idArea not in", values, "idarea");
            return (Criteria) this;
        }

        public Criteria andIdareaBetween(Integer value1, Integer value2) {
            addCriterion("idArea between", value1, value2, "idarea");
            return (Criteria) this;
        }

        public Criteria andIdareaNotBetween(Integer value1, Integer value2) {
            addCriterion("idArea not between", value1, value2, "idarea");
            return (Criteria) this;
        }

        public Criteria andAreaPriceIsNull() {
            addCriterion("Area_price is null");
            return (Criteria) this;
        }

        public Criteria andAreaPriceIsNotNull() {
            addCriterion("Area_price is not null");
            return (Criteria) this;
        }

        public Criteria andAreaPriceEqualTo(Double value) {
            addCriterion("Area_price =", value, "areaPrice");
            return (Criteria) this;
        }

        public Criteria andAreaPriceNotEqualTo(Double value) {
            addCriterion("Area_price <>", value, "areaPrice");
            return (Criteria) this;
        }

        public Criteria andAreaPriceGreaterThan(Double value) {
            addCriterion("Area_price >", value, "areaPrice");
            return (Criteria) this;
        }

        public Criteria andAreaPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("Area_price >=", value, "areaPrice");
            return (Criteria) this;
        }

        public Criteria andAreaPriceLessThan(Double value) {
            addCriterion("Area_price <", value, "areaPrice");
            return (Criteria) this;
        }

        public Criteria andAreaPriceLessThanOrEqualTo(Double value) {
            addCriterion("Area_price <=", value, "areaPrice");
            return (Criteria) this;
        }

        public Criteria andAreaPriceIn(List<Double> values) {
            addCriterion("Area_price in", values, "areaPrice");
            return (Criteria) this;
        }

        public Criteria andAreaPriceNotIn(List<Double> values) {
            addCriterion("Area_price not in", values, "areaPrice");
            return (Criteria) this;
        }

        public Criteria andAreaPriceBetween(Double value1, Double value2) {
            addCriterion("Area_price between", value1, value2, "areaPrice");
            return (Criteria) this;
        }

        public Criteria andAreaPriceNotBetween(Double value1, Double value2) {
            addCriterion("Area_price not between", value1, value2, "areaPrice");
            return (Criteria) this;
        }

        public Criteria andAreaPerchersIsNull() {
            addCriterion("Area_perchers is null");
            return (Criteria) this;
        }

        public Criteria andAreaPerchersIsNotNull() {
            addCriterion("Area_perchers is not null");
            return (Criteria) this;
        }

        public Criteria andAreaPerchersEqualTo(Double value) {
            addCriterion("Area_perchers =", value, "areaPerchers");
            return (Criteria) this;
        }

        public Criteria andAreaPerchersNotEqualTo(Double value) {
            addCriterion("Area_perchers <>", value, "areaPerchers");
            return (Criteria) this;
        }

        public Criteria andAreaPerchersGreaterThan(Double value) {
            addCriterion("Area_perchers >", value, "areaPerchers");
            return (Criteria) this;
        }

        public Criteria andAreaPerchersGreaterThanOrEqualTo(Double value) {
            addCriterion("Area_perchers >=", value, "areaPerchers");
            return (Criteria) this;
        }

        public Criteria andAreaPerchersLessThan(Double value) {
            addCriterion("Area_perchers <", value, "areaPerchers");
            return (Criteria) this;
        }

        public Criteria andAreaPerchersLessThanOrEqualTo(Double value) {
            addCriterion("Area_perchers <=", value, "areaPerchers");
            return (Criteria) this;
        }

        public Criteria andAreaPerchersIn(List<Double> values) {
            addCriterion("Area_perchers in", values, "areaPerchers");
            return (Criteria) this;
        }

        public Criteria andAreaPerchersNotIn(List<Double> values) {
            addCriterion("Area_perchers not in", values, "areaPerchers");
            return (Criteria) this;
        }

        public Criteria andAreaPerchersBetween(Double value1, Double value2) {
            addCriterion("Area_perchers between", value1, value2, "areaPerchers");
            return (Criteria) this;
        }

        public Criteria andAreaPerchersNotBetween(Double value1, Double value2) {
            addCriterion("Area_perchers not between", value1, value2, "areaPerchers");
            return (Criteria) this;
        }

        public Criteria andBopIdbopIsNull() {
            addCriterion("BOP_idBOP is null");
            return (Criteria) this;
        }

        public Criteria andBopIdbopIsNotNull() {
            addCriterion("BOP_idBOP is not null");
            return (Criteria) this;
        }

        public Criteria andBopIdbopEqualTo(Integer value) {
            addCriterion("BOP_idBOP =", value, "bopIdbop");
            return (Criteria) this;
        }

        public Criteria andBopIdbopNotEqualTo(Integer value) {
            addCriterion("BOP_idBOP <>", value, "bopIdbop");
            return (Criteria) this;
        }

        public Criteria andBopIdbopGreaterThan(Integer value) {
            addCriterion("BOP_idBOP >", value, "bopIdbop");
            return (Criteria) this;
        }

        public Criteria andBopIdbopGreaterThanOrEqualTo(Integer value) {
            addCriterion("BOP_idBOP >=", value, "bopIdbop");
            return (Criteria) this;
        }

        public Criteria andBopIdbopLessThan(Integer value) {
            addCriterion("BOP_idBOP <", value, "bopIdbop");
            return (Criteria) this;
        }

        public Criteria andBopIdbopLessThanOrEqualTo(Integer value) {
            addCriterion("BOP_idBOP <=", value, "bopIdbop");
            return (Criteria) this;
        }

        public Criteria andBopIdbopIn(List<Integer> values) {
            addCriterion("BOP_idBOP in", values, "bopIdbop");
            return (Criteria) this;
        }

        public Criteria andBopIdbopNotIn(List<Integer> values) {
            addCriterion("BOP_idBOP not in", values, "bopIdbop");
            return (Criteria) this;
        }

        public Criteria andBopIdbopBetween(Integer value1, Integer value2) {
            addCriterion("BOP_idBOP between", value1, value2, "bopIdbop");
            return (Criteria) this;
        }

        public Criteria andBopIdbopNotBetween(Integer value1, Integer value2) {
            addCriterion("BOP_idBOP not between", value1, value2, "bopIdbop");
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