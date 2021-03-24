package com.Week2_Day3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter birth date:");
		String dat= sc.nextLine(); //dd-mm-yyyy
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
		Date d=null;
		try {
			d=sdf.parse(dat);
			System.out.println(d); //Tue Aug 12 00:00:00 IST 1997
		}
		catch(ParseException e) {
			System.out.println(e);
		}
		
		SimpleDateFormat sdf1= new SimpleDateFormat("MMM, dd yyyy");
		System.out.println(sdf1.format(d)); 
		
	}

}
