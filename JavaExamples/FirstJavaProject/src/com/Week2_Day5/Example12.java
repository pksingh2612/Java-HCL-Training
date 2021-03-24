package com.Week2_Day5;

interface Messageable{
	Example12 getExample(String msg);
}
public class Example12 {
	Example12(String msg){
		System.out.println(msg);
	}
	public static void main(String[] args) {
		Messageable m = Example12::new; //method reference to a constructor
		
	}

}
