package com.cg.tms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.cg.tms.exception.TMSException;
import com.cg.tms.model.TrainerDetails;
import com.cg.tms.utility.JdbcUtility;

public class TrainerDaoImpl implements TrainerDao {
	static Logger logger = Logger.getLogger(TrainerDaoImpl.class);
	PreparedStatement statement = null;
	Connection connection = null;
	@Override
	public List<TrainerDetails> getdetails(String location, String technology) throws TMSException {
		logger.info("");
		List<TrainerDetails> list = new ArrayList<>();
		ResultSet resultSet = null;
		connection = JdbcUtility.getConnection();
		logger.info("");
		try {
			logger.info("");
			statement = connection.prepareStatement(QueryMapper.getTrainersDetails);
			statement.setString(1, location);
			statement.setString(2, technology);
			resultSet = statement.executeQuery();
			logger.info("");
			while (resultSet.next()) 
			{
				logger.info("");
				int id=resultSet.getInt(1);
				String name=resultSet.getString(2);
				String location1=resultSet.getString(3);
				String designation=resultSet.getString(4);
				String technology1=resultSet.getString(5);
				String contactNo=resultSet.getString(6);
				TrainerDetails details=new TrainerDetails();
				details.setId(id);
				details.setName(name);
				details.setLocation(location1);
				details.setDesignation(designation);
				details.setTechnology(technology1);
				details.setContactNo(contactNo);
				list.add(details);
				logger.info("");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

}
