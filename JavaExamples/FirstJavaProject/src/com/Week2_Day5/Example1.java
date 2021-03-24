package com.Week2_Day5;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class Example1 {

	public static void main(String[] args) {
		LocalDateTime l1=LocalDateTime.now();
		System.out.println(l1);
		System.out.println(l1.with(TemporalAdjusters.firstDayOfMonth()));
		System.out.println(l1.with(TemporalAdjusters.lastDayOfMonth()));
		System.out.println(l1.with(TemporalAdjusters.firstDayOfNextMonth()));
		System.out.println(l1.with(TemporalAdjusters.firstDayOfNextYear()));
		System.out.println(l1.with(TemporalAdjusters.firstDayOfMonth()));
		System.out.println(l1.with(TemporalAdjusters.next(DayOfWeek.MONDAY)));

	}

}
