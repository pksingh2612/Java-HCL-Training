package com.Week2_Day5;

public class Person {
	int pid;
	String name;
	int age;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int pid, String name, int age) {
		super();
		this.pid = pid;
		this.name = name;
		this.age = age;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
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
}
