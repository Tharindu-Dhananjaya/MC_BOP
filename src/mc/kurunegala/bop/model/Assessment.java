package mc.kurunegala.bop.model;

public class Assessment {
    private Integer idassessment;

    private Integer customerIdcustomer;

    private Integer wardIdward;

    private Integer streetIdstreet;

    private Integer assNatureIdassNature;

    private Integer assDiscriptionIdassDiscription;

    private Integer userIduser;

    private Double assessmentOder;

    private String assessmentNo;

    private Integer assessmentStatus;

    private Integer assessmentSyn;

    private String assessmentComment;

    private String assessmentObsolete;

    public Integer getIdassessment() {
        return idassessment;
    }

    public void setIdassessment(Integer idassessment) {
        this.idassessment = idassessment;
    }

    public Integer getCustomerIdcustomer() {
        return customerIdcustomer;
    }

    public void setCustomerIdcustomer(Integer customerIdcustomer) {
        this.customerIdcustomer = customerIdcustomer;
    }

    public Integer getWardIdward() {
        return wardIdward;
    }

    public void setWardIdward(Integer wardIdward) {
        this.wardIdward = wardIdward;
    }

    public Integer getStreetIdstreet() {
        return streetIdstreet;
    }

    public void setStreetIdstreet(Integer streetIdstreet) {
        this.streetIdstreet = streetIdstreet;
    }

    public Integer getAssNatureIdassNature() {
        return assNatureIdassNature;
    }

    public void setAssNatureIdassNature(Integer assNatureIdassNature) {
        this.assNatureIdassNature = assNatureIdassNature;
    }

    public Integer getAssDiscriptionIdassDiscription() {
        return assDiscriptionIdassDiscription;
    }

    public void setAssDiscriptionIdassDiscription(Integer assDiscriptionIdassDiscription) {
        this.assDiscriptionIdassDiscription = assDiscriptionIdassDiscription;
    }

    public Integer getUserIduser() {
        return userIduser;
    }

    public void setUserIduser(Integer userIduser) {
        this.userIduser = userIduser;
    }

    public Double getAssessmentOder() {
        return assessmentOder;
    }

    public void setAssessmentOder(Double assessmentOder) {
        this.assessmentOder = assessmentOder;
    }

    public String getAssessmentNo() {
        return assessmentNo;
    }

    public void setAssessmentNo(String assessmentNo) {
        this.assessmentNo = assessmentNo == null ? null : assessmentNo.trim();
    }

    public Integer getAssessmentStatus() {
        return assessmentStatus;
    }

    public void setAssessmentStatus(Integer assessmentStatus) {
        this.assessmentStatus = assessmentStatus;
    }

    public Integer getAssessmentSyn() {
        return assessmentSyn;
    }

    public void setAssessmentSyn(Integer assessmentSyn) {
        this.assessmentSyn = assessmentSyn;
    }

    public String getAssessmentComment() {
        return assessmentComment;
    }

    public void setAssessmentComment(String assessmentComment) {
        this.assessmentComment = assessmentComment == null ? null : assessmentComment.trim();
    }

    public String getAssessmentObsolete() {
        return assessmentObsolete;
    }

    public void setAssessmentObsolete(String assessmentObsolete) {
        this.assessmentObsolete = assessmentObsolete == null ? null : assessmentObsolete.trim();
    }
    
    public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	private Customer customer;
}