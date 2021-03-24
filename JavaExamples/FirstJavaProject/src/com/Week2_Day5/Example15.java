package com.Week2_Day5;

import java.util.function.Function;

public class Example15 {

	public static void main(String[] args) {
		Function<String,Integer> f = (x)->x.length();
		Integer i = f.apply("hello");
		System.out.println(i);
	}
}
