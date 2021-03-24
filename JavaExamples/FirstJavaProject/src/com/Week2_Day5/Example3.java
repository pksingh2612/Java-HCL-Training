package com.Week2_Day5;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Example3 {

	public static void main(String[] args) {
		LocalDate l1=LocalDate.now();
		LocalDate l2=l1.plus(Period.ofDays(5));
		int i= Period.between(l1,l2).getDays();
		System.out.println(i);
		int j= Period.between(l1,l2).getMonths();
		System.out.println(j);
		
		long l3=ChronoUnit.DAYS.between(l1,l2);
		System.out.println(l3);
		
		LocalTime l4= LocalTime.now();
		LocalTime l5= l4.plus(Duration.ofSeconds(20));
		
		long l6=Duration.between(l4,l5).getSeconds();
		System.out.println(l6);
		long l7=Duration.between(l4,l5).toMinutes();
		System.out.println(l7);
	}
}
