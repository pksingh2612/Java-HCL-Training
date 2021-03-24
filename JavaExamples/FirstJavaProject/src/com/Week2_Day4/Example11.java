package com.Week2_Day4;

import java.util.Optional;

public class Example11 {

	public static void main(String[] args) {
		String str[]= new String[5]; // string array by default contains null 
		// {null,null,null,null,null}
		
		String s=str[2].toLowerCase();
		System.out.println(s);
		
		Optional<String> opt= Optional.ofNullable(str[2]);
		if(opt.isPresent()) {
			String s1=str[2].toLowerCase();
			System.out.println(s1);
		}
		else {
			System.out.println("String value is not present");
		}
		
	}

}
