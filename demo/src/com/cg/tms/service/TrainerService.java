package com.cg.tms.service;

import java.util.List;

import com.cg.tms.exception.TMSException;
import com.cg.tms.model.TrainerDetails;

public interface TrainerService {

	

	List<TrainerDetails> getdetails(String location, String technology) throws TMSException;

}
