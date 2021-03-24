package com.Week3_Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example3 {

	public static void main(String[] args) {
		Integer a[] = new Integer[] {1,2,3,4,5};
		List<Integer> l = Arrays.asList(a);
		
		Stream<Integer> st=l.stream().map(e->e*e);
		st.forEach(System.out::println);
		
		List<Integer> l2=l.stream().map(e->e*3).collect(Collectors.toList());
		System.out.println(l2);
		
		List<Integer> l3=l.stream().flatMap(e->Stream.of(e*2)).collect(Collectors.toList());
		System.out.println(l3);
		
		Set<String> hs= new HashSet<>();
		hs.add("Penny");
		hs.add("Shaun");
		hs.add("Neil");
		
		Set<String> set1=hs.stream().map(e->e.toUpperCase()).collect(Collectors.toSet());
		System.out.println(set1);
		
		List<Integer> l4= new ArrayList<>();
		l4.add(10);
		l4.add(20);
		l4.add(30);
		
		Integer i=l4.stream().reduce(100,(x,y)->x+y);
		System.out.println(i);
		}

}
