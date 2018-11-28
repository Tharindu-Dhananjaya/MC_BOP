package mc.kurunegala.bop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mc.kurunegala.bop.dao.ApplicationCatagoryMapper;
import mc.kurunegala.bop.model.ApplicationCatagory;
import mc.kurunegala.bop.model.Assessment;


@Service
public class ApplicationCategoryService {
	
	@Autowired
	ApplicationCatagoryMapper mapper;
	
	public List<ApplicationCatagory> viewAllActive(int state){
		return mapper.selectAllByState(state);
	}
	
	

}
