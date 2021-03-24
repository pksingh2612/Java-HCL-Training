package com.Week2_Day5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Example4 {

	public static void main(String[] args) {
		LocalDateTime l1= LocalDateTime.now();
		System.out.println(l1); //2021-03-19T10:08:50.201495400
		String s1=l1.format(DateTimeFormatter.ISO_DATE);
		System.out.println(s1); //2021-03-19
		String s2=l1.format(DateTimeFormatter.ISO_DATE_TIME); 
		System.out.println(s2); //2021-03-19T10:10:45.1062385
		String s3=l1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(s3);//19/03/2021
		String s4=l1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
		System.out.println(s4);//19-Mar-2021

	}

}
