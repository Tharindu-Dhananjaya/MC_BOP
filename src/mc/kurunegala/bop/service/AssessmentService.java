package mc.kurunegala.bop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mc.kurunegala.bop.dao.AssessmentMapper;
import mc.kurunegala.bop.model.Assessment;
import mc.kurunegala.bop.model.AssessmentSearcher;



@Service
public class AssessmentService {
	
	@Autowired
	AssessmentMapper mapper;
	
	public List<Assessment> viewAllActive(int state){
		return mapper.selectAllByState(state);
	}

	public List<Assessment> serachAssessment(AssessmentSearcher searcher) {
		return mapper.selectbySeracher(searcher);
	}

	public Assessment get(int id) {
		return mapper.selectByPrimaryKeyWithCustomer(id);
	}

}
