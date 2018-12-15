package mc.kurunegala.bop.model;

public class Dipartment {
    private Integer iddipartment;

    private String dipName;

    private String dipHead;

    private Integer dipStatus;

    private Integer dipSyn;

    public Integer getIddipartment() {
        return iddipartment;
    }

    public void setIddipartment(Integer iddipartment) {
        this.iddipartment = iddipartment;
    }

    public String getDipName() {
        return dipName;
    }

    public void setDipName(String dipName) {
        this.dipName = dipName == null ? null : dipName.trim();
    }

    public String getDipHead() {
        return dipHead;
    }

    public void setDipHead(String dipHead) {
        this.dipHead = dipHead == null ? null : dipHead.trim();
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