package com.Week1_Day5;

abstract class A{
    
}

public class Example1 {

	 public static void main(String[] args) throws InstantiationException, ClassNotFoundException, IllegalAccessException
	    {
	        Class c=Class.forName("A"); 
	          A a=(A)c.newInstance();//we are creating object
	        System.out.println(a);
	    }
	        
}
