package com.pack.dao;


import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pack.model.Employee;
import com.pack.service.EmployeeServiceImpl;

@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao{
Logger logger = Logger.getLogger(EmployeeDaoImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void insertEmployee(Employee emp) {
		logger.info("Inside insertEmployee() dao");
		sessionFactory.getCurrentSession().save(emp);
	}
	
	@Override
	public List<Employee> fetchAllEmployee() {
		logger.info("Inside fetchAllEmployee() dao");
		Query q=sessionFactory.getCurrentSession().createQuery("select e from Employee e");
		List elist=q.list();
		return elist;
	}
	
	@Override
	public void deleteEmployee(int empId) {
		logger.info("Inside deleteEmployee() dao");
		Employee emp = (Employee)sessionFactory.getCurrentSession().get(Employee.class,empId);
		sessionFactory.getCurrentSession().delete(emp);
		
//		Query q = sessionFactory.getCurrentSession().createQuery("delete from Employee e where e.employeeid=?");
//		q.setParameter(0, empId);
//		q.executeUpdate();
	}
	
	@Override
	public Employee fetchEmployeeById(int empId) {
		logger.info("Inside fetchEmployeeById() dao");
		Employee emp=(Employee)sessionFactory.getCurrentSession().get(Employee.class, empId);
		return emp;
	}
	
	@Override
	public void updateEmployee(Employee emp) {
		logger.info("Inside updateEmployee() dao");
		sessionFactory.getCurrentSession().update(emp);
	}
}
