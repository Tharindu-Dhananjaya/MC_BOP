package mc.kurunegala.bop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mc.kurunegala.bop.dao.WardMapper;
import mc.kurunegala.bop.model.Ward;

@Service
public class WardService {

	@Autowired
	WardMapper mapper;
	
	public List<Ward> viewAll(){
		return mapper.selectAllByState(1);
	}
}
