package mc.kurunegala.bop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mc.kurunegala.bop.dao.UploadsMapper;
import mc.kurunegala.bop.model.Uploads;

@Service
public class UploadSearvice {
	@Autowired
	UploadsMapper mapper;

	public void add(Uploads upload) {
		mapper.insertSelective(upload);
	}

}
