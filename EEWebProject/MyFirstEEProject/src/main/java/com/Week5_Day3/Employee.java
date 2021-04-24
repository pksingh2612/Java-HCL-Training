package com.Week5_Day3;

import java.util.Date;

public class Employee {
	int empid;
	String name;
	int age;
	double salary;
	String dept;
	String gender;
	Date doj;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String name, int age, double salary, String dept, String gender, Date doj) {
		super();
		this.empid = empid;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.dept = dept;
		this.gender = gender;
		this.doj = doj;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	
}
