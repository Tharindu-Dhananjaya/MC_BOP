package mc.kurunegala.bop.model;

import java.util.ArrayList;
import java.util.List;

public class AssDiscriptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssDiscriptionExample() {
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

        public Criteria andIdassDiscriptionIsNull() {
            addCriterion("idass_discription is null");
            return (Criteria) this;
        }

        public Criteria andIdassDiscriptionIsNotNull() {
            addCriterion("idass_discription is not null");
            return (Criteria) this;
        }

        public Criteria andIdassDiscriptionEqualTo(Integer value) {
            addCriterion("idass_discription =", value, "idassDiscription");
            return (Criteria) this;
        }

        public Criteria andIdassDiscriptionNotEqualTo(Integer value) {
            addCriterion("idass_discription <>", value, "idassDiscription");
            return (Criteria) this;
        }

        public Criteria andIdassDiscriptionGreaterThan(Integer value) {
            addCriterion("idass_discription >", value, "idassDiscription");
            return (Criteria) this;
        }

        public Criteria andIdassDiscriptionGreaterThanOrEqualTo(Integer value) {
            addCriterion("idass_discription >=", value, "idassDiscription");
            return (Criteria) this;
        }

        public Criteria andIdassDiscriptionLessThan(Integer value) {
            addCriterion("idass_discription <", value, "idassDiscription");
            return (Criteria) this;
        }

        public Criteria andIdassDiscriptionLessThanOrEqualTo(Integer value) {
            addCriterion("idass_discription <=", value, "idassDiscription");
            return (Criteria) this;
        }

        public Criteria andIdassDiscriptionIn(List<Integer> values) {
            addCriterion("idass_discription in", values, "idassDiscription");
            return (Criteria) this;
        }

        public Criteria andIdassDiscriptionNotIn(List<Integer> values) {
            addCriterion("idass_discription not in", values, "idassDiscription");
            return (Criteria) this;
        }

        public Criteria andIdassDiscriptionBetween(Integer value1, Integer value2) {
            addCriterion("idass_discription between", value1, value2, "idassDiscription");
            return (Criteria) this;
        }

        public Criteria andIdassDiscriptionNotBetween(Integer value1, Integer value2) {
            addCriterion("idass_discription not between", value1, value2, "idassDiscription");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionIsNull() {
            addCriterion("ass_discription is null");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionIsNotNull() {
            addCriterion("ass_discription is not null");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionEqualTo(String value) {
            addCriterion("ass_discription =", value, "assDiscription");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionNotEqualTo(String value) {
            addCriterion("ass_discription <>", value, "assDiscription");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionGreaterThan(String value) {
            addCriterion("ass_discription >", value, "assDiscription");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionGreaterThanOrEqualTo(String value) {
            addCriterion("ass_discription >=", value, "assDiscription");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionLessThan(String value) {
            addCriterion("ass_discription <", value, "assDiscription");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionLessThanOrEqualTo(String value) {
            addCriterion("ass_discription <=", value, "assDiscription");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionLike(String value) {
            addCriterion("ass_discription like", value, "assDiscription");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionNotLike(String value) {
            addCriterion("ass_discription not like", value, "assDiscription");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionIn(List<String> values) {
            addCriterion("ass_discription in", values, "assDiscription");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionNotIn(List<String> values) {
            addCriterion("ass_discription not in", values, "assDiscription");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionBetween(String value1, String value2) {
            addCriterion("ass_discription between", value1, value2, "assDiscription");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionNotBetween(String value1, String value2) {
            addCriterion("ass_discription not between", value1, value2, "assDiscription");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionStatusIsNull() {
            addCriterion("ass_discription_status is null");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionStatusIsNotNull() {
            addCriterion("ass_discription_status is not null");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionStatusEqualTo(String value) {
            addCriterion("ass_discription_status =", value, "assDiscriptionStatus");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionStatusNotEqualTo(String value) {
            addCriterion("ass_discription_status <>", value, "assDiscriptionStatus");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionStatusGreaterThan(String value) {
            addCriterion("ass_discription_status >", value, "assDiscriptionStatus");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ass_discription_status >=", value, "assDiscriptionStatus");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionStatusLessThan(String value) {
            addCriterion("ass_discription_status <", value, "assDiscriptionStatus");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionStatusLessThanOrEqualTo(String value) {
            addCriterion("ass_discription_status <=", value, "assDiscriptionStatus");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionStatusLike(String value) {
            addCriterion("ass_discription_status like", value, "assDiscriptionStatus");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionStatusNotLike(String value) {
            addCriterion("ass_discription_status not like", value, "assDiscriptionStatus");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionStatusIn(List<String> values) {
            addCriterion("ass_discription_status in", values, "assDiscriptionStatus");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionStatusNotIn(List<String> values) {
            addCriterion("ass_discription_status not in", values, "assDiscriptionStatus");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionStatusBetween(String value1, String value2) {
            addCriterion("ass_discription_status between", value1, value2, "assDiscriptionStatus");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionStatusNotBetween(String value1, String value2) {
            addCriterion("ass_discription_status not between", value1, value2, "assDiscriptionStatus");
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