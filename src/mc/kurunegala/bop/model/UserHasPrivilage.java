package mc.kurunegala.bop.model;

public class UserHasPrivilage {
    private Integer iduserHasPrivilage;

    private Integer userIduser;

    private Integer privilageIdprivilage;

    private Integer userHasPrivilageStatus;

    private Integer userHasPrivilageSyn;

    public Integer getIduserHasPrivilage() {
        return iduserHasPrivilage;
    }

    public void setIduserHasPrivilage(Integer iduserHasPrivilage) {
        this.iduserHasPrivilage = iduserHasPrivilage;
    }

    public Integer getUserIduser() {
        return userIduser;
    }

    public void setUserIduser(Integer userIduser) {
        this.userIduser = userIduser;
    }

    public Integer getPrivilageIdprivilage() {
        return privilageIdprivilage;
    }

    public void setPrivilageIdprivilage(Integer privilageIdprivilage) {
        this.privilageIdprivilage = privilageIdprivilage;
    }

    public Integer getUserHasPrivilageStatus() {
        return userHasPrivilageStatus;
    }

    public void setUserHasPrivilageStatus(Integer userHasPrivilageStatus) {
        this.userHasPrivilageStatus = userHasPrivilageStatus;
    }

    public Integer getUserHasPrivilageSyn() {
        return userHasPrivilageSyn;
    }

    public void setUserHasPrivilageSyn(Integer userHasPrivilageSyn) {
        this.userHasPrivilageSyn = userHasPrivilageSyn;
    }
}