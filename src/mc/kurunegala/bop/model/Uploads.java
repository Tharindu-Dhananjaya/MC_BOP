package mc.kurunegala.bop.model;

public class Uploads {
    private Integer iduploads;

    private Integer doccatIddoccat;

    private Integer applicationCatagoryIdapplicationCatagory;

    private Integer idapplication;

    private String uploadsPath;

    private Integer uploadsCount;

    private String uploadsTitle;

    private String uploadsOthers;

    public Integer getIduploads() {
        return iduploads;
    }

    public void setIduploads(Integer iduploads) {
        this.iduploads = iduploads;
    }

    public Integer getDoccatIddoccat() {
        return doccatIddoccat;
    }

    public void setDoccatIddoccat(Integer doccatIddoccat) {
        this.doccatIddoccat = doccatIddoccat;
    }

    public Integer getApplicationCatagoryIdapplicationCatagory() {
        return applicationCatagoryIdapplicationCatagory;
    }

    public void setApplicationCatagoryIdapplicationCatagory(Integer applicationCatagoryIdapplicationCatagory) {
        this.applicationCatagoryIdapplicationCatagory = applicationCatagoryIdapplicationCatagory;
    }

    public Integer getIdapplication() {
        return idapplication;
    }

    public void setIdapplication(Integer idapplication) {
        this.idapplication = idapplication;
    }

    public String getUploadsPath() {
        return uploadsPath;
    }

    public void setUploadsPath(String uploadsPath) {
        this.uploadsPath = uploadsPath == null ? null : uploadsPath.trim();
    }

    public Integer getUploadsCount() {
        return uploadsCount;
    }

    public void setUploadsCount(Integer uploadsCount) {
        this.uploadsCount = uploadsCount;
    }

    public String getUploadsTitle() {
        return uploadsTitle;
    }

    public void setUploadsTitle(String uploadsTitle) {
        this.uploadsTitle = uploadsTitle == null ? null : uploadsTitle.trim();
    }

    public String getUploadsOthers() {
        return uploadsOthers;
    }

    public void setUploadsOthers(String uploadsOthers) {
        this.uploadsOthers = uploadsOthers == null ? null : uploadsOthers.trim();
    }
}