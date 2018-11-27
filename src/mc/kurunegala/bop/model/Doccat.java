package mc.kurunegala.bop.model;

public class Doccat {
    private Integer iddoccat;

    private String doccatName;

    public Integer getIddoccat() {
        return iddoccat;
    }

    public void setIddoccat(Integer iddoccat) {
        this.iddoccat = iddoccat;
    }

    public String getDoccatName() {
        return doccatName;
    }

    public void setDoccatName(String doccatName) {
        this.doccatName = doccatName == null ? null : doccatName.trim();
    }
}