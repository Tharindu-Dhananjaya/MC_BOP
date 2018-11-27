package mc.kurunegala.bop.model;

import java.util.ArrayList;
import java.util.List;

public class UploadsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UploadsExample() {
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

        public Criteria andIduploadsIsNull() {
            addCriterion("idUploads is null");
            return (Criteria) this;
        }

        public Criteria andIduploadsIsNotNull() {
            addCriterion("idUploads is not null");
            return (Criteria) this;
        }

        public Criteria andIduploadsEqualTo(Integer value) {
            addCriterion("idUploads =", value, "iduploads");
            return (Criteria) this;
        }

        public Criteria andIduploadsNotEqualTo(Integer value) {
            addCriterion("idUploads <>", value, "iduploads");
            return (Criteria) this;
        }

        public Criteria andIduploadsGreaterThan(Integer value) {
            addCriterion("idUploads >", value, "iduploads");
            return (Criteria) this;
        }

        public Criteria andIduploadsGreaterThanOrEqualTo(Integer value) {
            addCriterion("idUploads >=", value, "iduploads");
            return (Criteria) this;
        }

        public Criteria andIduploadsLessThan(Integer value) {
            addCriterion("idUploads <", value, "iduploads");
            return (Criteria) this;
        }

        public Criteria andIduploadsLessThanOrEqualTo(Integer value) {
            addCriterion("idUploads <=", value, "iduploads");
            return (Criteria) this;
        }

        public Criteria andIduploadsIn(List<Integer> values) {
            addCriterion("idUploads in", values, "iduploads");
            return (Criteria) this;
        }

        public Criteria andIduploadsNotIn(List<Integer> values) {
            addCriterion("idUploads not in", values, "iduploads");
            return (Criteria) this;
        }

        public Criteria andIduploadsBetween(Integer value1, Integer value2) {
            addCriterion("idUploads between", value1, value2, "iduploads");
            return (Criteria) this;
        }

        public Criteria andIduploadsNotBetween(Integer value1, Integer value2) {
            addCriterion("idUploads not between", value1, value2, "iduploads");
            return (Criteria) this;
        }

        public Criteria andDoccatIddoccatIsNull() {
            addCriterion("Doccat_idDoccat is null");
            return (Criteria) this;
        }

        public Criteria andDoccatIddoccatIsNotNull() {
            addCriterion("Doccat_idDoccat is not null");
            return (Criteria) this;
        }

        public Criteria andDoccatIddoccatEqualTo(Integer value) {
            addCriterion("Doccat_idDoccat =", value, "doccatIddoccat");
            return (Criteria) this;
        }

        public Criteria andDoccatIddoccatNotEqualTo(Integer value) {
            addCriterion("Doccat_idDoccat <>", value, "doccatIddoccat");
            return (Criteria) this;
        }

        public Criteria andDoccatIddoccatGreaterThan(Integer value) {
            addCriterion("Doccat_idDoccat >", value, "doccatIddoccat");
            return (Criteria) this;
        }

        public Criteria andDoccatIddoccatGreaterThanOrEqualTo(Integer value) {
            addCriterion("Doccat_idDoccat >=", value, "doccatIddoccat");
            return (Criteria) this;
        }

        public Criteria andDoccatIddoccatLessThan(Integer value) {
            addCriterion("Doccat_idDoccat <", value, "doccatIddoccat");
            return (Criteria) this;
        }

        public Criteria andDoccatIddoccatLessThanOrEqualTo(Integer value) {
            addCriterion("Doccat_idDoccat <=", value, "doccatIddoccat");
            return (Criteria) this;
        }

        public Criteria andDoccatIddoccatIn(List<Integer> values) {
            addCriterion("Doccat_idDoccat in", values, "doccatIddoccat");
            return (Criteria) this;
        }

        public Criteria andDoccatIddoccatNotIn(List<Integer> values) {
            addCriterion("Doccat_idDoccat not in", values, "doccatIddoccat");
            return (Criteria) this;
        }

        public Criteria andDoccatIddoccatBetween(Integer value1, Integer value2) {
            addCriterion("Doccat_idDoccat between", value1, value2, "doccatIddoccat");
            return (Criteria) this;
        }

        public Criteria andDoccatIddoccatNotBetween(Integer value1, Integer value2) {
            addCriterion("Doccat_idDoccat not between", value1, value2, "doccatIddoccat");
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

        public Criteria andIdapplicationIsNull() {
            addCriterion("idApplication is null");
            return (Criteria) this;
        }

        public Criteria andIdapplicationIsNotNull() {
            addCriterion("idApplication is not null");
            return (Criteria) this;
        }

        public Criteria andIdapplicationEqualTo(Integer value) {
            addCriterion("idApplication =", value, "idapplication");
            return (Criteria) this;
        }

        public Criteria andIdapplicationNotEqualTo(Integer value) {
            addCriterion("idApplication <>", value, "idapplication");
            return (Criteria) this;
        }

        public Criteria andIdapplicationGreaterThan(Integer value) {
            addCriterion("idApplication >", value, "idapplication");
            return (Criteria) this;
        }

        public Criteria andIdapplicationGreaterThanOrEqualTo(Integer value) {
            addCriterion("idApplication >=", value, "idapplication");
            return (Criteria) this;
        }

        public Criteria andIdapplicationLessThan(Integer value) {
            addCriterion("idApplication <", value, "idapplication");
            return (Criteria) this;
        }

        public Criteria andIdapplicationLessThanOrEqualTo(Integer value) {
            addCriterion("idApplication <=", value, "idapplication");
            return (Criteria) this;
        }

        public Criteria andIdapplicationIn(List<Integer> values) {
            addCriterion("idApplication in", values, "idapplication");
            return (Criteria) this;
        }

        public Criteria andIdapplicationNotIn(List<Integer> values) {
            addCriterion("idApplication not in", values, "idapplication");
            return (Criteria) this;
        }

        public Criteria andIdapplicationBetween(Integer value1, Integer value2) {
            addCriterion("idApplication between", value1, value2, "idapplication");
            return (Criteria) this;
        }

        public Criteria andIdapplicationNotBetween(Integer value1, Integer value2) {
            addCriterion("idApplication not between", value1, value2, "idapplication");
            return (Criteria) this;
        }

        public Criteria andUploadsPathIsNull() {
            addCriterion("Uploads_path is null");
            return (Criteria) this;
        }

        public Criteria andUploadsPathIsNotNull() {
            addCriterion("Uploads_path is not null");
            return (Criteria) this;
        }

        public Criteria andUploadsPathEqualTo(String value) {
            addCriterion("Uploads_path =", value, "uploadsPath");
            return (Criteria) this;
        }

        public Criteria andUploadsPathNotEqualTo(String value) {
            addCriterion("Uploads_path <>", value, "uploadsPath");
            return (Criteria) this;
        }

        public Criteria andUploadsPathGreaterThan(String value) {
            addCriterion("Uploads_path >", value, "uploadsPath");
            return (Criteria) this;
        }

        public Criteria andUploadsPathGreaterThanOrEqualTo(String value) {
            addCriterion("Uploads_path >=", value, "uploadsPath");
            return (Criteria) this;
        }

        public Criteria andUploadsPathLessThan(String value) {
            addCriterion("Uploads_path <", value, "uploadsPath");
            return (Criteria) this;
        }

        public Criteria andUploadsPathLessThanOrEqualTo(String value) {
            addCriterion("Uploads_path <=", value, "uploadsPath");
            return (Criteria) this;
        }

        public Criteria andUploadsPathLike(String value) {
            addCriterion("Uploads_path like", value, "uploadsPath");
            return (Criteria) this;
        }

        public Criteria andUploadsPathNotLike(String value) {
            addCriterion("Uploads_path not like", value, "uploadsPath");
            return (Criteria) this;
        }

        public Criteria andUploadsPathIn(List<String> values) {
            addCriterion("Uploads_path in", values, "uploadsPath");
            return (Criteria) this;
        }

        public Criteria andUploadsPathNotIn(List<String> values) {
            addCriterion("Uploads_path not in", values, "uploadsPath");
            return (Criteria) this;
        }

        public Criteria andUploadsPathBetween(String value1, String value2) {
            addCriterion("Uploads_path between", value1, value2, "uploadsPath");
            return (Criteria) this;
        }

        public Criteria andUploadsPathNotBetween(String value1, String value2) {
            addCriterion("Uploads_path not between", value1, value2, "uploadsPath");
            return (Criteria) this;
        }

        public Criteria andUploadsCountIsNull() {
            addCriterion("Uploads_count is null");
            return (Criteria) this;
        }

        public Criteria andUploadsCountIsNotNull() {
            addCriterion("Uploads_count is not null");
            return (Criteria) this;
        }

        public Criteria andUploadsCountEqualTo(Integer value) {
            addCriterion("Uploads_count =", value, "uploadsCount");
            return (Criteria) this;
        }

        public Criteria andUploadsCountNotEqualTo(Integer value) {
            addCriterion("Uploads_count <>", value, "uploadsCount");
            return (Criteria) this;
        }

        public Criteria andUploadsCountGreaterThan(Integer value) {
            addCriterion("Uploads_count >", value, "uploadsCount");
            return (Criteria) this;
        }

        public Criteria andUploadsCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("Uploads_count >=", value, "uploadsCount");
            return (Criteria) this;
        }

        public Criteria andUploadsCountLessThan(Integer value) {
            addCriterion("Uploads_count <", value, "uploadsCount");
            return (Criteria) this;
        }

        public Criteria andUploadsCountLessThanOrEqualTo(Integer value) {
            addCriterion("Uploads_count <=", value, "uploadsCount");
            return (Criteria) this;
        }

        public Criteria andUploadsCountIn(List<Integer> values) {
            addCriterion("Uploads_count in", values, "uploadsCount");
            return (Criteria) this;
        }

        public Criteria andUploadsCountNotIn(List<Integer> values) {
            addCriterion("Uploads_count not in", values, "uploadsCount");
            return (Criteria) this;
        }

        public Criteria andUploadsCountBetween(Integer value1, Integer value2) {
            addCriterion("Uploads_count between", value1, value2, "uploadsCount");
            return (Criteria) this;
        }

        public Criteria andUploadsCountNotBetween(Integer value1, Integer value2) {
            addCriterion("Uploads_count not between", value1, value2, "uploadsCount");
            return (Criteria) this;
        }

        public Criteria andUploadsTitleIsNull() {
            addCriterion("Uploads_title is null");
            return (Criteria) this;
        }

        public Criteria andUploadsTitleIsNotNull() {
            addCriterion("Uploads_title is not null");
            return (Criteria) this;
        }

        public Criteria andUploadsTitleEqualTo(String value) {
            addCriterion("Uploads_title =", value, "uploadsTitle");
            return (Criteria) this;
        }

        public Criteria andUploadsTitleNotEqualTo(String value) {
            addCriterion("Uploads_title <>", value, "uploadsTitle");
            return (Criteria) this;
        }

        public Criteria andUploadsTitleGreaterThan(String value) {
            addCriterion("Uploads_title >", value, "uploadsTitle");
            return (Criteria) this;
        }

        public Criteria andUploadsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Uploads_title >=", value, "uploadsTitle");
            return (Criteria) this;
        }

        public Criteria andUploadsTitleLessThan(String value) {
            addCriterion("Uploads_title <", value, "uploadsTitle");
            return (Criteria) this;
        }

        public Criteria andUploadsTitleLessThanOrEqualTo(String value) {
            addCriterion("Uploads_title <=", value, "uploadsTitle");
            return (Criteria) this;
        }

        public Criteria andUploadsTitleLike(String value) {
            addCriterion("Uploads_title like", value, "uploadsTitle");
            return (Criteria) this;
        }

        public Criteria andUploadsTitleNotLike(String value) {
            addCriterion("Uploads_title not like", value, "uploadsTitle");
            return (Criteria) this;
        }

        public Criteria andUploadsTitleIn(List<String> values) {
            addCriterion("Uploads_title in", values, "uploadsTitle");
            return (Criteria) this;
        }

        public Criteria andUploadsTitleNotIn(List<String> values) {
            addCriterion("Uploads_title not in", values, "uploadsTitle");
            return (Criteria) this;
        }

        public Criteria andUploadsTitleBetween(String value1, String value2) {
            addCriterion("Uploads_title between", value1, value2, "uploadsTitle");
            return (Criteria) this;
        }

        public Criteria andUploadsTitleNotBetween(String value1, String value2) {
            addCriterion("Uploads_title not between", value1, value2, "uploadsTitle");
            return (Criteria) this;
        }

        public Criteria andUploadsOthersIsNull() {
            addCriterion("Uploads_others is null");
            return (Criteria) this;
        }

        public Criteria andUploadsOthersIsNotNull() {
            addCriterion("Uploads_others is not null");
            return (Criteria) this;
        }

        public Criteria andUploadsOthersEqualTo(String value) {
            addCriterion("Uploads_others =", value, "uploadsOthers");
            return (Criteria) this;
        }

        public Criteria andUploadsOthersNotEqualTo(String value) {
            addCriterion("Uploads_others <>", value, "uploadsOthers");
            return (Criteria) this;
        }

        public Criteria andUploadsOthersGreaterThan(String value) {
            addCriterion("Uploads_others >", value, "uploadsOthers");
            return (Criteria) this;
        }

        public Criteria andUploadsOthersGreaterThanOrEqualTo(String value) {
            addCriterion("Uploads_others >=", value, "uploadsOthers");
            return (Criteria) this;
        }

        public Criteria andUploadsOthersLessThan(String value) {
            addCriterion("Uploads_others <", value, "uploadsOthers");
            return (Criteria) this;
        }

        public Criteria andUploadsOthersLessThanOrEqualTo(String value) {
            addCriterion("Uploads_others <=", value, "uploadsOthers");
            return (Criteria) this;
        }

        public Criteria andUploadsOthersLike(String value) {
            addCriterion("Uploads_others like", value, "uploadsOthers");
            return (Criteria) this;
        }

        public Criteria andUploadsOthersNotLike(String value) {
            addCriterion("Uploads_others not like", value, "uploadsOthers");
            return (Criteria) this;
        }

        public Criteria andUploadsOthersIn(List<String> values) {
            addCriterion("Uploads_others in", values, "uploadsOthers");
            return (Criteria) this;
        }

        public Criteria andUploadsOthersNotIn(List<String> values) {
            addCriterion("Uploads_others not in", values, "uploadsOthers");
            return (Criteria) this;
        }

        public Criteria andUploadsOthersBetween(String value1, String value2) {
            addCriterion("Uploads_others between", value1, value2, "uploadsOthers");
            return (Criteria) this;
        }

        public Criteria andUploadsOthersNotBetween(String value1, String value2) {
            addCriterion("Uploads_others not between", value1, value2, "uploadsOthers");
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