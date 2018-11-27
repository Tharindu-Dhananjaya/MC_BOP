package mc.kurunegala.bop.model;

public class Street {
    private Integer idstreet;

    private String streetName;

    private String streetNo;

    private Integer streetStatus;

    private Integer streetSyn;

    private String streetComent;

    private Integer wardIdward;

    public Integer getIdstreet() {
        return idstreet;
    }

    public void setIdstreet(Integer idstreet) {
        this.idstreet = idstreet;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName == null ? null : streetName.trim();
    }

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo == null ? null : streetNo.trim();
    }

    public Integer getStreetStatus() {
        return streetStatus;
    }

    public void setStreetStatus(Integer streetStatus) {
        this.streetStatus = streetStatus;
    }

    public Integer getStreetSyn() {
        return streetSyn;
    }

    public void setStreetSyn(Integer streetSyn) {
        this.streetSyn = streetSyn;
    }

    public String getStreetComent() {
        return streetComent;
    }

    public void setStreetComent(String streetComent) {
        this.streetComent = streetComent == null ? null : streetComent.trim();
    }

    public Integer getWardIdward() {
        return wardIdward;
    }

    public void setWardIdward(Integer wardIdward) {
        this.wardIdward = wardIdward;
    }
}