package mc.kurunegala.bop.model;

import org.springframework.web.multipart.MultipartFile;

public class BOPWrapper {

	private BOPWithBLOBs bop;
	private Area rea;
	private Uploads uplload;
	private MultipartFile fileData;
	private NeedDoc needDoc;
	private Assessment assessment;

	private String perch;
	private String landMarkComleted;
	private String landType;

	public BOPWithBLOBs getBop() {
		if (bop == null)
			bop = new BOPWithBLOBs();

		return bop;
	}

	public void setBop(BOPWithBLOBs bop) {
		this.bop = bop;
	}

	public Area getRea() {
		return rea;
	}

	public void setRea(Area rea) {
		this.rea = rea;
	}

	public Uploads getUplload() {
		return uplload;
	}

	public void setUplload(Uploads uplload) {
		this.uplload = uplload;
	}

	public MultipartFile getFileData() {
		return fileData;
	}

	public void setFileData(MultipartFile fileData) {
		this.fileData = fileData;
	}

	public NeedDoc getNeedDoc() {
		return needDoc;
	}

	public void setNeedDoc(NeedDoc needDoc) {
		this.needDoc = needDoc;
	}

	public String getPerch() {
		return perch;
	}

	public void setPerch(String perch) {
		this.perch = perch;
	}

	public Assessment getAssessment() {
		return assessment;
	}

	public void setAssessment(Assessment assessment) {
		this.assessment = assessment;
	}

	public String getLandMarkComleted() {
		return landMarkComleted;
	}

	public void setLandMarkComleted(String landMarkComleted) {
		this.landMarkComleted = landMarkComleted;
	}

	public String getLandType() {
		return landType;
	}

	public void setLandType(String landType) {
		this.landType = landType;
	}

}
