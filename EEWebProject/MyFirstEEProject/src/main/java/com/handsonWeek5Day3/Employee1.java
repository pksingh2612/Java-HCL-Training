package com.handsonWeek5Day3;

public class Employee1 {
 private int empId;
 private String name;
 private int age;
 private String gender;
 private String deptname;
 private int basic;
 private String grade;
public Employee1() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee1(int empId, String name, int age, String gender, String deptname, int basic, String grade) {
	super();
	this.empId = empId;
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.deptname = deptname;
	this.basic = basic;
	this.grade = grade;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
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
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getDeptname() {
	return deptname;
}
public void setDeptname(String deptname) {
	this.deptname = deptname;
}
public int getBasic() {
	return basic;
}
public void setBasic(int basic) {
	this.basic = basic;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
 
}
