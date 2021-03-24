package com.Week2_Day5;

import java.util.HashMap;
import java.util.Map;

public class Example23 {

	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<>();
		hm.put(1,"Java");
		hm.put(2,null);
		System.out.println(hm);
		
		hm.computeIfAbsent(1,(key)->"Java at "+key);
		System.out.println(hm);
		hm.computeIfAbsent(2,(key)->"Java at "+key);
		System.out.println(hm);
		hm.computeIfAbsent(3,(key)->"Java at "+key);
		System.out.println(hm);
		
		Map<Integer,String> hm1= new HashMap<>();
		hm1.put(1,"Java");
		hm1.put(2,"Java");
		System.out.println(hm1);
		
		hm1.computeIfPresent(1,(key,oldval)->oldval.concat("script"));
		hm1.computeIfPresent(2,(key,oldval)->oldval.concat("Technology"));
		System.out.println(hm1);
		
		String s1=hm1.computeIfPresent(1,(key,oldval)->null);
		System.out.println(s1);//null
		String s2=hm1.computeIfPresent(3,(key,oldval)->null);
		System.out.println(s2);//null
		String s3=hm1.computeIfPresent(30,(key,oldval)->"Spring Framework");
		System.out.println(s2);//null
		
		
	}

}
