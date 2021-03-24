package com.Week2_Day2;

import java.util.Calendar;

public class Example12 {

	public static void main(String[] args) {
		String month[] = {"jan","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Dec"};
		Calendar c = Calendar.getInstance(); // c containing current date and time
		//c.set(0, 0, 0, 0, 0, 0);
		System.out.println("Date:");
		System.out.println(month[c.get(Calendar.MONTH)]);
		System.out.println();
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.YEAR));
		System.out.println("Time : "+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
		
		c.add(Calendar.HOUR,2);
		c.add(Calendar.MINUTE,3);
		c.add(Calendar.SECOND,4);
		System.out.println("Time : "+c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
		
		
	}
}
