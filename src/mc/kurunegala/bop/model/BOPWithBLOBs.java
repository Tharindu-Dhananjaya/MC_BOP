package mc.kurunegala.bop.model;

import java.util.List;

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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<BopHasAssessment> getBopHasAssessment() {
		return bopHasAssessment;
	}

	public void setBopHasAssessment(List<BopHasAssessment> bopHasAssessment) {
		this.bopHasAssessment = bopHasAssessment;
	}

	public List<Uploads> getUploads() {
		return uploads;
	}

	public void setUploads(List<Uploads> uploads) {
		this.uploads = uploads;
	}

	public List<Area> getAreas() {
		return areas;
	}

	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}

	private Customer customer;
	private List<BopHasAssessment> bopHasAssessment;
	private List<Uploads> uploads;
	private List<Area> areas;
}