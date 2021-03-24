package com.Week2_Day5;

import java.util.ArrayList;
import java.util.List;

public class Example13 {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Ram");
		l.add("Sam");
		l.add("Tam");
		l.add("Jam");
		l.add("Fam");
		System.out.println(l);
		l.forEach((c)->System.out.println(c));
		l.forEach(System.out::println); //method reference of instance method
	}

}
