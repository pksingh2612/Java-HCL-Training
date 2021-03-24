package com.Week3_Day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example4 {

	public static void main(String[] args) {
		List<String> l = Arrays.asList("9","A","Z","1","B","4","a","c");
		
		List<String> l1 = l.stream().sorted().collect(Collectors.toList());
		System.out.println(l1);
		
		System.out.println("In reverse order");
		List<String> l2= l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(l2);
		
		List<Student> l3 = new ArrayList<>();
		l3.add(new Student("PK",23));
		l3.add(new Student("KK",26));
		l3.add(new Student("MK",23));
		l3.add(new Student("SK",21));
		l3.add(new Student("RK",40));
		l3.add(new Student("BK",30));
		l3.add(new Student("DK",80));
		
		List<Student> l4= l3.stream().sorted(Comparator.comparingInt(Student::getAge)).collect(Collectors.toList());
		System.out.println(l4);
		
		List<Student> l5= l3.stream().sorted(Comparator.comparingInt(Student::getAge).reversed()).collect(Collectors.toList());
		System.out.println(l5);
		
		List<Student> l6= l3.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
		System.out.println(l6);
		
		
		
	}

}
