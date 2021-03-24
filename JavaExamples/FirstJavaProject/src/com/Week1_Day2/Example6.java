package com.Week1_Day2;

class A{
    A()
    {
        this(3.13f);
        System.out.println("1");
    }
    A(int a){
        this();
        System.out.println("2");
        
    }
    A(String s){
        this(10);
        System.out.println("3");
    }
    A(float f){
        System.out.println("4");
    }
}
public class Example6 {
	 public static void main(String []args)
    {
    //A a1=new A();
    //A a2=new A(10);
    A a3=new A("hello");
    //A a4=new A("3.14f");
	}
}
