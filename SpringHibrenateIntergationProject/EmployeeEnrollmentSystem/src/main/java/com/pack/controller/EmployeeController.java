package com.pack.controller;


import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pack.model.Employee;
import com.pack.service.EmployeeService;

@Controller
public class EmployeeController {
Logger logger = Logger.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value="/")
	public String employeeRegistrationPage(ModelMap m) {
		logger.info("Inside employeeRegistrationPage() ");
		Employee employee = new Employee();
		m.addAttribute("employeeForm",employee);
		return "EmployeeRegister";
	}
	
	@RequestMapping(value="/insertEmp",method=RequestMethod.POST)
	public String saveEmployee(@Validated @ModelAttribute("employeeForm") Employee employee,BindingResult result,ModelMap map) {
		logger.info("Inside saveEmployee() ");
		String viewPage="";
		if(result.hasErrors()) {
			viewPage="EmployeeRegister";
		}
		else {
			Random r = new Random();
			int empId=r.nextInt(99999)+10000;
			employee.setEmployeeid(empId);
			employeeService.insertEmployee(employee);
			List<Employee> empList = employeeService.fetchAllEmployee();
			map.addAttribute("employeeList",empList);
			viewPage="EmployeeSuccess";
		}
		return viewPage;
	}
	
	@RequestMapping(value="/deleteEmp/{id}")
	public String deleteEmployee(@PathVariable("id") Integer empId,ModelMap map) {
		logger.info("Inside deleteEmployee() ");
		employeeService.deleteEmployee(empId);
		List<Employee> empList = employeeService.fetchAllEmployee();
		map.addAttribute("employeeList",empList);
		return "EmployeeSuccess";
	}
	
	@RequestMapping(value="/fetchById/{eid}")
	public String fetchEmployeeById(@PathVariable("eid") Integer empId,ModelMap map) {
		logger.info("Inside fetchEmployeeById() ");
		Employee employee = employeeService.fetchEmployeeById(empId);
		map.addAttribute("editForm",employee);
		return "EmployeeUpdate";
	}
	
	@RequestMapping(value="/updateEmp",method=RequestMethod.POST)
	public String updateEmployee(@Validated @ModelAttribute("editForm") Employee employee,BindingResult result,ModelMap map) {
		logger.info("Inside updateEmployee() ");
		String viewPage="";
		if(result.hasErrors()) {
			viewPage="EmployeeUpdate";
		}
		else {
			employeeService.updateEmployee(employee);
			List<Employee> empList = employeeService.fetchAllEmployee();
			map.addAttribute("employeeList",empList);
			viewPage="EmployeeSuccess";
		}
		return viewPage;
	}
}
