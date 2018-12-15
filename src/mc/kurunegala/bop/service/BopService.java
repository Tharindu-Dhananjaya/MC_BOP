package mc.kurunegala.bop.service;

import java.util.List;

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

	public BOPWithBLOBs viewByBopNo(String bopNo) {
		return mapper.selectByBopNo(bopNo);
	}

	public void update(BOPWithBLOBs bop) {
		mapper.updateByPrimaryKeySelective(bop);
	}

	public BOPWithBLOBs get(Integer bopIdbop) {
		return mapper.selectByPrimaryKey(bopIdbop);
	}

	public List<BOPWithBLOBs> viewByState(int state) {
		return mapper.selectByState(state);
	}

	public BOPWithBLOBs viewByBopId(Integer bopIdbop) {
		return mapper.selectByPrimaryKeyWithExtra(bopIdbop);
	}

}
