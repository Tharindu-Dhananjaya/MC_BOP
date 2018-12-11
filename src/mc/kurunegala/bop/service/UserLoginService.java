package mc.kurunegala.bop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mc.kurunegala.bop.dao.UserLoginMapper;
import mc.kurunegala.bop.model.UserLogin;

@Service
public class UserLoginService {

	@Autowired
	UserLoginMapper mapper;

	public void add(UserLogin log) {
		mapper.insert(log);
	}

	public void update(UserLogin log) {
		mapper.updateByPrimaryKeySelective(log);
	}

}
