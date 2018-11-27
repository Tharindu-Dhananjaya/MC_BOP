package mc.kurunegala.bop.model;

public class Ward {
    private Integer idward;

    private String wardNo;

    private String wardName;

    private Integer wardStatus;

    private Integer wardSyn;

    private String wardComment;

    public Integer getIdward() {
        return idward;
    }

    public void setIdward(Integer idward) {
        this.idward = idward;
    }

    public String getWardNo() {
        return wardNo;
    }

    public void setWardNo(String wardNo) {
        this.wardNo = wardNo == null ? null : wardNo.trim();
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName == null ? null : wardName.trim();
    }

    public Integer getWardStatus() {
        return wardStatus;
    }

    public void setWardStatus(Integer wardStatus) {
        this.wardStatus = wardStatus;
    }

    public Integer getWardSyn() {
        return wardSyn;
    }

    public void setWardSyn(Integer wardSyn) {
        this.wardSyn = wardSyn;
    }

    public String getWardComment() {
        return wardComment;
    }

    public void setWardComment(String wardComment) {
        this.wardComment = wardComment == null ? null : wardComment.trim();
    }
}