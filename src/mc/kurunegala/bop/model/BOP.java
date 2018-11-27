package mc.kurunegala.bop.model;

import java.util.Date;

public class BOP {
    private Integer idbop;

    private Integer customerIdcustomer;

    private Date bopApplayDate;

    private String bopPlanNo;

    private String bopUrveyorsName;

    private String bopNo;

    private String bopIsMarkonground;

    private String bopOwnership;

    private Double bopTotalPrice;

    private Integer bopCompleteStatus;

    public Integer getIdbop() {
        return idbop;
    }

    public void setIdbop(Integer idbop) {
        this.idbop = idbop;
    }

    public Integer getCustomerIdcustomer() {
        return customerIdcustomer;
    }

    public void setCustomerIdcustomer(Integer customerIdcustomer) {
        this.customerIdcustomer = customerIdcustomer;
    }

    public Date getBopApplayDate() {
        return bopApplayDate;
    }

    public void setBopApplayDate(Date bopApplayDate) {
        this.bopApplayDate = bopApplayDate;
    }

    public String getBopPlanNo() {
        return bopPlanNo;
    }

    public void setBopPlanNo(String bopPlanNo) {
        this.bopPlanNo = bopPlanNo == null ? null : bopPlanNo.trim();
    }

    public String getBopUrveyorsName() {
        return bopUrveyorsName;
    }

    public void setBopUrveyorsName(String bopUrveyorsName) {
        this.bopUrveyorsName = bopUrveyorsName == null ? null : bopUrveyorsName.trim();
    }

    public String getBopNo() {
        return bopNo;
    }

    public void setBopNo(String bopNo) {
        this.bopNo = bopNo == null ? null : bopNo.trim();
    }

    public String getBopIsMarkonground() {
        return bopIsMarkonground;
    }

    public void setBopIsMarkonground(String bopIsMarkonground) {
        this.bopIsMarkonground = bopIsMarkonground == null ? null : bopIsMarkonground.trim();
    }

    public String getBopOwnership() {
        return bopOwnership;
    }

    public void setBopOwnership(String bopOwnership) {
        this.bopOwnership = bopOwnership == null ? null : bopOwnership.trim();
    }

    public Double getBopTotalPrice() {
        return bopTotalPrice;
    }

    public void setBopTotalPrice(Double bopTotalPrice) {
        this.bopTotalPrice = bopTotalPrice;
    }

    public Integer getBopCompleteStatus() {
        return bopCompleteStatus;
    }

    public void setBopCompleteStatus(Integer bopCompleteStatus) {
        this.bopCompleteStatus = bopCompleteStatus;
    }
}