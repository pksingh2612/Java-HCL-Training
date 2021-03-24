package com.Week3_Day2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestEmployeeLogic {
	Employee emp=null;
	EmployeeLogic empl=null;

	@Before
	public void setUp() throws Exception {
		emp = new Employee();
		empl= new EmployeeLogic();
	}

	@After
	public void tearDown() throws Exception {
		emp=null;
		empl=null;
	}

	@Test
	public void testcalculateYearlyTest() {
		emp.setName("ram");
		emp.setAge(24);
		emp.setSalary(10000);
		double salary=empl.calculateYearlySalary(emp);
		assertEquals(120000,salary,0.0);
		
	}
	@Test
	@Ignore
	public void testcalculateAppraisal() {
		emp.setName("ram");
		emp.setAge(24);
		emp.setSalary(10000);
		double appraisal=empl.calculateAppraisal(emp);
		assertEquals(11000,appraisal,0.0);
		
	}

}