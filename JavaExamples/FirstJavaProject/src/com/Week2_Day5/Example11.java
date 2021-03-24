package com.Week2_Day5;

interface Drawable{
	void draw();
}
public class Example11 {
	
	public static void draw1(){
		System.out.println("using method reference static method");
	}
	
	public void draw2(){
		System.out.println("using method reference instance method");
	}

	public static void main(String[] args) {
		Drawable d = ()-> System.out.println("Using lambda");
		d.draw();
		
		Drawable d1 = Example11:: draw1;
		d1.draw();
		
		Example11 e = new Example11();
		Drawable d2 = e::draw2; // method reference of instance method
		d2.draw();
		
		
	}

}
