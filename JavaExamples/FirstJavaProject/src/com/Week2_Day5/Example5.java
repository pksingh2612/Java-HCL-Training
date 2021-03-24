package com.Week2_Day5;

interface Greeting{
	void perform();
}
class HelloWorldGreeting implements Greeting{
	@Override
	public void perform() {
		System.out.println("Hello world");
	}
}
public class Example5 {
	
	void greet(Greeting g) {
		g.perform();
	}

	public static void main(String[] args) {
		
	}

}
