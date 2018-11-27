package mc.kurunegala.bop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mc.kurunegala.bop.dao.BOPMapper;


@Service
public class BopService {
	
	@Autowired
	BOPMapper mapper;

}
