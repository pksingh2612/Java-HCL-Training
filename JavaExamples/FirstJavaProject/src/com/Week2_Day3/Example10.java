package com.Week2_Day3;
class SampleThread extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isDaemon());
	}
}

public class Example10 {

	public static void main(String[] args) {
		
		SampleThread s1 = new SampleThread();
		SampleThread s2 = new SampleThread();
		
//		s1.setDaemon(true);
//		s1.start();
//		s2.start();
//		
//		Thread-0
//		true
//		Thread-1
//		false
		s1.start();
		s1.setDaemon(true);
		s2.start();
//		Output:
//		Exception in thread "main" Thread-0
//		false
//		java.lang.IllegalThreadStateException
//			at java.base/java.lang.Thread.setDaemon(Thread.java:1402)
//			at com.day8.Example10.main(Example10.java:25)
	}

}
