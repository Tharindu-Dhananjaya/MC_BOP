package mc.kurunegala.bop.model;

public class UserHasDipartment {
	private Integer iduserHasDepartment;

	private Integer userIduser;

	private Integer dipartmentIddipartment;

	public Integer getIduserHasDepartment() {
		return iduserHasDepartment;
	}

	public void setIduserHasDepartment(Integer iduserHasDepartment) {
		this.iduserHasDepartment = iduserHasDepartment;
	}

	public Integer getUserIduser() {
		return userIduser;
	}

	public void setUserIduser(Integer userIduser) {
		this.userIduser = userIduser;
	}

	public Integer getDipartmentIddipartment() {
		return dipartmentIddipartment;
	}

	public void setDipartmentIddipartment(Integer dipartmentIddipartment) {
		this.dipartmentIddipartment = dipartmentIddipartment;
	}

	public Dipartment getDipartment() {
		return dipartment;
	}

	public void setDipartment(Dipartment dipartment) {
		this.dipartment = dipartment;
	}

	private Dipartment dipartment;
}