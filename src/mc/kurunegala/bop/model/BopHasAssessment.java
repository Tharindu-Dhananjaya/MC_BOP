package mc.kurunegala.bop.model;

public class BopHasAssessment {
    private Integer idbopHasAssessmentcol;

	private Integer bopIdbop;

	private Integer assessmentIdassessment;

	private Integer bopHasAssessmentStatus;

	public Integer getIdbopHasAssessmentcol() {
		return idbopHasAssessmentcol;
	}

	public void setIdbopHasAssessmentcol(Integer idbopHasAssessmentcol) {
		this.idbopHasAssessmentcol = idbopHasAssessmentcol;
	}

	public Integer getBopIdbop() {
		return bopIdbop;
	}

	public void setBopIdbop(Integer bopIdbop) {
		this.bopIdbop = bopIdbop;
	}

	public Integer getAssessmentIdassessment() {
		return assessmentIdassessment;
	}

	public void setAssessmentIdassessment(Integer assessmentIdassessment) {
		this.assessmentIdassessment = assessmentIdassessment;
	}

	public Integer getBopHasAssessmentStatus() {
		return bopHasAssessmentStatus;
	}

	public void setBopHasAssessmentStatus(Integer bopHasAssessmentStatus) {
		this.bopHasAssessmentStatus = bopHasAssessmentStatus;
	}

	    public Assessment getAssessment() {
		return assessment;
	}

	public void setAssessment(Assessment assessment) {
		this.assessment = assessment;
	}

	public BOP getBop() {
		return bop;
	}

	public void setBop(BOP bop) {
		this.bop = bop;
	}

	private Assessment assessment;
    private BOP bop;
}