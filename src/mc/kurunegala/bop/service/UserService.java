package mc.kurunegala.bop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mc.kurunegala.bop.dao.UserMapper;
import mc.kurunegala.bop.model.User;

@Service
public class UserService {

	@Autowired
	UserMapper mapper;

	public User viewByUserNameAndPassword(String userName, String password) {
		return mapper.viewForLogin(userName, password);
	}
}
