package com.Week2_Day4;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
public class Example14 {

	public static void main(String[] args) {
		LocalTime l1= LocalTime.now(); //current time
		System.out.println(l1);
		
		LocalTime l2= LocalTime.parse("09:30");
		System.out.println(l2);
		
		LocalTime l3= LocalTime.of(9,45);
		System.out.println(l3);
		
		LocalTime l4=l3.plusHours(2);
		System.out.println(l4);
		
		LocalTime l5=l3.minusHours(2);
		System.out.println(l5);
		
		LocalTime l6=l3.minus(3,ChronoUnit.MINUTES);
		System.out.println(l5);
		
		System.out.println(LocalTime.MAX);
		System.out.println(LocalTime.MIN);

	}

}
