package mc.kurunegala.bop.model;

import java.util.Date;

public class UserLogin {
    private Integer iduserLogin;

    private Date userLoginIn;

    private Date userLoginOut;

    private Integer userIduser;

    private Integer userLoginSyn;

    public Integer getIduserLogin() {
        return iduserLogin;
    }

    public void setIduserLogin(Integer iduserLogin) {
        this.iduserLogin = iduserLogin;
    }

    public Date getUserLoginIn() {
        return userLoginIn;
    }

    public void setUserLoginIn(Date userLoginIn) {
        this.userLoginIn = userLoginIn;
    }

    public Date getUserLoginOut() {
        return userLoginOut;
    }

    public void setUserLoginOut(Date userLoginOut) {
        this.userLoginOut = userLoginOut;
    }

    public Integer getUserIduser() {
        return userIduser;
    }

    public void setUserIduser(Integer userIduser) {
        this.userIduser = userIduser;
    }

    public Integer getUserLoginSyn() {
        return userLoginSyn;
    }

    public void setUserLoginSyn(Integer userLoginSyn) {
        this.userLoginSyn = userLoginSyn;
    }
}