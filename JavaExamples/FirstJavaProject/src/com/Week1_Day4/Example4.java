package com.Week1_Day4;

public class Example4 {

	public static void main(String[] args) {
		 Boolean b1=new Boolean("true");
	        System.out.println(b1);
	        Boolean b2=new Boolean("false");
	        System.out.println(b2);
	        Boolean b3=new Boolean("true");
	        System.out.println(b3);
	        Boolean b4=new Boolean("false");
	        System.out.println(b4);
	        Boolean b5=new Boolean("hello");
	        System.out.println(b5);
	        Boolean b6=new Boolean("true");
	        System.out.println(b6);
	        Boolean b7=b3;
	        Boolean b8=b5;
	        int r=0;
	        if(b1.equals(b2)) r=0;
	        if(b2.equals(b5)) r=r+1;
	        if(b4.equals(b5)) r=r+10;
	    if(b7==b3) r=r+100;
	    System.out.println("false");
	}

}
