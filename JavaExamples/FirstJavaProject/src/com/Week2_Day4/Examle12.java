package com.Week2_Day4;

import java.util.Optional;

public class Examle12 {

	public static void main(String[] args) {
		String[] st=new String[5];
        //st[2]="java";
        Optional<String> opt=Optional.ofNullable(st[2]);
        if(opt.isPresent()) {
            System.out.println(opt.get());
            
        }
        else {
            System.out.println(opt.orElse("value is not present"));
        }
	}

}
