/**
 * 
 */
package com.cg.tms.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cg.tms.dao.TrainerDao;
import com.cg.tms.dao.TrainerDaoImpl;
import com.cg.tms.exception.TMSException;
import com.cg.tms.model.TrainerDetails;

/**
 * @author 
 *
 */
public class TrainerDaoImplTest {

	/**
	 * @throws java.lang.Exception
	 */
	TrainerDao dao=null;
	@Before
	public void setUp() throws Exception {
		dao=new TrainerDaoImpl();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		dao=null;
	}

	/**
	 * Test method for {@link com.cg.tms.dao.TrainerDaoImpl#getdetails(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testGetdetails() {
		int value;
		try {
			
			List<TrainerDetails> list=dao.getdetails("Mumbai","jee");
			if(list.isEmpty())
				value=0;
			else
				value=1;
			assertEquals(1, value);
		} catch (TMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
