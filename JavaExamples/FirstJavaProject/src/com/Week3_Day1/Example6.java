package com.Week3_Day1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example6 {

	public static void main(String[] args) {
		List<Student> l = Arrays.asList(
				new Student("TK",23), 
				new Student("PK",34),
				new Student("GK",25),
				new Student("MK",35),
				new Student("BK",20),
				new Student("JK",30)
		);
		
		Stream<Student> st=l.parallelStream();
		System.out.println(st.isParallel());
		
		boolean b1=st.map(p->p.getAge()*2).anyMatch(p->p>50);
		System.out.println(b1);
		
		IntStream i1= IntStream.range(1, 6).parallel();
		System.out.println(i1.isParallel());
		
		IntStream i2= i1.sequential();
		System.out.println(i2.isParallel());

	}

}
