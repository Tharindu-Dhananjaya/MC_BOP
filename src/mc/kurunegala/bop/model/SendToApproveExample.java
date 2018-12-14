package mc.kurunegala.bop.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SendToApproveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SendToApproveExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdsendToApproveIsNull() {
            addCriterion("idSend_to_approve is null");
            return (Criteria) this;
        }

        public Criteria andIdsendToApproveIsNotNull() {
            addCriterion("idSend_to_approve is not null");
            return (Criteria) this;
        }

        public Criteria andIdsendToApproveEqualTo(Integer value) {
            addCriterion("idSend_to_approve =", value, "idsendToApprove");
            return (Criteria) this;
        }

        public Criteria andIdsendToApproveNotEqualTo(Integer value) {
            addCriterion("idSend_to_approve <>", value, "idsendToApprove");
            return (Criteria) this;
        }

        public Criteria andIdsendToApproveGreaterThan(Integer value) {
            addCriterion("idSend_to_approve >", value, "idsendToApprove");
            return (Criteria) this;
        }

        public Criteria andIdsendToApproveGreaterThanOrEqualTo(Integer value) {
            addCriterion("idSend_to_approve >=", value, "idsendToApprove");
            return (Criteria) this;
        }

        public Criteria andIdsendToApproveLessThan(Integer value) {
            addCriterion("idSend_to_approve <", value, "idsendToApprove");
            return (Criteria) this;
        }

        public Criteria andIdsendToApproveLessThanOrEqualTo(Integer value) {
            addCriterion("idSend_to_approve <=", value, "idsendToApprove");
            return (Criteria) this;
        }

        public Criteria andIdsendToApproveIn(List<Integer> values) {
            addCriterion("idSend_to_approve in", values, "idsendToApprove");
            return (Criteria) this;
        }

        public Criteria andIdsendToApproveNotIn(List<Integer> values) {
            addCriterion("idSend_to_approve not in", values, "idsendToApprove");
            return (Criteria) this;
        }

        public Criteria andIdsendToApproveBetween(Integer value1, Integer value2) {
            addCriterion("idSend_to_approve between", value1, value2, "idsendToApprove");
            return (Criteria) this;
        }

        public Criteria andIdsendToApproveNotBetween(Integer value1, Integer value2) {
            addCriterion("idSend_to_approve not between", value1, value2, "idsendToApprove");
            return (Criteria) this;
        }

        public Criteria andApprovalByIdapprovalByIsNull() {
            addCriterion("Approval_By_idApproval_By is null");
            return (Criteria) this;
        }

        public Criteria andApprovalByIdapprovalByIsNotNull() {
            addCriterion("Approval_By_idApproval_By is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalByIdapprovalByEqualTo(Integer value) {
            addCriterion("Approval_By_idApproval_By =", value, "approvalByIdapprovalBy");
            return (Criteria) this;
        }

        public Criteria andApprovalByIdapprovalByNotEqualTo(Integer value) {
            addCriterion("Approval_By_idApproval_By <>", value, "approvalByIdapprovalBy");
            return (Criteria) this;
        }

        public Criteria andApprovalByIdapprovalByGreaterThan(Integer value) {
            addCriterion("Approval_By_idApproval_By >", value, "approvalByIdapprovalBy");
            return (Criteria) this;
        }

        public Criteria andApprovalByIdapprovalByGreaterThanOrEqualTo(Integer value) {
            addCriterion("Approval_By_idApproval_By >=", value, "approvalByIdapprovalBy");
            return (Criteria) this;
        }

        public Criteria andApprovalByIdapprovalByLessThan(Integer value) {
            addCriterion("Approval_By_idApproval_By <", value, "approvalByIdapprovalBy");
            return (Criteria) this;
        }

        public Criteria andApprovalByIdapprovalByLessThanOrEqualTo(Integer value) {
            addCriterion("Approval_By_idApproval_By <=", value, "approvalByIdapprovalBy");
            return (Criteria) this;
        }

        public Criteria andApprovalByIdapprovalByIn(List<Integer> values) {
            addCriterion("Approval_By_idApproval_By in", values, "approvalByIdapprovalBy");
            return (Criteria) this;
        }

        public Criteria andApprovalByIdapprovalByNotIn(List<Integer> values) {
            addCriterion("Approval_By_idApproval_By not in", values, "approvalByIdapprovalBy");
            return (Criteria) this;
        }

        public Criteria andApprovalByIdapprovalByBetween(Integer value1, Integer value2) {
            addCriterion("Approval_By_idApproval_By between", value1, value2, "approvalByIdapprovalBy");
            return (Criteria) this;
        }

        public Criteria andApprovalByIdapprovalByNotBetween(Integer value1, Integer value2) {
            addCriterion("Approval_By_idApproval_By not between", value1, value2, "approvalByIdapprovalBy");
            return (Criteria) this;
        }

        public Criteria andSendToUserIsNull() {
            addCriterion("Send_to_user is null");
            return (Criteria) this;
        }

        public Criteria andSendToUserIsNotNull() {
            addCriterion("Send_to_user is not null");
            return (Criteria) this;
        }

        public Criteria andSendToUserEqualTo(Integer value) {
            addCriterion("Send_to_user =", value, "sendToUser");
            return (Criteria) this;
        }

        public Criteria andSendToUserNotEqualTo(Integer value) {
            addCriterion("Send_to_user <>", value, "sendToUser");
            return (Criteria) this;
        }

        public Criteria andSendToUserGreaterThan(Integer value) {
            addCriterion("Send_to_user >", value, "sendToUser");
            return (Criteria) this;
        }

        public Criteria andSendToUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("Send_to_user >=", value, "sendToUser");
            return (Criteria) this;
        }

        public Criteria andSendToUserLessThan(Integer value) {
            addCriterion("Send_to_user <", value, "sendToUser");
            return (Criteria) this;
        }

        public Criteria andSendToUserLessThanOrEqualTo(Integer value) {
            addCriterion("Send_to_user <=", value, "sendToUser");
            return (Criteria) this;
        }

        public Criteria andSendToUserIn(List<Integer> values) {
            addCriterion("Send_to_user in", values, "sendToUser");
            return (Criteria) this;
        }

        public Criteria andSendToUserNotIn(List<Integer> values) {
            addCriterion("Send_to_user not in", values, "sendToUser");
            return (Criteria) this;
        }

        public Criteria andSendToUserBetween(Integer value1, Integer value2) {
            addCriterion("Send_to_user between", value1, value2, "sendToUser");
            return (Criteria) this;
        }

        public Criteria andSendToUserNotBetween(Integer value1, Integer value2) {
            addCriterion("Send_to_user not between", value1, value2, "sendToUser");
            return (Criteria) this;
        }

        public Criteria andStatusApproveIsNull() {
            addCriterion("status_approve is null");
            return (Criteria) this;
        }

        public Criteria andStatusApproveIsNotNull() {
            addCriterion("status_approve is not null");
            return (Criteria) this;
        }

        public Criteria andStatusApproveEqualTo(Integer value) {
            addCriterion("status_approve =", value, "statusApprove");
            return (Criteria) this;
        }

        public Criteria andStatusApproveNotEqualTo(Integer value) {
            addCriterion("status_approve <>", value, "statusApprove");
            return (Criteria) this;
        }

        public Criteria andStatusApproveGreaterThan(Integer value) {
            addCriterion("status_approve >", value, "statusApprove");
            return (Criteria) this;
        }

        public Criteria andStatusApproveGreaterThanOrEqualTo(Integer value) {
            addCriterion("status_approve >=", value, "statusApprove");
            return (Criteria) this;
        }

        public Criteria andStatusApproveLessThan(Integer value) {
            addCriterion("status_approve <", value, "statusApprove");
            return (Criteria) this;
        }

        public Criteria andStatusApproveLessThanOrEqualTo(Integer value) {
            addCriterion("status_approve <=", value, "statusApprove");
            return (Criteria) this;
        }

        public Criteria andStatusApproveIn(List<Integer> values) {
            addCriterion("status_approve in", values, "statusApprove");
            return (Criteria) this;
        }

        public Criteria andStatusApproveNotIn(List<Integer> values) {
            addCriterion("status_approve not in", values, "statusApprove");
            return (Criteria) this;
        }

        public Criteria andStatusApproveBetween(Integer value1, Integer value2) {
            addCriterion("status_approve between", value1, value2, "statusApprove");
            return (Criteria) this;
        }

        public Criteria andStatusApproveNotBetween(Integer value1, Integer value2) {
            addCriterion("status_approve not between", value1, value2, "statusApprove");
            return (Criteria) this;
        }

        public Criteria andSendDateTimeIsNull() {
            addCriterion("send_date_time is null");
            return (Criteria) this;
        }

        public Criteria andSendDateTimeIsNotNull() {
            addCriterion("send_date_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendDateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("send_date_time =", value, "sendDateTime");
            return (Criteria) this;
        }

        public Criteria andSendDateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("send_date_time <>", value, "sendDateTime");
            return (Criteria) this;
        }

        public Criteria andSendDateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("send_date_time >", value, "sendDateTime");
            return (Criteria) this;
        }

        public Criteria andSendDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("send_date_time >=", value, "sendDateTime");
            return (Criteria) this;
        }

        public Criteria andSendDateTimeLessThan(Date value) {
            addCriterionForJDBCDate("send_date_time <", value, "sendDateTime");
            return (Criteria) this;
        }

        public Criteria andSendDateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("send_date_time <=", value, "sendDateTime");
            return (Criteria) this;
        }

        public Criteria andSendDateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("send_date_time in", values, "sendDateTime");
            return (Criteria) this;
        }

        public Criteria andSendDateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("send_date_time not in", values, "sendDateTime");
            return (Criteria) this;
        }

        public Criteria andSendDateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("send_date_time between", value1, value2, "sendDateTime");
            return (Criteria) this;
        }

        public Criteria andSendDateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("send_date_time not between", value1, value2, "sendDateTime");
            return (Criteria) this;
        }

        public Criteria andSendToApprovecolIsNull() {
            addCriterion("Send_to_approvecol is null");
            return (Criteria) this;
        }

        public Criteria andSendToApprovecolIsNotNull() {
            addCriterion("Send_to_approvecol is not null");
            return (Criteria) this;
        }

        public Criteria andSendToApprovecolEqualTo(String value) {
            addCriterion("Send_to_approvecol =", value, "sendToApprovecol");
            return (Criteria) this;
        }

        public Criteria andSendToApprovecolNotEqualTo(String value) {
            addCriterion("Send_to_approvecol <>", value, "sendToApprovecol");
            return (Criteria) this;
        }

        public Criteria andSendToApprovecolGreaterThan(String value) {
            addCriterion("Send_to_approvecol >", value, "sendToApprovecol");
            return (Criteria) this;
        }

        public Criteria andSendToApprovecolGreaterThanOrEqualTo(String value) {
            addCriterion("Send_to_approvecol >=", value, "sendToApprovecol");
            return (Criteria) this;
        }

        public Criteria andSendToApprovecolLessThan(String value) {
            addCriterion("Send_to_approvecol <", value, "sendToApprovecol");
            return (Criteria) this;
        }

        public Criteria andSendToApprovecolLessThanOrEqualTo(String value) {
            addCriterion("Send_to_approvecol <=", value, "sendToApprovecol");
            return (Criteria) this;
        }

        public Criteria andSendToApprovecolLike(String value) {
            addCriterion("Send_to_approvecol like", value, "sendToApprovecol");
            return (Criteria) this;
        }

        public Criteria andSendToApprovecolNotLike(String value) {
            addCriterion("Send_to_approvecol not like", value, "sendToApprovecol");
            return (Criteria) this;
        }

        public Criteria andSendToApprovecolIn(List<String> values) {
            addCriterion("Send_to_approvecol in", values, "sendToApprovecol");
            return (Criteria) this;
        }

        public Criteria andSendToApprovecolNotIn(List<String> values) {
            addCriterion("Send_to_approvecol not in", values, "sendToApprovecol");
            return (Criteria) this;
        }

        public Criteria andSendToApprovecolBetween(String value1, String value2) {
            addCriterion("Send_to_approvecol between", value1, value2, "sendToApprovecol");
            return (Criteria) this;
        }

        public Criteria andSendToApprovecolNotBetween(String value1, String value2) {
            addCriterion("Send_to_approvecol not between", value1, value2, "sendToApprovecol");
            return (Criteria) this;
        }

        public Criteria andSendByUserIsNull() {
            addCriterion("Send_by_user is null");
            return (Criteria) this;
        }

        public Criteria andSendByUserIsNotNull() {
            addCriterion("Send_by_user is not null");
            return (Criteria) this;
        }

        public Criteria andSendByUserEqualTo(Integer value) {
            addCriterion("Send_by_user =", value, "sendByUser");
            return (Criteria) this;
        }

        public Criteria andSendByUserNotEqualTo(Integer value) {
            addCriterion("Send_by_user <>", value, "sendByUser");
            return (Criteria) this;
        }

        public Criteria andSendByUserGreaterThan(Integer value) {
            addCriterion("Send_by_user >", value, "sendByUser");
            return (Criteria) this;
        }

        public Criteria andSendByUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("Send_by_user >=", value, "sendByUser");
            return (Criteria) this;
        }

        public Criteria andSendByUserLessThan(Integer value) {
            addCriterion("Send_by_user <", value, "sendByUser");
            return (Criteria) this;
        }

        public Criteria andSendByUserLessThanOrEqualTo(Integer value) {
            addCriterion("Send_by_user <=", value, "sendByUser");
            return (Criteria) this;
        }

        public Criteria andSendByUserIn(List<Integer> values) {
            addCriterion("Send_by_user in", values, "sendByUser");
            return (Criteria) this;
        }

        public Criteria andSendByUserNotIn(List<Integer> values) {
            addCriterion("Send_by_user not in", values, "sendByUser");
            return (Criteria) this;
        }

        public Criteria andSendByUserBetween(Integer value1, Integer value2) {
            addCriterion("Send_by_user between", value1, value2, "sendByUser");
            return (Criteria) this;
        }

        public Criteria andSendByUserNotBetween(Integer value1, Integer value2) {
            addCriterion("Send_by_user not between", value1, value2, "sendByUser");
            return (Criteria) this;
        }

        public Criteria andApplicationIdIsNull() {
            addCriterion("Application_id is null");
            return (Criteria) this;
        }

        public Criteria andApplicationIdIsNotNull() {
            addCriterion("Application_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationIdEqualTo(Integer value) {
            addCriterion("Application_id =", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotEqualTo(Integer value) {
            addCriterion("Application_id <>", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdGreaterThan(Integer value) {
            addCriterion("Application_id >", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Application_id >=", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdLessThan(Integer value) {
            addCriterion("Application_id <", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdLessThanOrEqualTo(Integer value) {
            addCriterion("Application_id <=", value, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdIn(List<Integer> values) {
            addCriterion("Application_id in", values, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotIn(List<Integer> values) {
            addCriterion("Application_id not in", values, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdBetween(Integer value1, Integer value2) {
            addCriterion("Application_id between", value1, value2, "applicationId");
            return (Criteria) this;
        }

        public Criteria andApplicationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Application_id not between", value1, value2, "applicationId");
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