package com.day4;

public class Example8 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hellohellohellohello"); 
		System.out.println(sb);
		System.out.println(sb.length());// 20
		System.out.println(sb.capacity());// 16+20 = 38
		
		//sb.ensureCapacity(21);
	}

}
