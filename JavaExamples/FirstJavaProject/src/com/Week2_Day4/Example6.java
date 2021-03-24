package com.Week2_Day4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Example6 {
	public static void main(String[] args) throws IOException {
		  String s="This should end up in the array";
	        byte[] b=s.getBytes();
	      ByteArrayOutputStream f=new ByteArrayOutputStream();
	      f.write(b);
	      System.out.println(f);
	}
}
