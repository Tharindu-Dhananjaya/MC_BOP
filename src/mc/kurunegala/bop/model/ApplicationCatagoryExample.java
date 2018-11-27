package mc.kurunegala.bop.model;

import java.util.ArrayList;
import java.util.List;

public class ApplicationCatagoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplicationCatagoryExample() {
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

        public Criteria andIdapplicationCatagoryIsNull() {
            addCriterion("idApplication_Catagory is null");
            return (Criteria) this;
        }

        public Criteria andIdapplicationCatagoryIsNotNull() {
            addCriterion("idApplication_Catagory is not null");
            return (Criteria) this;
        }

        public Criteria andIdapplicationCatagoryEqualTo(Integer value) {
            addCriterion("idApplication_Catagory =", value, "idapplicationCatagory");
            return (Criteria) this;
        }

        public Criteria andIdapplicationCatagoryNotEqualTo(Integer value) {
            addCriterion("idApplication_Catagory <>", value, "idapplicationCatagory");
            return (Criteria) this;
        }

        public Criteria andIdapplicationCatagoryGreaterThan(Integer value) {
            addCriterion("idApplication_Catagory >", value, "idapplicationCatagory");
            return (Criteria) this;
        }

        public Criteria andIdapplicationCatagoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("idApplication_Catagory >=", value, "idapplicationCatagory");
            return (Criteria) this;
        }

        public Criteria andIdapplicationCatagoryLessThan(Integer value) {
            addCriterion("idApplication_Catagory <", value, "idapplicationCatagory");
            return (Criteria) this;
        }

        public Criteria andIdapplicationCatagoryLessThanOrEqualTo(Integer value) {
            addCriterion("idApplication_Catagory <=", value, "idapplicationCatagory");
            return (Criteria) this;
        }

        public Criteria andIdapplicationCatagoryIn(List<Integer> values) {
            addCriterion("idApplication_Catagory in", values, "idapplicationCatagory");
            return (Criteria) this;
        }

        public Criteria andIdapplicationCatagoryNotIn(List<Integer> values) {
            addCriterion("idApplication_Catagory not in", values, "idapplicationCatagory");
            return (Criteria) this;
        }

        public Criteria andIdapplicationCatagoryBetween(Integer value1, Integer value2) {
            addCriterion("idApplication_Catagory between", value1, value2, "idapplicationCatagory");
            return (Criteria) this;
        }

        public Criteria andIdapplicationCatagoryNotBetween(Integer value1, Integer value2) {
            addCriterion("idApplication_Catagory not between", value1, value2, "idapplicationCatagory");
            return (Criteria) this;
        }

        public Criteria andApplicationNameIsNull() {
            addCriterion("application_name is null");
            return (Criteria) this;
        }

        public Criteria andApplicationNameIsNotNull() {
            addCriterion("application_name is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationNameEqualTo(String value) {
            addCriterion("application_name =", value, "applicationName");
            return (Criteria) this;
        }

        public Criteria andApplicationNameNotEqualTo(String value) {
            addCriterion("application_name <>", value, "applicationName");
            return (Criteria) this;
        }

        public Criteria andApplicationNameGreaterThan(String value) {
            addCriterion("application_name >", value, "applicationName");
            return (Criteria) this;
        }

        public Criteria andApplicationNameGreaterThanOrEqualTo(String value) {
            addCriterion("application_name >=", value, "applicationName");
            return (Criteria) this;
        }

        public Criteria andApplicationNameLessThan(String value) {
            addCriterion("application_name <", value, "applicationName");
            return (Criteria) this;
        }

        public Criteria andApplicationNameLessThanOrEqualTo(String value) {
            addCriterion("application_name <=", value, "applicationName");
            return (Criteria) this;
        }

        public Criteria andApplicationNameLike(String value) {
            addCriterion("application_name like", value, "applicationName");
            return (Criteria) this;
        }

        public Criteria andApplicationNameNotLike(String value) {
            addCriterion("application_name not like", value, "applicationName");
            return (Criteria) this;
        }

        public Criteria andApplicationNameIn(List<String> values) {
            addCriterion("application_name in", values, "applicationName");
            return (Criteria) this;
        }

        public Criteria andApplicationNameNotIn(List<String> values) {
            addCriterion("application_name not in", values, "applicationName");
            return (Criteria) this;
        }

        public Criteria andApplicationNameBetween(String value1, String value2) {
            addCriterion("application_name between", value1, value2, "applicationName");
            return (Criteria) this;
        }

        public Criteria andApplicationNameNotBetween(String value1, String value2) {
            addCriterion("application_name not between", value1, value2, "applicationName");
            return (Criteria) this;
        }

        public Criteria andApplicationCatagoryStatusIsNull() {
            addCriterion("Application_Catagory_status is null");
            return (Criteria) this;
        }

        public Criteria andApplicationCatagoryStatusIsNotNull() {
            addCriterion("Application_Catagory_status is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationCatagoryStatusEqualTo(Integer value) {
            addCriterion("Application_Catagory_status =", value, "applicationCatagoryStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationCatagoryStatusNotEqualTo(Integer value) {
            addCriterion("Application_Catagory_status <>", value, "applicationCatagoryStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationCatagoryStatusGreaterThan(Integer value) {
            addCriterion("Application_Catagory_status >", value, "applicationCatagoryStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationCatagoryStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Application_Catagory_status >=", value, "applicationCatagoryStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationCatagoryStatusLessThan(Integer value) {
            addCriterion("Application_Catagory_status <", value, "applicationCatagoryStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationCatagoryStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Application_Catagory_status <=", value, "applicationCatagoryStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationCatagoryStatusIn(List<Integer> values) {
            addCriterion("Application_Catagory_status in", values, "applicationCatagoryStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationCatagoryStatusNotIn(List<Integer> values) {
            addCriterion("Application_Catagory_status not in", values, "applicationCatagoryStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationCatagoryStatusBetween(Integer value1, Integer value2) {
            addCriterion("Application_Catagory_status between", value1, value2, "applicationCatagoryStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationCatagoryStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Application_Catagory_status not between", value1, value2, "applicationCatagoryStatus");
            return (Criteria) this;
        }

        public Criteria andApplicationCatagorySynIsNull() {
            addCriterion("Application_Catagory_syn is null");
            return (Criteria) this;
        }

        public Criteria andApplicationCatagorySynIsNotNull() {
            addCriterion("Application_Catagory_syn is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationCatagorySynEqualTo(Integer value) {
            addCriterion("Application_Catagory_syn =", value, "applicationCatagorySyn");
            return (Criteria) this;
        }

        public Criteria andApplicationCatagorySynNotEqualTo(Integer value) {
            addCriterion("Application_Catagory_syn <>", value, "applicationCatagorySyn");
            return (Criteria) this;
        }

        public Criteria andApplicationCatagorySynGreaterThan(Integer value) {
            addCriterion("Application_Catagory_syn >", value, "applicationCatagorySyn");
            return (Criteria) this;
        }

        public Criteria andApplicationCatagorySynGreaterThanOrEqualTo(Integer value) {
            addCriterion("Application_Catagory_syn >=", value, "applicationCatagorySyn");
            return (Criteria) this;
        }

        public Criteria andApplicationCatagorySynLessThan(Integer value) {
            addCriterion("Application_Catagory_syn <", value, "applicationCatagorySyn");
            return (Criteria) this;
        }

        public Criteria andApplicationCatagorySynLessThanOrEqualTo(Integer value) {
            addCriterion("Application_Catagory_syn <=", value, "applicationCatagorySyn");
            return (Criteria) this;
        }

        public Criteria andApplicationCatagorySynIn(List<Integer> values) {
            addCriterion("Application_Catagory_syn in", values, "applicationCatagorySyn");
            return (Criteria) this;
        }

        public Criteria andApplicationCatagorySynNotIn(List<Integer> values) {
            addCriterion("Application_Catagory_syn not in", values, "applicationCatagorySyn");
            return (Criteria) this;
        }

        public Criteria andApplicationCatagorySynBetween(Integer value1, Integer value2) {
            addCriterion("Application_Catagory_syn between", value1, value2, "applicationCatagorySyn");
            return (Criteria) this;
        }

        public Criteria andApplicationCatagorySynNotBetween(Integer value1, Integer value2) {
            addCriterion("Application_Catagory_syn not between", value1, value2, "applicationCatagorySyn");
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