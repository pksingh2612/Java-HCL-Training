package com.Week2_Day5;
public class Example7 {

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("run");
			}
		});
		t.run();
		
		Thread t1 = new Thread(()->System.out.println("Running"));
		t1.run();
	}
}
