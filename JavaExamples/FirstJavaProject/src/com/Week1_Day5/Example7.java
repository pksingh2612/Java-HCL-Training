package com.Week1_Day5;

public class Example7 {
	static void throwDemo() throws NullPointerException{
		System.out.println("Inside throwsDemo");
		throw new NullPointerException("demo");
	}
		
		public static void main(String[] args) {
			try {
				throwDemo();
			}
			catch(NullPointerException e) {
				System.out.println("caught");
			}
		}
}
