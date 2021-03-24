package com.Week3_Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Example2 {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Ram");
		l.add("Babu");
		l.add("Condy");
		l.add("Sam");
		l.add("Babu");
		
		Stream<String> st = l.stream(); //created stream
		Stream<String> st1=st.distinct(); //intermediate operation
		long count = st1.count(); //terminal operation
		System.out.println(count); //4
		
		long count1 = l.stream().distinct().count();
		System.out.println(count1);
		
		boolean b1 = l.stream().distinct().anyMatch((s2)->s2.startsWith("Ra"));
		System.out.println(b1);
		
		List<Student> l1 = new ArrayList<>();
		l1.add(new Student("PK",23));
		l1.add(new Student("KK",26));
		l1.add(new Student("MK",23));
		l1.add(new Student("SK",21));
		l1.add(new Student("RK",40));
		l1.add(new Student("BK",30));
		l1.add(new Student("DK",80));
		
		Stream<Student> st2=l1.stream().filter(s->s.getAge()>25);
		st2.forEach(System.out::println);
		
		boolean b2 = l1.stream().allMatch(s->s.getName().contains("K"));
		System.out.println(b2);
		
		boolean b3=l1.stream().anyMatch(s->s.getName().contains("B"));
		System.out.println(b3);
		
		boolean b4=l1.stream().noneMatch(s->s.getName().contains("A"));
		System.out.println(b4);
		
		

	}

}
