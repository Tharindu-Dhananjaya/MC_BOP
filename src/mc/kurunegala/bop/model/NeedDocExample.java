package mc.kurunegala.bop.model;

import java.util.ArrayList;
import java.util.List;

public class NeedDocExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NeedDocExample() {
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

        public Criteria andIdneeddocIsNull() {
            addCriterion("idNeedDoc is null");
            return (Criteria) this;
        }

        public Criteria andIdneeddocIsNotNull() {
            addCriterion("idNeedDoc is not null");
            return (Criteria) this;
        }

        public Criteria andIdneeddocEqualTo(Integer value) {
            addCriterion("idNeedDoc =", value, "idneeddoc");
            return (Criteria) this;
        }

        public Criteria andIdneeddocNotEqualTo(Integer value) {
            addCriterion("idNeedDoc <>", value, "idneeddoc");
            return (Criteria) this;
        }

        public Criteria andIdneeddocGreaterThan(Integer value) {
            addCriterion("idNeedDoc >", value, "idneeddoc");
            return (Criteria) this;
        }

        public Criteria andIdneeddocGreaterThanOrEqualTo(Integer value) {
            addCriterion("idNeedDoc >=", value, "idneeddoc");
            return (Criteria) this;
        }

        public Criteria andIdneeddocLessThan(Integer value) {
            addCriterion("idNeedDoc <", value, "idneeddoc");
            return (Criteria) this;
        }

        public Criteria andIdneeddocLessThanOrEqualTo(Integer value) {
            addCriterion("idNeedDoc <=", value, "idneeddoc");
            return (Criteria) this;
        }

        public Criteria andIdneeddocIn(List<Integer> values) {
            addCriterion("idNeedDoc in", values, "idneeddoc");
            return (Criteria) this;
        }

        public Criteria andIdneeddocNotIn(List<Integer> values) {
            addCriterion("idNeedDoc not in", values, "idneeddoc");
            return (Criteria) this;
        }

        public Criteria andIdneeddocBetween(Integer value1, Integer value2) {
            addCriterion("idNeedDoc between", value1, value2, "idneeddoc");
            return (Criteria) this;
        }

        public Criteria andIdneeddocNotBetween(Integer value1, Integer value2) {
            addCriterion("idNeedDoc not between", value1, value2, "idneeddoc");
            return (Criteria) this;
        }

        public Criteria andNeeddocPriorityIsNull() {
            addCriterion("NeedDoc_priority is null");
            return (Criteria) this;
        }

        public Criteria andNeeddocPriorityIsNotNull() {
            addCriterion("NeedDoc_priority is not null");
            return (Criteria) this;
        }

        public Criteria andNeeddocPriorityEqualTo(Integer value) {
            addCriterion("NeedDoc_priority =", value, "needdocPriority");
            return (Criteria) this;
        }

        public Criteria andNeeddocPriorityNotEqualTo(Integer value) {
            addCriterion("NeedDoc_priority <>", value, "needdocPriority");
            return (Criteria) this;
        }

        public Criteria andNeeddocPriorityGreaterThan(Integer value) {
            addCriterion("NeedDoc_priority >", value, "needdocPriority");
            return (Criteria) this;
        }

        public Criteria andNeeddocPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("NeedDoc_priority >=", value, "needdocPriority");
            return (Criteria) this;
        }

        public Criteria andNeeddocPriorityLessThan(Integer value) {
            addCriterion("NeedDoc_priority <", value, "needdocPriority");
            return (Criteria) this;
        }

        public Criteria andNeeddocPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("NeedDoc_priority <=", value, "needdocPriority");
            return (Criteria) this;
        }

        public Criteria andNeeddocPriorityIn(List<Integer> values) {
            addCriterion("NeedDoc_priority in", values, "needdocPriority");
            return (Criteria) this;
        }

        public Criteria andNeeddocPriorityNotIn(List<Integer> values) {
            addCriterion("NeedDoc_priority not in", values, "needdocPriority");
            return (Criteria) this;
        }

        public Criteria andNeeddocPriorityBetween(Integer value1, Integer value2) {
            addCriterion("NeedDoc_priority between", value1, value2, "needdocPriority");
            return (Criteria) this;
        }

        public Criteria andNeeddocPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("NeedDoc_priority not between", value1, value2, "needdocPriority");
            return (Criteria) this;
        }

        public Criteria andApplicationCatagoryIdapplicationCatagoryIsNull() {
            addCriterion("Application_Catagory_idApplication_Catagory is null");
            return (Criteria) this;
        }

        public Criteria andApplicationCatagoryIdapplicationCatagoryIsNotNull() {
            addCriterion("Application_Catagory_idApplication_Catagory is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationCatagoryIdapplicationCatagoryEqualTo(Integer value) {
            addCriterion("Application_Catagory_idApplication_Catagory =", value, "applicationCatagoryIdapplicationCatagory");
            return (Criteria) this;
        }

        public Criteria andApplicationCatagoryIdapplicationCatagoryNotEqualTo(Integer value) {
            addCriterion("Application_Catagory_idApplication_Catagory <>", value, "applicationCatagoryIdapplicationCatagory");
            return (Criteria) this;
        }

        public Criteria andApplicationCatagoryIdapplicationCatagoryGreaterThan(Integer value) {
            addCriterion("Application_Catagory_idApplication_Catagory >", value, "applicationCatagoryIdapplicationCatagory");
            return (Criteria) this;
        }

        public Criteria andApplicationCatagoryIdapplicationCatagoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("Application_Catagory_idApplication_Catagory >=", value, "applicationCatagoryIdapplicationCatagory");
            return (Criteria) this;
        }

        public Criteria andApplicationCatagoryIdapplicationCatagoryLessThan(Integer value) {
            addCriterion("Application_Catagory_idApplication_Catagory <", value, "applicationCatagoryIdapplicationCatagory");
            return (Criteria) this;
        }

        public Criteria andApplicationCatagoryIdapplicationCatagoryLessThanOrEqualTo(Integer value) {
            addCriterion("Application_Catagory_idApplication_Catagory <=", value, "applicationCatagoryIdapplicationCatagory");
            return (Criteria) this;
        }

        public Criteria andApplicationCatagoryIdapplicationCatagoryIn(List<Integer> values) {
            addCriterion("Application_Catagory_idApplication_Catagory in", values, "applicationCatagoryIdapplicationCatagory");
            return (Criteria) this;
        }

        public Criteria andApplicationCatagoryIdapplicationCatagoryNotIn(List<Integer> values) {
            addCriterion("Application_Catagory_idApplication_Catagory not in", values, "applicationCatagoryIdapplicationCatagory");
            return (Criteria) this;
        }

        public Criteria andApplicationCatagoryIdapplicationCatagoryBetween(Integer value1, Integer value2) {
            addCriterion("Application_Catagory_idApplication_Catagory between", value1, value2, "applicationCatagoryIdapplicationCatagory");
            return (Criteria) this;
        }

        public Criteria andApplicationCatagoryIdapplicationCatagoryNotBetween(Integer value1, Integer value2) {
            addCriterion("Application_Catagory_idApplication_Catagory not between", value1, value2, "applicationCatagoryIdapplicationCatagory");
            return (Criteria) this;
        }

        public Criteria andDoccatIddoccatIsNull() {
            addCriterion("Doccat_idDoccat is null");
            return (Criteria) this;
        }

        public Criteria andDoccatIddoccatIsNotNull() {
            addCriterion("Doccat_idDoccat is not null");
            return (Criteria) this;
        }

        public Criteria andDoccatIddoccatEqualTo(Integer value) {
            addCriterion("Doccat_idDoccat =", value, "doccatIddoccat");
            return (Criteria) this;
        }

        public Criteria andDoccatIddoccatNotEqualTo(Integer value) {
            addCriterion("Doccat_idDoccat <>", value, "doccatIddoccat");
            return (Criteria) this;
        }

        public Criteria andDoccatIddoccatGreaterThan(Integer value) {
            addCriterion("Doccat_idDoccat >", value, "doccatIddoccat");
            return (Criteria) this;
        }

        public Criteria andDoccatIddoccatGreaterThanOrEqualTo(Integer value) {
            addCriterion("Doccat_idDoccat >=", value, "doccatIddoccat");
            return (Criteria) this;
        }

        public Criteria andDoccatIddoccatLessThan(Integer value) {
            addCriterion("Doccat_idDoccat <", value, "doccatIddoccat");
            return (Criteria) this;
        }

        public Criteria andDoccatIddoccatLessThanOrEqualTo(Integer value) {
            addCriterion("Doccat_idDoccat <=", value, "doccatIddoccat");
            return (Criteria) this;
        }

        public Criteria andDoccatIddoccatIn(List<Integer> values) {
            addCriterion("Doccat_idDoccat in", values, "doccatIddoccat");
            return (Criteria) this;
        }

        public Criteria andDoccatIddoccatNotIn(List<Integer> values) {
            addCriterion("Doccat_idDoccat not in", values, "doccatIddoccat");
            return (Criteria) this;
        }

        public Criteria andDoccatIddoccatBetween(Integer value1, Integer value2) {
            addCriterion("Doccat_idDoccat between", value1, value2, "doccatIddoccat");
            return (Criteria) this;
        }

        public Criteria andDoccatIddoccatNotBetween(Integer value1, Integer value2) {
            addCriterion("Doccat_idDoccat not between", value1, value2, "doccatIddoccat");
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