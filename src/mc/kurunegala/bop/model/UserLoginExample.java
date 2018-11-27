package mc.kurunegala.bop.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserLoginExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserLoginExample() {
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

        public Criteria andIduserLoginIsNull() {
            addCriterion("idUser_Login is null");
            return (Criteria) this;
        }

        public Criteria andIduserLoginIsNotNull() {
            addCriterion("idUser_Login is not null");
            return (Criteria) this;
        }

        public Criteria andIduserLoginEqualTo(Integer value) {
            addCriterion("idUser_Login =", value, "iduserLogin");
            return (Criteria) this;
        }

        public Criteria andIduserLoginNotEqualTo(Integer value) {
            addCriterion("idUser_Login <>", value, "iduserLogin");
            return (Criteria) this;
        }

        public Criteria andIduserLoginGreaterThan(Integer value) {
            addCriterion("idUser_Login >", value, "iduserLogin");
            return (Criteria) this;
        }

        public Criteria andIduserLoginGreaterThanOrEqualTo(Integer value) {
            addCriterion("idUser_Login >=", value, "iduserLogin");
            return (Criteria) this;
        }

        public Criteria andIduserLoginLessThan(Integer value) {
            addCriterion("idUser_Login <", value, "iduserLogin");
            return (Criteria) this;
        }

        public Criteria andIduserLoginLessThanOrEqualTo(Integer value) {
            addCriterion("idUser_Login <=", value, "iduserLogin");
            return (Criteria) this;
        }

        public Criteria andIduserLoginIn(List<Integer> values) {
            addCriterion("idUser_Login in", values, "iduserLogin");
            return (Criteria) this;
        }

        public Criteria andIduserLoginNotIn(List<Integer> values) {
            addCriterion("idUser_Login not in", values, "iduserLogin");
            return (Criteria) this;
        }

        public Criteria andIduserLoginBetween(Integer value1, Integer value2) {
            addCriterion("idUser_Login between", value1, value2, "iduserLogin");
            return (Criteria) this;
        }

        public Criteria andIduserLoginNotBetween(Integer value1, Integer value2) {
            addCriterion("idUser_Login not between", value1, value2, "iduserLogin");
            return (Criteria) this;
        }

        public Criteria andUserLoginInIsNull() {
            addCriterion("user_login_in is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginInIsNotNull() {
            addCriterion("user_login_in is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginInEqualTo(Date value) {
            addCriterion("user_login_in =", value, "userLoginIn");
            return (Criteria) this;
        }

        public Criteria andUserLoginInNotEqualTo(Date value) {
            addCriterion("user_login_in <>", value, "userLoginIn");
            return (Criteria) this;
        }

        public Criteria andUserLoginInGreaterThan(Date value) {
            addCriterion("user_login_in >", value, "userLoginIn");
            return (Criteria) this;
        }

        public Criteria andUserLoginInGreaterThanOrEqualTo(Date value) {
            addCriterion("user_login_in >=", value, "userLoginIn");
            return (Criteria) this;
        }

        public Criteria andUserLoginInLessThan(Date value) {
            addCriterion("user_login_in <", value, "userLoginIn");
            return (Criteria) this;
        }

        public Criteria andUserLoginInLessThanOrEqualTo(Date value) {
            addCriterion("user_login_in <=", value, "userLoginIn");
            return (Criteria) this;
        }

        public Criteria andUserLoginInIn(List<Date> values) {
            addCriterion("user_login_in in", values, "userLoginIn");
            return (Criteria) this;
        }

        public Criteria andUserLoginInNotIn(List<Date> values) {
            addCriterion("user_login_in not in", values, "userLoginIn");
            return (Criteria) this;
        }

        public Criteria andUserLoginInBetween(Date value1, Date value2) {
            addCriterion("user_login_in between", value1, value2, "userLoginIn");
            return (Criteria) this;
        }

        public Criteria andUserLoginInNotBetween(Date value1, Date value2) {
            addCriterion("user_login_in not between", value1, value2, "userLoginIn");
            return (Criteria) this;
        }

        public Criteria andUserLoginOutIsNull() {
            addCriterion("user_login_out is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginOutIsNotNull() {
            addCriterion("user_login_out is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginOutEqualTo(Date value) {
            addCriterion("user_login_out =", value, "userLoginOut");
            return (Criteria) this;
        }

        public Criteria andUserLoginOutNotEqualTo(Date value) {
            addCriterion("user_login_out <>", value, "userLoginOut");
            return (Criteria) this;
        }

        public Criteria andUserLoginOutGreaterThan(Date value) {
            addCriterion("user_login_out >", value, "userLoginOut");
            return (Criteria) this;
        }

        public Criteria andUserLoginOutGreaterThanOrEqualTo(Date value) {
            addCriterion("user_login_out >=", value, "userLoginOut");
            return (Criteria) this;
        }

        public Criteria andUserLoginOutLessThan(Date value) {
            addCriterion("user_login_out <", value, "userLoginOut");
            return (Criteria) this;
        }

        public Criteria andUserLoginOutLessThanOrEqualTo(Date value) {
            addCriterion("user_login_out <=", value, "userLoginOut");
            return (Criteria) this;
        }

        public Criteria andUserLoginOutIn(List<Date> values) {
            addCriterion("user_login_out in", values, "userLoginOut");
            return (Criteria) this;
        }

        public Criteria andUserLoginOutNotIn(List<Date> values) {
            addCriterion("user_login_out not in", values, "userLoginOut");
            return (Criteria) this;
        }

        public Criteria andUserLoginOutBetween(Date value1, Date value2) {
            addCriterion("user_login_out between", value1, value2, "userLoginOut");
            return (Criteria) this;
        }

        public Criteria andUserLoginOutNotBetween(Date value1, Date value2) {
            addCriterion("user_login_out not between", value1, value2, "userLoginOut");
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

        public Criteria andUserLoginSynIsNull() {
            addCriterion("user_login_syn is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginSynIsNotNull() {
            addCriterion("user_login_syn is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginSynEqualTo(Integer value) {
            addCriterion("user_login_syn =", value, "userLoginSyn");
            return (Criteria) this;
        }

        public Criteria andUserLoginSynNotEqualTo(Integer value) {
            addCriterion("user_login_syn <>", value, "userLoginSyn");
            return (Criteria) this;
        }

        public Criteria andUserLoginSynGreaterThan(Integer value) {
            addCriterion("user_login_syn >", value, "userLoginSyn");
            return (Criteria) this;
        }

        public Criteria andUserLoginSynGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_login_syn >=", value, "userLoginSyn");
            return (Criteria) this;
        }

        public Criteria andUserLoginSynLessThan(Integer value) {
            addCriterion("user_login_syn <", value, "userLoginSyn");
            return (Criteria) this;
        }

        public Criteria andUserLoginSynLessThanOrEqualTo(Integer value) {
            addCriterion("user_login_syn <=", value, "userLoginSyn");
            return (Criteria) this;
        }

        public Criteria andUserLoginSynIn(List<Integer> values) {
            addCriterion("user_login_syn in", values, "userLoginSyn");
            return (Criteria) this;
        }

        public Criteria andUserLoginSynNotIn(List<Integer> values) {
            addCriterion("user_login_syn not in", values, "userLoginSyn");
            return (Criteria) this;
        }

        public Criteria andUserLoginSynBetween(Integer value1, Integer value2) {
            addCriterion("user_login_syn between", value1, value2, "userLoginSyn");
            return (Criteria) this;
        }

        public Criteria andUserLoginSynNotBetween(Integer value1, Integer value2) {
            addCriterion("user_login_syn not between", value1, value2, "userLoginSyn");
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