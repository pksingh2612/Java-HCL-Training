package com.day6;


import java.util.LinkedHashSet;

public class Example6 {

	public static void main(String[] args) {
		LinkedHashSet<String> s = new LinkedHashSet<>();
		System.out.println(s.size());
		s.add("v");
		s.add("d");
		s.add("3");
		s.add("e");
		s.add("5");
		s.add("t");
		System.out.println(s.size());
		System.out.println(s);

	}

}
