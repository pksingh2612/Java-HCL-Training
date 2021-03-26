package com.Week3_Day5;

import java.util.Date;

public class Employee {
	private int empid;
	private String ename;
	private int age;
	private double salary;
	private Date dob;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String ename, int age, double salary, Date dob) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.age = age;
		this.salary = salary;
		this.dob = dob;
	}
	
	
}
