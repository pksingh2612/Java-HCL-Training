package com.Week2_Day5;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Example16 {

	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> b = (n1,n2)->n1+n2;
		System.out.println(b.apply(20,30));
		
		Function<Integer,Integer> f = (n1)->n1/2;
		System.out.println(f.apply(10));

		BinaryOperator b1=(n1,n2)->"Result is"+n1+n2;
		System.out.println(b1.apply(20,30));
		
		UnaryOperator<Integer> f1=(n1)->n1/2;
		System.out.println(f1.apply(10));
		
		
	}

}
