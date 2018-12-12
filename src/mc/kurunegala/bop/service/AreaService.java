package mc.kurunegala.bop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mc.kurunegala.bop.dao.AreaMapper;
import mc.kurunegala.bop.model.Area;


@Service
public class AreaService {
	@Autowired
	AreaMapper mapper;

	public void add(Area area) {
		mapper.insertSelective(area);
	}

}
