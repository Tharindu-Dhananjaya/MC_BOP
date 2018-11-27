package mc.kurunegala.bop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mc.kurunegala.bop.dao.UserLoginMapper;


@Service
public class UserLoginService {

	@Autowired
	UserLoginMapper mapper;
	
}
