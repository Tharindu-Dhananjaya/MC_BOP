package mc.kurunegala.bop.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApproveDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApproveDetailsExample() {
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

        public Criteria andIdapproveDetailsIsNull() {
            addCriterion("idApprove_details is null");
            return (Criteria) this;
        }

        public Criteria andIdapproveDetailsIsNotNull() {
            addCriterion("idApprove_details is not null");
            return (Criteria) this;
        }

        public Criteria andIdapproveDetailsEqualTo(Integer value) {
            addCriterion("idApprove_details =", value, "idapproveDetails");
            return (Criteria) this;
        }

        public Criteria andIdapproveDetailsNotEqualTo(Integer value) {
            addCriterion("idApprove_details <>", value, "idapproveDetails");
            return (Criteria) this;
        }

        public Criteria andIdapproveDetailsGreaterThan(Integer value) {
            addCriterion("idApprove_details >", value, "idapproveDetails");
            return (Criteria) this;
        }

        public Criteria andIdapproveDetailsGreaterThanOrEqualTo(Integer value) {
            addCriterion("idApprove_details >=", value, "idapproveDetails");
            return (Criteria) this;
        }

        public Criteria andIdapproveDetailsLessThan(Integer value) {
            addCriterion("idApprove_details <", value, "idapproveDetails");
            return (Criteria) this;
        }

        public Criteria andIdapproveDetailsLessThanOrEqualTo(Integer value) {
            addCriterion("idApprove_details <=", value, "idapproveDetails");
            return (Criteria) this;
        }

        public Criteria andIdapproveDetailsIn(List<Integer> values) {
            addCriterion("idApprove_details in", values, "idapproveDetails");
            return (Criteria) this;
        }

        public Criteria andIdapproveDetailsNotIn(List<Integer> values) {
            addCriterion("idApprove_details not in", values, "idapproveDetails");
            return (Criteria) this;
        }

        public Criteria andIdapproveDetailsBetween(Integer value1, Integer value2) {
            addCriterion("idApprove_details between", value1, value2, "idapproveDetails");
            return (Criteria) this;
        }

        public Criteria andIdapproveDetailsNotBetween(Integer value1, Integer value2) {
            addCriterion("idApprove_details not between", value1, value2, "idapproveDetails");
            return (Criteria) this;
        }

        public Criteria andPricingIsNull() {
            addCriterion("pricing is null");
            return (Criteria) this;
        }

        public Criteria andPricingIsNotNull() {
            addCriterion("pricing is not null");
            return (Criteria) this;
        }

        public Criteria andPricingEqualTo(Double value) {
            addCriterion("pricing =", value, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingNotEqualTo(Double value) {
            addCriterion("pricing <>", value, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingGreaterThan(Double value) {
            addCriterion("pricing >", value, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingGreaterThanOrEqualTo(Double value) {
            addCriterion("pricing >=", value, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingLessThan(Double value) {
            addCriterion("pricing <", value, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingLessThanOrEqualTo(Double value) {
            addCriterion("pricing <=", value, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingIn(List<Double> values) {
            addCriterion("pricing in", values, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingNotIn(List<Double> values) {
            addCriterion("pricing not in", values, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingBetween(Double value1, Double value2) {
            addCriterion("pricing between", value1, value2, "pricing");
            return (Criteria) this;
        }

        public Criteria andPricingNotBetween(Double value1, Double value2) {
            addCriterion("pricing not between", value1, value2, "pricing");
            return (Criteria) this;
        }

        public Criteria andStatusApprovDetailsIsNull() {
            addCriterion("status_approv_details is null");
            return (Criteria) this;
        }

        public Criteria andStatusApprovDetailsIsNotNull() {
            addCriterion("status_approv_details is not null");
            return (Criteria) this;
        }

        public Criteria andStatusApprovDetailsEqualTo(Integer value) {
            addCriterion("status_approv_details =", value, "statusApprovDetails");
            return (Criteria) this;
        }

        public Criteria andStatusApprovDetailsNotEqualTo(Integer value) {
            addCriterion("status_approv_details <>", value, "statusApprovDetails");
            return (Criteria) this;
        }

        public Criteria andStatusApprovDetailsGreaterThan(Integer value) {
            addCriterion("status_approv_details >", value, "statusApprovDetails");
            return (Criteria) this;
        }

        public Criteria andStatusApprovDetailsGreaterThanOrEqualTo(Integer value) {
            addCriterion("status_approv_details >=", value, "statusApprovDetails");
            return (Criteria) this;
        }

        public Criteria andStatusApprovDetailsLessThan(Integer value) {
            addCriterion("status_approv_details <", value, "statusApprovDetails");
            return (Criteria) this;
        }

        public Criteria andStatusApprovDetailsLessThanOrEqualTo(Integer value) {
            addCriterion("status_approv_details <=", value, "statusApprovDetails");
            return (Criteria) this;
        }

        public Criteria andStatusApprovDetailsIn(List<Integer> values) {
            addCriterion("status_approv_details in", values, "statusApprovDetails");
            return (Criteria) this;
        }

        public Criteria andStatusApprovDetailsNotIn(List<Integer> values) {
            addCriterion("status_approv_details not in", values, "statusApprovDetails");
            return (Criteria) this;
        }

        public Criteria andStatusApprovDetailsBetween(Integer value1, Integer value2) {
            addCriterion("status_approv_details between", value1, value2, "statusApprovDetails");
            return (Criteria) this;
        }

        public Criteria andStatusApprovDetailsNotBetween(Integer value1, Integer value2) {
            addCriterion("status_approv_details not between", value1, value2, "statusApprovDetails");
            return (Criteria) this;
        }

        public Criteria andOthersIsNull() {
            addCriterion("Others is null");
            return (Criteria) this;
        }

        public Criteria andOthersIsNotNull() {
            addCriterion("Others is not null");
            return (Criteria) this;
        }

        public Criteria andOthersEqualTo(String value) {
            addCriterion("Others =", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotEqualTo(String value) {
            addCriterion("Others <>", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersGreaterThan(String value) {
            addCriterion("Others >", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersGreaterThanOrEqualTo(String value) {
            addCriterion("Others >=", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLessThan(String value) {
            addCriterion("Others <", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLessThanOrEqualTo(String value) {
            addCriterion("Others <=", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLike(String value) {
            addCriterion("Others like", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotLike(String value) {
            addCriterion("Others not like", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersIn(List<String> values) {
            addCriterion("Others in", values, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotIn(List<String> values) {
            addCriterion("Others not in", values, "others");
            return (Criteria) this;
        }

        public Criteria andOthersBetween(String value1, String value2) {
            addCriterion("Others between", value1, value2, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotBetween(String value1, String value2) {
            addCriterion("Others not between", value1, value2, "others");
            return (Criteria) this;
        }

        public Criteria andDateApproveDetailsIsNull() {
            addCriterion("date_approve_details is null");
            return (Criteria) this;
        }

        public Criteria andDateApproveDetailsIsNotNull() {
            addCriterion("date_approve_details is not null");
            return (Criteria) this;
        }

        public Criteria andDateApproveDetailsEqualTo(Date value) {
            addCriterion("date_approve_details =", value, "dateApproveDetails");
            return (Criteria) this;
        }

        public Criteria andDateApproveDetailsNotEqualTo(Date value) {
            addCriterion("date_approve_details <>", value, "dateApproveDetails");
            return (Criteria) this;
        }

        public Criteria andDateApproveDetailsGreaterThan(Date value) {
            addCriterion("date_approve_details >", value, "dateApproveDetails");
            return (Criteria) this;
        }

        public Criteria andDateApproveDetailsGreaterThanOrEqualTo(Date value) {
            addCriterion("date_approve_details >=", value, "dateApproveDetails");
            return (Criteria) this;
        }

        public Criteria andDateApproveDetailsLessThan(Date value) {
            addCriterion("date_approve_details <", value, "dateApproveDetails");
            return (Criteria) this;
        }

        public Criteria andDateApproveDetailsLessThanOrEqualTo(Date value) {
            addCriterion("date_approve_details <=", value, "dateApproveDetails");
            return (Criteria) this;
        }

        public Criteria andDateApproveDetailsIn(List<Date> values) {
            addCriterion("date_approve_details in", values, "dateApproveDetails");
            return (Criteria) this;
        }

        public Criteria andDateApproveDetailsNotIn(List<Date> values) {
            addCriterion("date_approve_details not in", values, "dateApproveDetails");
            return (Criteria) this;
        }

        public Criteria andDateApproveDetailsBetween(Date value1, Date value2) {
            addCriterion("date_approve_details between", value1, value2, "dateApproveDetails");
            return (Criteria) this;
        }

        public Criteria andDateApproveDetailsNotBetween(Date value1, Date value2) {
            addCriterion("date_approve_details not between", value1, value2, "dateApproveDetails");
            return (Criteria) this;
        }

        public Criteria andSendToApproveIdsendToApproveIsNull() {
            addCriterion("Send_to_approve_idSend_to_approve is null");
            return (Criteria) this;
        }

        public Criteria andSendToApproveIdsendToApproveIsNotNull() {
            addCriterion("Send_to_approve_idSend_to_approve is not null");
            return (Criteria) this;
        }

        public Criteria andSendToApproveIdsendToApproveEqualTo(Integer value) {
            addCriterion("Send_to_approve_idSend_to_approve =", value, "sendToApproveIdsendToApprove");
            return (Criteria) this;
        }

        public Criteria andSendToApproveIdsendToApproveNotEqualTo(Integer value) {
            addCriterion("Send_to_approve_idSend_to_approve <>", value, "sendToApproveIdsendToApprove");
            return (Criteria) this;
        }

        public Criteria andSendToApproveIdsendToApproveGreaterThan(Integer value) {
            addCriterion("Send_to_approve_idSend_to_approve >", value, "sendToApproveIdsendToApprove");
            return (Criteria) this;
        }

        public Criteria andSendToApproveIdsendToApproveGreaterThanOrEqualTo(Integer value) {
            addCriterion("Send_to_approve_idSend_to_approve >=", value, "sendToApproveIdsendToApprove");
            return (Criteria) this;
        }

        public Criteria andSendToApproveIdsendToApproveLessThan(Integer value) {
            addCriterion("Send_to_approve_idSend_to_approve <", value, "sendToApproveIdsendToApprove");
            return (Criteria) this;
        }

        public Criteria andSendToApproveIdsendToApproveLessThanOrEqualTo(Integer value) {
            addCriterion("Send_to_approve_idSend_to_approve <=", value, "sendToApproveIdsendToApprove");
            return (Criteria) this;
        }

        public Criteria andSendToApproveIdsendToApproveIn(List<Integer> values) {
            addCriterion("Send_to_approve_idSend_to_approve in", values, "sendToApproveIdsendToApprove");
            return (Criteria) this;
        }

        public Criteria andSendToApproveIdsendToApproveNotIn(List<Integer> values) {
            addCriterion("Send_to_approve_idSend_to_approve not in", values, "sendToApproveIdsendToApprove");
            return (Criteria) this;
        }

        public Criteria andSendToApproveIdsendToApproveBetween(Integer value1, Integer value2) {
            addCriterion("Send_to_approve_idSend_to_approve between", value1, value2, "sendToApproveIdsendToApprove");
            return (Criteria) this;
        }

        public Criteria andSendToApproveIdsendToApproveNotBetween(Integer value1, Integer value2) {
            addCriterion("Send_to_approve_idSend_to_approve not between", value1, value2, "sendToApproveIdsendToApprove");
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