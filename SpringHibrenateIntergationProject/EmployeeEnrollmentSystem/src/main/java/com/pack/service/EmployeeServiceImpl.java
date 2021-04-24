package com.pack.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pack.dao.EmployeeDao;
import com.pack.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	Logger logger = Logger.getLogger(EmployeeServiceImpl.class);
	@Autowired 
	private EmployeeDao employeeDao;
	
	@Override
	public void insertEmployee(Employee emp1) {
		logger.info("Inside insertEmployee() service");
		employeeDao.insertEmployee(emp1);
	}
	
	@Override
	public List<Employee> fetchAllEmployee(){
		logger.info("Inside fetchAllEmployee() service");
		List<Employee> empList = employeeDao.fetchAllEmployee();
		return empList;
	}
	
	@Override
	public void deleteEmployee(int empId) {
		logger.info("Inside deleteEmployee() service");
		employeeDao.deleteEmployee(empId);
	}
	
	@Override
	public Employee fetchEmployeeById(int empId) {
		logger.info("Inside fetchEmployeeById() service");
		Employee emp=employeeDao.fetchEmployeeById(empId);
		return emp;
	}
	
	@Override
	public void updateEmployee(Employee emp) {
		logger.info("Inside updateEmployee() service");
		employeeDao.updateEmployee(emp);
	}
}
