package com.Week2_Day5;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Example17 {

	public static void main(String[] args) {
		Predicate<String> p =(s)->s.startsWith("Foo");
		System.out.println(p.test("Foobar"));
		
		BiPredicate<Integer,String> bp=(s1,s2)->s1>20 && s2.endsWith("bar");
		System.out.println(bp.test(10, "Foobar"));	
	}

}
