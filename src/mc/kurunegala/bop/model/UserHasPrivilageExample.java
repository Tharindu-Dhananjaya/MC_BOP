package mc.kurunegala.bop.model;

import java.util.ArrayList;
import java.util.List;

public class UserHasPrivilageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserHasPrivilageExample() {
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

        public Criteria andIduserHasPrivilageIsNull() {
            addCriterion("idUser_has_Privilage is null");
            return (Criteria) this;
        }

        public Criteria andIduserHasPrivilageIsNotNull() {
            addCriterion("idUser_has_Privilage is not null");
            return (Criteria) this;
        }

        public Criteria andIduserHasPrivilageEqualTo(Integer value) {
            addCriterion("idUser_has_Privilage =", value, "iduserHasPrivilage");
            return (Criteria) this;
        }

        public Criteria andIduserHasPrivilageNotEqualTo(Integer value) {
            addCriterion("idUser_has_Privilage <>", value, "iduserHasPrivilage");
            return (Criteria) this;
        }

        public Criteria andIduserHasPrivilageGreaterThan(Integer value) {
            addCriterion("idUser_has_Privilage >", value, "iduserHasPrivilage");
            return (Criteria) this;
        }

        public Criteria andIduserHasPrivilageGreaterThanOrEqualTo(Integer value) {
            addCriterion("idUser_has_Privilage >=", value, "iduserHasPrivilage");
            return (Criteria) this;
        }

        public Criteria andIduserHasPrivilageLessThan(Integer value) {
            addCriterion("idUser_has_Privilage <", value, "iduserHasPrivilage");
            return (Criteria) this;
        }

        public Criteria andIduserHasPrivilageLessThanOrEqualTo(Integer value) {
            addCriterion("idUser_has_Privilage <=", value, "iduserHasPrivilage");
            return (Criteria) this;
        }

        public Criteria andIduserHasPrivilageIn(List<Integer> values) {
            addCriterion("idUser_has_Privilage in", values, "iduserHasPrivilage");
            return (Criteria) this;
        }

        public Criteria andIduserHasPrivilageNotIn(List<Integer> values) {
            addCriterion("idUser_has_Privilage not in", values, "iduserHasPrivilage");
            return (Criteria) this;
        }

        public Criteria andIduserHasPrivilageBetween(Integer value1, Integer value2) {
            addCriterion("idUser_has_Privilage between", value1, value2, "iduserHasPrivilage");
            return (Criteria) this;
        }

        public Criteria andIduserHasPrivilageNotBetween(Integer value1, Integer value2) {
            addCriterion("idUser_has_Privilage not between", value1, value2, "iduserHasPrivilage");
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

        public Criteria andPrivilageIdprivilageIsNull() {
            addCriterion("Privilage_idPrivilage is null");
            return (Criteria) this;
        }

        public Criteria andPrivilageIdprivilageIsNotNull() {
            addCriterion("Privilage_idPrivilage is not null");
            return (Criteria) this;
        }

        public Criteria andPrivilageIdprivilageEqualTo(Integer value) {
            addCriterion("Privilage_idPrivilage =", value, "privilageIdprivilage");
            return (Criteria) this;
        }

        public Criteria andPrivilageIdprivilageNotEqualTo(Integer value) {
            addCriterion("Privilage_idPrivilage <>", value, "privilageIdprivilage");
            return (Criteria) this;
        }

        public Criteria andPrivilageIdprivilageGreaterThan(Integer value) {
            addCriterion("Privilage_idPrivilage >", value, "privilageIdprivilage");
            return (Criteria) this;
        }

        public Criteria andPrivilageIdprivilageGreaterThanOrEqualTo(Integer value) {
            addCriterion("Privilage_idPrivilage >=", value, "privilageIdprivilage");
            return (Criteria) this;
        }

        public Criteria andPrivilageIdprivilageLessThan(Integer value) {
            addCriterion("Privilage_idPrivilage <", value, "privilageIdprivilage");
            return (Criteria) this;
        }

        public Criteria andPrivilageIdprivilageLessThanOrEqualTo(Integer value) {
            addCriterion("Privilage_idPrivilage <=", value, "privilageIdprivilage");
            return (Criteria) this;
        }

        public Criteria andPrivilageIdprivilageIn(List<Integer> values) {
            addCriterion("Privilage_idPrivilage in", values, "privilageIdprivilage");
            return (Criteria) this;
        }

        public Criteria andPrivilageIdprivilageNotIn(List<Integer> values) {
            addCriterion("Privilage_idPrivilage not in", values, "privilageIdprivilage");
            return (Criteria) this;
        }

        public Criteria andPrivilageIdprivilageBetween(Integer value1, Integer value2) {
            addCriterion("Privilage_idPrivilage between", value1, value2, "privilageIdprivilage");
            return (Criteria) this;
        }

        public Criteria andPrivilageIdprivilageNotBetween(Integer value1, Integer value2) {
            addCriterion("Privilage_idPrivilage not between", value1, value2, "privilageIdprivilage");
            return (Criteria) this;
        }

        public Criteria andUserHasPrivilageStatusIsNull() {
            addCriterion("User_has_Privilage_status is null");
            return (Criteria) this;
        }

        public Criteria andUserHasPrivilageStatusIsNotNull() {
            addCriterion("User_has_Privilage_status is not null");
            return (Criteria) this;
        }

        public Criteria andUserHasPrivilageStatusEqualTo(Integer value) {
            addCriterion("User_has_Privilage_status =", value, "userHasPrivilageStatus");
            return (Criteria) this;
        }

        public Criteria andUserHasPrivilageStatusNotEqualTo(Integer value) {
            addCriterion("User_has_Privilage_status <>", value, "userHasPrivilageStatus");
            return (Criteria) this;
        }

        public Criteria andUserHasPrivilageStatusGreaterThan(Integer value) {
            addCriterion("User_has_Privilage_status >", value, "userHasPrivilageStatus");
            return (Criteria) this;
        }

        public Criteria andUserHasPrivilageStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_has_Privilage_status >=", value, "userHasPrivilageStatus");
            return (Criteria) this;
        }

        public Criteria andUserHasPrivilageStatusLessThan(Integer value) {
            addCriterion("User_has_Privilage_status <", value, "userHasPrivilageStatus");
            return (Criteria) this;
        }

        public Criteria andUserHasPrivilageStatusLessThanOrEqualTo(Integer value) {
            addCriterion("User_has_Privilage_status <=", value, "userHasPrivilageStatus");
            return (Criteria) this;
        }

        public Criteria andUserHasPrivilageStatusIn(List<Integer> values) {
            addCriterion("User_has_Privilage_status in", values, "userHasPrivilageStatus");
            return (Criteria) this;
        }

        public Criteria andUserHasPrivilageStatusNotIn(List<Integer> values) {
            addCriterion("User_has_Privilage_status not in", values, "userHasPrivilageStatus");
            return (Criteria) this;
        }

        public Criteria andUserHasPrivilageStatusBetween(Integer value1, Integer value2) {
            addCriterion("User_has_Privilage_status between", value1, value2, "userHasPrivilageStatus");
            return (Criteria) this;
        }

        public Criteria andUserHasPrivilageStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("User_has_Privilage_status not between", value1, value2, "userHasPrivilageStatus");
            return (Criteria) this;
        }

        public Criteria andUserHasPrivilageSynIsNull() {
            addCriterion("User_has_Privilage_syn is null");
            return (Criteria) this;
        }

        public Criteria andUserHasPrivilageSynIsNotNull() {
            addCriterion("User_has_Privilage_syn is not null");
            return (Criteria) this;
        }

        public Criteria andUserHasPrivilageSynEqualTo(Integer value) {
            addCriterion("User_has_Privilage_syn =", value, "userHasPrivilageSyn");
            return (Criteria) this;
        }

        public Criteria andUserHasPrivilageSynNotEqualTo(Integer value) {
            addCriterion("User_has_Privilage_syn <>", value, "userHasPrivilageSyn");
            return (Criteria) this;
        }

        public Criteria andUserHasPrivilageSynGreaterThan(Integer value) {
            addCriterion("User_has_Privilage_syn >", value, "userHasPrivilageSyn");
            return (Criteria) this;
        }

        public Criteria andUserHasPrivilageSynGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_has_Privilage_syn >=", value, "userHasPrivilageSyn");
            return (Criteria) this;
        }

        public Criteria andUserHasPrivilageSynLessThan(Integer value) {
            addCriterion("User_has_Privilage_syn <", value, "userHasPrivilageSyn");
            return (Criteria) this;
        }

        public Criteria andUserHasPrivilageSynLessThanOrEqualTo(Integer value) {
            addCriterion("User_has_Privilage_syn <=", value, "userHasPrivilageSyn");
            return (Criteria) this;
        }

        public Criteria andUserHasPrivilageSynIn(List<Integer> values) {
            addCriterion("User_has_Privilage_syn in", values, "userHasPrivilageSyn");
            return (Criteria) this;
        }

        public Criteria andUserHasPrivilageSynNotIn(List<Integer> values) {
            addCriterion("User_has_Privilage_syn not in", values, "userHasPrivilageSyn");
            return (Criteria) this;
        }

        public Criteria andUserHasPrivilageSynBetween(Integer value1, Integer value2) {
            addCriterion("User_has_Privilage_syn between", value1, value2, "userHasPrivilageSyn");
            return (Criteria) this;
        }

        public Criteria andUserHasPrivilageSynNotBetween(Integer value1, Integer value2) {
            addCriterion("User_has_Privilage_syn not between", value1, value2, "userHasPrivilageSyn");
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