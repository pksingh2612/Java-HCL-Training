//4. Create a class named Player with the following member variables / attributes (default access) 
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
//country
//
//String
//
//skill
//
//
//Create another class called Main and write a main method to get the player details in a string seperated by comma.Use String. split() function to display the details. 
//
//Input and Output Format: 
//Refer sample input and output for formatting specifications. 
//All text in bold corresponds to input and the rest corresponds to output. 
//
//Sample Input and Output : 
//Enter the player details 
//MS Dhoni,India,All Rounder 
//Player Details 
//Player Name : MS Dhoni 
//Country Name : India 
//Skill : All Rounder 
package com.handson3;

import java.util.Scanner;

class Player1{
	String name;
	String country;
	String skill;
}
public class Problem4 {

	public static void main(String[] args) {
        Player1 player= new Player1();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the player details : ");
		String[] result = sc.nextLine().split(",");
		player.name= result[0];
		player.country= result[1];
		player.country= result[2];
		
		System.out.println("Player Details :");
		System.out.println("Player Name : "+player.name);
		System.out.println("Country Name : "+player.country); 
		System.out.println("Skill: "+player.country); 
	}
}
