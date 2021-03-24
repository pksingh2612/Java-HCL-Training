package com.Week2_Day2;

import java.util.GregorianCalendar;

public class Example13 {

	public static void main(String[] args) {
		String month[] = {"jan","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Dec"};
		GregorianCalendar c = new GregorianCalendar(); // c containing current date and time
		//c.set(0, 0, 0, 0, 0, 0);
		System.out.println("Date:");
		System.out.println(month[c.get(GregorianCalendar.MONTH)]);
		System.out.println();
		System.out.println(c.get(GregorianCalendar.DATE));
		System.out.println(c.get(GregorianCalendar.YEAR));
		System.out.println("Time : "+c.get(GregorianCalendar.HOUR)+":"+c.get(GregorianCalendar.MINUTE)+":"+c.get(GregorianCalendar.SECOND));
		
		c.add(GregorianCalendar.HOUR,2);
		c.add(GregorianCalendar.MINUTE,3);
		c.add(GregorianCalendar.SECOND,4);
		System.out.println("Time : "+c.get(GregorianCalendar.HOUR)+":"+c.get(GregorianCalendar.MINUTE)+":"+c.get(GregorianCalendar.SECOND));
		
		

	}

}
