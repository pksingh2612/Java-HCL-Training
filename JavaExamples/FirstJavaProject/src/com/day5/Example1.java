package com.day5;

abstract class A{
	
}
public class Example1 {

	public static void main(String[] args) throws InstantiationException{
		
		Class c= Class.forName("A.class");
		c.newInstance();// we are creating object at runtime
	}

}
