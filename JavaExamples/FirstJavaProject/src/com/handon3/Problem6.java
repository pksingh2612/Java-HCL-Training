//2.                   Create a class named ExtraType with the following member variables / attributes 
//String name 
//long runs 
//
//Include appropriate getters and setters. 
//[Naming Convention: 
//getters : getName getRuns.. 
//setters : setName, setRuns...] 
//
//Create another class and write a main method to get the extratype details in a string seperated by #. Use String.split() function to display the details. 
//
//Input and Output Format: 
// Refer sample input and output for formatting specifications. 
//All text in bold corresponds to input and the rest corresponds to output. 
//
//Sample Input and Output : 
//Enter the extratype details 
//Wide#1 
//ExtraType Details 
//Extra Type:Wide 
//Runs:1 

package com.handon3;

import java.util.Scanner;

class ExtraType{
	  String name;
	  long runs;
	
	  public long getRuns() {
		return runs;
	  }
	  void setRuns(long newRuns) {
	    this.runs = newRuns;
	  }
	  public String getName() {
		return name;
	  }
	  void setName(String newName) {
	    this.name = newName;
	  }
}
public class Problem6 {
	public static void main(String[] args) {
		ExtraType extraType= new ExtraType();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the extratype details :");
		String[] result = sc.nextLine().split("#");
		extraType.setName(result[0]);
		extraType.setRuns(Long.parseLong(result[1]));
		
		System.out.println("ExtraType Details :");
		System.out.println("Extra Type : "+extraType.getName());
		System.out.println("Runs : "+extraType.getRuns()); 
	}
}
