package mc.kurunegala.bop.model;

import java.util.ArrayList;
import java.util.List;

public class AssessmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssessmentExample() {
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

        public Criteria andIdassessmentIsNull() {
            addCriterion("idAssessment is null");
            return (Criteria) this;
        }

        public Criteria andIdassessmentIsNotNull() {
            addCriterion("idAssessment is not null");
            return (Criteria) this;
        }

        public Criteria andIdassessmentEqualTo(Integer value) {
            addCriterion("idAssessment =", value, "idassessment");
            return (Criteria) this;
        }

        public Criteria andIdassessmentNotEqualTo(Integer value) {
            addCriterion("idAssessment <>", value, "idassessment");
            return (Criteria) this;
        }

        public Criteria andIdassessmentGreaterThan(Integer value) {
            addCriterion("idAssessment >", value, "idassessment");
            return (Criteria) this;
        }

        public Criteria andIdassessmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("idAssessment >=", value, "idassessment");
            return (Criteria) this;
        }

        public Criteria andIdassessmentLessThan(Integer value) {
            addCriterion("idAssessment <", value, "idassessment");
            return (Criteria) this;
        }

        public Criteria andIdassessmentLessThanOrEqualTo(Integer value) {
            addCriterion("idAssessment <=", value, "idassessment");
            return (Criteria) this;
        }

        public Criteria andIdassessmentIn(List<Integer> values) {
            addCriterion("idAssessment in", values, "idassessment");
            return (Criteria) this;
        }

        public Criteria andIdassessmentNotIn(List<Integer> values) {
            addCriterion("idAssessment not in", values, "idassessment");
            return (Criteria) this;
        }

        public Criteria andIdassessmentBetween(Integer value1, Integer value2) {
            addCriterion("idAssessment between", value1, value2, "idassessment");
            return (Criteria) this;
        }

        public Criteria andIdassessmentNotBetween(Integer value1, Integer value2) {
            addCriterion("idAssessment not between", value1, value2, "idassessment");
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

        public Criteria andStreetIdstreetIsNull() {
            addCriterion("Street_idStreet is null");
            return (Criteria) this;
        }

        public Criteria andStreetIdstreetIsNotNull() {
            addCriterion("Street_idStreet is not null");
            return (Criteria) this;
        }

        public Criteria andStreetIdstreetEqualTo(Integer value) {
            addCriterion("Street_idStreet =", value, "streetIdstreet");
            return (Criteria) this;
        }

        public Criteria andStreetIdstreetNotEqualTo(Integer value) {
            addCriterion("Street_idStreet <>", value, "streetIdstreet");
            return (Criteria) this;
        }

        public Criteria andStreetIdstreetGreaterThan(Integer value) {
            addCriterion("Street_idStreet >", value, "streetIdstreet");
            return (Criteria) this;
        }

        public Criteria andStreetIdstreetGreaterThanOrEqualTo(Integer value) {
            addCriterion("Street_idStreet >=", value, "streetIdstreet");
            return (Criteria) this;
        }

        public Criteria andStreetIdstreetLessThan(Integer value) {
            addCriterion("Street_idStreet <", value, "streetIdstreet");
            return (Criteria) this;
        }

        public Criteria andStreetIdstreetLessThanOrEqualTo(Integer value) {
            addCriterion("Street_idStreet <=", value, "streetIdstreet");
            return (Criteria) this;
        }

        public Criteria andStreetIdstreetIn(List<Integer> values) {
            addCriterion("Street_idStreet in", values, "streetIdstreet");
            return (Criteria) this;
        }

        public Criteria andStreetIdstreetNotIn(List<Integer> values) {
            addCriterion("Street_idStreet not in", values, "streetIdstreet");
            return (Criteria) this;
        }

        public Criteria andStreetIdstreetBetween(Integer value1, Integer value2) {
            addCriterion("Street_idStreet between", value1, value2, "streetIdstreet");
            return (Criteria) this;
        }

        public Criteria andStreetIdstreetNotBetween(Integer value1, Integer value2) {
            addCriterion("Street_idStreet not between", value1, value2, "streetIdstreet");
            return (Criteria) this;
        }

        public Criteria andAssNatureIdassNatureIsNull() {
            addCriterion("ass_nature_idass_nature is null");
            return (Criteria) this;
        }

        public Criteria andAssNatureIdassNatureIsNotNull() {
            addCriterion("ass_nature_idass_nature is not null");
            return (Criteria) this;
        }

        public Criteria andAssNatureIdassNatureEqualTo(Integer value) {
            addCriterion("ass_nature_idass_nature =", value, "assNatureIdassNature");
            return (Criteria) this;
        }

        public Criteria andAssNatureIdassNatureNotEqualTo(Integer value) {
            addCriterion("ass_nature_idass_nature <>", value, "assNatureIdassNature");
            return (Criteria) this;
        }

        public Criteria andAssNatureIdassNatureGreaterThan(Integer value) {
            addCriterion("ass_nature_idass_nature >", value, "assNatureIdassNature");
            return (Criteria) this;
        }

        public Criteria andAssNatureIdassNatureGreaterThanOrEqualTo(Integer value) {
            addCriterion("ass_nature_idass_nature >=", value, "assNatureIdassNature");
            return (Criteria) this;
        }

        public Criteria andAssNatureIdassNatureLessThan(Integer value) {
            addCriterion("ass_nature_idass_nature <", value, "assNatureIdassNature");
            return (Criteria) this;
        }

        public Criteria andAssNatureIdassNatureLessThanOrEqualTo(Integer value) {
            addCriterion("ass_nature_idass_nature <=", value, "assNatureIdassNature");
            return (Criteria) this;
        }

        public Criteria andAssNatureIdassNatureIn(List<Integer> values) {
            addCriterion("ass_nature_idass_nature in", values, "assNatureIdassNature");
            return (Criteria) this;
        }

        public Criteria andAssNatureIdassNatureNotIn(List<Integer> values) {
            addCriterion("ass_nature_idass_nature not in", values, "assNatureIdassNature");
            return (Criteria) this;
        }

        public Criteria andAssNatureIdassNatureBetween(Integer value1, Integer value2) {
            addCriterion("ass_nature_idass_nature between", value1, value2, "assNatureIdassNature");
            return (Criteria) this;
        }

        public Criteria andAssNatureIdassNatureNotBetween(Integer value1, Integer value2) {
            addCriterion("ass_nature_idass_nature not between", value1, value2, "assNatureIdassNature");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionIdassDiscriptionIsNull() {
            addCriterion("ass_discription_idass_discription is null");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionIdassDiscriptionIsNotNull() {
            addCriterion("ass_discription_idass_discription is not null");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionIdassDiscriptionEqualTo(Integer value) {
            addCriterion("ass_discription_idass_discription =", value, "assDiscriptionIdassDiscription");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionIdassDiscriptionNotEqualTo(Integer value) {
            addCriterion("ass_discription_idass_discription <>", value, "assDiscriptionIdassDiscription");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionIdassDiscriptionGreaterThan(Integer value) {
            addCriterion("ass_discription_idass_discription >", value, "assDiscriptionIdassDiscription");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionIdassDiscriptionGreaterThanOrEqualTo(Integer value) {
            addCriterion("ass_discription_idass_discription >=", value, "assDiscriptionIdassDiscription");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionIdassDiscriptionLessThan(Integer value) {
            addCriterion("ass_discription_idass_discription <", value, "assDiscriptionIdassDiscription");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionIdassDiscriptionLessThanOrEqualTo(Integer value) {
            addCriterion("ass_discription_idass_discription <=", value, "assDiscriptionIdassDiscription");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionIdassDiscriptionIn(List<Integer> values) {
            addCriterion("ass_discription_idass_discription in", values, "assDiscriptionIdassDiscription");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionIdassDiscriptionNotIn(List<Integer> values) {
            addCriterion("ass_discription_idass_discription not in", values, "assDiscriptionIdassDiscription");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionIdassDiscriptionBetween(Integer value1, Integer value2) {
            addCriterion("ass_discription_idass_discription between", value1, value2, "assDiscriptionIdassDiscription");
            return (Criteria) this;
        }

        public Criteria andAssDiscriptionIdassDiscriptionNotBetween(Integer value1, Integer value2) {
            addCriterion("ass_discription_idass_discription not between", value1, value2, "assDiscriptionIdassDiscription");
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

        public Criteria andAssessmentOderIsNull() {
            addCriterion("assessment_oder is null");
            return (Criteria) this;
        }

        public Criteria andAssessmentOderIsNotNull() {
            addCriterion("assessment_oder is not null");
            return (Criteria) this;
        }

        public Criteria andAssessmentOderEqualTo(Double value) {
            addCriterion("assessment_oder =", value, "assessmentOder");
            return (Criteria) this;
        }

        public Criteria andAssessmentOderNotEqualTo(Double value) {
            addCriterion("assessment_oder <>", value, "assessmentOder");
            return (Criteria) this;
        }

        public Criteria andAssessmentOderGreaterThan(Double value) {
            addCriterion("assessment_oder >", value, "assessmentOder");
            return (Criteria) this;
        }

        public Criteria andAssessmentOderGreaterThanOrEqualTo(Double value) {
            addCriterion("assessment_oder >=", value, "assessmentOder");
            return (Criteria) this;
        }

        public Criteria andAssessmentOderLessThan(Double value) {
            addCriterion("assessment_oder <", value, "assessmentOder");
            return (Criteria) this;
        }

        public Criteria andAssessmentOderLessThanOrEqualTo(Double value) {
            addCriterion("assessment_oder <=", value, "assessmentOder");
            return (Criteria) this;
        }

        public Criteria andAssessmentOderIn(List<Double> values) {
            addCriterion("assessment_oder in", values, "assessmentOder");
            return (Criteria) this;
        }

        public Criteria andAssessmentOderNotIn(List<Double> values) {
            addCriterion("assessment_oder not in", values, "assessmentOder");
            return (Criteria) this;
        }

        public Criteria andAssessmentOderBetween(Double value1, Double value2) {
            addCriterion("assessment_oder between", value1, value2, "assessmentOder");
            return (Criteria) this;
        }

        public Criteria andAssessmentOderNotBetween(Double value1, Double value2) {
            addCriterion("assessment_oder not between", value1, value2, "assessmentOder");
            return (Criteria) this;
        }

        public Criteria andAssessmentNoIsNull() {
            addCriterion("assessment_no is null");
            return (Criteria) this;
        }

        public Criteria andAssessmentNoIsNotNull() {
            addCriterion("assessment_no is not null");
            return (Criteria) this;
        }

        public Criteria andAssessmentNoEqualTo(String value) {
            addCriterion("assessment_no =", value, "assessmentNo");
            return (Criteria) this;
        }

        public Criteria andAssessmentNoNotEqualTo(String value) {
            addCriterion("assessment_no <>", value, "assessmentNo");
            return (Criteria) this;
        }

        public Criteria andAssessmentNoGreaterThan(String value) {
            addCriterion("assessment_no >", value, "assessmentNo");
            return (Criteria) this;
        }

        public Criteria andAssessmentNoGreaterThanOrEqualTo(String value) {
            addCriterion("assessment_no >=", value, "assessmentNo");
            return (Criteria) this;
        }

        public Criteria andAssessmentNoLessThan(String value) {
            addCriterion("assessment_no <", value, "assessmentNo");
            return (Criteria) this;
        }

        public Criteria andAssessmentNoLessThanOrEqualTo(String value) {
            addCriterion("assessment_no <=", value, "assessmentNo");
            return (Criteria) this;
        }

        public Criteria andAssessmentNoLike(String value) {
            addCriterion("assessment_no like", value, "assessmentNo");
            return (Criteria) this;
        }

        public Criteria andAssessmentNoNotLike(String value) {
            addCriterion("assessment_no not like", value, "assessmentNo");
            return (Criteria) this;
        }

        public Criteria andAssessmentNoIn(List<String> values) {
            addCriterion("assessment_no in", values, "assessmentNo");
            return (Criteria) this;
        }

        public Criteria andAssessmentNoNotIn(List<String> values) {
            addCriterion("assessment_no not in", values, "assessmentNo");
            return (Criteria) this;
        }

        public Criteria andAssessmentNoBetween(String value1, String value2) {
            addCriterion("assessment_no between", value1, value2, "assessmentNo");
            return (Criteria) this;
        }

        public Criteria andAssessmentNoNotBetween(String value1, String value2) {
            addCriterion("assessment_no not between", value1, value2, "assessmentNo");
            return (Criteria) this;
        }

        public Criteria andAssessmentStatusIsNull() {
            addCriterion("assessment_status is null");
            return (Criteria) this;
        }

        public Criteria andAssessmentStatusIsNotNull() {
            addCriterion("assessment_status is not null");
            return (Criteria) this;
        }

        public Criteria andAssessmentStatusEqualTo(Integer value) {
            addCriterion("assessment_status =", value, "assessmentStatus");
            return (Criteria) this;
        }

        public Criteria andAssessmentStatusNotEqualTo(Integer value) {
            addCriterion("assessment_status <>", value, "assessmentStatus");
            return (Criteria) this;
        }

        public Criteria andAssessmentStatusGreaterThan(Integer value) {
            addCriterion("assessment_status >", value, "assessmentStatus");
            return (Criteria) this;
        }

        public Criteria andAssessmentStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("assessment_status >=", value, "assessmentStatus");
            return (Criteria) this;
        }

        public Criteria andAssessmentStatusLessThan(Integer value) {
            addCriterion("assessment_status <", value, "assessmentStatus");
            return (Criteria) this;
        }

        public Criteria andAssessmentStatusLessThanOrEqualTo(Integer value) {
            addCriterion("assessment_status <=", value, "assessmentStatus");
            return (Criteria) this;
        }

        public Criteria andAssessmentStatusIn(List<Integer> values) {
            addCriterion("assessment_status in", values, "assessmentStatus");
            return (Criteria) this;
        }

        public Criteria andAssessmentStatusNotIn(List<Integer> values) {
            addCriterion("assessment_status not in", values, "assessmentStatus");
            return (Criteria) this;
        }

        public Criteria andAssessmentStatusBetween(Integer value1, Integer value2) {
            addCriterion("assessment_status between", value1, value2, "assessmentStatus");
            return (Criteria) this;
        }

        public Criteria andAssessmentStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("assessment_status not between", value1, value2, "assessmentStatus");
            return (Criteria) this;
        }

        public Criteria andAssessmentSynIsNull() {
            addCriterion("assessment_syn is null");
            return (Criteria) this;
        }

        public Criteria andAssessmentSynIsNotNull() {
            addCriterion("assessment_syn is not null");
            return (Criteria) this;
        }

        public Criteria andAssessmentSynEqualTo(Integer value) {
            addCriterion("assessment_syn =", value, "assessmentSyn");
            return (Criteria) this;
        }

        public Criteria andAssessmentSynNotEqualTo(Integer value) {
            addCriterion("assessment_syn <>", value, "assessmentSyn");
            return (Criteria) this;
        }

        public Criteria andAssessmentSynGreaterThan(Integer value) {
            addCriterion("assessment_syn >", value, "assessmentSyn");
            return (Criteria) this;
        }

        public Criteria andAssessmentSynGreaterThanOrEqualTo(Integer value) {
            addCriterion("assessment_syn >=", value, "assessmentSyn");
            return (Criteria) this;
        }

        public Criteria andAssessmentSynLessThan(Integer value) {
            addCriterion("assessment_syn <", value, "assessmentSyn");
            return (Criteria) this;
        }

        public Criteria andAssessmentSynLessThanOrEqualTo(Integer value) {
            addCriterion("assessment_syn <=", value, "assessmentSyn");
            return (Criteria) this;
        }

        public Criteria andAssessmentSynIn(List<Integer> values) {
            addCriterion("assessment_syn in", values, "assessmentSyn");
            return (Criteria) this;
        }

        public Criteria andAssessmentSynNotIn(List<Integer> values) {
            addCriterion("assessment_syn not in", values, "assessmentSyn");
            return (Criteria) this;
        }

        public Criteria andAssessmentSynBetween(Integer value1, Integer value2) {
            addCriterion("assessment_syn between", value1, value2, "assessmentSyn");
            return (Criteria) this;
        }

        public Criteria andAssessmentSynNotBetween(Integer value1, Integer value2) {
            addCriterion("assessment_syn not between", value1, value2, "assessmentSyn");
            return (Criteria) this;
        }

        public Criteria andAssessmentCommentIsNull() {
            addCriterion("assessment_comment is null");
            return (Criteria) this;
        }

        public Criteria andAssessmentCommentIsNotNull() {
            addCriterion("assessment_comment is not null");
            return (Criteria) this;
        }

        public Criteria andAssessmentCommentEqualTo(String value) {
            addCriterion("assessment_comment =", value, "assessmentComment");
            return (Criteria) this;
        }

        public Criteria andAssessmentCommentNotEqualTo(String value) {
            addCriterion("assessment_comment <>", value, "assessmentComment");
            return (Criteria) this;
        }

        public Criteria andAssessmentCommentGreaterThan(String value) {
            addCriterion("assessment_comment >", value, "assessmentComment");
            return (Criteria) this;
        }

        public Criteria andAssessmentCommentGreaterThanOrEqualTo(String value) {
            addCriterion("assessment_comment >=", value, "assessmentComment");
            return (Criteria) this;
        }

        public Criteria andAssessmentCommentLessThan(String value) {
            addCriterion("assessment_comment <", value, "assessmentComment");
            return (Criteria) this;
        }

        public Criteria andAssessmentCommentLessThanOrEqualTo(String value) {
            addCriterion("assessment_comment <=", value, "assessmentComment");
            return (Criteria) this;
        }

        public Criteria andAssessmentCommentLike(String value) {
            addCriterion("assessment_comment like", value, "assessmentComment");
            return (Criteria) this;
        }

        public Criteria andAssessmentCommentNotLike(String value) {
            addCriterion("assessment_comment not like", value, "assessmentComment");
            return (Criteria) this;
        }

        public Criteria andAssessmentCommentIn(List<String> values) {
            addCriterion("assessment_comment in", values, "assessmentComment");
            return (Criteria) this;
        }

        public Criteria andAssessmentCommentNotIn(List<String> values) {
            addCriterion("assessment_comment not in", values, "assessmentComment");
            return (Criteria) this;
        }

        public Criteria andAssessmentCommentBetween(String value1, String value2) {
            addCriterion("assessment_comment between", value1, value2, "assessmentComment");
            return (Criteria) this;
        }

        public Criteria andAssessmentCommentNotBetween(String value1, String value2) {
            addCriterion("assessment_comment not between", value1, value2, "assessmentComment");
            return (Criteria) this;
        }

        public Criteria andAssessmentObsoleteIsNull() {
            addCriterion("assessment_obsolete is null");
            return (Criteria) this;
        }

        public Criteria andAssessmentObsoleteIsNotNull() {
            addCriterion("assessment_obsolete is not null");
            return (Criteria) this;
        }

        public Criteria andAssessmentObsoleteEqualTo(String value) {
            addCriterion("assessment_obsolete =", value, "assessmentObsolete");
            return (Criteria) this;
        }

        public Criteria andAssessmentObsoleteNotEqualTo(String value) {
            addCriterion("assessment_obsolete <>", value, "assessmentObsolete");
            return (Criteria) this;
        }

        public Criteria andAssessmentObsoleteGreaterThan(String value) {
            addCriterion("assessment_obsolete >", value, "assessmentObsolete");
            return (Criteria) this;
        }

        public Criteria andAssessmentObsoleteGreaterThanOrEqualTo(String value) {
            addCriterion("assessment_obsolete >=", value, "assessmentObsolete");
            return (Criteria) this;
        }

        public Criteria andAssessmentObsoleteLessThan(String value) {
            addCriterion("assessment_obsolete <", value, "assessmentObsolete");
            return (Criteria) this;
        }

        public Criteria andAssessmentObsoleteLessThanOrEqualTo(String value) {
            addCriterion("assessment_obsolete <=", value, "assessmentObsolete");
            return (Criteria) this;
        }

        public Criteria andAssessmentObsoleteLike(String value) {
            addCriterion("assessment_obsolete like", value, "assessmentObsolete");
            return (Criteria) this;
        }

        public Criteria andAssessmentObsoleteNotLike(String value) {
            addCriterion("assessment_obsolete not like", value, "assessmentObsolete");
            return (Criteria) this;
        }

        public Criteria andAssessmentObsoleteIn(List<String> values) {
            addCriterion("assessment_obsolete in", values, "assessmentObsolete");
            return (Criteria) this;
        }

        public Criteria andAssessmentObsoleteNotIn(List<String> values) {
            addCriterion("assessment_obsolete not in", values, "assessmentObsolete");
            return (Criteria) this;
        }

        public Criteria andAssessmentObsoleteBetween(String value1, String value2) {
            addCriterion("assessment_obsolete between", value1, value2, "assessmentObsolete");
            return (Criteria) this;
        }

        public Criteria andAssessmentObsoleteNotBetween(String value1, String value2) {
            addCriterion("assessment_obsolete not between", value1, value2, "assessmentObsolete");
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