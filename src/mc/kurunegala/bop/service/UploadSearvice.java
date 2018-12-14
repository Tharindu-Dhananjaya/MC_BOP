package mc.kurunegala.bop.service;

import java.util.List;

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

	public List<Uploads> viewByBopId(Integer bopIdbop) {
		return mapper.selectByBopId(bopIdbop);
	}

}
