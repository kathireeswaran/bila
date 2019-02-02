package com.cg.tms.service;

import java.util.List;

import com.cg.tms.dao.TrainerDao;
import com.cg.tms.dao.TrainerDaoImpl;
import com.cg.tms.exception.TMSException;
import com.cg.tms.model.TrainerDetails;

public class TrainerServiceImpl implements TrainerService {
TrainerDao dao=new TrainerDaoImpl();
	
	@Override
	public List<TrainerDetails> getdetails(String location, String technology) throws TMSException {
		// TODO Auto-generated method stub
		return dao.getdetails(location,technology);
	}

}
