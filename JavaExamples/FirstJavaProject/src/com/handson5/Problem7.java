//2.Custom Exceptions [Age]
//
//
//Write a program to get the name and age of the player from the user and  display it. 
//
//player name is a string 
//
//player age is an integer value 
//
//Note : The player is eligible to participate in IPL when their age is 19 and above 
//
// 
//
//  
//
//This program may generate   
//
//1. InvalidAgeRange Custom Exception when the player&#39;s age is below 19 
//
// Use exception handling mechanisms to handle these exceptions 
//
// Create a class called CustomException which extends Exception and it includes constructor
//
//to initialize the message. 
//
// 
//
// Use appropriate exception handling mechanisms to handle these exceptions  
//
// 
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
//Enter the player name
//
//Albie Morkel
//
//Enter the player age
//
//35
//
//Player name : Albie Morkel
//
//Player age : 35
//
// 
//
//Sample  Input/Output 2:
//
//Enter the player name
//
//Ishan Kishan
//
//Enter the player age
//
//16
//
//CustomException: InvalidAgeRangeException

package com.handson5;

import java.util.Scanner;

class CustomException extends Exception{
	CustomException(String s){  
	  super(s);  
	 }  
}

public class Problem7 {
	
	static void validate(int age) throws CustomException{  
     if(age<19)  
    	 throw new CustomException("InvalidAgeRangeException");  
//     else  
//    	 System.out.println("The Player is eligible to participate in IPL");  
   }  

	public static void main(String[] args) {
		
		try{  
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the player name :");
			String playerName = sc.nextLine();
			System.out.println("Enter the player age :");
			int playerAge = sc.nextInt();
		    System.out.println("Player name :" + playerName);
		    validate(playerAge);
			System.out.println("Player age :" + playerAge);
		}
		catch(Exception e){
			System.out.println(e);
		}  
		

	}

}
