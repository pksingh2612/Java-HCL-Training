package com.Week2_Day5;

import java.util.ArrayList;
import java.util.List;

public class Example25 {

	public static void main(String[] args) {
		List<Person> l = new ArrayList<>();
		l.add(new Person(23,"Tom",34));
		l.add(new Person(25,"Sita",23));
		l.add(new Person(24,"Rama",30));
		l.add(new Person(21,"Krishna",24));
		
		l.sort((p1,p2)->p1.getAge()>p2.getAge()?1:-1);
		l.forEach((n)->System.out.println(n));
		
		System.out.println();
		l.replaceAll(p->{
			if(p.getAge()>30) {
				return p;
			}
			else {
				p.setAge(p.getAge()+5);
				return p;
			}
		});
		
		l.forEach((n)->System.out.println(n));
		
	}

}
