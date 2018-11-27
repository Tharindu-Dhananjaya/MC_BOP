package mc.kurunegala.bop.model;

import java.util.ArrayList;
import java.util.List;

public class StreetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StreetExample() {
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

        public Criteria andIdstreetIsNull() {
            addCriterion("idStreet is null");
            return (Criteria) this;
        }

        public Criteria andIdstreetIsNotNull() {
            addCriterion("idStreet is not null");
            return (Criteria) this;
        }

        public Criteria andIdstreetEqualTo(Integer value) {
            addCriterion("idStreet =", value, "idstreet");
            return (Criteria) this;
        }

        public Criteria andIdstreetNotEqualTo(Integer value) {
            addCriterion("idStreet <>", value, "idstreet");
            return (Criteria) this;
        }

        public Criteria andIdstreetGreaterThan(Integer value) {
            addCriterion("idStreet >", value, "idstreet");
            return (Criteria) this;
        }

        public Criteria andIdstreetGreaterThanOrEqualTo(Integer value) {
            addCriterion("idStreet >=", value, "idstreet");
            return (Criteria) this;
        }

        public Criteria andIdstreetLessThan(Integer value) {
            addCriterion("idStreet <", value, "idstreet");
            return (Criteria) this;
        }

        public Criteria andIdstreetLessThanOrEqualTo(Integer value) {
            addCriterion("idStreet <=", value, "idstreet");
            return (Criteria) this;
        }

        public Criteria andIdstreetIn(List<Integer> values) {
            addCriterion("idStreet in", values, "idstreet");
            return (Criteria) this;
        }

        public Criteria andIdstreetNotIn(List<Integer> values) {
            addCriterion("idStreet not in", values, "idstreet");
            return (Criteria) this;
        }

        public Criteria andIdstreetBetween(Integer value1, Integer value2) {
            addCriterion("idStreet between", value1, value2, "idstreet");
            return (Criteria) this;
        }

        public Criteria andIdstreetNotBetween(Integer value1, Integer value2) {
            addCriterion("idStreet not between", value1, value2, "idstreet");
            return (Criteria) this;
        }

        public Criteria andStreetNameIsNull() {
            addCriterion("street_name is null");
            return (Criteria) this;
        }

        public Criteria andStreetNameIsNotNull() {
            addCriterion("street_name is not null");
            return (Criteria) this;
        }

        public Criteria andStreetNameEqualTo(String value) {
            addCriterion("street_name =", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameNotEqualTo(String value) {
            addCriterion("street_name <>", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameGreaterThan(String value) {
            addCriterion("street_name >", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameGreaterThanOrEqualTo(String value) {
            addCriterion("street_name >=", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameLessThan(String value) {
            addCriterion("street_name <", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameLessThanOrEqualTo(String value) {
            addCriterion("street_name <=", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameLike(String value) {
            addCriterion("street_name like", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameNotLike(String value) {
            addCriterion("street_name not like", value, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameIn(List<String> values) {
            addCriterion("street_name in", values, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameNotIn(List<String> values) {
            addCriterion("street_name not in", values, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameBetween(String value1, String value2) {
            addCriterion("street_name between", value1, value2, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNameNotBetween(String value1, String value2) {
            addCriterion("street_name not between", value1, value2, "streetName");
            return (Criteria) this;
        }

        public Criteria andStreetNoIsNull() {
            addCriterion("street_no is null");
            return (Criteria) this;
        }

        public Criteria andStreetNoIsNotNull() {
            addCriterion("street_no is not null");
            return (Criteria) this;
        }

        public Criteria andStreetNoEqualTo(String value) {
            addCriterion("street_no =", value, "streetNo");
            return (Criteria) this;
        }

        public Criteria andStreetNoNotEqualTo(String value) {
            addCriterion("street_no <>", value, "streetNo");
            return (Criteria) this;
        }

        public Criteria andStreetNoGreaterThan(String value) {
            addCriterion("street_no >", value, "streetNo");
            return (Criteria) this;
        }

        public Criteria andStreetNoGreaterThanOrEqualTo(String value) {
            addCriterion("street_no >=", value, "streetNo");
            return (Criteria) this;
        }

        public Criteria andStreetNoLessThan(String value) {
            addCriterion("street_no <", value, "streetNo");
            return (Criteria) this;
        }

        public Criteria andStreetNoLessThanOrEqualTo(String value) {
            addCriterion("street_no <=", value, "streetNo");
            return (Criteria) this;
        }

        public Criteria andStreetNoLike(String value) {
            addCriterion("street_no like", value, "streetNo");
            return (Criteria) this;
        }

        public Criteria andStreetNoNotLike(String value) {
            addCriterion("street_no not like", value, "streetNo");
            return (Criteria) this;
        }

        public Criteria andStreetNoIn(List<String> values) {
            addCriterion("street_no in", values, "streetNo");
            return (Criteria) this;
        }

        public Criteria andStreetNoNotIn(List<String> values) {
            addCriterion("street_no not in", values, "streetNo");
            return (Criteria) this;
        }

        public Criteria andStreetNoBetween(String value1, String value2) {
            addCriterion("street_no between", value1, value2, "streetNo");
            return (Criteria) this;
        }

        public Criteria andStreetNoNotBetween(String value1, String value2) {
            addCriterion("street_no not between", value1, value2, "streetNo");
            return (Criteria) this;
        }

        public Criteria andStreetStatusIsNull() {
            addCriterion("street_status is null");
            return (Criteria) this;
        }

        public Criteria andStreetStatusIsNotNull() {
            addCriterion("street_status is not null");
            return (Criteria) this;
        }

        public Criteria andStreetStatusEqualTo(Integer value) {
            addCriterion("street_status =", value, "streetStatus");
            return (Criteria) this;
        }

        public Criteria andStreetStatusNotEqualTo(Integer value) {
            addCriterion("street_status <>", value, "streetStatus");
            return (Criteria) this;
        }

        public Criteria andStreetStatusGreaterThan(Integer value) {
            addCriterion("street_status >", value, "streetStatus");
            return (Criteria) this;
        }

        public Criteria andStreetStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("street_status >=", value, "streetStatus");
            return (Criteria) this;
        }

        public Criteria andStreetStatusLessThan(Integer value) {
            addCriterion("street_status <", value, "streetStatus");
            return (Criteria) this;
        }

        public Criteria andStreetStatusLessThanOrEqualTo(Integer value) {
            addCriterion("street_status <=", value, "streetStatus");
            return (Criteria) this;
        }

        public Criteria andStreetStatusIn(List<Integer> values) {
            addCriterion("street_status in", values, "streetStatus");
            return (Criteria) this;
        }

        public Criteria andStreetStatusNotIn(List<Integer> values) {
            addCriterion("street_status not in", values, "streetStatus");
            return (Criteria) this;
        }

        public Criteria andStreetStatusBetween(Integer value1, Integer value2) {
            addCriterion("street_status between", value1, value2, "streetStatus");
            return (Criteria) this;
        }

        public Criteria andStreetStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("street_status not between", value1, value2, "streetStatus");
            return (Criteria) this;
        }

        public Criteria andStreetSynIsNull() {
            addCriterion("street_syn is null");
            return (Criteria) this;
        }

        public Criteria andStreetSynIsNotNull() {
            addCriterion("street_syn is not null");
            return (Criteria) this;
        }

        public Criteria andStreetSynEqualTo(Integer value) {
            addCriterion("street_syn =", value, "streetSyn");
            return (Criteria) this;
        }

        public Criteria andStreetSynNotEqualTo(Integer value) {
            addCriterion("street_syn <>", value, "streetSyn");
            return (Criteria) this;
        }

        public Criteria andStreetSynGreaterThan(Integer value) {
            addCriterion("street_syn >", value, "streetSyn");
            return (Criteria) this;
        }

        public Criteria andStreetSynGreaterThanOrEqualTo(Integer value) {
            addCriterion("street_syn >=", value, "streetSyn");
            return (Criteria) this;
        }

        public Criteria andStreetSynLessThan(Integer value) {
            addCriterion("street_syn <", value, "streetSyn");
            return (Criteria) this;
        }

        public Criteria andStreetSynLessThanOrEqualTo(Integer value) {
            addCriterion("street_syn <=", value, "streetSyn");
            return (Criteria) this;
        }

        public Criteria andStreetSynIn(List<Integer> values) {
            addCriterion("street_syn in", values, "streetSyn");
            return (Criteria) this;
        }

        public Criteria andStreetSynNotIn(List<Integer> values) {
            addCriterion("street_syn not in", values, "streetSyn");
            return (Criteria) this;
        }

        public Criteria andStreetSynBetween(Integer value1, Integer value2) {
            addCriterion("street_syn between", value1, value2, "streetSyn");
            return (Criteria) this;
        }

        public Criteria andStreetSynNotBetween(Integer value1, Integer value2) {
            addCriterion("street_syn not between", value1, value2, "streetSyn");
            return (Criteria) this;
        }

        public Criteria andStreetComentIsNull() {
            addCriterion("street_coment is null");
            return (Criteria) this;
        }

        public Criteria andStreetComentIsNotNull() {
            addCriterion("street_coment is not null");
            return (Criteria) this;
        }

        public Criteria andStreetComentEqualTo(String value) {
            addCriterion("street_coment =", value, "streetComent");
            return (Criteria) this;
        }

        public Criteria andStreetComentNotEqualTo(String value) {
            addCriterion("street_coment <>", value, "streetComent");
            return (Criteria) this;
        }

        public Criteria andStreetComentGreaterThan(String value) {
            addCriterion("street_coment >", value, "streetComent");
            return (Criteria) this;
        }

        public Criteria andStreetComentGreaterThanOrEqualTo(String value) {
            addCriterion("street_coment >=", value, "streetComent");
            return (Criteria) this;
        }

        public Criteria andStreetComentLessThan(String value) {
            addCriterion("street_coment <", value, "streetComent");
            return (Criteria) this;
        }

        public Criteria andStreetComentLessThanOrEqualTo(String value) {
            addCriterion("street_coment <=", value, "streetComent");
            return (Criteria) this;
        }

        public Criteria andStreetComentLike(String value) {
            addCriterion("street_coment like", value, "streetComent");
            return (Criteria) this;
        }

        public Criteria andStreetComentNotLike(String value) {
            addCriterion("street_coment not like", value, "streetComent");
            return (Criteria) this;
        }

        public Criteria andStreetComentIn(List<String> values) {
            addCriterion("street_coment in", values, "streetComent");
            return (Criteria) this;
        }

        public Criteria andStreetComentNotIn(List<String> values) {
            addCriterion("street_coment not in", values, "streetComent");
            return (Criteria) this;
        }

        public Criteria andStreetComentBetween(String value1, String value2) {
            addCriterion("street_coment between", value1, value2, "streetComent");
            return (Criteria) this;
        }

        public Criteria andStreetComentNotBetween(String value1, String value2) {
            addCriterion("street_coment not between", value1, value2, "streetComent");
            return (Criteria) this;
        }

        public Criteria andWardIdwardIsNull() {
            addCriterion("Ward_idWard is null");
            return (Criteria) this;
        }

        public Criteria andWardIdwardIsNotNull() {
            addCriterion("Ward_idWard is not null");
            return (Criteria) this;
        }

        public Criteria andWardIdwardEqualTo(Integer value) {
            addCriterion("Ward_idWard =", value, "wardIdward");
            return (Criteria) this;
        }

        public Criteria andWardIdwardNotEqualTo(Integer value) {
            addCriterion("Ward_idWard <>", value, "wardIdward");
            return (Criteria) this;
        }

        public Criteria andWardIdwardGreaterThan(Integer value) {
            addCriterion("Ward_idWard >", value, "wardIdward");
            return (Criteria) this;
        }

        public Criteria andWardIdwardGreaterThanOrEqualTo(Integer value) {
            addCriterion("Ward_idWard >=", value, "wardIdward");
            return (Criteria) this;
        }

        public Criteria andWardIdwardLessThan(Integer value) {
            addCriterion("Ward_idWard <", value, "wardIdward");
            return (Criteria) this;
        }

        public Criteria andWardIdwardLessThanOrEqualTo(Integer value) {
            addCriterion("Ward_idWard <=", value, "wardIdward");
            return (Criteria) this;
        }

        public Criteria andWardIdwardIn(List<Integer> values) {
            addCriterion("Ward_idWard in", values, "wardIdward");
            return (Criteria) this;
        }

        public Criteria andWardIdwardNotIn(List<Integer> values) {
            addCriterion("Ward_idWard not in", values, "wardIdward");
            return (Criteria) this;
        }

        public Criteria andWardIdwardBetween(Integer value1, Integer value2) {
            addCriterion("Ward_idWard between", value1, value2, "wardIdward");
            return (Criteria) this;
        }

        public Criteria andWardIdwardNotBetween(Integer value1, Integer value2) {
            addCriterion("Ward_idWard not between", value1, value2, "wardIdward");
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