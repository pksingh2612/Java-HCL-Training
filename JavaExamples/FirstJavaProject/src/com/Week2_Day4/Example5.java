package com.Week2_Day4;

import java.io.ByteArrayInputStream;

public class Example5 {

	public static void main(String[] args) {
		String temp="abc";
		byte b[]=temp.getBytes();  // store char in ascii form

		ByteArrayInputStream in = new ByteArrayInputStream(b);
		for(int i=0;i<2;i++) {
			int c;
			while((c=in.read())!=-1) {
				if(i==0) {
					System.out.println((char)c);
				}
				else {
					System.out.println(Character.toUpperCase((char)c));//A
				}
			}
			System.out.println();
			in.reset();
		}
	}

}
