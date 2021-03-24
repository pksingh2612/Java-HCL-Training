package com.Week3_Day1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example7 {

	public static void main(String[] args) {
		List<Integer> l =Arrays.asList(1,2,3,2,1);
		
		Optional<Integer> opt=l.stream().findFirst();
		if(opt.isPresent()) {
			System.out.println(opt.get());
		}
		else {
			System.out.println("No value is present");
		}
		
		Optional<Integer> opt1=l.stream().filter(x->(x>1)).findFirst();
		if(opt1.isPresent()) {
			System.out.println(opt1.get());
		}
		else {
			System.out.println("No value is present");
		}
		
		Optional<Integer> opt2=l.stream().filter(x->(x>1)).findAny();
		if(opt2.isPresent()) {
			System.out.println(opt2.get());
		}
		else {
			System.out.println("No value is present");
		}
	}

}
