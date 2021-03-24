package com.Week2_Day5;

interface Sayable{
	void say();
}
public class Example9 {
	
	public static void doSomething() {
		System.out.println("Hello World");
	}
	public static void main(String[] args) {
		Sayable s=()-> System.out.println("using functional interface");
		s.say();
		
		Sayable s1 = Example9::doSomething; // Method Reference using Static Method
		s1.say();
	}

}
