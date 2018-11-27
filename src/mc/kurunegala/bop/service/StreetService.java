package mc.kurunegala.bop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mc.kurunegala.bop.dao.StreetMapper;
import mc.kurunegala.bop.model.Street;

@Service
public class StreetService {
	
	@Autowired
	StreetMapper mapper;
	
	public List<Street> viewAll(){
		return mapper.selectByState(1);
	}

}
