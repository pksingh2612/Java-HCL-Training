//1. Exception 2(ArrayIndexOutOfBoundsException And NegativeArraySizeException)
//
// 
//
//Write a program to get the number of overs and the runs scored in each over. Get the over
//
//number from the user and display number of runs scored in that over. Let 
//
//number of overs be the array size
//
//over number be the index of the array+1
//
//runs be the array elements
//
// 
//
//This program may generate 
//
//1. NegativeArraySize Exception when the number of overs is negative
//
//2. ArrayIndexOutOfRange Exception when the over number that is searched is beyond the
//
//specified over numbers. 
//
//Use exception handling mechanisms to handle these exceptions.Use a single catch block. In
//
//the catch block, print the class name of the exception thrown.
//
//Input and Output Format:
//
//Refer sample input and output for formatting specifications.
//
//All text in bold corresponds to input and the rest corresponds to output.
//
// 
//
//Sample  Input/Output 1:
//
//Enter the number of overs
//
//3
//
//Enter the number of runs for each over
//
//8
//
//15
//
//12
//
//Enter the over number 
//
//2
//
//Runs scored in this over : 15
//
// 
//
//Sample  Input/Output 2:
//
//Enter the number of overs
//
//3
//
//Enter the number of runs for each over
//
//8
//
//15
//
//12
//
//Enter the over number 
//
//4
//
//java.lang.ArrayIndexOutOfBoundsException
//
// 
//
//Sample  Input/Output 3:
//
//Enter the number of overs
//
//-1
//
//Enter the number of runs for each over
//
//java.lang.NegativeArraySizeException

package com.handson5;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		try {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the number of overs :");
			int totalOver = sc.nextInt();
			
			int[] array = new int[totalOver];
			System.out.println("Enter the number of runs for each over :");
			for(int i=0;i<totalOver;i++) {
				array[i]=sc.nextInt();
			}
			
			System.out.println("Enter the over number :");
			int overNumber = sc.nextInt();
			
			System.out.println("Runs scored in this over :"+array[overNumber-1]);
		}
		catch( Exception e) {
			System.out.println(e);
		}
		
		//NegativeArraySizeException
		//ArrayIndexOutOfRange
	}

}

