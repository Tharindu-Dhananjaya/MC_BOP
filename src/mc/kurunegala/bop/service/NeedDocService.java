package mc.kurunegala.bop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mc.kurunegala.bop.dao.NeedDocMapper;
import mc.kurunegala.bop.model.NeedDoc;

@Service
public class NeedDocService {

	@Autowired
	NeedDocMapper mapper;
	
	public List<NeedDoc> viewAll(){
		return mapper.viewAll();
	}

	public NeedDoc viewById(Integer idneeddoc) {
		return mapper.selectByPrimaryKey(idneeddoc);
	}
}
