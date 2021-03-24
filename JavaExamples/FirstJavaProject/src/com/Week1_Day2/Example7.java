package com.Week1_Day2;

class OverLoadDemo{
	void test() {
		System.out.println("No parameters");
	}
	
	void test(int a) {
		System.out.println("a = "+a);
	}
	
	void test(int a,int b) {
		System.out.println("a = "+a+" b = "+b);
	}
	
	double test(double a) {
		return a*a;
	}
}

public class Example7 {

	public static void main(String[] args) {
		OverLoadDemo ob =new OverLoadDemo();
		ob.test();
		ob.test(10);
		ob.test(10,20);
		double var = ob.test(10.01);
		System.out.println("Var = "+var);
	}

}
