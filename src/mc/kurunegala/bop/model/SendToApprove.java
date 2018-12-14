package mc.kurunegala.bop.model;

import java.util.Date;

public class SendToApprove {
    private Integer idsendToApprove;

    private Integer approvalByIdapprovalBy;

    private Integer sendToUser;

    private Integer statusApprove;

    private Date sendDateTime;

    private String sendToApprovecol;

    private Integer sendByUser;

    private Integer applicationId;

    private Integer applicationCatagoryIdapplicationCatagory;

    public Integer getIdsendToApprove() {
        return idsendToApprove;
    }

    public void setIdsendToApprove(Integer idsendToApprove) {
        this.idsendToApprove = idsendToApprove;
    }

    public Integer getApprovalByIdapprovalBy() {
        return approvalByIdapprovalBy;
    }

    public void setApprovalByIdapprovalBy(Integer approvalByIdapprovalBy) {
        this.approvalByIdapprovalBy = approvalByIdapprovalBy;
    }

    public Integer getSendToUser() {
        return sendToUser;
    }

    public void setSendToUser(Integer sendToUser) {
        this.sendToUser = sendToUser;
    }

    public Integer getStatusApprove() {
        return statusApprove;
    }

    public void setStatusApprove(Integer statusApprove) {
        this.statusApprove = statusApprove;
    }

    public Date getSendDateTime() {
        return sendDateTime;
    }

    public void setSendDateTime(Date sendDateTime) {
        this.sendDateTime = sendDateTime;
    }

    public String getSendToApprovecol() {
        return sendToApprovecol;
    }

    public void setSendToApprovecol(String sendToApprovecol) {
        this.sendToApprovecol = sendToApprovecol == null ? null : sendToApprovecol.trim();
    }

    public Integer getSendByUser() {
        return sendByUser;
    }

    public void setSendByUser(Integer sendByUser) {
        this.sendByUser = sendByUser;
    }

    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    public Integer getApplicationCatagoryIdapplicationCatagory() {
        return applicationCatagoryIdapplicationCatagory;
    }

    public void setApplicationCatagoryIdapplicationCatagory(Integer applicationCatagoryIdapplicationCatagory) {
        this.applicationCatagoryIdapplicationCatagory = applicationCatagoryIdapplicationCatagory;
    }
}