package com.day2;

class A{
    A() {
    	this(3.13f);
		System.out.println("1");
	}
	A(int a) {
		this();
		System.out.println("2");
	}
	A(String s) {
		this();
		System.out.println("3");
	}
	A(float f) {
//		this(10);
		System.out.println("4");
	}
	
}
public class Example6 {
	public static void main(String[] args)
	{
		A a1 = new A("hello");
	}
}
