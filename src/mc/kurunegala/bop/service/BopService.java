package mc.kurunegala.bop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mc.kurunegala.bop.dao.BOPMapper;
import mc.kurunegala.bop.model.BOP;
import mc.kurunegala.bop.model.BOPWithBLOBs;
import mc.kurunegala.bop.model.Customer;

@Service
public class BopService {

	@Autowired
	BOPMapper mapper;

	public void add(BOPWithBLOBs bop) {
		mapper.insertSelective(bop);
	}

	public String getMaxAssessmentNumber() {
		return mapper.viewMaxBopNo();
	}

}
