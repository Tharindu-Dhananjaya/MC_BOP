package mc.kurunegala.bop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mc.kurunegala.bop.dao.ApprovalCatMapper;


@Service
public class ApprualCatService {

	@Autowired
	ApprovalCatMapper mapper;
	
}
