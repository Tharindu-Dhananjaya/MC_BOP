package mc.kurunegala.bop.model;

import org.springframework.web.multipart.MultipartFile;

public class UploadWrapper {
	
	private MultipartFile fileData;
	private NeedDoc needDoc;
	private String bopNo;
	

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

	public String getBopNo() {
		return bopNo;
	}

	public void setBopNo(String bopNo) {
		this.bopNo = bopNo;
	}

}
