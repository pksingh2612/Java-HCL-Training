//Problem Statement:
//
//There are exactly 2.54 centimeters to an inch. Write a program that takes a number of inches from the 
//command line and converts it to centimeters.

package com.handon2;

public class Problem11 {

	public static void main(String[] args) {
		
		int inInches=Integer.parseInt(args[0]);
		System.out.print(inInches+" inches = "+(inInches*2.54)+" centimeters");

	}

}

// Set arguments first using right click in eclipse > Run as > Run Configuration > arguments set> click run button 
// output : 23 inches = 58.42 centimeters
