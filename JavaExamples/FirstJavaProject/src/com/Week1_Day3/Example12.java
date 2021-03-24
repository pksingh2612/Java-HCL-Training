package com.Week1_Day3;

abstract class A4{
    abstract void callme();
    void show() {
        System.out.println("normal method");
    
        
    }
}
 class B4 extends A4{
    void callme() {
        System.out.println("implementation of abstact method");
    
    }
}
public class Example12 {

	public static void main(String[] args) {
		B4 b=new B4();
        b.callme();
        b.show();
		
	}

}
