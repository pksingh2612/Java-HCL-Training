package com.Week2_Day2;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class Example4 {

	public static void main(String[] args) {
		Hashtable<Integer,Double> ht = new Hashtable<>();
		System.out.println(ht.size());
		
		ht.put(10,3.14);
		ht.put(2,5.43);
		ht.put(8,6.12);
		ht.put(5,4.13);
		ht.put(4,1.12);
		
		System.out.println(ht.size()); //5
		System.out.println(ht);
		
		Set s=ht.keySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			Integer i = (Integer)itr.next();
			System.out.println(i);
		}
		
		

	}

}
