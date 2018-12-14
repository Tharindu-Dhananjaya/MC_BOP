package mc.kurunegala.bop.model;

import java.util.ArrayList;
import java.util.List;

public class DipartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DipartmentExample() {
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

        public Criteria andIddipartmentIsNull() {
            addCriterion("idDipartment is null");
            return (Criteria) this;
        }

        public Criteria andIddipartmentIsNotNull() {
            addCriterion("idDipartment is not null");
            return (Criteria) this;
        }

        public Criteria andIddipartmentEqualTo(Integer value) {
            addCriterion("idDipartment =", value, "iddipartment");
            return (Criteria) this;
        }

        public Criteria andIddipartmentNotEqualTo(Integer value) {
            addCriterion("idDipartment <>", value, "iddipartment");
            return (Criteria) this;
        }

        public Criteria andIddipartmentGreaterThan(Integer value) {
            addCriterion("idDipartment >", value, "iddipartment");
            return (Criteria) this;
        }

        public Criteria andIddipartmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("idDipartment >=", value, "iddipartment");
            return (Criteria) this;
        }

        public Criteria andIddipartmentLessThan(Integer value) {
            addCriterion("idDipartment <", value, "iddipartment");
            return (Criteria) this;
        }

        public Criteria andIddipartmentLessThanOrEqualTo(Integer value) {
            addCriterion("idDipartment <=", value, "iddipartment");
            return (Criteria) this;
        }

        public Criteria andIddipartmentIn(List<Integer> values) {
            addCriterion("idDipartment in", values, "iddipartment");
            return (Criteria) this;
        }

        public Criteria andIddipartmentNotIn(List<Integer> values) {
            addCriterion("idDipartment not in", values, "iddipartment");
            return (Criteria) this;
        }

        public Criteria andIddipartmentBetween(Integer value1, Integer value2) {
            addCriterion("idDipartment between", value1, value2, "iddipartment");
            return (Criteria) this;
        }

        public Criteria andIddipartmentNotBetween(Integer value1, Integer value2) {
            addCriterion("idDipartment not between", value1, value2, "iddipartment");
            return (Criteria) this;
        }

        public Criteria andDipNameIsNull() {
            addCriterion("dip_name is null");
            return (Criteria) this;
        }

        public Criteria andDipNameIsNotNull() {
            addCriterion("dip_name is not null");
            return (Criteria) this;
        }

        public Criteria andDipNameEqualTo(String value) {
            addCriterion("dip_name =", value, "dipName");
            return (Criteria) this;
        }

        public Criteria andDipNameNotEqualTo(String value) {
            addCriterion("dip_name <>", value, "dipName");
            return (Criteria) this;
        }

        public Criteria andDipNameGreaterThan(String value) {
            addCriterion("dip_name >", value, "dipName");
            return (Criteria) this;
        }

        public Criteria andDipNameGreaterThanOrEqualTo(String value) {
            addCriterion("dip_name >=", value, "dipName");
            return (Criteria) this;
        }

        public Criteria andDipNameLessThan(String value) {
            addCriterion("dip_name <", value, "dipName");
            return (Criteria) this;
        }

        public Criteria andDipNameLessThanOrEqualTo(String value) {
            addCriterion("dip_name <=", value, "dipName");
            return (Criteria) this;
        }

        public Criteria andDipNameLike(String value) {
            addCriterion("dip_name like", value, "dipName");
            return (Criteria) this;
        }

        public Criteria andDipNameNotLike(String value) {
            addCriterion("dip_name not like", value, "dipName");
            return (Criteria) this;
        }

        public Criteria andDipNameIn(List<String> values) {
            addCriterion("dip_name in", values, "dipName");
            return (Criteria) this;
        }

        public Criteria andDipNameNotIn(List<String> values) {
            addCriterion("dip_name not in", values, "dipName");
            return (Criteria) this;
        }

        public Criteria andDipNameBetween(String value1, String value2) {
            addCriterion("dip_name between", value1, value2, "dipName");
            return (Criteria) this;
        }

        public Criteria andDipNameNotBetween(String value1, String value2) {
            addCriterion("dip_name not between", value1, value2, "dipName");
            return (Criteria) this;
        }

        public Criteria andDipHeadIsNull() {
            addCriterion("dip_head is null");
            return (Criteria) this;
        }

        public Criteria andDipHeadIsNotNull() {
            addCriterion("dip_head is not null");
            return (Criteria) this;
        }

        public Criteria andDipHeadEqualTo(String value) {
            addCriterion("dip_head =", value, "dipHead");
            return (Criteria) this;
        }

        public Criteria andDipHeadNotEqualTo(String value) {
            addCriterion("dip_head <>", value, "dipHead");
            return (Criteria) this;
        }

        public Criteria andDipHeadGreaterThan(String value) {
            addCriterion("dip_head >", value, "dipHead");
            return (Criteria) this;
        }

        public Criteria andDipHeadGreaterThanOrEqualTo(String value) {
            addCriterion("dip_head >=", value, "dipHead");
            return (Criteria) this;
        }

        public Criteria andDipHeadLessThan(String value) {
            addCriterion("dip_head <", value, "dipHead");
            return (Criteria) this;
        }

        public Criteria andDipHeadLessThanOrEqualTo(String value) {
            addCriterion("dip_head <=", value, "dipHead");
            return (Criteria) this;
        }

        public Criteria andDipHeadLike(String value) {
            addCriterion("dip_head like", value, "dipHead");
            return (Criteria) this;
        }

        public Criteria andDipHeadNotLike(String value) {
            addCriterion("dip_head not like", value, "dipHead");
            return (Criteria) this;
        }

        public Criteria andDipHeadIn(List<String> values) {
            addCriterion("dip_head in", values, "dipHead");
            return (Criteria) this;
        }

        public Criteria andDipHeadNotIn(List<String> values) {
            addCriterion("dip_head not in", values, "dipHead");
            return (Criteria) this;
        }

        public Criteria andDipHeadBetween(String value1, String value2) {
            addCriterion("dip_head between", value1, value2, "dipHead");
            return (Criteria) this;
        }

        public Criteria andDipHeadNotBetween(String value1, String value2) {
            addCriterion("dip_head not between", value1, value2, "dipHead");
            return (Criteria) this;
        }

        public Criteria andDipStatusIsNull() {
            addCriterion("dip_status is null");
            return (Criteria) this;
        }

        public Criteria andDipStatusIsNotNull() {
            addCriterion("dip_status is not null");
            return (Criteria) this;
        }

        public Criteria andDipStatusEqualTo(Integer value) {
            addCriterion("dip_status =", value, "dipStatus");
            return (Criteria) this;
        }

        public Criteria andDipStatusNotEqualTo(Integer value) {
            addCriterion("dip_status <>", value, "dipStatus");
            return (Criteria) this;
        }

        public Criteria andDipStatusGreaterThan(Integer value) {
            addCriterion("dip_status >", value, "dipStatus");
            return (Criteria) this;
        }

        public Criteria andDipStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("dip_status >=", value, "dipStatus");
            return (Criteria) this;
        }

        public Criteria andDipStatusLessThan(Integer value) {
            addCriterion("dip_status <", value, "dipStatus");
            return (Criteria) this;
        }

        public Criteria andDipStatusLessThanOrEqualTo(Integer value) {
            addCriterion("dip_status <=", value, "dipStatus");
            return (Criteria) this;
        }

        public Criteria andDipStatusIn(List<Integer> values) {
            addCriterion("dip_status in", values, "dipStatus");
            return (Criteria) this;
        }

        public Criteria andDipStatusNotIn(List<Integer> values) {
            addCriterion("dip_status not in", values, "dipStatus");
            return (Criteria) this;
        }

        public Criteria andDipStatusBetween(Integer value1, Integer value2) {
            addCriterion("dip_status between", value1, value2, "dipStatus");
            return (Criteria) this;
        }

        public Criteria andDipStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("dip_status not between", value1, value2, "dipStatus");
            return (Criteria) this;
        }

        public Criteria andDipSynIsNull() {
            addCriterion("dip_syn is null");
            return (Criteria) this;
        }

        public Criteria andDipSynIsNotNull() {
            addCriterion("dip_syn is not null");
            return (Criteria) this;
        }

        public Criteria andDipSynEqualTo(Integer value) {
            addCriterion("dip_syn =", value, "dipSyn");
            return (Criteria) this;
        }

        public Criteria andDipSynNotEqualTo(Integer value) {
            addCriterion("dip_syn <>", value, "dipSyn");
            return (Criteria) this;
        }

        public Criteria andDipSynGreaterThan(Integer value) {
            addCriterion("dip_syn >", value, "dipSyn");
            return (Criteria) this;
        }

        public Criteria andDipSynGreaterThanOrEqualTo(Integer value) {
            addCriterion("dip_syn >=", value, "dipSyn");
            return (Criteria) this;
        }

        public Criteria andDipSynLessThan(Integer value) {
            addCriterion("dip_syn <", value, "dipSyn");
            return (Criteria) this;
        }

        public Criteria andDipSynLessThanOrEqualTo(Integer value) {
            addCriterion("dip_syn <=", value, "dipSyn");
            return (Criteria) this;
        }

        public Criteria andDipSynIn(List<Integer> values) {
            addCriterion("dip_syn in", values, "dipSyn");
            return (Criteria) this;
        }

        public Criteria andDipSynNotIn(List<Integer> values) {
            addCriterion("dip_syn not in", values, "dipSyn");
            return (Criteria) this;
        }

        public Criteria andDipSynBetween(Integer value1, Integer value2) {
            addCriterion("dip_syn between", value1, value2, "dipSyn");
            return (Criteria) this;
        }

        public Criteria andDipSynNotBetween(Integer value1, Integer value2) {
            addCriterion("dip_syn not between", value1, value2, "dipSyn");
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