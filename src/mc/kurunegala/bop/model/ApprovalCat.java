package mc.kurunegala.bop.model;

public class ApprovalCat {
    private Integer idapprovalCat;

    private String approvalName;

    private Integer statusAppCat;

    private Integer synAppCat;

    public Integer getIdapprovalCat() {
        return idapprovalCat;
    }

    public void setIdapprovalCat(Integer idapprovalCat) {
        this.idapprovalCat = idapprovalCat;
    }

    public String getApprovalName() {
        return approvalName;
    }

    public void setApprovalName(String approvalName) {
        this.approvalName = approvalName == null ? null : approvalName.trim();
    }

    public Integer getStatusAppCat() {
        return statusAppCat;
    }

    public void setStatusAppCat(Integer statusAppCat) {
        this.statusAppCat = statusAppCat;
    }

    public Integer getSynAppCat() {
        return synAppCat;
    }

    public void setSynAppCat(Integer synAppCat) {
        this.synAppCat = synAppCat;
    }
}