//2. Create a class named Player with the following  member variables / attributes  (Default access) 
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
//Create another class named Main and write a main method to test the above class. 
//
//  Input and Output Format: 
// Refer sample input and output for formatting specifications. 
//All text in bold corresponds to input and the rest corresponds to output. 
//
// Sample Input and Output : 
//Enter the player name 
//MS Dhoni 
//Enter the country name 
//India 
//Enter the skill 
//All Rounder 
//Player Details : 
//Player Name : MS Dhoni 
//Country Name : India 
//Skill : All Rounder


package com.handson3;

import java.util.Scanner;

class Player{
	String name;
	String country;
	String skill;
}
public class Problem2 {

	public static void main(String[] args) {
		
		Player player= new Player();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the player name : ");
		player.name= sc.nextLine();
		System.out.print("Enter the country name : ");
		player.country= sc.nextLine();
		System.out.print("Enter the skill : ");
		player.skill= sc.nextLine();
		
		System.out.println("Player Details :");
		System.out.println("Player Name : "+player.name);
		System.out.println("Country Name : "+player.country); 
		System.out.println("Skill: "+player.skill); 
	}
}
