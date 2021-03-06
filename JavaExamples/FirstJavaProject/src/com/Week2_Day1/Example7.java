package com.Week2_Day1;

import java.util.TreeSet;

public class Example7 {

	public static void main(String[] args) {
		TreeSet<String> s = new TreeSet<>();
		System.out.println(s.size());
		s.add("v");
		s.add("d");
		s.add("3");
		s.add("e");
		s.add("5");
		s.add("t");
		System.out.println(s.size());
		System.out.println(s);
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.headSet("f"));
		System.out.println(s.tailSet("f"));
		
		TreeSet<Integer> ts= new TreeSet<>();
		ts.add(12);
		ts.add(13);
		ts.add(14);
		ts.add(15);
		System.out.println(ts); //11 12 15 16
		// return the smallest elt greater than or equal to given elt
		System.out.println(ts.ceiling(13)); //15
		System.out.println(ts.ceiling(13));
		// return the greatest elt less than or equal to given elt
		System.out.println(ts.floor(13)); //12
		System.out.println(ts.pollFirst()); //12
		System.out.println(ts.pollLast()); //12
		System.out.println(ts); //12
		
		
		
		
		

	}

}
