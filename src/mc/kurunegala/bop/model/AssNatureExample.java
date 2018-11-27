package mc.kurunegala.bop.model;

import java.util.ArrayList;
import java.util.List;

public class AssNatureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssNatureExample() {
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

        public Criteria andIdassNatureIsNull() {
            addCriterion("idass_nature is null");
            return (Criteria) this;
        }

        public Criteria andIdassNatureIsNotNull() {
            addCriterion("idass_nature is not null");
            return (Criteria) this;
        }

        public Criteria andIdassNatureEqualTo(Integer value) {
            addCriterion("idass_nature =", value, "idassNature");
            return (Criteria) this;
        }

        public Criteria andIdassNatureNotEqualTo(Integer value) {
            addCriterion("idass_nature <>", value, "idassNature");
            return (Criteria) this;
        }

        public Criteria andIdassNatureGreaterThan(Integer value) {
            addCriterion("idass_nature >", value, "idassNature");
            return (Criteria) this;
        }

        public Criteria andIdassNatureGreaterThanOrEqualTo(Integer value) {
            addCriterion("idass_nature >=", value, "idassNature");
            return (Criteria) this;
        }

        public Criteria andIdassNatureLessThan(Integer value) {
            addCriterion("idass_nature <", value, "idassNature");
            return (Criteria) this;
        }

        public Criteria andIdassNatureLessThanOrEqualTo(Integer value) {
            addCriterion("idass_nature <=", value, "idassNature");
            return (Criteria) this;
        }

        public Criteria andIdassNatureIn(List<Integer> values) {
            addCriterion("idass_nature in", values, "idassNature");
            return (Criteria) this;
        }

        public Criteria andIdassNatureNotIn(List<Integer> values) {
            addCriterion("idass_nature not in", values, "idassNature");
            return (Criteria) this;
        }

        public Criteria andIdassNatureBetween(Integer value1, Integer value2) {
            addCriterion("idass_nature between", value1, value2, "idassNature");
            return (Criteria) this;
        }

        public Criteria andIdassNatureNotBetween(Integer value1, Integer value2) {
            addCriterion("idass_nature not between", value1, value2, "idassNature");
            return (Criteria) this;
        }

        public Criteria andAssNatureNameIsNull() {
            addCriterion("ass_nature_name is null");
            return (Criteria) this;
        }

        public Criteria andAssNatureNameIsNotNull() {
            addCriterion("ass_nature_name is not null");
            return (Criteria) this;
        }

        public Criteria andAssNatureNameEqualTo(String value) {
            addCriterion("ass_nature_name =", value, "assNatureName");
            return (Criteria) this;
        }

        public Criteria andAssNatureNameNotEqualTo(String value) {
            addCriterion("ass_nature_name <>", value, "assNatureName");
            return (Criteria) this;
        }

        public Criteria andAssNatureNameGreaterThan(String value) {
            addCriterion("ass_nature_name >", value, "assNatureName");
            return (Criteria) this;
        }

        public Criteria andAssNatureNameGreaterThanOrEqualTo(String value) {
            addCriterion("ass_nature_name >=", value, "assNatureName");
            return (Criteria) this;
        }

        public Criteria andAssNatureNameLessThan(String value) {
            addCriterion("ass_nature_name <", value, "assNatureName");
            return (Criteria) this;
        }

        public Criteria andAssNatureNameLessThanOrEqualTo(String value) {
            addCriterion("ass_nature_name <=", value, "assNatureName");
            return (Criteria) this;
        }

        public Criteria andAssNatureNameLike(String value) {
            addCriterion("ass_nature_name like", value, "assNatureName");
            return (Criteria) this;
        }

        public Criteria andAssNatureNameNotLike(String value) {
            addCriterion("ass_nature_name not like", value, "assNatureName");
            return (Criteria) this;
        }

        public Criteria andAssNatureNameIn(List<String> values) {
            addCriterion("ass_nature_name in", values, "assNatureName");
            return (Criteria) this;
        }

        public Criteria andAssNatureNameNotIn(List<String> values) {
            addCriterion("ass_nature_name not in", values, "assNatureName");
            return (Criteria) this;
        }

        public Criteria andAssNatureNameBetween(String value1, String value2) {
            addCriterion("ass_nature_name between", value1, value2, "assNatureName");
            return (Criteria) this;
        }

        public Criteria andAssNatureNameNotBetween(String value1, String value2) {
            addCriterion("ass_nature_name not between", value1, value2, "assNatureName");
            return (Criteria) this;
        }

        public Criteria andAssNatureYearRateIsNull() {
            addCriterion("ass_nature_year_rate is null");
            return (Criteria) this;
        }

        public Criteria andAssNatureYearRateIsNotNull() {
            addCriterion("ass_nature_year_rate is not null");
            return (Criteria) this;
        }

        public Criteria andAssNatureYearRateEqualTo(Double value) {
            addCriterion("ass_nature_year_rate =", value, "assNatureYearRate");
            return (Criteria) this;
        }

        public Criteria andAssNatureYearRateNotEqualTo(Double value) {
            addCriterion("ass_nature_year_rate <>", value, "assNatureYearRate");
            return (Criteria) this;
        }

        public Criteria andAssNatureYearRateGreaterThan(Double value) {
            addCriterion("ass_nature_year_rate >", value, "assNatureYearRate");
            return (Criteria) this;
        }

        public Criteria andAssNatureYearRateGreaterThanOrEqualTo(Double value) {
            addCriterion("ass_nature_year_rate >=", value, "assNatureYearRate");
            return (Criteria) this;
        }

        public Criteria andAssNatureYearRateLessThan(Double value) {
            addCriterion("ass_nature_year_rate <", value, "assNatureYearRate");
            return (Criteria) this;
        }

        public Criteria andAssNatureYearRateLessThanOrEqualTo(Double value) {
            addCriterion("ass_nature_year_rate <=", value, "assNatureYearRate");
            return (Criteria) this;
        }

        public Criteria andAssNatureYearRateIn(List<Double> values) {
            addCriterion("ass_nature_year_rate in", values, "assNatureYearRate");
            return (Criteria) this;
        }

        public Criteria andAssNatureYearRateNotIn(List<Double> values) {
            addCriterion("ass_nature_year_rate not in", values, "assNatureYearRate");
            return (Criteria) this;
        }

        public Criteria andAssNatureYearRateBetween(Double value1, Double value2) {
            addCriterion("ass_nature_year_rate between", value1, value2, "assNatureYearRate");
            return (Criteria) this;
        }

        public Criteria andAssNatureYearRateNotBetween(Double value1, Double value2) {
            addCriterion("ass_nature_year_rate not between", value1, value2, "assNatureYearRate");
            return (Criteria) this;
        }

        public Criteria andAssNatureStatusIsNull() {
            addCriterion("ass_nature_status is null");
            return (Criteria) this;
        }

        public Criteria andAssNatureStatusIsNotNull() {
            addCriterion("ass_nature_status is not null");
            return (Criteria) this;
        }

        public Criteria andAssNatureStatusEqualTo(Integer value) {
            addCriterion("ass_nature_status =", value, "assNatureStatus");
            return (Criteria) this;
        }

        public Criteria andAssNatureStatusNotEqualTo(Integer value) {
            addCriterion("ass_nature_status <>", value, "assNatureStatus");
            return (Criteria) this;
        }

        public Criteria andAssNatureStatusGreaterThan(Integer value) {
            addCriterion("ass_nature_status >", value, "assNatureStatus");
            return (Criteria) this;
        }

        public Criteria andAssNatureStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ass_nature_status >=", value, "assNatureStatus");
            return (Criteria) this;
        }

        public Criteria andAssNatureStatusLessThan(Integer value) {
            addCriterion("ass_nature_status <", value, "assNatureStatus");
            return (Criteria) this;
        }

        public Criteria andAssNatureStatusLessThanOrEqualTo(Integer value) {
            addCriterion("ass_nature_status <=", value, "assNatureStatus");
            return (Criteria) this;
        }

        public Criteria andAssNatureStatusIn(List<Integer> values) {
            addCriterion("ass_nature_status in", values, "assNatureStatus");
            return (Criteria) this;
        }

        public Criteria andAssNatureStatusNotIn(List<Integer> values) {
            addCriterion("ass_nature_status not in", values, "assNatureStatus");
            return (Criteria) this;
        }

        public Criteria andAssNatureStatusBetween(Integer value1, Integer value2) {
            addCriterion("ass_nature_status between", value1, value2, "assNatureStatus");
            return (Criteria) this;
        }

        public Criteria andAssNatureStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ass_nature_status not between", value1, value2, "assNatureStatus");
            return (Criteria) this;
        }

        public Criteria andAssNatureWarrantRateIsNull() {
            addCriterion("ass_nature_warrant_rate is null");
            return (Criteria) this;
        }

        public Criteria andAssNatureWarrantRateIsNotNull() {
            addCriterion("ass_nature_warrant_rate is not null");
            return (Criteria) this;
        }

        public Criteria andAssNatureWarrantRateEqualTo(Double value) {
            addCriterion("ass_nature_warrant_rate =", value, "assNatureWarrantRate");
            return (Criteria) this;
        }

        public Criteria andAssNatureWarrantRateNotEqualTo(Double value) {
            addCriterion("ass_nature_warrant_rate <>", value, "assNatureWarrantRate");
            return (Criteria) this;
        }

        public Criteria andAssNatureWarrantRateGreaterThan(Double value) {
            addCriterion("ass_nature_warrant_rate >", value, "assNatureWarrantRate");
            return (Criteria) this;
        }

        public Criteria andAssNatureWarrantRateGreaterThanOrEqualTo(Double value) {
            addCriterion("ass_nature_warrant_rate >=", value, "assNatureWarrantRate");
            return (Criteria) this;
        }

        public Criteria andAssNatureWarrantRateLessThan(Double value) {
            addCriterion("ass_nature_warrant_rate <", value, "assNatureWarrantRate");
            return (Criteria) this;
        }

        public Criteria andAssNatureWarrantRateLessThanOrEqualTo(Double value) {
            addCriterion("ass_nature_warrant_rate <=", value, "assNatureWarrantRate");
            return (Criteria) this;
        }

        public Criteria andAssNatureWarrantRateIn(List<Double> values) {
            addCriterion("ass_nature_warrant_rate in", values, "assNatureWarrantRate");
            return (Criteria) this;
        }

        public Criteria andAssNatureWarrantRateNotIn(List<Double> values) {
            addCriterion("ass_nature_warrant_rate not in", values, "assNatureWarrantRate");
            return (Criteria) this;
        }

        public Criteria andAssNatureWarrantRateBetween(Double value1, Double value2) {
            addCriterion("ass_nature_warrant_rate between", value1, value2, "assNatureWarrantRate");
            return (Criteria) this;
        }

        public Criteria andAssNatureWarrantRateNotBetween(Double value1, Double value2) {
            addCriterion("ass_nature_warrant_rate not between", value1, value2, "assNatureWarrantRate");
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