package com.Week2_Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example8 {

	public static void main(String[] args) {
		List<Student> l =new ArrayList<>();
		l.add(new Student(3,"Ram",34));
		l.add(new Student(3,"Sam",34));
		l.add(new Student(3,"Raj",18));
		l.add(new Student(3,"kiri",23));
		
		Collections.sort(l);
		for(Student st:l) {
			System.out.println(st.getId()+" "+ st.getName()+" "+st.getAge());
		}
	}

}
