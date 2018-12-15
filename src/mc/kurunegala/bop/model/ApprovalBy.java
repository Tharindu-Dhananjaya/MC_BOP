package mc.kurunegala.bop.model;

public class ApprovalBy {
    private Integer idapprovalBy;

    private Integer priority;

    private Integer applicationCatagoryIdapplicationCatagory;

    private Integer approvalCatIdapprovalCat;

    public Integer getIdapprovalBy() {
        return idapprovalBy;
    }

    public void setIdapprovalBy(Integer idapprovalBy) {
        this.idapprovalBy = idapprovalBy;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getApplicationCatagoryIdapplicationCatagory() {
        return applicationCatagoryIdapplicationCatagory;
    }

    public void setApplicationCatagoryIdapplicationCatagory(Integer applicationCatagoryIdapplicationCatagory) {
        this.applicationCatagoryIdapplicationCatagory = applicationCatagoryIdapplicationCatagory;
    }

    public Integer getApprovalCatIdapprovalCat() {
        return approvalCatIdapprovalCat;
    }

    public void setApprovalCatIdapprovalCat(Integer approvalCatIdapprovalCat) {
        this.approvalCatIdapprovalCat = approvalCatIdapprovalCat;
    }
}