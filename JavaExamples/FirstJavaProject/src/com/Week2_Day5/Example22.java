package com.Week2_Day5;

import java.util.HashMap;
import java.util.Map;

public class Example22 {

	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<>();
		hm.put(20,"Author-A");
		hm.put(10,"Author-B");
		hm.put(30,"Author-C");
		
		boolean rem= hm.remove(10,"Author-B");
		System.out.println(rem);
		boolean rem1=hm.remove(10, "Author-D");
		System.out.println(rem1);
		hm.forEach((k,v)->System.out.println(k+" "+v));
		
		boolean b2=hm.replace(30,"Author-C", "Author-D");
		System.out.println(b2);
		String b3=hm.replace(20,"Author-X");
		System.out.println(b3);
		String b4=hm.replace(200,"Author-Y");
		System.out.println(b4);
		hm.forEach((k,v)->System.out.println(k+" "+v));
	}
}
