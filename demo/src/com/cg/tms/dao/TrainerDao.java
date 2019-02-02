package com.cg.tms.dao;

import java.util.List;

import com.cg.tms.exception.TMSException;
import com.cg.tms.model.TrainerDetails;

public interface TrainerDao {


	List<TrainerDetails> getdetails(String location, String technology) throws TMSException;

}
