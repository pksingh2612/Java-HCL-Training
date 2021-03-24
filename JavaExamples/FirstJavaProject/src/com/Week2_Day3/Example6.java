package com.Week2_Day3;

class NewThread2 implements Runnable{
	
	Thread t;
    String tname;
	
	NewThread2(String name){
	    tname= name;
		t=new Thread(this,tname);
		System.out.println("Child Thread"+t); //Thread[one, 5, main] Thread[two,5,main] Thread[three, 5, main]
		t.start(); // starts one thread and put in runnable stage and comes to main method
	}
	@Override
	public void run()
	{
		try {
			for(int i=5;i>0;i--) {
				System.out.println(tname+" "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Child thread interrupted");
		}
		System.out.println("Child thread exiting");
	}
}
public class Example6 {

	public static void main(String[] args) {
		NewThread2 n = new NewThread2("one");
		NewThread2 n1 = new NewThread2("two");
		NewThread2 n2 = new NewThread2("three");
		
		System.out.println(n.t.isAlive()); //true
		System.out.println(n1.t.isAlive()); //true
		System.out.println(n2.t.isAlive()); //true
		
		try {
			n.t.join();
			n1.t.join();
			n2.t.join();
		}
		catch(InterruptedException e) {
			System.out.println("Main Thread interrupted");
		}
		
		System.out.println(n.t.isAlive()); //false
		System.out.println(n1.t.isAlive()); //false
		System.out.println(n2.t.isAlive()); //false
		System.out.println("Main thread exiting"); //false
		

	}

}
