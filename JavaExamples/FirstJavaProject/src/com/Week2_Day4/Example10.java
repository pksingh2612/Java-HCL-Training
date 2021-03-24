package com.Week2_Day4;
class Test implements interfaceA,interfaceB{
	
	@Override 
	public void display() {
		interfaceB.super.display();
		interfaceA.super.display();
	}
}
public class Example10 {

	public static void main(String[] args) {
		
		Test t = new Test();
		t.display(); // it call both interface default method
	}
}
