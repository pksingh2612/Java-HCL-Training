package com.Week1_Day5;

import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {
		try {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter first number");
			int a= sc.nextInt();
			System.out.println("Enter second number");
			int b= sc.nextInt();
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("You can't divide by 0");
		}
		
	}
}
