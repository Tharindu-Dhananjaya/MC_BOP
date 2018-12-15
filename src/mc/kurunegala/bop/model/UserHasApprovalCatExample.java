package mc.kurunegala.bop.model;

import java.util.ArrayList;
import java.util.List;

public class UserHasApprovalCatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserHasApprovalCatExample() {
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

        public Criteria andIduserHasApprovalCatIsNull() {
            addCriterion("idUser_has_Approval_cat is null");
            return (Criteria) this;
        }

        public Criteria andIduserHasApprovalCatIsNotNull() {
            addCriterion("idUser_has_Approval_cat is not null");
            return (Criteria) this;
        }

        public Criteria andIduserHasApprovalCatEqualTo(Integer value) {
            addCriterion("idUser_has_Approval_cat =", value, "iduserHasApprovalCat");
            return (Criteria) this;
        }

        public Criteria andIduserHasApprovalCatNotEqualTo(Integer value) {
            addCriterion("idUser_has_Approval_cat <>", value, "iduserHasApprovalCat");
            return (Criteria) this;
        }

        public Criteria andIduserHasApprovalCatGreaterThan(Integer value) {
            addCriterion("idUser_has_Approval_cat >", value, "iduserHasApprovalCat");
            return (Criteria) this;
        }

        public Criteria andIduserHasApprovalCatGreaterThanOrEqualTo(Integer value) {
            addCriterion("idUser_has_Approval_cat >=", value, "iduserHasApprovalCat");
            return (Criteria) this;
        }

        public Criteria andIduserHasApprovalCatLessThan(Integer value) {
            addCriterion("idUser_has_Approval_cat <", value, "iduserHasApprovalCat");
            return (Criteria) this;
        }

        public Criteria andIduserHasApprovalCatLessThanOrEqualTo(Integer value) {
            addCriterion("idUser_has_Approval_cat <=", value, "iduserHasApprovalCat");
            return (Criteria) this;
        }

        public Criteria andIduserHasApprovalCatIn(List<Integer> values) {
            addCriterion("idUser_has_Approval_cat in", values, "iduserHasApprovalCat");
            return (Criteria) this;
        }

        public Criteria andIduserHasApprovalCatNotIn(List<Integer> values) {
            addCriterion("idUser_has_Approval_cat not in", values, "iduserHasApprovalCat");
            return (Criteria) this;
        }

        public Criteria andIduserHasApprovalCatBetween(Integer value1, Integer value2) {
            addCriterion("idUser_has_Approval_cat between", value1, value2, "iduserHasApprovalCat");
            return (Criteria) this;
        }

        public Criteria andIduserHasApprovalCatNotBetween(Integer value1, Integer value2) {
            addCriterion("idUser_has_Approval_cat not between", value1, value2, "iduserHasApprovalCat");
            return (Criteria) this;
        }

        public Criteria andUserIduserIsNull() {
            addCriterion("User_idUser is null");
            return (Criteria) this;
        }

        public Criteria andUserIduserIsNotNull() {
            addCriterion("User_idUser is not null");
            return (Criteria) this;
        }

        public Criteria andUserIduserEqualTo(Integer value) {
            addCriterion("User_idUser =", value, "userIduser");
            return (Criteria) this;
        }

        public Criteria andUserIduserNotEqualTo(Integer value) {
            addCriterion("User_idUser <>", value, "userIduser");
            return (Criteria) this;
        }

        public Criteria andUserIduserGreaterThan(Integer value) {
            addCriterion("User_idUser >", value, "userIduser");
            return (Criteria) this;
        }

        public Criteria andUserIduserGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_idUser >=", value, "userIduser");
            return (Criteria) this;
        }

        public Criteria andUserIduserLessThan(Integer value) {
            addCriterion("User_idUser <", value, "userIduser");
            return (Criteria) this;
        }

        public Criteria andUserIduserLessThanOrEqualTo(Integer value) {
            addCriterion("User_idUser <=", value, "userIduser");
            return (Criteria) this;
        }

        public Criteria andUserIduserIn(List<Integer> values) {
            addCriterion("User_idUser in", values, "userIduser");
            return (Criteria) this;
        }

        public Criteria andUserIduserNotIn(List<Integer> values) {
            addCriterion("User_idUser not in", values, "userIduser");
            return (Criteria) this;
        }

        public Criteria andUserIduserBetween(Integer value1, Integer value2) {
            addCriterion("User_idUser between", value1, value2, "userIduser");
            return (Criteria) this;
        }

        public Criteria andUserIduserNotBetween(Integer value1, Integer value2) {
            addCriterion("User_idUser not between", value1, value2, "userIduser");
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