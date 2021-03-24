package com.Week2_Day3;

public class Example3 {

	public static void main(String[] args) {
		Thread t= Thread.currentThread();
		System.out.println(t);
		t.setName("DemoThread");
		System.out.println(t);
		try {
			for(int i=5;i>0;i--) {
				System.out.println(i);
				Thread.sleep(1000); // in milisecond
				t.interrupt();
			}
		}
		catch(InterruptedException e) {
			System.out.println("Main thread interrupted");
		}

	}

}
