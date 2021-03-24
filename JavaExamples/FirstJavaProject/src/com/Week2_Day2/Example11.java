package com.Week2_Day2;

import java.util.Date;

public class Example11 {

	public static void main(String[] args) {
		Date d1= new Date();
		System.out.println(d1);//		Tue Mar 16 16:24:02 IST 2021
		Date d2= new Date(100000);
		System.out.println(d2); //		Thu Jan 01 05:31:40 IST 1970
		System.out.println(d1.after(d2)); //true
		System.out.println(d1.before(d2)); //false
		System.out.println(d1.compareTo(d2)); //1
		System.out.println(d1.getTime()); //1615892241360
		
	}

}
