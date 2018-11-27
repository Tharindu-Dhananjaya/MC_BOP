package mc.kurunegala.bop.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andIduserIsNull() {
            addCriterion("idUser is null");
            return (Criteria) this;
        }

        public Criteria andIduserIsNotNull() {
            addCriterion("idUser is not null");
            return (Criteria) this;
        }

        public Criteria andIduserEqualTo(Integer value) {
            addCriterion("idUser =", value, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserNotEqualTo(Integer value) {
            addCriterion("idUser <>", value, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserGreaterThan(Integer value) {
            addCriterion("idUser >", value, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserGreaterThanOrEqualTo(Integer value) {
            addCriterion("idUser >=", value, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserLessThan(Integer value) {
            addCriterion("idUser <", value, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserLessThanOrEqualTo(Integer value) {
            addCriterion("idUser <=", value, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserIn(List<Integer> values) {
            addCriterion("idUser in", values, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserNotIn(List<Integer> values) {
            addCriterion("idUser not in", values, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserBetween(Integer value1, Integer value2) {
            addCriterion("idUser between", value1, value2, "iduser");
            return (Criteria) this;
        }

        public Criteria andIduserNotBetween(Integer value1, Integer value2) {
            addCriterion("idUser not between", value1, value2, "iduser");
            return (Criteria) this;
        }

        public Criteria andUserFullNameIsNull() {
            addCriterion("user_full_name is null");
            return (Criteria) this;
        }

        public Criteria andUserFullNameIsNotNull() {
            addCriterion("user_full_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserFullNameEqualTo(String value) {
            addCriterion("user_full_name =", value, "userFullName");
            return (Criteria) this;
        }

        public Criteria andUserFullNameNotEqualTo(String value) {
            addCriterion("user_full_name <>", value, "userFullName");
            return (Criteria) this;
        }

        public Criteria andUserFullNameGreaterThan(String value) {
            addCriterion("user_full_name >", value, "userFullName");
            return (Criteria) this;
        }

        public Criteria andUserFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_full_name >=", value, "userFullName");
            return (Criteria) this;
        }

        public Criteria andUserFullNameLessThan(String value) {
            addCriterion("user_full_name <", value, "userFullName");
            return (Criteria) this;
        }

        public Criteria andUserFullNameLessThanOrEqualTo(String value) {
            addCriterion("user_full_name <=", value, "userFullName");
            return (Criteria) this;
        }

        public Criteria andUserFullNameLike(String value) {
            addCriterion("user_full_name like", value, "userFullName");
            return (Criteria) this;
        }

        public Criteria andUserFullNameNotLike(String value) {
            addCriterion("user_full_name not like", value, "userFullName");
            return (Criteria) this;
        }

        public Criteria andUserFullNameIn(List<String> values) {
            addCriterion("user_full_name in", values, "userFullName");
            return (Criteria) this;
        }

        public Criteria andUserFullNameNotIn(List<String> values) {
            addCriterion("user_full_name not in", values, "userFullName");
            return (Criteria) this;
        }

        public Criteria andUserFullNameBetween(String value1, String value2) {
            addCriterion("user_full_name between", value1, value2, "userFullName");
            return (Criteria) this;
        }

        public Criteria andUserFullNameNotBetween(String value1, String value2) {
            addCriterion("user_full_name not between", value1, value2, "userFullName");
            return (Criteria) this;
        }

        public Criteria andUserNicIsNull() {
            addCriterion("user_nic is null");
            return (Criteria) this;
        }

        public Criteria andUserNicIsNotNull() {
            addCriterion("user_nic is not null");
            return (Criteria) this;
        }

        public Criteria andUserNicEqualTo(String value) {
            addCriterion("user_nic =", value, "userNic");
            return (Criteria) this;
        }

        public Criteria andUserNicNotEqualTo(String value) {
            addCriterion("user_nic <>", value, "userNic");
            return (Criteria) this;
        }

        public Criteria andUserNicGreaterThan(String value) {
            addCriterion("user_nic >", value, "userNic");
            return (Criteria) this;
        }

        public Criteria andUserNicGreaterThanOrEqualTo(String value) {
            addCriterion("user_nic >=", value, "userNic");
            return (Criteria) this;
        }

        public Criteria andUserNicLessThan(String value) {
            addCriterion("user_nic <", value, "userNic");
            return (Criteria) this;
        }

        public Criteria andUserNicLessThanOrEqualTo(String value) {
            addCriterion("user_nic <=", value, "userNic");
            return (Criteria) this;
        }

        public Criteria andUserNicLike(String value) {
            addCriterion("user_nic like", value, "userNic");
            return (Criteria) this;
        }

        public Criteria andUserNicNotLike(String value) {
            addCriterion("user_nic not like", value, "userNic");
            return (Criteria) this;
        }

        public Criteria andUserNicIn(List<String> values) {
            addCriterion("user_nic in", values, "userNic");
            return (Criteria) this;
        }

        public Criteria andUserNicNotIn(List<String> values) {
            addCriterion("user_nic not in", values, "userNic");
            return (Criteria) this;
        }

        public Criteria andUserNicBetween(String value1, String value2) {
            addCriterion("user_nic between", value1, value2, "userNic");
            return (Criteria) this;
        }

        public Criteria andUserNicNotBetween(String value1, String value2) {
            addCriterion("user_nic not between", value1, value2, "userNic");
            return (Criteria) this;
        }

        public Criteria andUserDateIsNull() {
            addCriterion("user_date is null");
            return (Criteria) this;
        }

        public Criteria andUserDateIsNotNull() {
            addCriterion("user_date is not null");
            return (Criteria) this;
        }

        public Criteria andUserDateEqualTo(Date value) {
            addCriterionForJDBCDate("user_date =", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("user_date <>", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateGreaterThan(Date value) {
            addCriterionForJDBCDate("user_date >", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_date >=", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateLessThan(Date value) {
            addCriterionForJDBCDate("user_date <", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_date <=", value, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateIn(List<Date> values) {
            addCriterionForJDBCDate("user_date in", values, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("user_date not in", values, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_date between", value1, value2, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_date not between", value1, value2, "userDate");
            return (Criteria) this;
        }

        public Criteria andUserBirthDayIsNull() {
            addCriterion("user_birth_day is null");
            return (Criteria) this;
        }

        public Criteria andUserBirthDayIsNotNull() {
            addCriterion("user_birth_day is not null");
            return (Criteria) this;
        }

        public Criteria andUserBirthDayEqualTo(Date value) {
            addCriterionForJDBCDate("user_birth_day =", value, "userBirthDay");
            return (Criteria) this;
        }

        public Criteria andUserBirthDayNotEqualTo(Date value) {
            addCriterionForJDBCDate("user_birth_day <>", value, "userBirthDay");
            return (Criteria) this;
        }

        public Criteria andUserBirthDayGreaterThan(Date value) {
            addCriterionForJDBCDate("user_birth_day >", value, "userBirthDay");
            return (Criteria) this;
        }

        public Criteria andUserBirthDayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_birth_day >=", value, "userBirthDay");
            return (Criteria) this;
        }

        public Criteria andUserBirthDayLessThan(Date value) {
            addCriterionForJDBCDate("user_birth_day <", value, "userBirthDay");
            return (Criteria) this;
        }

        public Criteria andUserBirthDayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_birth_day <=", value, "userBirthDay");
            return (Criteria) this;
        }

        public Criteria andUserBirthDayIn(List<Date> values) {
            addCriterionForJDBCDate("user_birth_day in", values, "userBirthDay");
            return (Criteria) this;
        }

        public Criteria andUserBirthDayNotIn(List<Date> values) {
            addCriterionForJDBCDate("user_birth_day not in", values, "userBirthDay");
            return (Criteria) this;
        }

        public Criteria andUserBirthDayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_birth_day between", value1, value2, "userBirthDay");
            return (Criteria) this;
        }

        public Criteria andUserBirthDayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_birth_day not between", value1, value2, "userBirthDay");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNull() {
            addCriterion("user_status is null");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNotNull() {
            addCriterion("user_status is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatusEqualTo(Integer value) {
            addCriterion("user_status =", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotEqualTo(Integer value) {
            addCriterion("user_status <>", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThan(Integer value) {
            addCriterion("user_status >", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_status >=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThan(Integer value) {
            addCriterion("user_status <", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThanOrEqualTo(Integer value) {
            addCriterion("user_status <=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusIn(List<Integer> values) {
            addCriterion("user_status in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotIn(List<Integer> values) {
            addCriterion("user_status not in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusBetween(Integer value1, Integer value2) {
            addCriterion("user_status between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("user_status not between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserSynIsNull() {
            addCriterion("user_syn is null");
            return (Criteria) this;
        }

        public Criteria andUserSynIsNotNull() {
            addCriterion("user_syn is not null");
            return (Criteria) this;
        }

        public Criteria andUserSynEqualTo(Integer value) {
            addCriterion("user_syn =", value, "userSyn");
            return (Criteria) this;
        }

        public Criteria andUserSynNotEqualTo(Integer value) {
            addCriterion("user_syn <>", value, "userSyn");
            return (Criteria) this;
        }

        public Criteria andUserSynGreaterThan(Integer value) {
            addCriterion("user_syn >", value, "userSyn");
            return (Criteria) this;
        }

        public Criteria andUserSynGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_syn >=", value, "userSyn");
            return (Criteria) this;
        }

        public Criteria andUserSynLessThan(Integer value) {
            addCriterion("user_syn <", value, "userSyn");
            return (Criteria) this;
        }

        public Criteria andUserSynLessThanOrEqualTo(Integer value) {
            addCriterion("user_syn <=", value, "userSyn");
            return (Criteria) this;
        }

        public Criteria andUserSynIn(List<Integer> values) {
            addCriterion("user_syn in", values, "userSyn");
            return (Criteria) this;
        }

        public Criteria andUserSynNotIn(List<Integer> values) {
            addCriterion("user_syn not in", values, "userSyn");
            return (Criteria) this;
        }

        public Criteria andUserSynBetween(Integer value1, Integer value2) {
            addCriterion("user_syn between", value1, value2, "userSyn");
            return (Criteria) this;
        }

        public Criteria andUserSynNotBetween(Integer value1, Integer value2) {
            addCriterion("user_syn not between", value1, value2, "userSyn");
            return (Criteria) this;
        }

        public Criteria andUserQuestionIsNull() {
            addCriterion("user_question is null");
            return (Criteria) this;
        }

        public Criteria andUserQuestionIsNotNull() {
            addCriterion("user_question is not null");
            return (Criteria) this;
        }

        public Criteria andUserQuestionEqualTo(String value) {
            addCriterion("user_question =", value, "userQuestion");
            return (Criteria) this;
        }

        public Criteria andUserQuestionNotEqualTo(String value) {
            addCriterion("user_question <>", value, "userQuestion");
            return (Criteria) this;
        }

        public Criteria andUserQuestionGreaterThan(String value) {
            addCriterion("user_question >", value, "userQuestion");
            return (Criteria) this;
        }

        public Criteria andUserQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("user_question >=", value, "userQuestion");
            return (Criteria) this;
        }

        public Criteria andUserQuestionLessThan(String value) {
            addCriterion("user_question <", value, "userQuestion");
            return (Criteria) this;
        }

        public Criteria andUserQuestionLessThanOrEqualTo(String value) {
            addCriterion("user_question <=", value, "userQuestion");
            return (Criteria) this;
        }

        public Criteria andUserQuestionLike(String value) {
            addCriterion("user_question like", value, "userQuestion");
            return (Criteria) this;
        }

        public Criteria andUserQuestionNotLike(String value) {
            addCriterion("user_question not like", value, "userQuestion");
            return (Criteria) this;
        }

        public Criteria andUserQuestionIn(List<String> values) {
            addCriterion("user_question in", values, "userQuestion");
            return (Criteria) this;
        }

        public Criteria andUserQuestionNotIn(List<String> values) {
            addCriterion("user_question not in", values, "userQuestion");
            return (Criteria) this;
        }

        public Criteria andUserQuestionBetween(String value1, String value2) {
            addCriterion("user_question between", value1, value2, "userQuestion");
            return (Criteria) this;
        }

        public Criteria andUserQuestionNotBetween(String value1, String value2) {
            addCriterion("user_question not between", value1, value2, "userQuestion");
            return (Criteria) this;
        }

        public Criteria andUserAnswerIsNull() {
            addCriterion("user_answer is null");
            return (Criteria) this;
        }

        public Criteria andUserAnswerIsNotNull() {
            addCriterion("user_answer is not null");
            return (Criteria) this;
        }

        public Criteria andUserAnswerEqualTo(String value) {
            addCriterion("user_answer =", value, "userAnswer");
            return (Criteria) this;
        }

        public Criteria andUserAnswerNotEqualTo(String value) {
            addCriterion("user_answer <>", value, "userAnswer");
            return (Criteria) this;
        }

        public Criteria andUserAnswerGreaterThan(String value) {
            addCriterion("user_answer >", value, "userAnswer");
            return (Criteria) this;
        }

        public Criteria andUserAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("user_answer >=", value, "userAnswer");
            return (Criteria) this;
        }

        public Criteria andUserAnswerLessThan(String value) {
            addCriterion("user_answer <", value, "userAnswer");
            return (Criteria) this;
        }

        public Criteria andUserAnswerLessThanOrEqualTo(String value) {
            addCriterion("user_answer <=", value, "userAnswer");
            return (Criteria) this;
        }

        public Criteria andUserAnswerLike(String value) {
            addCriterion("user_answer like", value, "userAnswer");
            return (Criteria) this;
        }

        public Criteria andUserAnswerNotLike(String value) {
            addCriterion("user_answer not like", value, "userAnswer");
            return (Criteria) this;
        }

        public Criteria andUserAnswerIn(List<String> values) {
            addCriterion("user_answer in", values, "userAnswer");
            return (Criteria) this;
        }

        public Criteria andUserAnswerNotIn(List<String> values) {
            addCriterion("user_answer not in", values, "userAnswer");
            return (Criteria) this;
        }

        public Criteria andUserAnswerBetween(String value1, String value2) {
            addCriterion("user_answer between", value1, value2, "userAnswer");
            return (Criteria) this;
        }

        public Criteria andUserAnswerNotBetween(String value1, String value2) {
            addCriterion("user_answer not between", value1, value2, "userAnswer");
            return (Criteria) this;
        }

        public Criteria andUserUsernameIsNull() {
            addCriterion("user_username is null");
            return (Criteria) this;
        }

        public Criteria andUserUsernameIsNotNull() {
            addCriterion("user_username is not null");
            return (Criteria) this;
        }

        public Criteria andUserUsernameEqualTo(String value) {
            addCriterion("user_username =", value, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameNotEqualTo(String value) {
            addCriterion("user_username <>", value, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameGreaterThan(String value) {
            addCriterion("user_username >", value, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("user_username >=", value, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameLessThan(String value) {
            addCriterion("user_username <", value, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameLessThanOrEqualTo(String value) {
            addCriterion("user_username <=", value, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameLike(String value) {
            addCriterion("user_username like", value, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameNotLike(String value) {
            addCriterion("user_username not like", value, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameIn(List<String> values) {
            addCriterion("user_username in", values, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameNotIn(List<String> values) {
            addCriterion("user_username not in", values, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameBetween(String value1, String value2) {
            addCriterion("user_username between", value1, value2, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserUsernameNotBetween(String value1, String value2) {
            addCriterion("user_username not between", value1, value2, "userUsername");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
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