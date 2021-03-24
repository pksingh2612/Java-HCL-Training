package com.Week3_Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example1 {

	public static void main(String[] args) {
		String arr[] = new String[] {"AA","BB","CC"};
		Stream<String> st=Arrays.stream(arr);
		
		//st.forEach((s)->System.out.println(s));
		st.forEach(System.out::println);
		
		List<String> l = new ArrayList<>();
		l.add("A");
		l.add("B");
		l.add("C");
		Stream<String> st1=l.stream();
		st1.forEach(System.out::println);
		
		Stream<String> st2=Stream.of("X","Y","Z");
		st2.forEach((s)->System.out.println(s));
		
	}

}
