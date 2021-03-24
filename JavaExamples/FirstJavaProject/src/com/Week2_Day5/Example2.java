package com.Week2_Day5;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class CustomTemporalAdjuster implements TemporalAdjuster{
	@Override
	public Temporal adjustInto(Temporal temporal) {
		LocalDate l1=LocalDate.now();
		int day=l1.getDayOfMonth();
		if(day%2==0)
			l1=l1.plusDays(2);
		else
			l1=l1.plusDays(1);
		return temporal.with(l1);
		
	}
}
public class Example2 {

	public static void main(String[] args) {
		//Custom temporal adjuster
		LocalDate l1= LocalDate.of(2017, Month.NOVEMBER, 1);
		LocalDate l2= LocalDate.of(2017, Month.NOVEMBER, 2);
		CustomTemporalAdjuster cust= new CustomTemporalAdjuster();
		LocalDate d1 = l1.with(cust);
		LocalDate d2 = l2.with(cust);
		System.out.println(d1);
		System.out.println(d2);
		
	}

}
