package mc.kurunegala.bop.model;

import java.util.Date;

public class ApproveWrapper {
	
	private String ownership;
	private Date date;
	private String approval;
	private String comment;
	
	private String draftmenStatus;
	private String draftmentComment;
	private String engineerStatus;
	private String engineerComment;
	private String ToStatus;
	private String ToComment;
	public String getOwnership() {
		return ownership;
	}
	public void setOwnership(String ownership) {
		this.ownership = ownership;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getApproval() {
		return approval;
	}
	public void setApproval(String approval) {
		this.approval = approval;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getDraftmenStatus() {
		return draftmenStatus;
	}
	public void setDraftmenStatus(String draftmenStatus) {
		this.draftmenStatus = draftmenStatus;
	}
	public String getDraftmentComment() {
		return draftmentComment;
	}
	public void setDraftmentComment(String draftmentComment) {
		this.draftmentComment = draftmentComment;
	}
	public String getEngineerStatus() {
		return engineerStatus;
	}
	public void setEngineerStatus(String engineerStatus) {
		this.engineerStatus = engineerStatus;
	}
	public String getEngineerComment() {
		return engineerComment;
	}
	public void setEngineerComment(String engineerComment) {
		this.engineerComment = engineerComment;
	}
	public String getToStatus() {
		return ToStatus;
	}
	public void setToStatus(String toStatus) {
		ToStatus = toStatus;
	}
	public String getToComment() {
		return ToComment;
	}
	public void setToComment(String toComment) {
		ToComment = toComment;
	}

}
