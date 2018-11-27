package mc.kurunegala.bop.model;

import java.util.ArrayList;
import java.util.List;

public class UserHasDipartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserHasDipartmentExample() {
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

        public Criteria andIduserHasDepartmentIsNull() {
            addCriterion("idUser_has_department is null");
            return (Criteria) this;
        }

        public Criteria andIduserHasDepartmentIsNotNull() {
            addCriterion("idUser_has_department is not null");
            return (Criteria) this;
        }

        public Criteria andIduserHasDepartmentEqualTo(Integer value) {
            addCriterion("idUser_has_department =", value, "iduserHasDepartment");
            return (Criteria) this;
        }

        public Criteria andIduserHasDepartmentNotEqualTo(Integer value) {
            addCriterion("idUser_has_department <>", value, "iduserHasDepartment");
            return (Criteria) this;
        }

        public Criteria andIduserHasDepartmentGreaterThan(Integer value) {
            addCriterion("idUser_has_department >", value, "iduserHasDepartment");
            return (Criteria) this;
        }

        public Criteria andIduserHasDepartmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("idUser_has_department >=", value, "iduserHasDepartment");
            return (Criteria) this;
        }

        public Criteria andIduserHasDepartmentLessThan(Integer value) {
            addCriterion("idUser_has_department <", value, "iduserHasDepartment");
            return (Criteria) this;
        }

        public Criteria andIduserHasDepartmentLessThanOrEqualTo(Integer value) {
            addCriterion("idUser_has_department <=", value, "iduserHasDepartment");
            return (Criteria) this;
        }

        public Criteria andIduserHasDepartmentIn(List<Integer> values) {
            addCriterion("idUser_has_department in", values, "iduserHasDepartment");
            return (Criteria) this;
        }

        public Criteria andIduserHasDepartmentNotIn(List<Integer> values) {
            addCriterion("idUser_has_department not in", values, "iduserHasDepartment");
            return (Criteria) this;
        }

        public Criteria andIduserHasDepartmentBetween(Integer value1, Integer value2) {
            addCriterion("idUser_has_department between", value1, value2, "iduserHasDepartment");
            return (Criteria) this;
        }

        public Criteria andIduserHasDepartmentNotBetween(Integer value1, Integer value2) {
            addCriterion("idUser_has_department not between", value1, value2, "iduserHasDepartment");
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

        public Criteria andDipartmentIddipartmentIsNull() {
            addCriterion("Dipartment_idDipartment is null");
            return (Criteria) this;
        }

        public Criteria andDipartmentIddipartmentIsNotNull() {
            addCriterion("Dipartment_idDipartment is not null");
            return (Criteria) this;
        }

        public Criteria andDipartmentIddipartmentEqualTo(Integer value) {
            addCriterion("Dipartment_idDipartment =", value, "dipartmentIddipartment");
            return (Criteria) this;
        }

        public Criteria andDipartmentIddipartmentNotEqualTo(Integer value) {
            addCriterion("Dipartment_idDipartment <>", value, "dipartmentIddipartment");
            return (Criteria) this;
        }

        public Criteria andDipartmentIddipartmentGreaterThan(Integer value) {
            addCriterion("Dipartment_idDipartment >", value, "dipartmentIddipartment");
            return (Criteria) this;
        }

        public Criteria andDipartmentIddipartmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("Dipartment_idDipartment >=", value, "dipartmentIddipartment");
            return (Criteria) this;
        }

        public Criteria andDipartmentIddipartmentLessThan(Integer value) {
            addCriterion("Dipartment_idDipartment <", value, "dipartmentIddipartment");
            return (Criteria) this;
        }

        public Criteria andDipartmentIddipartmentLessThanOrEqualTo(Integer value) {
            addCriterion("Dipartment_idDipartment <=", value, "dipartmentIddipartment");
            return (Criteria) this;
        }

        public Criteria andDipartmentIddipartmentIn(List<Integer> values) {
            addCriterion("Dipartment_idDipartment in", values, "dipartmentIddipartment");
            return (Criteria) this;
        }

        public Criteria andDipartmentIddipartmentNotIn(List<Integer> values) {
            addCriterion("Dipartment_idDipartment not in", values, "dipartmentIddipartment");
            return (Criteria) this;
        }

        public Criteria andDipartmentIddipartmentBetween(Integer value1, Integer value2) {
            addCriterion("Dipartment_idDipartment between", value1, value2, "dipartmentIddipartment");
            return (Criteria) this;
        }

        public Criteria andDipartmentIddipartmentNotBetween(Integer value1, Integer value2) {
            addCriterion("Dipartment_idDipartment not between", value1, value2, "dipartmentIddipartment");
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