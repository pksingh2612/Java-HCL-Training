package com.Week2_Day4;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Example13 {

	public static void main(String[] args) {
		LocalDate l1=LocalDate.now();//current date
        System.out.println(l1);
        
        Clock c=Clock.systemDefaultZone();
        LocalDate l2=LocalDate.now(c);
        System.out.println(l2);//current date
        
        ZoneId z=ZoneId.of("Europe/Paris");
        LocalDate l3=LocalDate.now(z);
        System.out.println(l3);
        
        LocalDate l4=LocalDate.of(2000, 12, 13);
        System.out.println(l4);
        
        LocalDate l5=LocalDate.parse("2003-12-06");
        System.out.println(l5);
        
        LocalDate l6=l5.plusDays(4);
        System.out.println(l6);
        
        LocalDate l7=l6.minusYears(10);
        System.out.println(l7);
        
        LocalDate l8=l7.minus(4,ChronoUnit.MONTHS);
        System.out.println(l8);
        
        DayOfWeek d1=LocalDate.parse("2000-02-01").getDayOfWeek();
        System.out.println(d1);
        
        int m1=LocalDate.parse("2000-05-01").getDayOfMonth();
        System.out.println(m1);
        
        LocalDate l9=LocalDate.parse("2000-03-01");
        System.out.println(l9.isLeapYear());
        
        boolean b=LocalDate.parse("2010-01-02").isBefore(LocalDate.parse("1990-02-01"));
        System.out.println(b);
        
        boolean b1=LocalDate.parse("2010-01-02").isAfter(LocalDate.parse("1990-02-01"));
        System.out.println(b1);
        
        LocalDateTime l10=LocalDate.parse("2003-01-02").atStartOfDay();
        System.out.println(l10);
        
		
		
	}

}
