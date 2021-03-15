package com.day3;

public class Example18 {

	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1==s2);
		String s3=s2;
		System.out.println(s2==s3); //true
		
		String s4 = "hello"; // literal
		String s5 = "hello"; 
		System.out.println(s4.equals(s5)); //true
		// == works like equals() if we not using new operator
		System.out.println(s4==s5); // true
	}

}
