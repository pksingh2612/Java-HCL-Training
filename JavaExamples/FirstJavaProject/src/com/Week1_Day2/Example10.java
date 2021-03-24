package com.Week1_Day2;

public class Example10 {

	static int a=3;
	static int b;
	
	static {
		System.out.println("Static block initialized");
		b=a*4;
	}
	static void meth(int x) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
	}
	public static void main(String[] args) {
		meth(43);
	}

}
