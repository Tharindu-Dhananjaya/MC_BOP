package mc.kurunegala.bop.model;

public class AssDiscription {
    private Integer idassDiscription;

    private String assDiscription;

    private String assDiscriptionStatus;

    public Integer getIdassDiscription() {
        return idassDiscription;
    }

    public void setIdassDiscription(Integer idassDiscription) {
        this.idassDiscription = idassDiscription;
    }

    public String getAssDiscription() {
        return assDiscription;
    }

    public void setAssDiscription(String assDiscription) {
        this.assDiscription = assDiscription == null ? null : assDiscription.trim();
    }

    public String getAssDiscriptionStatus() {
        return assDiscriptionStatus;
    }

    public void setAssDiscriptionStatus(String assDiscriptionStatus) {
        this.assDiscriptionStatus = assDiscriptionStatus == null ? null : assDiscriptionStatus.trim();
    }
}