//3. Create a class named Delivery with the following public member variables / attributes 
//
//Data Type
//
//Variable Name
//
//Long
//
//over
//
//Long
//
//ball
//
//Long
//
//runs
//
//String
//
//batsman
//
//String
//
//bowler
//
//String
//
//nonStriker
//
//
//  
//Include a method in the class named displayDeliveryDetails(). In this method, display the details of the delivery in the format shown in the sample output. This method does not accept any arguments and its return type is void. 
//
//Create another class called Main  and write a main method to test the above class. 
//
//  Input and Output Format: 
// Refer sample input and output for formatting specifications. 
//All text in bold corresponds to input and the rest corresponds to output. 
//
// Sample Input and Output : 
//Enter the over 
//1 
//Enter the ball 
//1 
//Enter the runs 
//4 
//Enter the batsman name 
//MS Dhoni 
//Enter the bowler name 
//Dale steyn 
//Enter the nonStriker name 
//Suresh Raina 
//Delivery Details : 
//Over : 1 
//Ball : 1 
//Runs : 4 
//Batsman : MS Dhoni 
//Bowler : Dale steyn 
//NonStriker : Suresh Raina 


package com.handson3;

import java.util.Scanner;

class Delivery{

	public Long over;
	public Long ball;
	public Long runs;
	public String batsman;
	public String bowler;
	public String nonStriker;
	
	void displayDeliveryDetails() {
		System.out.println("Delivery Details : ");
		System.out.println("Over : "+over);
		System.out.println("Ball : "+ball); 
		System.out.println("Runs : "+runs); 
		System.out.println("Batsman : "+batsman);
		System.out.println("Bowler : "+bowler); 
		System.out.println("NonStriker : "+nonStriker); 
	}
}
public class Problem3 {

	public static void main(String[] args) {
		
		Delivery delivery= new Delivery();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the over : ");
		delivery.over= Long.parseLong(sc.nextLine());
		System.out.println("Enter the ball : ");
		delivery.ball= Long.parseLong(sc.nextLine());
		System.out.println("Enter the runs: ");
		delivery.runs= Long.parseLong(sc.nextLine());
		System.out.println("Enter the batsman name : ");
		delivery.batsman= sc.nextLine();
		System.out.println("Enter the bowler name : ");
		delivery.bowler= sc.nextLine();
		System.out.println("Enter the nonStriker name : ");
		delivery.nonStriker= sc.nextLine();
		
		delivery.displayDeliveryDetails();
	}

}
