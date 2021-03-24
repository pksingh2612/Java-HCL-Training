package com.Week2_Day5;

public class Example10 {

	public static void status() {
		System.out.println("Thread is running");
	}
	public static void main(String[] args) {
		Thread t1= new Thread(()->System.out.println("using lambda"));
		t1.run();
		
		Thread t2= new Thread(Example10::status); // method reference of static method
		t2.run();
	}
}
