package com.Week1_Day5;

public class Example6 {
	
	static void demoA() {
		try {
			System.out.println("Inside demoA");
			throw new RuntimeException();
		}
		catch(RuntimeException e) {
			System.out.println("Exception handling here in A static component");
		}
		finally {
			System.out.println("Inside demoA finially");
		}
	}
	static void demoB() {
		try {
			System.out.println("Inside demoB");
			return;
		}
		finally {
			System.out.println("Inside demoB finially");
		}
	}
	static void demoC() {
		try {
			System.out.println("Inside demoC");
		}
		finally {
			System.out.println("Inside demoC finially");
		}
	}

	public static void main(String[] args) {
		try {
			demoA();
		}
		catch(RuntimeException e) {
			System.out.println("Exception caught");
		}
		demoB();
		demoC();

	}

}
