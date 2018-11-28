package mc.kurunegala.bop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mc.kurunegala.bop.dao.BopHasAssessmentMapper;
import mc.kurunegala.bop.model.BopHasAssessment;

@Service
public class BopHasAssessmentService {
	
	@Autowired
	BopHasAssessmentMapper mapper;
	
	public List<BopHasAssessment> viewAllByState(int state){
		return mapper.selectByState(state);
	}

}
