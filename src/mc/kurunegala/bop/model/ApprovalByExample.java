package mc.kurunegala.bop.model;

import java.util.ArrayList;
import java.util.List;

public class ApprovalByExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApprovalByExample() {
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

        public Criteria andIdapprovalByIsNull() {
            addCriterion("idApproval_By is null");
            return (Criteria) this;
        }

        public Criteria andIdapprovalByIsNotNull() {
            addCriterion("idApproval_By is not null");
            return (Criteria) this;
        }

        public Criteria andIdapprovalByEqualTo(Integer value) {
            addCriterion("idApproval_By =", value, "idapprovalBy");
            return (Criteria) this;
        }

        public Criteria andIdapprovalByNotEqualTo(Integer value) {
            addCriterion("idApproval_By <>", value, "idapprovalBy");
            return (Criteria) this;
        }

        public Criteria andIdapprovalByGreaterThan(Integer value) {
            addCriterion("idApproval_By >", value, "idapprovalBy");
            return (Criteria) this;
        }

        public Criteria andIdapprovalByGreaterThanOrEqualTo(Integer value) {
            addCriterion("idApproval_By >=", value, "idapprovalBy");
            return (Criteria) this;
        }

        public Criteria andIdapprovalByLessThan(Integer value) {
            addCriterion("idApproval_By <", value, "idapprovalBy");
            return (Criteria) this;
        }

        public Criteria andIdapprovalByLessThanOrEqualTo(Integer value) {
            addCriterion("idApproval_By <=", value, "idapprovalBy");
            return (Criteria) this;
        }

        public Criteria andIdapprovalByIn(List<Integer> values) {
            addCriterion("idApproval_By in", values, "idapprovalBy");
            return (Criteria) this;
        }

        public Criteria andIdapprovalByNotIn(List<Integer> values) {
            addCriterion("idApproval_By not in", values, "idapprovalBy");
            return (Criteria) this;
        }

        public Criteria andIdapprovalByBetween(Integer value1, Integer value2) {
            addCriterion("idApproval_By between", value1, value2, "idapprovalBy");
            return (Criteria) this;
        }

        public Criteria andIdapprovalByNotBetween(Integer value1, Integer value2) {
            addCriterion("idApproval_By not between", value1, value2, "idapprovalBy");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Integer value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Integer value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Integer value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Integer value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Integer> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Integer> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Integer value1, Integer value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("priority not between", value1, value2, "priority");
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

        public Criteria andApprovalCatIdapprovalCatIsNull() {
            addCriterion("Approval_cat_idApproval_cat is null");
            return (Criteria) this;
        }

        public Criteria andApprovalCatIdapprovalCatIsNotNull() {
            addCriterion("Approval_cat_idApproval_cat is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalCatIdapprovalCatEqualTo(Integer value) {
            addCriterion("Approval_cat_idApproval_cat =", value, "approvalCatIdapprovalCat");
            return (Criteria) this;
        }

        public Criteria andApprovalCatIdapprovalCatNotEqualTo(Integer value) {
            addCriterion("Approval_cat_idApproval_cat <>", value, "approvalCatIdapprovalCat");
            return (Criteria) this;
        }

        public Criteria andApprovalCatIdapprovalCatGreaterThan(Integer value) {
            addCriterion("Approval_cat_idApproval_cat >", value, "approvalCatIdapprovalCat");
            return (Criteria) this;
        }

        public Criteria andApprovalCatIdapprovalCatGreaterThanOrEqualTo(Integer value) {
            addCriterion("Approval_cat_idApproval_cat >=", value, "approvalCatIdapprovalCat");
            return (Criteria) this;
        }

        public Criteria andApprovalCatIdapprovalCatLessThan(Integer value) {
            addCriterion("Approval_cat_idApproval_cat <", value, "approvalCatIdapprovalCat");
            return (Criteria) this;
        }

        public Criteria andApprovalCatIdapprovalCatLessThanOrEqualTo(Integer value) {
            addCriterion("Approval_cat_idApproval_cat <=", value, "approvalCatIdapprovalCat");
            return (Criteria) this;
        }

        public Criteria andApprovalCatIdapprovalCatIn(List<Integer> values) {
            addCriterion("Approval_cat_idApproval_cat in", values, "approvalCatIdapprovalCat");
            return (Criteria) this;
        }

        public Criteria andApprovalCatIdapprovalCatNotIn(List<Integer> values) {
            addCriterion("Approval_cat_idApproval_cat not in", values, "approvalCatIdapprovalCat");
            return (Criteria) this;
        }

        public Criteria andApprovalCatIdapprovalCatBetween(Integer value1, Integer value2) {
            addCriterion("Approval_cat_idApproval_cat between", value1, value2, "approvalCatIdapprovalCat");
            return (Criteria) this;
        }

        public Criteria andApprovalCatIdapprovalCatNotBetween(Integer value1, Integer value2) {
            addCriterion("Approval_cat_idApproval_cat not between", value1, value2, "approvalCatIdapprovalCat");
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