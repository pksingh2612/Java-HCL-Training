package com.Week3_Day1;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example5 {

	public static void main(String[] args) {
		Stream<String> str1 = Stream.<String>builder().add("PK").add("KK").add("MK").build();
		str1.forEach(System.out::println);
		
		Stream<String> str2= Stream.generate(()->"Hello").limit(3);
		str2.forEach(System.out::println);
		
		Stream<Integer> str3 = Stream.iterate(10,i->i+2).limit(10);
		str3.forEach(System.out::println);
		
		IntStream str4 = IntStream.range(1,6); // start to end-1
		str4.forEach(System.out::println);
		
		IntStream str5 = IntStream.rangeClosed(1,6); // start to end
		str5.forEach(System.out::println);
		
		IntStream str6 = "abcd".chars();
		str6.forEach(System.out::println);
		
		Random r = new Random();
		DoubleStream d = r.doubles(5);
		d.forEach(System.out::println);
		
	}

}
