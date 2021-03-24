package com.Week1_Day3;

class A{
	int i;
}

class B extends A{
	int i;
	B(int a,int b){
		i=a;
		super.i=b;
	}
	
	void show() {
		System.out.println("i in A class "+super.i);
		System.out.println("i in B class "+i);
	}
}
public class Example2 {

	public static void main(String[] args) {
		B b= new B(1,2);
		b.show();	
	}
}
