package com.Week2_Day2;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.LinkedHashMap;

public class Example3 {

	public static void main(String[] args) {
		Map<String,Integer> hm =new LinkedHashMap<>();
		System.out.println(hm.size());
		
		hm.put("a",10);
		hm.put("h",20);
		hm.put("c",25);
		hm.put("a",23);
		
		System.out.println(hm.size()); //3
		System.out.println(hm);
		
		System.out.println(hm.get("h")); //20
		hm.remove("h");
		System.out.println(hm.get("h")); //null
		System.out.println(hm.containsKey("a"));
		System.out.println(hm.containsValue(25));
		
		Set s=hm.entrySet(); 	// convert both key value pair to set
		Iterator itr= s.iterator(); 
		while(itr.hasNext()) {
			Map.Entry me = (Map.Entry)itr.next();
			System.out.println(me.getKey()+" "+me.getValue());
		}
		
		System.out.println();
		Set s1= hm.keySet(); //convert only key
		Iterator itr1=s1.iterator();
		while(itr1.hasNext()) {
			String key= (String)itr1.next();
			System.out.println(key+" "+hm.get(key));
		}
	}

}
