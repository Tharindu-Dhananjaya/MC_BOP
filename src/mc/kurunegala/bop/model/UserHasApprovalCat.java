package mc.kurunegala.bop.model;

public class UserHasApprovalCat {
    private Integer iduserHasApprovalCat;

    private Integer userIduser;

    private Integer approvalCatIdapprovalCat;

    private Integer dipStatus;

    private Integer dipSyn;

    public Integer getIduserHasApprovalCat() {
        return iduserHasApprovalCat;
    }

    public void setIduserHasApprovalCat(Integer iduserHasApprovalCat) {
        this.iduserHasApprovalCat = iduserHasApprovalCat;
    }

    public Integer getUserIduser() {
        return userIduser;
    }

    public void setUserIduser(Integer userIduser) {
        this.userIduser = userIduser;
    }

    public Integer getApprovalCatIdapprovalCat() {
        return approvalCatIdapprovalCat;
    }

    public void setApprovalCatIdapprovalCat(Integer approvalCatIdapprovalCat) {
        this.approvalCatIdapprovalCat = approvalCatIdapprovalCat;
    }

    public Integer getDipStatus() {
        return dipStatus;
    }

    public void setDipStatus(Integer dipStatus) {
        this.dipStatus = dipStatus;
    }

    public Integer getDipSyn() {
        return dipSyn;
    }

    public void setDipSyn(Integer dipSyn) {
        this.dipSyn = dipSyn;
    }
}