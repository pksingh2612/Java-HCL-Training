package com.Week2_Day3;

class Newhread1 extends Thread{
	
	NewThread1(){
		super("Demothread");
		System.out.println("Child Thread"+this); // Thread[DempThread,5,main]
		start();
		
	}
	public void run() {
		
	}
}
public class Example5 {

	public static void main(String[] args) {
		Newhread1 n = new Newhread1();
		try {
			for(int i=5;i>0;i--) {
				System.out.println("Main Thread "+i);
				
			}
		}

	}

}
