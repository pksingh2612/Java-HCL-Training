package com.Week1_Day4;

public class Example8 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hellohellohellohello");
        System.out.println(sb);//hello
        System.out.println(sb.length()); //5
        System.out.println(sb.capacity()); //16+5=21
        
        sb.ensureCapacity(21);
        System.out.println(sb.capacity());
        
        StringBuffer sb1=new StringBuffer();
        System.out.println(sb1.capacity());
        sb1.ensureCapacity(18);
        System.out.println(sb1.capacity()); //16+16+2=34
        
        StringBuffer sb2=new StringBuffer("hello");
        System.out.println(sb2);
        System.out.println(sb2.length());
        sb2.setLength(2);
        System.out.println(sb2); //he
        System.out.println(sb2.charAt(1));//e
        sb2.setCharAt(1, 'i');
        System.out.println(sb2);//hi
        
        StringBuffer sb3=new StringBuffer("I Java");
        sb3.insert(2,"like");
        System.out.println(sb3);
        
        StringBuffer sb4=new StringBuffer();
        sb4.append("hello");
        System.out.println(sb4);//hello
        sb4.append("world");
        System.out.println(sb4);//helloworld
        
        StringBuffer sb5=new StringBuffer("abcd");
        System.out.println(sb5.reverse()); //dcba
        
        StringBuffer sb6=new StringBuffer("this is a test");
        System.out.println(sb6); //this is a test
        sb6.delete(5,  8);
        System.out.println(sb6); //this is a test
        sb6.deleteCharAt(0);
        System.out.println(sb6); //his a test
        
        StringBuffer sb7=new StringBuffer("this is  a test");
        sb7.replace(5, 8, "was");
        System.out.println(sb7);
        
        
	}

}
