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

import com.pack.model.Student;
import com.pack.service.StudentService;

@Controller
public class StudentController {

	Logger logger = Logger.getLogger(StudentController.class);
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/")
	public String studentRegistrationPage(ModelMap m) {
		logger.info("Inside studentRegistrationPage() ");
		Student student = new Student();
		m.addAttribute("studentForm",student);
		return "StudentRegister";
	}
	
	@RequestMapping(value="/insertStu",method=RequestMethod.POST)
	public String saveStudent(@Validated @ModelAttribute("studentForm") Student student,BindingResult result,ModelMap map) {
		logger.info("Inside saveStudent() ");
		String viewPage="";
		if(result.hasErrors()) {
			viewPage="StudentRegister";
		}
		else {
			Random r = new Random();
			int stuId=r.nextInt(99999)+10000;
			student.setSid(stuId);
			studentService.insertStudent(student);
			List<Student> stuList = studentService.fetchAllStudent();
			map.addAttribute("studentList",stuList);
			viewPage="StudentSuccess";
		}
		return viewPage;
	}
	
	@RequestMapping(value="/deleteStu/{id}")
	public String deleteStudent(@PathVariable("id") Integer stuId,ModelMap map) {
		logger.info("Inside deleteStudent() ");
		studentService.deleteStudent(stuId);
		List<Student> stuList = studentService.fetchAllStudent();
		map.addAttribute("studentList",stuList);
		return "StudentSuccess";
	}
	
	@RequestMapping(value="/fetchById/{eid}")
	public String fetchStudentById(@PathVariable("eid") Integer stuId,ModelMap map) {
		logger.info("Inside fetchStudentById() ");
		Student student = studentService.fetchStudentById(stuId);
		map.addAttribute("editForm",student);
		return "StudentUpdate";
	}
	
	@RequestMapping(value="/updateStu",method=RequestMethod.POST)
	public String updateStudent(@Validated @ModelAttribute("editForm") Student student,BindingResult result,ModelMap map) {
		logger.info("Inside updateEmployee() ");
		String viewPage="";
		if(result.hasErrors()) {
			viewPage="StudentUpdate";
		}
		else {
			studentService.updateStudent(student);
			List<Student> stuList = studentService.fetchAllStudent();
			map.addAttribute("studentList",stuList);
			viewPage="StudentSuccess";
		}
		return viewPage;
	}
}
