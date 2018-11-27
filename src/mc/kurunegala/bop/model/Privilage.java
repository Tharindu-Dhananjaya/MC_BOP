package mc.kurunegala.bop.model;

public class Privilage {
    private Integer idprivilage;

    private String view;

    private String btn;

    private Double arange;

    public Integer getIdprivilage() {
        return idprivilage;
    }

    public void setIdprivilage(Integer idprivilage) {
        this.idprivilage = idprivilage;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view == null ? null : view.trim();
    }

    public String getBtn() {
        return btn;
    }

    public void setBtn(String btn) {
        this.btn = btn == null ? null : btn.trim();
    }

    public Double getArange() {
        return arange;
    }

    public void setArange(Double arange) {
        this.arange = arange;
    }
}