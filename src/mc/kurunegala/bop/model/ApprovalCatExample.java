package mc.kurunegala.bop.model;

import java.util.ArrayList;
import java.util.List;

public class ApprovalCatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApprovalCatExample() {
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

        public Criteria andIdapprovalCatIsNull() {
            addCriterion("idApproval_cat is null");
            return (Criteria) this;
        }

        public Criteria andIdapprovalCatIsNotNull() {
            addCriterion("idApproval_cat is not null");
            return (Criteria) this;
        }

        public Criteria andIdapprovalCatEqualTo(Integer value) {
            addCriterion("idApproval_cat =", value, "idapprovalCat");
            return (Criteria) this;
        }

        public Criteria andIdapprovalCatNotEqualTo(Integer value) {
            addCriterion("idApproval_cat <>", value, "idapprovalCat");
            return (Criteria) this;
        }

        public Criteria andIdapprovalCatGreaterThan(Integer value) {
            addCriterion("idApproval_cat >", value, "idapprovalCat");
            return (Criteria) this;
        }

        public Criteria andIdapprovalCatGreaterThanOrEqualTo(Integer value) {
            addCriterion("idApproval_cat >=", value, "idapprovalCat");
            return (Criteria) this;
        }

        public Criteria andIdapprovalCatLessThan(Integer value) {
            addCriterion("idApproval_cat <", value, "idapprovalCat");
            return (Criteria) this;
        }

        public Criteria andIdapprovalCatLessThanOrEqualTo(Integer value) {
            addCriterion("idApproval_cat <=", value, "idapprovalCat");
            return (Criteria) this;
        }

        public Criteria andIdapprovalCatIn(List<Integer> values) {
            addCriterion("idApproval_cat in", values, "idapprovalCat");
            return (Criteria) this;
        }

        public Criteria andIdapprovalCatNotIn(List<Integer> values) {
            addCriterion("idApproval_cat not in", values, "idapprovalCat");
            return (Criteria) this;
        }

        public Criteria andIdapprovalCatBetween(Integer value1, Integer value2) {
            addCriterion("idApproval_cat between", value1, value2, "idapprovalCat");
            return (Criteria) this;
        }

        public Criteria andIdapprovalCatNotBetween(Integer value1, Integer value2) {
            addCriterion("idApproval_cat not between", value1, value2, "idapprovalCat");
            return (Criteria) this;
        }

        public Criteria andApprovalNameIsNull() {
            addCriterion("approval_name is null");
            return (Criteria) this;
        }

        public Criteria andApprovalNameIsNotNull() {
            addCriterion("approval_name is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalNameEqualTo(String value) {
            addCriterion("approval_name =", value, "approvalName");
            return (Criteria) this;
        }

        public Criteria andApprovalNameNotEqualTo(String value) {
            addCriterion("approval_name <>", value, "approvalName");
            return (Criteria) this;
        }

        public Criteria andApprovalNameGreaterThan(String value) {
            addCriterion("approval_name >", value, "approvalName");
            return (Criteria) this;
        }

        public Criteria andApprovalNameGreaterThanOrEqualTo(String value) {
            addCriterion("approval_name >=", value, "approvalName");
            return (Criteria) this;
        }

        public Criteria andApprovalNameLessThan(String value) {
            addCriterion("approval_name <", value, "approvalName");
            return (Criteria) this;
        }

        public Criteria andApprovalNameLessThanOrEqualTo(String value) {
            addCriterion("approval_name <=", value, "approvalName");
            return (Criteria) this;
        }

        public Criteria andApprovalNameLike(String value) {
            addCriterion("approval_name like", value, "approvalName");
            return (Criteria) this;
        }

        public Criteria andApprovalNameNotLike(String value) {
            addCriterion("approval_name not like", value, "approvalName");
            return (Criteria) this;
        }

        public Criteria andApprovalNameIn(List<String> values) {
            addCriterion("approval_name in", values, "approvalName");
            return (Criteria) this;
        }

        public Criteria andApprovalNameNotIn(List<String> values) {
            addCriterion("approval_name not in", values, "approvalName");
            return (Criteria) this;
        }

        public Criteria andApprovalNameBetween(String value1, String value2) {
            addCriterion("approval_name between", value1, value2, "approvalName");
            return (Criteria) this;
        }

        public Criteria andApprovalNameNotBetween(String value1, String value2) {
            addCriterion("approval_name not between", value1, value2, "approvalName");
            return (Criteria) this;
        }

        public Criteria andStatusAppCatIsNull() {
            addCriterion("status_app_cat is null");
            return (Criteria) this;
        }

        public Criteria andStatusAppCatIsNotNull() {
            addCriterion("status_app_cat is not null");
            return (Criteria) this;
        }

        public Criteria andStatusAppCatEqualTo(Integer value) {
            addCriterion("status_app_cat =", value, "statusAppCat");
            return (Criteria) this;
        }

        public Criteria andStatusAppCatNotEqualTo(Integer value) {
            addCriterion("status_app_cat <>", value, "statusAppCat");
            return (Criteria) this;
        }

        public Criteria andStatusAppCatGreaterThan(Integer value) {
            addCriterion("status_app_cat >", value, "statusAppCat");
            return (Criteria) this;
        }

        public Criteria andStatusAppCatGreaterThanOrEqualTo(Integer value) {
            addCriterion("status_app_cat >=", value, "statusAppCat");
            return (Criteria) this;
        }

        public Criteria andStatusAppCatLessThan(Integer value) {
            addCriterion("status_app_cat <", value, "statusAppCat");
            return (Criteria) this;
        }

        public Criteria andStatusAppCatLessThanOrEqualTo(Integer value) {
            addCriterion("status_app_cat <=", value, "statusAppCat");
            return (Criteria) this;
        }

        public Criteria andStatusAppCatIn(List<Integer> values) {
            addCriterion("status_app_cat in", values, "statusAppCat");
            return (Criteria) this;
        }

        public Criteria andStatusAppCatNotIn(List<Integer> values) {
            addCriterion("status_app_cat not in", values, "statusAppCat");
            return (Criteria) this;
        }

        public Criteria andStatusAppCatBetween(Integer value1, Integer value2) {
            addCriterion("status_app_cat between", value1, value2, "statusAppCat");
            return (Criteria) this;
        }

        public Criteria andStatusAppCatNotBetween(Integer value1, Integer value2) {
            addCriterion("status_app_cat not between", value1, value2, "statusAppCat");
            return (Criteria) this;
        }

        public Criteria andSynAppCatIsNull() {
            addCriterion("syn_app_cat is null");
            return (Criteria) this;
        }

        public Criteria andSynAppCatIsNotNull() {
            addCriterion("syn_app_cat is not null");
            return (Criteria) this;
        }

        public Criteria andSynAppCatEqualTo(Integer value) {
            addCriterion("syn_app_cat =", value, "synAppCat");
            return (Criteria) this;
        }

        public Criteria andSynAppCatNotEqualTo(Integer value) {
            addCriterion("syn_app_cat <>", value, "synAppCat");
            return (Criteria) this;
        }

        public Criteria andSynAppCatGreaterThan(Integer value) {
            addCriterion("syn_app_cat >", value, "synAppCat");
            return (Criteria) this;
        }

        public Criteria andSynAppCatGreaterThanOrEqualTo(Integer value) {
            addCriterion("syn_app_cat >=", value, "synAppCat");
            return (Criteria) this;
        }

        public Criteria andSynAppCatLessThan(Integer value) {
            addCriterion("syn_app_cat <", value, "synAppCat");
            return (Criteria) this;
        }

        public Criteria andSynAppCatLessThanOrEqualTo(Integer value) {
            addCriterion("syn_app_cat <=", value, "synAppCat");
            return (Criteria) this;
        }

        public Criteria andSynAppCatIn(List<Integer> values) {
            addCriterion("syn_app_cat in", values, "synAppCat");
            return (Criteria) this;
        }

        public Criteria andSynAppCatNotIn(List<Integer> values) {
            addCriterion("syn_app_cat not in", values, "synAppCat");
            return (Criteria) this;
        }

        public Criteria andSynAppCatBetween(Integer value1, Integer value2) {
            addCriterion("syn_app_cat between", value1, value2, "synAppCat");
            return (Criteria) this;
        }

        public Criteria andSynAppCatNotBetween(Integer value1, Integer value2) {
            addCriterion("syn_app_cat not between", value1, value2, "synAppCat");
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