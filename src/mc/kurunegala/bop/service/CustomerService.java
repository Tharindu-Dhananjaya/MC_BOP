package mc.kurunegala.bop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mc.kurunegala.bop.dao.CustomerMapper;
import mc.kurunegala.bop.model.Customer;

@Service
public class CustomerService {

	@Autowired
	CustomerMapper mapper;
	
	public void add(Customer customer) {
		mapper.insertSelective(customer);
	}

	public void update(Customer customer) {
		mapper.updateByPrimaryKeySelective(customer);
	}
}
