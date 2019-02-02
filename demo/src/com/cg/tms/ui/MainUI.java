package com.cg.tms.ui;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.cg.tms.exception.TMSException;
import com.cg.tms.model.TrainerDetails;
import com.cg.tms.service.TrainerService;
import com.cg.tms.service.TrainerServiceImpl;

public class MainUI {
	static Logger logger = Logger.getLogger(MainUI.class);
	public static void main(String[] args) {
		PropertyConfigurator.configure("resource/log4j.properties");
		Scanner scanner = new Scanner(System.in);
       boolean doFlag=false;
       String location;
       do{
    	   System.out.println("Enter Location");
    	   location=scanner.next();
    	   String regexLocation="[A-Z]{1}[a-z]*";
    	   boolean input=Pattern.matches(regexLocation, location);
    	   if(input==true)
    	   {
    		doFlag=true;
    	   }
    	   else
    		   System.err.println("invalid location name(first letter caps)");
       }while(!doFlag);
       doFlag=false;
       String technology;
       do{
    	   System.out.println("Enter technology");
    	   technology=scanner.next();
    	   String regextechnology="[a-z]*";
    	   boolean input=Pattern.matches(regextechnology, technology);
    	   if(input==true)
    		   doFlag=true;
    	   else
    		   System.err.println("invalid technology name(in smaller case)");
       }while(!doFlag);
       
       TrainerService service = new TrainerServiceImpl();
       try {
		List<TrainerDetails> list=service.getdetails(location,technology);
		if (!(list.isEmpty())) {
			System.out.println("ID" + "        " + "name" + "           " + "location"
					+ "        " + "designation" + "        " + "technology" + "        "
					+ "contactno");
			for (TrainerDetails trainerDetails : list) {
				System.out.println(trainerDetails.getId()+""+trainerDetails.getName()+""+trainerDetails.getLocation()+""+
			trainerDetails.getDesignation()+""+trainerDetails.getTechnology()+""+trainerDetails.getContactNo());
	
			}
			
		}
		else
		{
			System.err.println("SORRY NO TRAINERS PRESENT FOR  THE GIVEN CRITERIA");
		}
	} catch (TMSException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
