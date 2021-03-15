package com.day6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Example8 {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(5);
		l.add(15);
		System.out.println(l);
		
		//1. For loop
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		
		//2. For Each statement
		for(int a:l)
			System.out.println(a);
		
		System.out.println("Using Iterator Interface");
		Iterator<Integer> itr= l.iterator();
		while(itr.hasNext()) {
			//Integer l=(Integer)itr.next();
			System.out.println(itr.next());
		}
		
		System.out.println("Using ListIterator interface");
		ListIterator<Integer> Itr= l.listIterator();
		// print element in forward direction 
		while(Itr.hasNext()) {
			Integer i = Itr.next();
			Itr.set(i+2);
		}
		
		// print element in backward direction 
		while(Itr.hasPrevious()) {
			System.out.println(Itr.previous());
		}
		
		
		

	}

}
