package mc.kurunegala.bop.model;

import java.util.Date;

public class Customer {
    private Integer idcustomer;

    private String cusName;

    private String cusNic;

    private String cusMobile;

    private String cusTel;

    private String cusAddressL1;

    private String cusAddressL2;

    private String cusAddressL3;

    private String cusSity;

    private Integer cusStatus;

    private Integer cusSyn;

    private Date cusRegDate;

    private Date cusUpdateDate;

    public Integer getIdcustomer() {
        return idcustomer;
    }

    public void setIdcustomer(Integer idcustomer) {
        this.idcustomer = idcustomer;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName == null ? null : cusName.trim();
    }

    public String getCusNic() {
        return cusNic;
    }

    public void setCusNic(String cusNic) {
        this.cusNic = cusNic == null ? null : cusNic.trim();
    }

    public String getCusMobile() {
        return cusMobile;
    }

    public void setCusMobile(String cusMobile) {
        this.cusMobile = cusMobile == null ? null : cusMobile.trim();
    }

    public String getCusTel() {
        return cusTel;
    }

    public void setCusTel(String cusTel) {
        this.cusTel = cusTel == null ? null : cusTel.trim();
    }

    public String getCusAddressL1() {
        return cusAddressL1;
    }

    public void setCusAddressL1(String cusAddressL1) {
        this.cusAddressL1 = cusAddressL1 == null ? null : cusAddressL1.trim();
    }

    public String getCusAddressL2() {
        return cusAddressL2;
    }

    public void setCusAddressL2(String cusAddressL2) {
        this.cusAddressL2 = cusAddressL2 == null ? null : cusAddressL2.trim();
    }

    public String getCusAddressL3() {
        return cusAddressL3;
    }

    public void setCusAddressL3(String cusAddressL3) {
        this.cusAddressL3 = cusAddressL3 == null ? null : cusAddressL3.trim();
    }

    public String getCusSity() {
        return cusSity;
    }

    public void setCusSity(String cusSity) {
        this.cusSity = cusSity == null ? null : cusSity.trim();
    }

    public Integer getCusStatus() {
        return cusStatus;
    }

    public void setCusStatus(Integer cusStatus) {
        this.cusStatus = cusStatus;
    }

    public Integer getCusSyn() {
        return cusSyn;
    }

    public void setCusSyn(Integer cusSyn) {
        this.cusSyn = cusSyn;
    }

    public Date getCusRegDate() {
        return cusRegDate;
    }

    public void setCusRegDate(Date cusRegDate) {
        this.cusRegDate = cusRegDate;
    }

    public Date getCusUpdateDate() {
        return cusUpdateDate;
    }

    public void setCusUpdateDate(Date cusUpdateDate) {
        this.cusUpdateDate = cusUpdateDate;
    }
}