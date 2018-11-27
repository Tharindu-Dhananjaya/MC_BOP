package mc.kurunegala.bop.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        public Criteria andIdcustomerIsNull() {
            addCriterion("idCustomer is null");
            return (Criteria) this;
        }

        public Criteria andIdcustomerIsNotNull() {
            addCriterion("idCustomer is not null");
            return (Criteria) this;
        }

        public Criteria andIdcustomerEqualTo(Integer value) {
            addCriterion("idCustomer =", value, "idcustomer");
            return (Criteria) this;
        }

        public Criteria andIdcustomerNotEqualTo(Integer value) {
            addCriterion("idCustomer <>", value, "idcustomer");
            return (Criteria) this;
        }

        public Criteria andIdcustomerGreaterThan(Integer value) {
            addCriterion("idCustomer >", value, "idcustomer");
            return (Criteria) this;
        }

        public Criteria andIdcustomerGreaterThanOrEqualTo(Integer value) {
            addCriterion("idCustomer >=", value, "idcustomer");
            return (Criteria) this;
        }

        public Criteria andIdcustomerLessThan(Integer value) {
            addCriterion("idCustomer <", value, "idcustomer");
            return (Criteria) this;
        }

        public Criteria andIdcustomerLessThanOrEqualTo(Integer value) {
            addCriterion("idCustomer <=", value, "idcustomer");
            return (Criteria) this;
        }

        public Criteria andIdcustomerIn(List<Integer> values) {
            addCriterion("idCustomer in", values, "idcustomer");
            return (Criteria) this;
        }

        public Criteria andIdcustomerNotIn(List<Integer> values) {
            addCriterion("idCustomer not in", values, "idcustomer");
            return (Criteria) this;
        }

        public Criteria andIdcustomerBetween(Integer value1, Integer value2) {
            addCriterion("idCustomer between", value1, value2, "idcustomer");
            return (Criteria) this;
        }

        public Criteria andIdcustomerNotBetween(Integer value1, Integer value2) {
            addCriterion("idCustomer not between", value1, value2, "idcustomer");
            return (Criteria) this;
        }

        public Criteria andCusNameIsNull() {
            addCriterion("cus_name is null");
            return (Criteria) this;
        }

        public Criteria andCusNameIsNotNull() {
            addCriterion("cus_name is not null");
            return (Criteria) this;
        }

        public Criteria andCusNameEqualTo(String value) {
            addCriterion("cus_name =", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotEqualTo(String value) {
            addCriterion("cus_name <>", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameGreaterThan(String value) {
            addCriterion("cus_name >", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameGreaterThanOrEqualTo(String value) {
            addCriterion("cus_name >=", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLessThan(String value) {
            addCriterion("cus_name <", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLessThanOrEqualTo(String value) {
            addCriterion("cus_name <=", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameLike(String value) {
            addCriterion("cus_name like", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotLike(String value) {
            addCriterion("cus_name not like", value, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameIn(List<String> values) {
            addCriterion("cus_name in", values, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotIn(List<String> values) {
            addCriterion("cus_name not in", values, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameBetween(String value1, String value2) {
            addCriterion("cus_name between", value1, value2, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNameNotBetween(String value1, String value2) {
            addCriterion("cus_name not between", value1, value2, "cusName");
            return (Criteria) this;
        }

        public Criteria andCusNicIsNull() {
            addCriterion("cus_nic is null");
            return (Criteria) this;
        }

        public Criteria andCusNicIsNotNull() {
            addCriterion("cus_nic is not null");
            return (Criteria) this;
        }

        public Criteria andCusNicEqualTo(String value) {
            addCriterion("cus_nic =", value, "cusNic");
            return (Criteria) this;
        }

        public Criteria andCusNicNotEqualTo(String value) {
            addCriterion("cus_nic <>", value, "cusNic");
            return (Criteria) this;
        }

        public Criteria andCusNicGreaterThan(String value) {
            addCriterion("cus_nic >", value, "cusNic");
            return (Criteria) this;
        }

        public Criteria andCusNicGreaterThanOrEqualTo(String value) {
            addCriterion("cus_nic >=", value, "cusNic");
            return (Criteria) this;
        }

        public Criteria andCusNicLessThan(String value) {
            addCriterion("cus_nic <", value, "cusNic");
            return (Criteria) this;
        }

        public Criteria andCusNicLessThanOrEqualTo(String value) {
            addCriterion("cus_nic <=", value, "cusNic");
            return (Criteria) this;
        }

        public Criteria andCusNicLike(String value) {
            addCriterion("cus_nic like", value, "cusNic");
            return (Criteria) this;
        }

        public Criteria andCusNicNotLike(String value) {
            addCriterion("cus_nic not like", value, "cusNic");
            return (Criteria) this;
        }

        public Criteria andCusNicIn(List<String> values) {
            addCriterion("cus_nic in", values, "cusNic");
            return (Criteria) this;
        }

        public Criteria andCusNicNotIn(List<String> values) {
            addCriterion("cus_nic not in", values, "cusNic");
            return (Criteria) this;
        }

        public Criteria andCusNicBetween(String value1, String value2) {
            addCriterion("cus_nic between", value1, value2, "cusNic");
            return (Criteria) this;
        }

        public Criteria andCusNicNotBetween(String value1, String value2) {
            addCriterion("cus_nic not between", value1, value2, "cusNic");
            return (Criteria) this;
        }

        public Criteria andCusMobileIsNull() {
            addCriterion("cus_mobile is null");
            return (Criteria) this;
        }

        public Criteria andCusMobileIsNotNull() {
            addCriterion("cus_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andCusMobileEqualTo(String value) {
            addCriterion("cus_mobile =", value, "cusMobile");
            return (Criteria) this;
        }

        public Criteria andCusMobileNotEqualTo(String value) {
            addCriterion("cus_mobile <>", value, "cusMobile");
            return (Criteria) this;
        }

        public Criteria andCusMobileGreaterThan(String value) {
            addCriterion("cus_mobile >", value, "cusMobile");
            return (Criteria) this;
        }

        public Criteria andCusMobileGreaterThanOrEqualTo(String value) {
            addCriterion("cus_mobile >=", value, "cusMobile");
            return (Criteria) this;
        }

        public Criteria andCusMobileLessThan(String value) {
            addCriterion("cus_mobile <", value, "cusMobile");
            return (Criteria) this;
        }

        public Criteria andCusMobileLessThanOrEqualTo(String value) {
            addCriterion("cus_mobile <=", value, "cusMobile");
            return (Criteria) this;
        }

        public Criteria andCusMobileLike(String value) {
            addCriterion("cus_mobile like", value, "cusMobile");
            return (Criteria) this;
        }

        public Criteria andCusMobileNotLike(String value) {
            addCriterion("cus_mobile not like", value, "cusMobile");
            return (Criteria) this;
        }

        public Criteria andCusMobileIn(List<String> values) {
            addCriterion("cus_mobile in", values, "cusMobile");
            return (Criteria) this;
        }

        public Criteria andCusMobileNotIn(List<String> values) {
            addCriterion("cus_mobile not in", values, "cusMobile");
            return (Criteria) this;
        }

        public Criteria andCusMobileBetween(String value1, String value2) {
            addCriterion("cus_mobile between", value1, value2, "cusMobile");
            return (Criteria) this;
        }

        public Criteria andCusMobileNotBetween(String value1, String value2) {
            addCriterion("cus_mobile not between", value1, value2, "cusMobile");
            return (Criteria) this;
        }

        public Criteria andCusTelIsNull() {
            addCriterion("cus_tel is null");
            return (Criteria) this;
        }

        public Criteria andCusTelIsNotNull() {
            addCriterion("cus_tel is not null");
            return (Criteria) this;
        }

        public Criteria andCusTelEqualTo(String value) {
            addCriterion("cus_tel =", value, "cusTel");
            return (Criteria) this;
        }

        public Criteria andCusTelNotEqualTo(String value) {
            addCriterion("cus_tel <>", value, "cusTel");
            return (Criteria) this;
        }

        public Criteria andCusTelGreaterThan(String value) {
            addCriterion("cus_tel >", value, "cusTel");
            return (Criteria) this;
        }

        public Criteria andCusTelGreaterThanOrEqualTo(String value) {
            addCriterion("cus_tel >=", value, "cusTel");
            return (Criteria) this;
        }

        public Criteria andCusTelLessThan(String value) {
            addCriterion("cus_tel <", value, "cusTel");
            return (Criteria) this;
        }

        public Criteria andCusTelLessThanOrEqualTo(String value) {
            addCriterion("cus_tel <=", value, "cusTel");
            return (Criteria) this;
        }

        public Criteria andCusTelLike(String value) {
            addCriterion("cus_tel like", value, "cusTel");
            return (Criteria) this;
        }

        public Criteria andCusTelNotLike(String value) {
            addCriterion("cus_tel not like", value, "cusTel");
            return (Criteria) this;
        }

        public Criteria andCusTelIn(List<String> values) {
            addCriterion("cus_tel in", values, "cusTel");
            return (Criteria) this;
        }

        public Criteria andCusTelNotIn(List<String> values) {
            addCriterion("cus_tel not in", values, "cusTel");
            return (Criteria) this;
        }

        public Criteria andCusTelBetween(String value1, String value2) {
            addCriterion("cus_tel between", value1, value2, "cusTel");
            return (Criteria) this;
        }

        public Criteria andCusTelNotBetween(String value1, String value2) {
            addCriterion("cus_tel not between", value1, value2, "cusTel");
            return (Criteria) this;
        }

        public Criteria andCusAddressL1IsNull() {
            addCriterion("cus_address_l1 is null");
            return (Criteria) this;
        }

        public Criteria andCusAddressL1IsNotNull() {
            addCriterion("cus_address_l1 is not null");
            return (Criteria) this;
        }

        public Criteria andCusAddressL1EqualTo(String value) {
            addCriterion("cus_address_l1 =", value, "cusAddressL1");
            return (Criteria) this;
        }

        public Criteria andCusAddressL1NotEqualTo(String value) {
            addCriterion("cus_address_l1 <>", value, "cusAddressL1");
            return (Criteria) this;
        }

        public Criteria andCusAddressL1GreaterThan(String value) {
            addCriterion("cus_address_l1 >", value, "cusAddressL1");
            return (Criteria) this;
        }

        public Criteria andCusAddressL1GreaterThanOrEqualTo(String value) {
            addCriterion("cus_address_l1 >=", value, "cusAddressL1");
            return (Criteria) this;
        }

        public Criteria andCusAddressL1LessThan(String value) {
            addCriterion("cus_address_l1 <", value, "cusAddressL1");
            return (Criteria) this;
        }

        public Criteria andCusAddressL1LessThanOrEqualTo(String value) {
            addCriterion("cus_address_l1 <=", value, "cusAddressL1");
            return (Criteria) this;
        }

        public Criteria andCusAddressL1Like(String value) {
            addCriterion("cus_address_l1 like", value, "cusAddressL1");
            return (Criteria) this;
        }

        public Criteria andCusAddressL1NotLike(String value) {
            addCriterion("cus_address_l1 not like", value, "cusAddressL1");
            return (Criteria) this;
        }

        public Criteria andCusAddressL1In(List<String> values) {
            addCriterion("cus_address_l1 in", values, "cusAddressL1");
            return (Criteria) this;
        }

        public Criteria andCusAddressL1NotIn(List<String> values) {
            addCriterion("cus_address_l1 not in", values, "cusAddressL1");
            return (Criteria) this;
        }

        public Criteria andCusAddressL1Between(String value1, String value2) {
            addCriterion("cus_address_l1 between", value1, value2, "cusAddressL1");
            return (Criteria) this;
        }

        public Criteria andCusAddressL1NotBetween(String value1, String value2) {
            addCriterion("cus_address_l1 not between", value1, value2, "cusAddressL1");
            return (Criteria) this;
        }

        public Criteria andCusAddressL2IsNull() {
            addCriterion("cus_address_l2 is null");
            return (Criteria) this;
        }

        public Criteria andCusAddressL2IsNotNull() {
            addCriterion("cus_address_l2 is not null");
            return (Criteria) this;
        }

        public Criteria andCusAddressL2EqualTo(String value) {
            addCriterion("cus_address_l2 =", value, "cusAddressL2");
            return (Criteria) this;
        }

        public Criteria andCusAddressL2NotEqualTo(String value) {
            addCriterion("cus_address_l2 <>", value, "cusAddressL2");
            return (Criteria) this;
        }

        public Criteria andCusAddressL2GreaterThan(String value) {
            addCriterion("cus_address_l2 >", value, "cusAddressL2");
            return (Criteria) this;
        }

        public Criteria andCusAddressL2GreaterThanOrEqualTo(String value) {
            addCriterion("cus_address_l2 >=", value, "cusAddressL2");
            return (Criteria) this;
        }

        public Criteria andCusAddressL2LessThan(String value) {
            addCriterion("cus_address_l2 <", value, "cusAddressL2");
            return (Criteria) this;
        }

        public Criteria andCusAddressL2LessThanOrEqualTo(String value) {
            addCriterion("cus_address_l2 <=", value, "cusAddressL2");
            return (Criteria) this;
        }

        public Criteria andCusAddressL2Like(String value) {
            addCriterion("cus_address_l2 like", value, "cusAddressL2");
            return (Criteria) this;
        }

        public Criteria andCusAddressL2NotLike(String value) {
            addCriterion("cus_address_l2 not like", value, "cusAddressL2");
            return (Criteria) this;
        }

        public Criteria andCusAddressL2In(List<String> values) {
            addCriterion("cus_address_l2 in", values, "cusAddressL2");
            return (Criteria) this;
        }

        public Criteria andCusAddressL2NotIn(List<String> values) {
            addCriterion("cus_address_l2 not in", values, "cusAddressL2");
            return (Criteria) this;
        }

        public Criteria andCusAddressL2Between(String value1, String value2) {
            addCriterion("cus_address_l2 between", value1, value2, "cusAddressL2");
            return (Criteria) this;
        }

        public Criteria andCusAddressL2NotBetween(String value1, String value2) {
            addCriterion("cus_address_l2 not between", value1, value2, "cusAddressL2");
            return (Criteria) this;
        }

        public Criteria andCusAddressL3IsNull() {
            addCriterion("cus_address_l3 is null");
            return (Criteria) this;
        }

        public Criteria andCusAddressL3IsNotNull() {
            addCriterion("cus_address_l3 is not null");
            return (Criteria) this;
        }

        public Criteria andCusAddressL3EqualTo(String value) {
            addCriterion("cus_address_l3 =", value, "cusAddressL3");
            return (Criteria) this;
        }

        public Criteria andCusAddressL3NotEqualTo(String value) {
            addCriterion("cus_address_l3 <>", value, "cusAddressL3");
            return (Criteria) this;
        }

        public Criteria andCusAddressL3GreaterThan(String value) {
            addCriterion("cus_address_l3 >", value, "cusAddressL3");
            return (Criteria) this;
        }

        public Criteria andCusAddressL3GreaterThanOrEqualTo(String value) {
            addCriterion("cus_address_l3 >=", value, "cusAddressL3");
            return (Criteria) this;
        }

        public Criteria andCusAddressL3LessThan(String value) {
            addCriterion("cus_address_l3 <", value, "cusAddressL3");
            return (Criteria) this;
        }

        public Criteria andCusAddressL3LessThanOrEqualTo(String value) {
            addCriterion("cus_address_l3 <=", value, "cusAddressL3");
            return (Criteria) this;
        }

        public Criteria andCusAddressL3Like(String value) {
            addCriterion("cus_address_l3 like", value, "cusAddressL3");
            return (Criteria) this;
        }

        public Criteria andCusAddressL3NotLike(String value) {
            addCriterion("cus_address_l3 not like", value, "cusAddressL3");
            return (Criteria) this;
        }

        public Criteria andCusAddressL3In(List<String> values) {
            addCriterion("cus_address_l3 in", values, "cusAddressL3");
            return (Criteria) this;
        }

        public Criteria andCusAddressL3NotIn(List<String> values) {
            addCriterion("cus_address_l3 not in", values, "cusAddressL3");
            return (Criteria) this;
        }

        public Criteria andCusAddressL3Between(String value1, String value2) {
            addCriterion("cus_address_l3 between", value1, value2, "cusAddressL3");
            return (Criteria) this;
        }

        public Criteria andCusAddressL3NotBetween(String value1, String value2) {
            addCriterion("cus_address_l3 not between", value1, value2, "cusAddressL3");
            return (Criteria) this;
        }

        public Criteria andCusSityIsNull() {
            addCriterion("cus_sity is null");
            return (Criteria) this;
        }

        public Criteria andCusSityIsNotNull() {
            addCriterion("cus_sity is not null");
            return (Criteria) this;
        }

        public Criteria andCusSityEqualTo(String value) {
            addCriterion("cus_sity =", value, "cusSity");
            return (Criteria) this;
        }

        public Criteria andCusSityNotEqualTo(String value) {
            addCriterion("cus_sity <>", value, "cusSity");
            return (Criteria) this;
        }

        public Criteria andCusSityGreaterThan(String value) {
            addCriterion("cus_sity >", value, "cusSity");
            return (Criteria) this;
        }

        public Criteria andCusSityGreaterThanOrEqualTo(String value) {
            addCriterion("cus_sity >=", value, "cusSity");
            return (Criteria) this;
        }

        public Criteria andCusSityLessThan(String value) {
            addCriterion("cus_sity <", value, "cusSity");
            return (Criteria) this;
        }

        public Criteria andCusSityLessThanOrEqualTo(String value) {
            addCriterion("cus_sity <=", value, "cusSity");
            return (Criteria) this;
        }

        public Criteria andCusSityLike(String value) {
            addCriterion("cus_sity like", value, "cusSity");
            return (Criteria) this;
        }

        public Criteria andCusSityNotLike(String value) {
            addCriterion("cus_sity not like", value, "cusSity");
            return (Criteria) this;
        }

        public Criteria andCusSityIn(List<String> values) {
            addCriterion("cus_sity in", values, "cusSity");
            return (Criteria) this;
        }

        public Criteria andCusSityNotIn(List<String> values) {
            addCriterion("cus_sity not in", values, "cusSity");
            return (Criteria) this;
        }

        public Criteria andCusSityBetween(String value1, String value2) {
            addCriterion("cus_sity between", value1, value2, "cusSity");
            return (Criteria) this;
        }

        public Criteria andCusSityNotBetween(String value1, String value2) {
            addCriterion("cus_sity not between", value1, value2, "cusSity");
            return (Criteria) this;
        }

        public Criteria andCusStatusIsNull() {
            addCriterion("cus_status is null");
            return (Criteria) this;
        }

        public Criteria andCusStatusIsNotNull() {
            addCriterion("cus_status is not null");
            return (Criteria) this;
        }

        public Criteria andCusStatusEqualTo(Integer value) {
            addCriterion("cus_status =", value, "cusStatus");
            return (Criteria) this;
        }

        public Criteria andCusStatusNotEqualTo(Integer value) {
            addCriterion("cus_status <>", value, "cusStatus");
            return (Criteria) this;
        }

        public Criteria andCusStatusGreaterThan(Integer value) {
            addCriterion("cus_status >", value, "cusStatus");
            return (Criteria) this;
        }

        public Criteria andCusStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("cus_status >=", value, "cusStatus");
            return (Criteria) this;
        }

        public Criteria andCusStatusLessThan(Integer value) {
            addCriterion("cus_status <", value, "cusStatus");
            return (Criteria) this;
        }

        public Criteria andCusStatusLessThanOrEqualTo(Integer value) {
            addCriterion("cus_status <=", value, "cusStatus");
            return (Criteria) this;
        }

        public Criteria andCusStatusIn(List<Integer> values) {
            addCriterion("cus_status in", values, "cusStatus");
            return (Criteria) this;
        }

        public Criteria andCusStatusNotIn(List<Integer> values) {
            addCriterion("cus_status not in", values, "cusStatus");
            return (Criteria) this;
        }

        public Criteria andCusStatusBetween(Integer value1, Integer value2) {
            addCriterion("cus_status between", value1, value2, "cusStatus");
            return (Criteria) this;
        }

        public Criteria andCusStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("cus_status not between", value1, value2, "cusStatus");
            return (Criteria) this;
        }

        public Criteria andCusSynIsNull() {
            addCriterion("cus_syn is null");
            return (Criteria) this;
        }

        public Criteria andCusSynIsNotNull() {
            addCriterion("cus_syn is not null");
            return (Criteria) this;
        }

        public Criteria andCusSynEqualTo(Integer value) {
            addCriterion("cus_syn =", value, "cusSyn");
            return (Criteria) this;
        }

        public Criteria andCusSynNotEqualTo(Integer value) {
            addCriterion("cus_syn <>", value, "cusSyn");
            return (Criteria) this;
        }

        public Criteria andCusSynGreaterThan(Integer value) {
            addCriterion("cus_syn >", value, "cusSyn");
            return (Criteria) this;
        }

        public Criteria andCusSynGreaterThanOrEqualTo(Integer value) {
            addCriterion("cus_syn >=", value, "cusSyn");
            return (Criteria) this;
        }

        public Criteria andCusSynLessThan(Integer value) {
            addCriterion("cus_syn <", value, "cusSyn");
            return (Criteria) this;
        }

        public Criteria andCusSynLessThanOrEqualTo(Integer value) {
            addCriterion("cus_syn <=", value, "cusSyn");
            return (Criteria) this;
        }

        public Criteria andCusSynIn(List<Integer> values) {
            addCriterion("cus_syn in", values, "cusSyn");
            return (Criteria) this;
        }

        public Criteria andCusSynNotIn(List<Integer> values) {
            addCriterion("cus_syn not in", values, "cusSyn");
            return (Criteria) this;
        }

        public Criteria andCusSynBetween(Integer value1, Integer value2) {
            addCriterion("cus_syn between", value1, value2, "cusSyn");
            return (Criteria) this;
        }

        public Criteria andCusSynNotBetween(Integer value1, Integer value2) {
            addCriterion("cus_syn not between", value1, value2, "cusSyn");
            return (Criteria) this;
        }

        public Criteria andCusRegDateIsNull() {
            addCriterion("cus_reg_date is null");
            return (Criteria) this;
        }

        public Criteria andCusRegDateIsNotNull() {
            addCriterion("cus_reg_date is not null");
            return (Criteria) this;
        }

        public Criteria andCusRegDateEqualTo(Date value) {
            addCriterionForJDBCDate("cus_reg_date =", value, "cusRegDate");
            return (Criteria) this;
        }

        public Criteria andCusRegDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("cus_reg_date <>", value, "cusRegDate");
            return (Criteria) this;
        }

        public Criteria andCusRegDateGreaterThan(Date value) {
            addCriterionForJDBCDate("cus_reg_date >", value, "cusRegDate");
            return (Criteria) this;
        }

        public Criteria andCusRegDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cus_reg_date >=", value, "cusRegDate");
            return (Criteria) this;
        }

        public Criteria andCusRegDateLessThan(Date value) {
            addCriterionForJDBCDate("cus_reg_date <", value, "cusRegDate");
            return (Criteria) this;
        }

        public Criteria andCusRegDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cus_reg_date <=", value, "cusRegDate");
            return (Criteria) this;
        }

        public Criteria andCusRegDateIn(List<Date> values) {
            addCriterionForJDBCDate("cus_reg_date in", values, "cusRegDate");
            return (Criteria) this;
        }

        public Criteria andCusRegDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("cus_reg_date not in", values, "cusRegDate");
            return (Criteria) this;
        }

        public Criteria andCusRegDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cus_reg_date between", value1, value2, "cusRegDate");
            return (Criteria) this;
        }

        public Criteria andCusRegDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cus_reg_date not between", value1, value2, "cusRegDate");
            return (Criteria) this;
        }

        public Criteria andCusUpdateDateIsNull() {
            addCriterion("cus_update_date is null");
            return (Criteria) this;
        }

        public Criteria andCusUpdateDateIsNotNull() {
            addCriterion("cus_update_date is not null");
            return (Criteria) this;
        }

        public Criteria andCusUpdateDateEqualTo(Date value) {
            addCriterionForJDBCDate("cus_update_date =", value, "cusUpdateDate");
            return (Criteria) this;
        }

        public Criteria andCusUpdateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("cus_update_date <>", value, "cusUpdateDate");
            return (Criteria) this;
        }

        public Criteria andCusUpdateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("cus_update_date >", value, "cusUpdateDate");
            return (Criteria) this;
        }

        public Criteria andCusUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cus_update_date >=", value, "cusUpdateDate");
            return (Criteria) this;
        }

        public Criteria andCusUpdateDateLessThan(Date value) {
            addCriterionForJDBCDate("cus_update_date <", value, "cusUpdateDate");
            return (Criteria) this;
        }

        public Criteria andCusUpdateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cus_update_date <=", value, "cusUpdateDate");
            return (Criteria) this;
        }

        public Criteria andCusUpdateDateIn(List<Date> values) {
            addCriterionForJDBCDate("cus_update_date in", values, "cusUpdateDate");
            return (Criteria) this;
        }

        public Criteria andCusUpdateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("cus_update_date not in", values, "cusUpdateDate");
            return (Criteria) this;
        }

        public Criteria andCusUpdateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cus_update_date between", value1, value2, "cusUpdateDate");
            return (Criteria) this;
        }

        public Criteria andCusUpdateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cus_update_date not between", value1, value2, "cusUpdateDate");
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