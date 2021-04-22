package com.Week1_Day3;

import java.util.Scanner;

public class TestCapitalize {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String word = sc.nextLine();
        System.out.println(word);
        
        Capitalize obj = new Capitalize();
        String output = obj.CapitalizeString(word);
        System.out.println(output);
	}

}
