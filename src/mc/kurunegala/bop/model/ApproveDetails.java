package mc.kurunegala.bop.model;

import java.util.Date;

public class ApproveDetails {
    private Integer idapproveDetails;

    private Double pricing;

    private Integer statusApprovDetails;

    private String others;

    private Date dateApproveDetails;

    private Integer sendToApproveIdsendToApprove;

    private String comment;

    public Integer getIdapproveDetails() {
        return idapproveDetails;
    }

    public void setIdapproveDetails(Integer idapproveDetails) {
        this.idapproveDetails = idapproveDetails;
    }

    public Double getPricing() {
        return pricing;
    }

    public void setPricing(Double pricing) {
        this.pricing = pricing;
    }

    public Integer getStatusApprovDetails() {
        return statusApprovDetails;
    }

    public void setStatusApprovDetails(Integer statusApprovDetails) {
        this.statusApprovDetails = statusApprovDetails;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others == null ? null : others.trim();
    }

    public Date getDateApproveDetails() {
        return dateApproveDetails;
    }

    public void setDateApproveDetails(Date dateApproveDetails) {
        this.dateApproveDetails = dateApproveDetails;
    }

    public Integer getSendToApproveIdsendToApprove() {
        return sendToApproveIdsendToApprove;
    }

    public void setSendToApproveIdsendToApprove(Integer sendToApproveIdsendToApprove) {
        this.sendToApproveIdsendToApprove = sendToApproveIdsendToApprove;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}