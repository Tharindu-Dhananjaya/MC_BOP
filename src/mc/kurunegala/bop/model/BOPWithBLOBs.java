package mc.kurunegala.bop.model;

public class BOPWithBLOBs extends BOP {
    private String bopDiscription;

    private String bopCondtion;

    private String bopRegulation;

    public String getBopDiscription() {
        return bopDiscription;
    }

    public void setBopDiscription(String bopDiscription) {
        this.bopDiscription = bopDiscription == null ? null : bopDiscription.trim();
    }

    public String getBopCondtion() {
        return bopCondtion;
    }

    public void setBopCondtion(String bopCondtion) {
        this.bopCondtion = bopCondtion == null ? null : bopCondtion.trim();
    }

    public String getBopRegulation() {
        return bopRegulation;
    }

    public void setBopRegulation(String bopRegulation) {
        this.bopRegulation = bopRegulation == null ? null : bopRegulation.trim();
    }
}