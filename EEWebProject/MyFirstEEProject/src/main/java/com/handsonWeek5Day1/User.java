package com.handsonWeek5Day1;

public class User {
	   private int userid;
	   private String name;
	   private int age;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userid, String name, int age) {
		super();
		this.userid = userid;
		this.name = name;
		this.age = age;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
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
