package mc.kurunegala.bop.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BOPExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BOPExample() {
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

        public Criteria andIdbopIsNull() {
            addCriterion("idBOP is null");
            return (Criteria) this;
        }

        public Criteria andIdbopIsNotNull() {
            addCriterion("idBOP is not null");
            return (Criteria) this;
        }

        public Criteria andIdbopEqualTo(Integer value) {
            addCriterion("idBOP =", value, "idbop");
            return (Criteria) this;
        }

        public Criteria andIdbopNotEqualTo(Integer value) {
            addCriterion("idBOP <>", value, "idbop");
            return (Criteria) this;
        }

        public Criteria andIdbopGreaterThan(Integer value) {
            addCriterion("idBOP >", value, "idbop");
            return (Criteria) this;
        }

        public Criteria andIdbopGreaterThanOrEqualTo(Integer value) {
            addCriterion("idBOP >=", value, "idbop");
            return (Criteria) this;
        }

        public Criteria andIdbopLessThan(Integer value) {
            addCriterion("idBOP <", value, "idbop");
            return (Criteria) this;
        }

        public Criteria andIdbopLessThanOrEqualTo(Integer value) {
            addCriterion("idBOP <=", value, "idbop");
            return (Criteria) this;
        }

        public Criteria andIdbopIn(List<Integer> values) {
            addCriterion("idBOP in", values, "idbop");
            return (Criteria) this;
        }

        public Criteria andIdbopNotIn(List<Integer> values) {
            addCriterion("idBOP not in", values, "idbop");
            return (Criteria) this;
        }

        public Criteria andIdbopBetween(Integer value1, Integer value2) {
            addCriterion("idBOP between", value1, value2, "idbop");
            return (Criteria) this;
        }

        public Criteria andIdbopNotBetween(Integer value1, Integer value2) {
            addCriterion("idBOP not between", value1, value2, "idbop");
            return (Criteria) this;
        }

        public Criteria andCustomerIdcustomerIsNull() {
            addCriterion("Customer_idCustomer is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdcustomerIsNotNull() {
            addCriterion("Customer_idCustomer is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdcustomerEqualTo(Integer value) {
            addCriterion("Customer_idCustomer =", value, "customerIdcustomer");
            return (Criteria) this;
        }

        public Criteria andCustomerIdcustomerNotEqualTo(Integer value) {
            addCriterion("Customer_idCustomer <>", value, "customerIdcustomer");
            return (Criteria) this;
        }

        public Criteria andCustomerIdcustomerGreaterThan(Integer value) {
            addCriterion("Customer_idCustomer >", value, "customerIdcustomer");
            return (Criteria) this;
        }

        public Criteria andCustomerIdcustomerGreaterThanOrEqualTo(Integer value) {
            addCriterion("Customer_idCustomer >=", value, "customerIdcustomer");
            return (Criteria) this;
        }

        public Criteria andCustomerIdcustomerLessThan(Integer value) {
            addCriterion("Customer_idCustomer <", value, "customerIdcustomer");
            return (Criteria) this;
        }

        public Criteria andCustomerIdcustomerLessThanOrEqualTo(Integer value) {
            addCriterion("Customer_idCustomer <=", value, "customerIdcustomer");
            return (Criteria) this;
        }

        public Criteria andCustomerIdcustomerIn(List<Integer> values) {
            addCriterion("Customer_idCustomer in", values, "customerIdcustomer");
            return (Criteria) this;
        }

        public Criteria andCustomerIdcustomerNotIn(List<Integer> values) {
            addCriterion("Customer_idCustomer not in", values, "customerIdcustomer");
            return (Criteria) this;
        }

        public Criteria andCustomerIdcustomerBetween(Integer value1, Integer value2) {
            addCriterion("Customer_idCustomer between", value1, value2, "customerIdcustomer");
            return (Criteria) this;
        }

        public Criteria andCustomerIdcustomerNotBetween(Integer value1, Integer value2) {
            addCriterion("Customer_idCustomer not between", value1, value2, "customerIdcustomer");
            return (Criteria) this;
        }

        public Criteria andBopApplayDateIsNull() {
            addCriterion("BOP_applay_date is null");
            return (Criteria) this;
        }

        public Criteria andBopApplayDateIsNotNull() {
            addCriterion("BOP_applay_date is not null");
            return (Criteria) this;
        }

        public Criteria andBopApplayDateEqualTo(Date value) {
            addCriterionForJDBCDate("BOP_applay_date =", value, "bopApplayDate");
            return (Criteria) this;
        }

        public Criteria andBopApplayDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("BOP_applay_date <>", value, "bopApplayDate");
            return (Criteria) this;
        }

        public Criteria andBopApplayDateGreaterThan(Date value) {
            addCriterionForJDBCDate("BOP_applay_date >", value, "bopApplayDate");
            return (Criteria) this;
        }

        public Criteria andBopApplayDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BOP_applay_date >=", value, "bopApplayDate");
            return (Criteria) this;
        }

        public Criteria andBopApplayDateLessThan(Date value) {
            addCriterionForJDBCDate("BOP_applay_date <", value, "bopApplayDate");
            return (Criteria) this;
        }

        public Criteria andBopApplayDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BOP_applay_date <=", value, "bopApplayDate");
            return (Criteria) this;
        }

        public Criteria andBopApplayDateIn(List<Date> values) {
            addCriterionForJDBCDate("BOP_applay_date in", values, "bopApplayDate");
            return (Criteria) this;
        }

        public Criteria andBopApplayDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("BOP_applay_date not in", values, "bopApplayDate");
            return (Criteria) this;
        }

        public Criteria andBopApplayDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BOP_applay_date between", value1, value2, "bopApplayDate");
            return (Criteria) this;
        }

        public Criteria andBopApplayDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BOP_applay_date not between", value1, value2, "bopApplayDate");
            return (Criteria) this;
        }

        public Criteria andBopPlanNoIsNull() {
            addCriterion("BOP_plan_no is null");
            return (Criteria) this;
        }

        public Criteria andBopPlanNoIsNotNull() {
            addCriterion("BOP_plan_no is not null");
            return (Criteria) this;
        }

        public Criteria andBopPlanNoEqualTo(String value) {
            addCriterion("BOP_plan_no =", value, "bopPlanNo");
            return (Criteria) this;
        }

        public Criteria andBopPlanNoNotEqualTo(String value) {
            addCriterion("BOP_plan_no <>", value, "bopPlanNo");
            return (Criteria) this;
        }

        public Criteria andBopPlanNoGreaterThan(String value) {
            addCriterion("BOP_plan_no >", value, "bopPlanNo");
            return (Criteria) this;
        }

        public Criteria andBopPlanNoGreaterThanOrEqualTo(String value) {
            addCriterion("BOP_plan_no >=", value, "bopPlanNo");
            return (Criteria) this;
        }

        public Criteria andBopPlanNoLessThan(String value) {
            addCriterion("BOP_plan_no <", value, "bopPlanNo");
            return (Criteria) this;
        }

        public Criteria andBopPlanNoLessThanOrEqualTo(String value) {
            addCriterion("BOP_plan_no <=", value, "bopPlanNo");
            return (Criteria) this;
        }

        public Criteria andBopPlanNoLike(String value) {
            addCriterion("BOP_plan_no like", value, "bopPlanNo");
            return (Criteria) this;
        }

        public Criteria andBopPlanNoNotLike(String value) {
            addCriterion("BOP_plan_no not like", value, "bopPlanNo");
            return (Criteria) this;
        }

        public Criteria andBopPlanNoIn(List<String> values) {
            addCriterion("BOP_plan_no in", values, "bopPlanNo");
            return (Criteria) this;
        }

        public Criteria andBopPlanNoNotIn(List<String> values) {
            addCriterion("BOP_plan_no not in", values, "bopPlanNo");
            return (Criteria) this;
        }

        public Criteria andBopPlanNoBetween(String value1, String value2) {
            addCriterion("BOP_plan_no between", value1, value2, "bopPlanNo");
            return (Criteria) this;
        }

        public Criteria andBopPlanNoNotBetween(String value1, String value2) {
            addCriterion("BOP_plan_no not between", value1, value2, "bopPlanNo");
            return (Criteria) this;
        }

        public Criteria andBopUrveyorsNameIsNull() {
            addCriterion("\"BOP_urveyors name\" is null");
            return (Criteria) this;
        }

        public Criteria andBopUrveyorsNameIsNotNull() {
            addCriterion("\"BOP_urveyors name\" is not null");
            return (Criteria) this;
        }

        public Criteria andBopUrveyorsNameEqualTo(String value) {
            addCriterion("\"BOP_urveyors name\" =", value, "bopUrveyorsName");
            return (Criteria) this;
        }

        public Criteria andBopUrveyorsNameNotEqualTo(String value) {
            addCriterion("\"BOP_urveyors name\" <>", value, "bopUrveyorsName");
            return (Criteria) this;
        }

        public Criteria andBopUrveyorsNameGreaterThan(String value) {
            addCriterion("\"BOP_urveyors name\" >", value, "bopUrveyorsName");
            return (Criteria) this;
        }

        public Criteria andBopUrveyorsNameGreaterThanOrEqualTo(String value) {
            addCriterion("\"BOP_urveyors name\" >=", value, "bopUrveyorsName");
            return (Criteria) this;
        }

        public Criteria andBopUrveyorsNameLessThan(String value) {
            addCriterion("\"BOP_urveyors name\" <", value, "bopUrveyorsName");
            return (Criteria) this;
        }

        public Criteria andBopUrveyorsNameLessThanOrEqualTo(String value) {
            addCriterion("\"BOP_urveyors name\" <=", value, "bopUrveyorsName");
            return (Criteria) this;
        }

        public Criteria andBopUrveyorsNameLike(String value) {
            addCriterion("\"BOP_urveyors name\" like", value, "bopUrveyorsName");
            return (Criteria) this;
        }

        public Criteria andBopUrveyorsNameNotLike(String value) {
            addCriterion("\"BOP_urveyors name\" not like", value, "bopUrveyorsName");
            return (Criteria) this;
        }

        public Criteria andBopUrveyorsNameIn(List<String> values) {
            addCriterion("\"BOP_urveyors name\" in", values, "bopUrveyorsName");
            return (Criteria) this;
        }

        public Criteria andBopUrveyorsNameNotIn(List<String> values) {
            addCriterion("\"BOP_urveyors name\" not in", values, "bopUrveyorsName");
            return (Criteria) this;
        }

        public Criteria andBopUrveyorsNameBetween(String value1, String value2) {
            addCriterion("\"BOP_urveyors name\" between", value1, value2, "bopUrveyorsName");
            return (Criteria) this;
        }

        public Criteria andBopUrveyorsNameNotBetween(String value1, String value2) {
            addCriterion("\"BOP_urveyors name\" not between", value1, value2, "bopUrveyorsName");
            return (Criteria) this;
        }

        public Criteria andBopNoIsNull() {
            addCriterion("BOP_no is null");
            return (Criteria) this;
        }

        public Criteria andBopNoIsNotNull() {
            addCriterion("BOP_no is not null");
            return (Criteria) this;
        }

        public Criteria andBopNoEqualTo(String value) {
            addCriterion("BOP_no =", value, "bopNo");
            return (Criteria) this;
        }

        public Criteria andBopNoNotEqualTo(String value) {
            addCriterion("BOP_no <>", value, "bopNo");
            return (Criteria) this;
        }

        public Criteria andBopNoGreaterThan(String value) {
            addCriterion("BOP_no >", value, "bopNo");
            return (Criteria) this;
        }

        public Criteria andBopNoGreaterThanOrEqualTo(String value) {
            addCriterion("BOP_no >=", value, "bopNo");
            return (Criteria) this;
        }

        public Criteria andBopNoLessThan(String value) {
            addCriterion("BOP_no <", value, "bopNo");
            return (Criteria) this;
        }

        public Criteria andBopNoLessThanOrEqualTo(String value) {
            addCriterion("BOP_no <=", value, "bopNo");
            return (Criteria) this;
        }

        public Criteria andBopNoLike(String value) {
            addCriterion("BOP_no like", value, "bopNo");
            return (Criteria) this;
        }

        public Criteria andBopNoNotLike(String value) {
            addCriterion("BOP_no not like", value, "bopNo");
            return (Criteria) this;
        }

        public Criteria andBopNoIn(List<String> values) {
            addCriterion("BOP_no in", values, "bopNo");
            return (Criteria) this;
        }

        public Criteria andBopNoNotIn(List<String> values) {
            addCriterion("BOP_no not in", values, "bopNo");
            return (Criteria) this;
        }

        public Criteria andBopNoBetween(String value1, String value2) {
            addCriterion("BOP_no between", value1, value2, "bopNo");
            return (Criteria) this;
        }

        public Criteria andBopNoNotBetween(String value1, String value2) {
            addCriterion("BOP_no not between", value1, value2, "bopNo");
            return (Criteria) this;
        }

        public Criteria andBopIsMarkongroundIsNull() {
            addCriterion("BOP_is_markonground is null");
            return (Criteria) this;
        }

        public Criteria andBopIsMarkongroundIsNotNull() {
            addCriterion("BOP_is_markonground is not null");
            return (Criteria) this;
        }

        public Criteria andBopIsMarkongroundEqualTo(String value) {
            addCriterion("BOP_is_markonground =", value, "bopIsMarkonground");
            return (Criteria) this;
        }

        public Criteria andBopIsMarkongroundNotEqualTo(String value) {
            addCriterion("BOP_is_markonground <>", value, "bopIsMarkonground");
            return (Criteria) this;
        }

        public Criteria andBopIsMarkongroundGreaterThan(String value) {
            addCriterion("BOP_is_markonground >", value, "bopIsMarkonground");
            return (Criteria) this;
        }

        public Criteria andBopIsMarkongroundGreaterThanOrEqualTo(String value) {
            addCriterion("BOP_is_markonground >=", value, "bopIsMarkonground");
            return (Criteria) this;
        }

        public Criteria andBopIsMarkongroundLessThan(String value) {
            addCriterion("BOP_is_markonground <", value, "bopIsMarkonground");
            return (Criteria) this;
        }

        public Criteria andBopIsMarkongroundLessThanOrEqualTo(String value) {
            addCriterion("BOP_is_markonground <=", value, "bopIsMarkonground");
            return (Criteria) this;
        }

        public Criteria andBopIsMarkongroundLike(String value) {
            addCriterion("BOP_is_markonground like", value, "bopIsMarkonground");
            return (Criteria) this;
        }

        public Criteria andBopIsMarkongroundNotLike(String value) {
            addCriterion("BOP_is_markonground not like", value, "bopIsMarkonground");
            return (Criteria) this;
        }

        public Criteria andBopIsMarkongroundIn(List<String> values) {
            addCriterion("BOP_is_markonground in", values, "bopIsMarkonground");
            return (Criteria) this;
        }

        public Criteria andBopIsMarkongroundNotIn(List<String> values) {
            addCriterion("BOP_is_markonground not in", values, "bopIsMarkonground");
            return (Criteria) this;
        }

        public Criteria andBopIsMarkongroundBetween(String value1, String value2) {
            addCriterion("BOP_is_markonground between", value1, value2, "bopIsMarkonground");
            return (Criteria) this;
        }

        public Criteria andBopIsMarkongroundNotBetween(String value1, String value2) {
            addCriterion("BOP_is_markonground not between", value1, value2, "bopIsMarkonground");
            return (Criteria) this;
        }

        public Criteria andBopOwnershipIsNull() {
            addCriterion("BOP_ownership is null");
            return (Criteria) this;
        }

        public Criteria andBopOwnershipIsNotNull() {
            addCriterion("BOP_ownership is not null");
            return (Criteria) this;
        }

        public Criteria andBopOwnershipEqualTo(String value) {
            addCriterion("BOP_ownership =", value, "bopOwnership");
            return (Criteria) this;
        }

        public Criteria andBopOwnershipNotEqualTo(String value) {
            addCriterion("BOP_ownership <>", value, "bopOwnership");
            return (Criteria) this;
        }

        public Criteria andBopOwnershipGreaterThan(String value) {
            addCriterion("BOP_ownership >", value, "bopOwnership");
            return (Criteria) this;
        }

        public Criteria andBopOwnershipGreaterThanOrEqualTo(String value) {
            addCriterion("BOP_ownership >=", value, "bopOwnership");
            return (Criteria) this;
        }

        public Criteria andBopOwnershipLessThan(String value) {
            addCriterion("BOP_ownership <", value, "bopOwnership");
            return (Criteria) this;
        }

        public Criteria andBopOwnershipLessThanOrEqualTo(String value) {
            addCriterion("BOP_ownership <=", value, "bopOwnership");
            return (Criteria) this;
        }

        public Criteria andBopOwnershipLike(String value) {
            addCriterion("BOP_ownership like", value, "bopOwnership");
            return (Criteria) this;
        }

        public Criteria andBopOwnershipNotLike(String value) {
            addCriterion("BOP_ownership not like", value, "bopOwnership");
            return (Criteria) this;
        }

        public Criteria andBopOwnershipIn(List<String> values) {
            addCriterion("BOP_ownership in", values, "bopOwnership");
            return (Criteria) this;
        }

        public Criteria andBopOwnershipNotIn(List<String> values) {
            addCriterion("BOP_ownership not in", values, "bopOwnership");
            return (Criteria) this;
        }

        public Criteria andBopOwnershipBetween(String value1, String value2) {
            addCriterion("BOP_ownership between", value1, value2, "bopOwnership");
            return (Criteria) this;
        }

        public Criteria andBopOwnershipNotBetween(String value1, String value2) {
            addCriterion("BOP_ownership not between", value1, value2, "bopOwnership");
            return (Criteria) this;
        }

        public Criteria andBopTotalPriceIsNull() {
            addCriterion("BOP_total_price is null");
            return (Criteria) this;
        }

        public Criteria andBopTotalPriceIsNotNull() {
            addCriterion("BOP_total_price is not null");
            return (Criteria) this;
        }

        public Criteria andBopTotalPriceEqualTo(Double value) {
            addCriterion("BOP_total_price =", value, "bopTotalPrice");
            return (Criteria) this;
        }

        public Criteria andBopTotalPriceNotEqualTo(Double value) {
            addCriterion("BOP_total_price <>", value, "bopTotalPrice");
            return (Criteria) this;
        }

        public Criteria andBopTotalPriceGreaterThan(Double value) {
            addCriterion("BOP_total_price >", value, "bopTotalPrice");
            return (Criteria) this;
        }

        public Criteria andBopTotalPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("BOP_total_price >=", value, "bopTotalPrice");
            return (Criteria) this;
        }

        public Criteria andBopTotalPriceLessThan(Double value) {
            addCriterion("BOP_total_price <", value, "bopTotalPrice");
            return (Criteria) this;
        }

        public Criteria andBopTotalPriceLessThanOrEqualTo(Double value) {
            addCriterion("BOP_total_price <=", value, "bopTotalPrice");
            return (Criteria) this;
        }

        public Criteria andBopTotalPriceIn(List<Double> values) {
            addCriterion("BOP_total_price in", values, "bopTotalPrice");
            return (Criteria) this;
        }

        public Criteria andBopTotalPriceNotIn(List<Double> values) {
            addCriterion("BOP_total_price not in", values, "bopTotalPrice");
            return (Criteria) this;
        }

        public Criteria andBopTotalPriceBetween(Double value1, Double value2) {
            addCriterion("BOP_total_price between", value1, value2, "bopTotalPrice");
            return (Criteria) this;
        }

        public Criteria andBopTotalPriceNotBetween(Double value1, Double value2) {
            addCriterion("BOP_total_price not between", value1, value2, "bopTotalPrice");
            return (Criteria) this;
        }

        public Criteria andBopCompleteStatusIsNull() {
            addCriterion("BOP_complete_status is null");
            return (Criteria) this;
        }

        public Criteria andBopCompleteStatusIsNotNull() {
            addCriterion("BOP_complete_status is not null");
            return (Criteria) this;
        }

        public Criteria andBopCompleteStatusEqualTo(Integer value) {
            addCriterion("BOP_complete_status =", value, "bopCompleteStatus");
            return (Criteria) this;
        }

        public Criteria andBopCompleteStatusNotEqualTo(Integer value) {
            addCriterion("BOP_complete_status <>", value, "bopCompleteStatus");
            return (Criteria) this;
        }

        public Criteria andBopCompleteStatusGreaterThan(Integer value) {
            addCriterion("BOP_complete_status >", value, "bopCompleteStatus");
            return (Criteria) this;
        }

        public Criteria andBopCompleteStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("BOP_complete_status >=", value, "bopCompleteStatus");
            return (Criteria) this;
        }

        public Criteria andBopCompleteStatusLessThan(Integer value) {
            addCriterion("BOP_complete_status <", value, "bopCompleteStatus");
            return (Criteria) this;
        }

        public Criteria andBopCompleteStatusLessThanOrEqualTo(Integer value) {
            addCriterion("BOP_complete_status <=", value, "bopCompleteStatus");
            return (Criteria) this;
        }

        public Criteria andBopCompleteStatusIn(List<Integer> values) {
            addCriterion("BOP_complete_status in", values, "bopCompleteStatus");
            return (Criteria) this;
        }

        public Criteria andBopCompleteStatusNotIn(List<Integer> values) {
            addCriterion("BOP_complete_status not in", values, "bopCompleteStatus");
            return (Criteria) this;
        }

        public Criteria andBopCompleteStatusBetween(Integer value1, Integer value2) {
            addCriterion("BOP_complete_status between", value1, value2, "bopCompleteStatus");
            return (Criteria) this;
        }

        public Criteria andBopCompleteStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("BOP_complete_status not between", value1, value2, "bopCompleteStatus");
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