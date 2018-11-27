package mc.kurunegala.bop.model;

public class ApplicationCatagory {
    private Integer idapplicationCatagory;

    private String applicationName;

    private Integer applicationCatagoryStatus;

    private Integer applicationCatagorySyn;

    public Integer getIdapplicationCatagory() {
        return idapplicationCatagory;
    }

    public void setIdapplicationCatagory(Integer idapplicationCatagory) {
        this.idapplicationCatagory = idapplicationCatagory;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName == null ? null : applicationName.trim();
    }

    public Integer getApplicationCatagoryStatus() {
        return applicationCatagoryStatus;
    }

    public void setApplicationCatagoryStatus(Integer applicationCatagoryStatus) {
        this.applicationCatagoryStatus = applicationCatagoryStatus;
    }

    public Integer getApplicationCatagorySyn() {
        return applicationCatagorySyn;
    }

    public void setApplicationCatagorySyn(Integer applicationCatagorySyn) {
        this.applicationCatagorySyn = applicationCatagorySyn;
    }
}