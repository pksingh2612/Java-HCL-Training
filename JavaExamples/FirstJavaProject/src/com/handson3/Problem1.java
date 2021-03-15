//1. Create a class named Venue with the following member variables / attributes (Default access) 
//
//Data Type
//
//Variable Name
//
//String
//
//name
//
//String
//
//city
//
//
//Create another class called Main and write a main method to test the above class. 
//
// Input and Output Format: 
// Refer sample input and output for formatting specifications. 
//All text in bold corresponds to input and the rest corresponds to output. 
//
// Sample Input and Output : 
//Enter the venue name 
//M. A. Chidambaram Stadium 
//Enter the city name 
//Chennai 
//Venue Details : 
//Venue Name : M. A. Chidambaram Stadium 
//City Name : Chennai 

package com.handson3;
import java.util.*;  
class Venue1{
	String name;
	String city;
}
public class Problem1 {

	public static void main(String[] args) {
		Venue1 venue= new Venue1();
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the venue name : ");
		venue.name=sc.nextLine();
		System.out.print("Enter the city name : ");
		venue.city=sc.nextLine();
		System.out.println("Venue Details :");
		System.out.println("Venue Name : "+venue.name);
		System.out.println("City Name : "+venue.city); 
	}
}


