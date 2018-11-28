package mc.kurunegala.bop.model;

import java.util.ArrayList;
import java.util.List;

public class BopHasAssessmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BopHasAssessmentExample() {
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

        public Criteria andIdbopHasAssessmentcolIsNull() {
            addCriterion("idBOP_has_Assessmentcol is null");
            return (Criteria) this;
        }

        public Criteria andIdbopHasAssessmentcolIsNotNull() {
            addCriterion("idBOP_has_Assessmentcol is not null");
            return (Criteria) this;
        }

        public Criteria andIdbopHasAssessmentcolEqualTo(Integer value) {
            addCriterion("idBOP_has_Assessmentcol =", value, "idbopHasAssessmentcol");
            return (Criteria) this;
        }

        public Criteria andIdbopHasAssessmentcolNotEqualTo(Integer value) {
            addCriterion("idBOP_has_Assessmentcol <>", value, "idbopHasAssessmentcol");
            return (Criteria) this;
        }

        public Criteria andIdbopHasAssessmentcolGreaterThan(Integer value) {
            addCriterion("idBOP_has_Assessmentcol >", value, "idbopHasAssessmentcol");
            return (Criteria) this;
        }

        public Criteria andIdbopHasAssessmentcolGreaterThanOrEqualTo(Integer value) {
            addCriterion("idBOP_has_Assessmentcol >=", value, "idbopHasAssessmentcol");
            return (Criteria) this;
        }

        public Criteria andIdbopHasAssessmentcolLessThan(Integer value) {
            addCriterion("idBOP_has_Assessmentcol <", value, "idbopHasAssessmentcol");
            return (Criteria) this;
        }

        public Criteria andIdbopHasAssessmentcolLessThanOrEqualTo(Integer value) {
            addCriterion("idBOP_has_Assessmentcol <=", value, "idbopHasAssessmentcol");
            return (Criteria) this;
        }

        public Criteria andIdbopHasAssessmentcolIn(List<Integer> values) {
            addCriterion("idBOP_has_Assessmentcol in", values, "idbopHasAssessmentcol");
            return (Criteria) this;
        }

        public Criteria andIdbopHasAssessmentcolNotIn(List<Integer> values) {
            addCriterion("idBOP_has_Assessmentcol not in", values, "idbopHasAssessmentcol");
            return (Criteria) this;
        }

        public Criteria andIdbopHasAssessmentcolBetween(Integer value1, Integer value2) {
            addCriterion("idBOP_has_Assessmentcol between", value1, value2, "idbopHasAssessmentcol");
            return (Criteria) this;
        }

        public Criteria andIdbopHasAssessmentcolNotBetween(Integer value1, Integer value2) {
            addCriterion("idBOP_has_Assessmentcol not between", value1, value2, "idbopHasAssessmentcol");
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

        public Criteria andAssessmentIdassessmentIsNull() {
            addCriterion("Assessment_idAssessment is null");
            return (Criteria) this;
        }

        public Criteria andAssessmentIdassessmentIsNotNull() {
            addCriterion("Assessment_idAssessment is not null");
            return (Criteria) this;
        }

        public Criteria andAssessmentIdassessmentEqualTo(Integer value) {
            addCriterion("Assessment_idAssessment =", value, "assessmentIdassessment");
            return (Criteria) this;
        }

        public Criteria andAssessmentIdassessmentNotEqualTo(Integer value) {
            addCriterion("Assessment_idAssessment <>", value, "assessmentIdassessment");
            return (Criteria) this;
        }

        public Criteria andAssessmentIdassessmentGreaterThan(Integer value) {
            addCriterion("Assessment_idAssessment >", value, "assessmentIdassessment");
            return (Criteria) this;
        }

        public Criteria andAssessmentIdassessmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("Assessment_idAssessment >=", value, "assessmentIdassessment");
            return (Criteria) this;
        }

        public Criteria andAssessmentIdassessmentLessThan(Integer value) {
            addCriterion("Assessment_idAssessment <", value, "assessmentIdassessment");
            return (Criteria) this;
        }

        public Criteria andAssessmentIdassessmentLessThanOrEqualTo(Integer value) {
            addCriterion("Assessment_idAssessment <=", value, "assessmentIdassessment");
            return (Criteria) this;
        }

        public Criteria andAssessmentIdassessmentIn(List<Integer> values) {
            addCriterion("Assessment_idAssessment in", values, "assessmentIdassessment");
            return (Criteria) this;
        }

        public Criteria andAssessmentIdassessmentNotIn(List<Integer> values) {
            addCriterion("Assessment_idAssessment not in", values, "assessmentIdassessment");
            return (Criteria) this;
        }

        public Criteria andAssessmentIdassessmentBetween(Integer value1, Integer value2) {
            addCriterion("Assessment_idAssessment between", value1, value2, "assessmentIdassessment");
            return (Criteria) this;
        }

        public Criteria andAssessmentIdassessmentNotBetween(Integer value1, Integer value2) {
            addCriterion("Assessment_idAssessment not between", value1, value2, "assessmentIdassessment");
            return (Criteria) this;
        }

        public Criteria andBopHasAssessmentStatusIsNull() {
            addCriterion("BOP_has_Assessment_status is null");
            return (Criteria) this;
        }

        public Criteria andBopHasAssessmentStatusIsNotNull() {
            addCriterion("BOP_has_Assessment_status is not null");
            return (Criteria) this;
        }

        public Criteria andBopHasAssessmentStatusEqualTo(Integer value) {
            addCriterion("BOP_has_Assessment_status =", value, "bopHasAssessmentStatus");
            return (Criteria) this;
        }

        public Criteria andBopHasAssessmentStatusNotEqualTo(Integer value) {
            addCriterion("BOP_has_Assessment_status <>", value, "bopHasAssessmentStatus");
            return (Criteria) this;
        }

        public Criteria andBopHasAssessmentStatusGreaterThan(Integer value) {
            addCriterion("BOP_has_Assessment_status >", value, "bopHasAssessmentStatus");
            return (Criteria) this;
        }

        public Criteria andBopHasAssessmentStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("BOP_has_Assessment_status >=", value, "bopHasAssessmentStatus");
            return (Criteria) this;
        }

        public Criteria andBopHasAssessmentStatusLessThan(Integer value) {
            addCriterion("BOP_has_Assessment_status <", value, "bopHasAssessmentStatus");
            return (Criteria) this;
        }

        public Criteria andBopHasAssessmentStatusLessThanOrEqualTo(Integer value) {
            addCriterion("BOP_has_Assessment_status <=", value, "bopHasAssessmentStatus");
            return (Criteria) this;
        }

        public Criteria andBopHasAssessmentStatusIn(List<Integer> values) {
            addCriterion("BOP_has_Assessment_status in", values, "bopHasAssessmentStatus");
            return (Criteria) this;
        }

        public Criteria andBopHasAssessmentStatusNotIn(List<Integer> values) {
            addCriterion("BOP_has_Assessment_status not in", values, "bopHasAssessmentStatus");
            return (Criteria) this;
        }

        public Criteria andBopHasAssessmentStatusBetween(Integer value1, Integer value2) {
            addCriterion("BOP_has_Assessment_status between", value1, value2, "bopHasAssessmentStatus");
            return (Criteria) this;
        }

        public Criteria andBopHasAssessmentStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("BOP_has_Assessment_status not between", value1, value2, "bopHasAssessmentStatus");
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