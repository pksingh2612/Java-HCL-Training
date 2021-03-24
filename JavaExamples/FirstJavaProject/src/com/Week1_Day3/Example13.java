package com.Week1_Day3;
abstract class A5{
    void show() {
        System.out.println("Hello");
    }
}
public class Example13 {

	public static void main(String[] args) {
		A5 a=new A5(){
		    
		    public void show() {
		        System.out.println("hi");
		        
		    }

		 

		    };
		    a.show();

	}

}
