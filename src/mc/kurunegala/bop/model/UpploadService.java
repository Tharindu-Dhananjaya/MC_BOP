package mc.kurunegala.bop.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mc.kurunegala.bop.dao.UploadsMapper;

@Service
public class UpploadService {
	@Autowired
	UploadsMapper mapper;

	public void add(Uploads entity) {
		mapper.insertSelective(entity);
	}

}
