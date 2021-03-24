package com.Week2_Day2;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Example5 {

	public static void main(String[] args) {
		Properties p = new Properties();
		p.put("a","b");
		p.put("c", "d");
		p.put("e","f");
		p.put("f", "h");
		System.out.println(p);
		
		Set s=p.keySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			String k=(String)itr.next();
			System.out.println(k+" "+p.getProperty(k));
		}
		
	}

}
