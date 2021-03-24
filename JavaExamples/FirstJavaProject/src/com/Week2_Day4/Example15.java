package com.Week2_Day4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class Example15 {

	public static void main(String[] args) {
		 LocalDateTime l1=LocalDateTime.now();
	        System.out.println(l1);
	        
	        LocalDateTime l2=LocalDateTime.of(LocalDate.now(), LocalTime.now());
	        System.out.println(l2);
	        
	        LocalDateTime l3=LocalDateTime.parse("2000-03-12T09:20:24");
	        System.out.println(l3);
	        
	        LocalDate l4=l3.toLocalDate();// convert localdatetime to local date
	        System.out.println(l4);
	        
	        LocalTime l5=l3.toLocalTime();//convert localdatetime to local time
	        System.out.println(l5);
	        
	        Date d=new Date();//java.util.date to jdk1.8 date
	        LocalDateTime l6=LocalDateTime.ofInstant(d.toInstant(), ZoneId.systemDefault());
	        System.out.println(l6);
	        
	        //calender to jdk1.8
	        Calendar c=Calendar.getInstance();
	        LocalDateTime l7=LocalDateTime.ofInstant(c.toInstant(), ZoneId.systemDefault());
	        System.out.println(l7);
	}

}
