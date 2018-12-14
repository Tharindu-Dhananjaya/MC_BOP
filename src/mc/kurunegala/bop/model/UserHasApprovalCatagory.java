package mc.kurunegala.bop.model;

public class UserHasApprovalCatagory {
    private Integer iduserHasApplicationCatagory;

    private Integer userIduser;

    private Integer applicationCatagoryIdapplicationCatagory;

    public Integer getIduserHasApplicationCatagory() {
        return iduserHasApplicationCatagory;
    }

    public void setIduserHasApplicationCatagory(Integer iduserHasApplicationCatagory) {
        this.iduserHasApplicationCatagory = iduserHasApplicationCatagory;
    }

    public Integer getUserIduser() {
        return userIduser;
    }

    public void setUserIduser(Integer userIduser) {
        this.userIduser = userIduser;
    }

    public Integer getApplicationCatagoryIdapplicationCatagory() {
        return applicationCatagoryIdapplicationCatagory;
    }

    public void setApplicationCatagoryIdapplicationCatagory(Integer applicationCatagoryIdapplicationCatagory) {
        this.applicationCatagoryIdapplicationCatagory = applicationCatagoryIdapplicationCatagory;
    }
}