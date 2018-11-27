package mc.kurunegala.bop.model;

import java.util.ArrayList;
import java.util.List;

public class WardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WardExample() {
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

        public Criteria andIdwardIsNull() {
            addCriterion("idWard is null");
            return (Criteria) this;
        }

        public Criteria andIdwardIsNotNull() {
            addCriterion("idWard is not null");
            return (Criteria) this;
        }

        public Criteria andIdwardEqualTo(Integer value) {
            addCriterion("idWard =", value, "idward");
            return (Criteria) this;
        }

        public Criteria andIdwardNotEqualTo(Integer value) {
            addCriterion("idWard <>", value, "idward");
            return (Criteria) this;
        }

        public Criteria andIdwardGreaterThan(Integer value) {
            addCriterion("idWard >", value, "idward");
            return (Criteria) this;
        }

        public Criteria andIdwardGreaterThanOrEqualTo(Integer value) {
            addCriterion("idWard >=", value, "idward");
            return (Criteria) this;
        }

        public Criteria andIdwardLessThan(Integer value) {
            addCriterion("idWard <", value, "idward");
            return (Criteria) this;
        }

        public Criteria andIdwardLessThanOrEqualTo(Integer value) {
            addCriterion("idWard <=", value, "idward");
            return (Criteria) this;
        }

        public Criteria andIdwardIn(List<Integer> values) {
            addCriterion("idWard in", values, "idward");
            return (Criteria) this;
        }

        public Criteria andIdwardNotIn(List<Integer> values) {
            addCriterion("idWard not in", values, "idward");
            return (Criteria) this;
        }

        public Criteria andIdwardBetween(Integer value1, Integer value2) {
            addCriterion("idWard between", value1, value2, "idward");
            return (Criteria) this;
        }

        public Criteria andIdwardNotBetween(Integer value1, Integer value2) {
            addCriterion("idWard not between", value1, value2, "idward");
            return (Criteria) this;
        }

        public Criteria andWardNoIsNull() {
            addCriterion("ward_no is null");
            return (Criteria) this;
        }

        public Criteria andWardNoIsNotNull() {
            addCriterion("ward_no is not null");
            return (Criteria) this;
        }

        public Criteria andWardNoEqualTo(String value) {
            addCriterion("ward_no =", value, "wardNo");
            return (Criteria) this;
        }

        public Criteria andWardNoNotEqualTo(String value) {
            addCriterion("ward_no <>", value, "wardNo");
            return (Criteria) this;
        }

        public Criteria andWardNoGreaterThan(String value) {
            addCriterion("ward_no >", value, "wardNo");
            return (Criteria) this;
        }

        public Criteria andWardNoGreaterThanOrEqualTo(String value) {
            addCriterion("ward_no >=", value, "wardNo");
            return (Criteria) this;
        }

        public Criteria andWardNoLessThan(String value) {
            addCriterion("ward_no <", value, "wardNo");
            return (Criteria) this;
        }

        public Criteria andWardNoLessThanOrEqualTo(String value) {
            addCriterion("ward_no <=", value, "wardNo");
            return (Criteria) this;
        }

        public Criteria andWardNoLike(String value) {
            addCriterion("ward_no like", value, "wardNo");
            return (Criteria) this;
        }

        public Criteria andWardNoNotLike(String value) {
            addCriterion("ward_no not like", value, "wardNo");
            return (Criteria) this;
        }

        public Criteria andWardNoIn(List<String> values) {
            addCriterion("ward_no in", values, "wardNo");
            return (Criteria) this;
        }

        public Criteria andWardNoNotIn(List<String> values) {
            addCriterion("ward_no not in", values, "wardNo");
            return (Criteria) this;
        }

        public Criteria andWardNoBetween(String value1, String value2) {
            addCriterion("ward_no between", value1, value2, "wardNo");
            return (Criteria) this;
        }

        public Criteria andWardNoNotBetween(String value1, String value2) {
            addCriterion("ward_no not between", value1, value2, "wardNo");
            return (Criteria) this;
        }

        public Criteria andWardNameIsNull() {
            addCriterion("ward_name is null");
            return (Criteria) this;
        }

        public Criteria andWardNameIsNotNull() {
            addCriterion("ward_name is not null");
            return (Criteria) this;
        }

        public Criteria andWardNameEqualTo(String value) {
            addCriterion("ward_name =", value, "wardName");
            return (Criteria) this;
        }

        public Criteria andWardNameNotEqualTo(String value) {
            addCriterion("ward_name <>", value, "wardName");
            return (Criteria) this;
        }

        public Criteria andWardNameGreaterThan(String value) {
            addCriterion("ward_name >", value, "wardName");
            return (Criteria) this;
        }

        public Criteria andWardNameGreaterThanOrEqualTo(String value) {
            addCriterion("ward_name >=", value, "wardName");
            return (Criteria) this;
        }

        public Criteria andWardNameLessThan(String value) {
            addCriterion("ward_name <", value, "wardName");
            return (Criteria) this;
        }

        public Criteria andWardNameLessThanOrEqualTo(String value) {
            addCriterion("ward_name <=", value, "wardName");
            return (Criteria) this;
        }

        public Criteria andWardNameLike(String value) {
            addCriterion("ward_name like", value, "wardName");
            return (Criteria) this;
        }

        public Criteria andWardNameNotLike(String value) {
            addCriterion("ward_name not like", value, "wardName");
            return (Criteria) this;
        }

        public Criteria andWardNameIn(List<String> values) {
            addCriterion("ward_name in", values, "wardName");
            return (Criteria) this;
        }

        public Criteria andWardNameNotIn(List<String> values) {
            addCriterion("ward_name not in", values, "wardName");
            return (Criteria) this;
        }

        public Criteria andWardNameBetween(String value1, String value2) {
            addCriterion("ward_name between", value1, value2, "wardName");
            return (Criteria) this;
        }

        public Criteria andWardNameNotBetween(String value1, String value2) {
            addCriterion("ward_name not between", value1, value2, "wardName");
            return (Criteria) this;
        }

        public Criteria andWardStatusIsNull() {
            addCriterion("ward_status is null");
            return (Criteria) this;
        }

        public Criteria andWardStatusIsNotNull() {
            addCriterion("ward_status is not null");
            return (Criteria) this;
        }

        public Criteria andWardStatusEqualTo(Integer value) {
            addCriterion("ward_status =", value, "wardStatus");
            return (Criteria) this;
        }

        public Criteria andWardStatusNotEqualTo(Integer value) {
            addCriterion("ward_status <>", value, "wardStatus");
            return (Criteria) this;
        }

        public Criteria andWardStatusGreaterThan(Integer value) {
            addCriterion("ward_status >", value, "wardStatus");
            return (Criteria) this;
        }

        public Criteria andWardStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ward_status >=", value, "wardStatus");
            return (Criteria) this;
        }

        public Criteria andWardStatusLessThan(Integer value) {
            addCriterion("ward_status <", value, "wardStatus");
            return (Criteria) this;
        }

        public Criteria andWardStatusLessThanOrEqualTo(Integer value) {
            addCriterion("ward_status <=", value, "wardStatus");
            return (Criteria) this;
        }

        public Criteria andWardStatusIn(List<Integer> values) {
            addCriterion("ward_status in", values, "wardStatus");
            return (Criteria) this;
        }

        public Criteria andWardStatusNotIn(List<Integer> values) {
            addCriterion("ward_status not in", values, "wardStatus");
            return (Criteria) this;
        }

        public Criteria andWardStatusBetween(Integer value1, Integer value2) {
            addCriterion("ward_status between", value1, value2, "wardStatus");
            return (Criteria) this;
        }

        public Criteria andWardStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ward_status not between", value1, value2, "wardStatus");
            return (Criteria) this;
        }

        public Criteria andWardSynIsNull() {
            addCriterion("ward_syn is null");
            return (Criteria) this;
        }

        public Criteria andWardSynIsNotNull() {
            addCriterion("ward_syn is not null");
            return (Criteria) this;
        }

        public Criteria andWardSynEqualTo(Integer value) {
            addCriterion("ward_syn =", value, "wardSyn");
            return (Criteria) this;
        }

        public Criteria andWardSynNotEqualTo(Integer value) {
            addCriterion("ward_syn <>", value, "wardSyn");
            return (Criteria) this;
        }

        public Criteria andWardSynGreaterThan(Integer value) {
            addCriterion("ward_syn >", value, "wardSyn");
            return (Criteria) this;
        }

        public Criteria andWardSynGreaterThanOrEqualTo(Integer value) {
            addCriterion("ward_syn >=", value, "wardSyn");
            return (Criteria) this;
        }

        public Criteria andWardSynLessThan(Integer value) {
            addCriterion("ward_syn <", value, "wardSyn");
            return (Criteria) this;
        }

        public Criteria andWardSynLessThanOrEqualTo(Integer value) {
            addCriterion("ward_syn <=", value, "wardSyn");
            return (Criteria) this;
        }

        public Criteria andWardSynIn(List<Integer> values) {
            addCriterion("ward_syn in", values, "wardSyn");
            return (Criteria) this;
        }

        public Criteria andWardSynNotIn(List<Integer> values) {
            addCriterion("ward_syn not in", values, "wardSyn");
            return (Criteria) this;
        }

        public Criteria andWardSynBetween(Integer value1, Integer value2) {
            addCriterion("ward_syn between", value1, value2, "wardSyn");
            return (Criteria) this;
        }

        public Criteria andWardSynNotBetween(Integer value1, Integer value2) {
            addCriterion("ward_syn not between", value1, value2, "wardSyn");
            return (Criteria) this;
        }

        public Criteria andWardCommentIsNull() {
            addCriterion("ward_comment is null");
            return (Criteria) this;
        }

        public Criteria andWardCommentIsNotNull() {
            addCriterion("ward_comment is not null");
            return (Criteria) this;
        }

        public Criteria andWardCommentEqualTo(String value) {
            addCriterion("ward_comment =", value, "wardComment");
            return (Criteria) this;
        }

        public Criteria andWardCommentNotEqualTo(String value) {
            addCriterion("ward_comment <>", value, "wardComment");
            return (Criteria) this;
        }

        public Criteria andWardCommentGreaterThan(String value) {
            addCriterion("ward_comment >", value, "wardComment");
            return (Criteria) this;
        }

        public Criteria andWardCommentGreaterThanOrEqualTo(String value) {
            addCriterion("ward_comment >=", value, "wardComment");
            return (Criteria) this;
        }

        public Criteria andWardCommentLessThan(String value) {
            addCriterion("ward_comment <", value, "wardComment");
            return (Criteria) this;
        }

        public Criteria andWardCommentLessThanOrEqualTo(String value) {
            addCriterion("ward_comment <=", value, "wardComment");
            return (Criteria) this;
        }

        public Criteria andWardCommentLike(String value) {
            addCriterion("ward_comment like", value, "wardComment");
            return (Criteria) this;
        }

        public Criteria andWardCommentNotLike(String value) {
            addCriterion("ward_comment not like", value, "wardComment");
            return (Criteria) this;
        }

        public Criteria andWardCommentIn(List<String> values) {
            addCriterion("ward_comment in", values, "wardComment");
            return (Criteria) this;
        }

        public Criteria andWardCommentNotIn(List<String> values) {
            addCriterion("ward_comment not in", values, "wardComment");
            return (Criteria) this;
        }

        public Criteria andWardCommentBetween(String value1, String value2) {
            addCriterion("ward_comment between", value1, value2, "wardComment");
            return (Criteria) this;
        }

        public Criteria andWardCommentNotBetween(String value1, String value2) {
            addCriterion("ward_comment not between", value1, value2, "wardComment");
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