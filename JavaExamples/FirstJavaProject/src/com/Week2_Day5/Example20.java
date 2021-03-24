package com.Week2_Day5;

import java.util.HashMap;
import java.util.Map;

public class Example20 {

	public static void main(String[] args) {
		Map<Integer,String> hm = new HashMap();
		System.out.println(hm.size());
		
		hm.put(1000, "Ram");
		hm.put(1000, "Sam");
		hm.put(1000, "Raj");
		hm.put(1000, "Tam");
		
		System.out.println(hm.get(2000));
		System.out.println(hm.getOrDefault(1500,"Tim"));
		
		hm.forEach((k,v)->System.out.println(k+" "+v));

	}

}
