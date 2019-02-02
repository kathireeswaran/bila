package com.cg.tms.dao;

public interface QueryMapper {
	public static final String getTrainersDetails="SELECT * FROM trainer_details where location=? and technology=?";

}
