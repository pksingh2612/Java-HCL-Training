package com.pack.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
	
	@RequestMapping(value="/emp/{id}")
	public String getEmployee(@PathVariable("id")int id, ModelMap map) throws Exception {
		String result="";
		if(id==1) {
			map.addAttribute("message","Hello World");
			result="home";
		}
		else if(id==2) {
			throw new EmployeeNotFoundException(); //creating user-defined exception
		}
		
		return result;
	}
	
	@ExceptionHandler(EmployeeNotFoundException.class)
	public String handleEmployeeNotFoundException(HttpServletRequest req, Exception e, ModelMap map) {
		map.addAttribute("url",req.getRequestURL());
		map.addAttribute("ex", e);
		return "error";
	}
}
