package com.Week2_Day1;

import java.util.LinkedList;
import java.util.List;

public class Example3 {

	public static void main(String[] args) {
		LinkedList<Integer> l= new LinkedList<>();
		System.out.println(l.size());
		l.add(10);
		l.add(4);
		l.add(2,4);
		l.addFirst(7); // List<Integer> l= new LinkedList<>(); in case of List
		l.addLast(20);
		l.add(30);
		l.add(3,15);
		System.out.println(l.size()); //7
		System.out.println(l);
		
		System.out.println(l.get(5));
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		l.remove(2);
		l.removeFirst();
		l.removeLast();
		System.out.println(l);
		
		
	}

}
