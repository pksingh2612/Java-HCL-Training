package com.Week2_Day3;

class Sample extends Thread{
	public void run() {
		System.out.println("Child thread called");
	}
}

public class Example9 {

	public static void main(String[] args) {
		Sample s = new Sample();
		s.start();
		
//		s.start();
//		s.start(); 
		//if we try to call already running thread then //java.lang.IllegalThreadStateException then 

		

	}

}
