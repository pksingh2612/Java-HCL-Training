package com.Week2_Day3;

import java.text.DateFormat;
import java.util.Date;

public class Example1 {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		
		DateFormat df= DateFormat.getInstance();
		System.out.println(df.format(d));
		
		DateFormat df1= DateFormat.getDateInstance();
		System.out.println(df1.format(d));
		
		DateFormat df2= DateFormat.getTimeInstance();
		System.out.println(df2.format(d));
		
		DateFormat df3= DateFormat.getTimeInstance(DateFormat.LONG);
		System.out.println(df3.format(d));
		
		DateFormat df4= DateFormat.getDateTimeInstance();
		System.out.println(df4.format(d));
		
		DateFormat df5= DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.FULL);
		System.out.println(df5.format(d));
		
		
	}

}
