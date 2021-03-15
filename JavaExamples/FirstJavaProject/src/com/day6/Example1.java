package com.day6;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		ArrayList l1= new ArrayList();
		System.out.println(l1.size());//0
		l1.add("A");
		l1.add("B");
		l1.add(11); // if Autoboxing is not their then we have to write this l1.add(new Interger(11));
		l1.add(3.14);
		l1.add(11); // duplicate value allowed
		System.out.println(l1.size());//5
		System.out.println(l1); //[A, B, 11, 3.14, 11] when we print the object it always print in square bracket
		
		ArrayList l3 = new ArrayList();
		
		List l2= new ArrayList(); // DMD
		l2.addAll(l1);
		System.out.println(l2.size());
		System.out.println(l2);
		
		List l4= new ArrayList(); // DMD
		l4.add(4);
		l4.add(6);
		System.out.println(l4.contains(4));
		System.out.println(l2.containsAll(l1));
		
		List l5 = new ArrayList();
		l5.add("A");
		l5.add("B");
		l5.add(1);
		l5.add(2);
		l5.add(3);
		System.out.println(l5);
		
		List l6= new ArrayList();
		l6.add("A");
		l6.add("B");
		l6.add(1);
		System.out.println(l6);
		
		l5.retainAll(l6);
		System.out.println(l5);
		System.out.println(l6);
		
		
		
		
	}


}
