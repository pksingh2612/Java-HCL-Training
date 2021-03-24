package com.Week2_Day5;

import java.util.HashMap;
import java.util.Map;

public class Example14 {

	public static void main(String[] args) {
		Map<String,Integer> hm = new HashMap<>();
		hm.put("b",20);
		hm.put("f",30);
		hm.put("a",34);
		hm.put("e",23);
		
		System.out.println(hm);
		
		hm.forEach((k,v)->System.out.println("key "+k+" Value "+v));
		
	}

}
