package com.day4;

public class Example5 {

	public static void main(String[] args) {
		String s1 = new String("hello");
		System.out.println(s1);
		
		byte[] b = {65,66,67,68,69,70};
		String s2 =  new String(b);
		System.out.println(s2);
		
		String s3 = new String(b,2,3);
		System.out.println(s3);
	}
}
