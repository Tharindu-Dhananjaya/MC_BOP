package mc.kurunegala.bop.model;

import java.util.ArrayList;
import java.util.List;

public class PrivilageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrivilageExample() {
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

        public Criteria andIdprivilageIsNull() {
            addCriterion("idPrivilage is null");
            return (Criteria) this;
        }

        public Criteria andIdprivilageIsNotNull() {
            addCriterion("idPrivilage is not null");
            return (Criteria) this;
        }

        public Criteria andIdprivilageEqualTo(Integer value) {
            addCriterion("idPrivilage =", value, "idprivilage");
            return (Criteria) this;
        }

        public Criteria andIdprivilageNotEqualTo(Integer value) {
            addCriterion("idPrivilage <>", value, "idprivilage");
            return (Criteria) this;
        }

        public Criteria andIdprivilageGreaterThan(Integer value) {
            addCriterion("idPrivilage >", value, "idprivilage");
            return (Criteria) this;
        }

        public Criteria andIdprivilageGreaterThanOrEqualTo(Integer value) {
            addCriterion("idPrivilage >=", value, "idprivilage");
            return (Criteria) this;
        }

        public Criteria andIdprivilageLessThan(Integer value) {
            addCriterion("idPrivilage <", value, "idprivilage");
            return (Criteria) this;
        }

        public Criteria andIdprivilageLessThanOrEqualTo(Integer value) {
            addCriterion("idPrivilage <=", value, "idprivilage");
            return (Criteria) this;
        }

        public Criteria andIdprivilageIn(List<Integer> values) {
            addCriterion("idPrivilage in", values, "idprivilage");
            return (Criteria) this;
        }

        public Criteria andIdprivilageNotIn(List<Integer> values) {
            addCriterion("idPrivilage not in", values, "idprivilage");
            return (Criteria) this;
        }

        public Criteria andIdprivilageBetween(Integer value1, Integer value2) {
            addCriterion("idPrivilage between", value1, value2, "idprivilage");
            return (Criteria) this;
        }

        public Criteria andIdprivilageNotBetween(Integer value1, Integer value2) {
            addCriterion("idPrivilage not between", value1, value2, "idprivilage");
            return (Criteria) this;
        }

        public Criteria andViewIsNull() {
            addCriterion("view is null");
            return (Criteria) this;
        }

        public Criteria andViewIsNotNull() {
            addCriterion("view is not null");
            return (Criteria) this;
        }

        public Criteria andViewEqualTo(String value) {
            addCriterion("view =", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewNotEqualTo(String value) {
            addCriterion("view <>", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewGreaterThan(String value) {
            addCriterion("view >", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewGreaterThanOrEqualTo(String value) {
            addCriterion("view >=", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewLessThan(String value) {
            addCriterion("view <", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewLessThanOrEqualTo(String value) {
            addCriterion("view <=", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewLike(String value) {
            addCriterion("view like", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewNotLike(String value) {
            addCriterion("view not like", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewIn(List<String> values) {
            addCriterion("view in", values, "view");
            return (Criteria) this;
        }

        public Criteria andViewNotIn(List<String> values) {
            addCriterion("view not in", values, "view");
            return (Criteria) this;
        }

        public Criteria andViewBetween(String value1, String value2) {
            addCriterion("view between", value1, value2, "view");
            return (Criteria) this;
        }

        public Criteria andViewNotBetween(String value1, String value2) {
            addCriterion("view not between", value1, value2, "view");
            return (Criteria) this;
        }

        public Criteria andBtnIsNull() {
            addCriterion("btn is null");
            return (Criteria) this;
        }

        public Criteria andBtnIsNotNull() {
            addCriterion("btn is not null");
            return (Criteria) this;
        }

        public Criteria andBtnEqualTo(String value) {
            addCriterion("btn =", value, "btn");
            return (Criteria) this;
        }

        public Criteria andBtnNotEqualTo(String value) {
            addCriterion("btn <>", value, "btn");
            return (Criteria) this;
        }

        public Criteria andBtnGreaterThan(String value) {
            addCriterion("btn >", value, "btn");
            return (Criteria) this;
        }

        public Criteria andBtnGreaterThanOrEqualTo(String value) {
            addCriterion("btn >=", value, "btn");
            return (Criteria) this;
        }

        public Criteria andBtnLessThan(String value) {
            addCriterion("btn <", value, "btn");
            return (Criteria) this;
        }

        public Criteria andBtnLessThanOrEqualTo(String value) {
            addCriterion("btn <=", value, "btn");
            return (Criteria) this;
        }

        public Criteria andBtnLike(String value) {
            addCriterion("btn like", value, "btn");
            return (Criteria) this;
        }

        public Criteria andBtnNotLike(String value) {
            addCriterion("btn not like", value, "btn");
            return (Criteria) this;
        }

        public Criteria andBtnIn(List<String> values) {
            addCriterion("btn in", values, "btn");
            return (Criteria) this;
        }

        public Criteria andBtnNotIn(List<String> values) {
            addCriterion("btn not in", values, "btn");
            return (Criteria) this;
        }

        public Criteria andBtnBetween(String value1, String value2) {
            addCriterion("btn between", value1, value2, "btn");
            return (Criteria) this;
        }

        public Criteria andBtnNotBetween(String value1, String value2) {
            addCriterion("btn not between", value1, value2, "btn");
            return (Criteria) this;
        }

        public Criteria andArangeIsNull() {
            addCriterion("arange is null");
            return (Criteria) this;
        }

        public Criteria andArangeIsNotNull() {
            addCriterion("arange is not null");
            return (Criteria) this;
        }

        public Criteria andArangeEqualTo(Double value) {
            addCriterion("arange =", value, "arange");
            return (Criteria) this;
        }

        public Criteria andArangeNotEqualTo(Double value) {
            addCriterion("arange <>", value, "arange");
            return (Criteria) this;
        }

        public Criteria andArangeGreaterThan(Double value) {
            addCriterion("arange >", value, "arange");
            return (Criteria) this;
        }

        public Criteria andArangeGreaterThanOrEqualTo(Double value) {
            addCriterion("arange >=", value, "arange");
            return (Criteria) this;
        }

        public Criteria andArangeLessThan(Double value) {
            addCriterion("arange <", value, "arange");
            return (Criteria) this;
        }

        public Criteria andArangeLessThanOrEqualTo(Double value) {
            addCriterion("arange <=", value, "arange");
            return (Criteria) this;
        }

        public Criteria andArangeIn(List<Double> values) {
            addCriterion("arange in", values, "arange");
            return (Criteria) this;
        }

        public Criteria andArangeNotIn(List<Double> values) {
            addCriterion("arange not in", values, "arange");
            return (Criteria) this;
        }

        public Criteria andArangeBetween(Double value1, Double value2) {
            addCriterion("arange between", value1, value2, "arange");
            return (Criteria) this;
        }

        public Criteria andArangeNotBetween(Double value1, Double value2) {
            addCriterion("arange not between", value1, value2, "arange");
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