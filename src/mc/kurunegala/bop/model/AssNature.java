package mc.kurunegala.bop.model;

public class AssNature {
    private Integer idassNature;

    private String assNatureName;

    private Double assNatureYearRate;

    private Integer assNatureStatus;

    private Double assNatureWarrantRate;

    public Integer getIdassNature() {
        return idassNature;
    }

    public void setIdassNature(Integer idassNature) {
        this.idassNature = idassNature;
    }

    public String getAssNatureName() {
        return assNatureName;
    }

    public void setAssNatureName(String assNatureName) {
        this.assNatureName = assNatureName == null ? null : assNatureName.trim();
    }

    public Double getAssNatureYearRate() {
        return assNatureYearRate;
    }

    public void setAssNatureYearRate(Double assNatureYearRate) {
        this.assNatureYearRate = assNatureYearRate;
    }

    public Integer getAssNatureStatus() {
        return assNatureStatus;
    }

    public void setAssNatureStatus(Integer assNatureStatus) {
        this.assNatureStatus = assNatureStatus;
    }

    public Double getAssNatureWarrantRate() {
        return assNatureWarrantRate;
    }

    public void setAssNatureWarrantRate(Double assNatureWarrantRate) {
        this.assNatureWarrantRate = assNatureWarrantRate;
    }
}