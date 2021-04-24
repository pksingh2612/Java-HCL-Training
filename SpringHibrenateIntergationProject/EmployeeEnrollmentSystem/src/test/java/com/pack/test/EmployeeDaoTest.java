package com.pack.test;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.pack.dao.EmployeeDao;
import com.pack.model.Employee;

@RunWith(SpringJUnit4ClassRunner.class) //indicates that the class should use Spring JUnit Facilities
@ContextConfiguration(locations= {"classpath:test-servlet.xml"}) //indicates which xml file contains all application context (or) bean info
@WebAppConfiguration //will load web specific AppilciationContext(ie) from src/java/webapp, that is , WebApplicationContext.
public class EmployeeDaoTest {
	@Autowired
	EmployeeDao employeeDao;
	
	@Test
	@Ignore
	public void testInsertEmployee() {
		Employee e = new Employee(20,"Ram Singh",24,"Chennai",new Date(),"male","pksingh345234@gmail.com");
		employeeDao.insertEmployee(e);
		Employee e1 = employeeDao.fetchEmployeeById(20);
		assertEquals(e1.getName(),e.getName());
	}
	
	@Test
	@Ignore
	public void testGetAllEmployee() {
		List<Employee> empList = employeeDao.fetchAllEmployee();
		assertEquals(empList.size(),13);
	}
	
	@Test
	@Ignore
	public void testDeleteEmployee() {
		employeeDao.deleteEmployee(20);
		List<Employee> empList = employeeDao.fetchAllEmployee();
		assertEquals(empList.size(),12);
	}
	
	@Test
	public void testUpdateEmployee() {
		Employee e1 = employeeDao.fetchEmployeeById(27350);
		e1.setAddress("Mumbai");
		employeeDao.updateEmployee(e1);
		Employee e2 = employeeDao.fetchEmployeeById(27350);
		assertEquals(e2.getAddress(),"Mumbai");
	}

}
