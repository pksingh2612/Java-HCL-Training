package com.Week2_Day2;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Example10 {

	public static void main(String[] args) {
		PriorityQueue<String> p = new PriorityQueue<>();
		p.add("Amit");
		p.add("vinay");
		p.add("kiri");
		p.add("Jaya");
		p.add("Ravi");
		System.out.println(p.element());
		System.out.println(p.peek());
		Iterator itr=p.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		p.remove();
		p.poll();
		System.out.println("After removing");
		itr=p.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
