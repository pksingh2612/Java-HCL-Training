//7. Delivery Details
//
//[Note :
//Strictly adhere to the object oriented specifications given as a part of the problem statement.
//Use the same class names and member variable names.
//Follow the naming conventions mentioned for getters / setters.
//Create 2 separate classes in 2 separate files.]
//
//
//
//Create a class named Delivery with the following private member variables / attributes
//
//1.        
//
//Long over;
//
//2.        
//
//3.        
//
//Long ball;
//
//4.        
//
//5.        
//
//Long runs;
//
//6.        
//
//7.        
//
//String batsman
//
//8.        
//
//9.        
//
//String bowler
//
//10.    
//
//11.    
//
//String nonStriker
//
//12.    
//
// 
//
// 
//
//Include a 6-argument constructor in this class. The arguments passed to the constructor are in this order --- over, ball, runs,batsman,bowler,nonStriker.
//Include an empty default constructor.
// 
//
// 
//
//
// 
//
//Include appropriate getters and setters.
//
//[Naming Convention:
//
//getters : getOver getBall...
//
//setters : setOver, setBall...]
//
// 
//
//
//
//Create another class named Main and include a main method to test the above class(Print the output in Main Class).
//
// 
//
// Input and Output Format:
//
// Refer sample input and output for formatting specifications.
//
//All text in bold corresponds to input and the rest corresponds to output.
//
// 
//
// Sample Input and Output :
//
//Enter the over
//1
//Enter the ball
//1
//Enter the runs
//4
//Enter the batsman name
//Ms Dhoni             
//Enter the bowler name
//Dale steyn
//Enter the nonStriker name
//Suresh Raina
//Over : 1
//Ball : 1
//Runs : 4
//Batsman : Ms Dhoni
//Bowler : Dale steyn
//NonStriker : Suresh Raina

package com.handson3;

import java.util.Scanner;

class Delivery1{
	private long over;
	private long ball;
	private long runs;
	private String batsman;
	private String bowler;
	private String nonStriker;
	Delivery1() {
		super();
	}
	Delivery1(long over, long ball, long runs, String batsman, String bowler, String nonStriker) {
		super();
		this.over = over;
		this.ball = ball;
		this.runs = runs;
		this.batsman = batsman;
		this.bowler = bowler;
		this.nonStriker = nonStriker;
	}
	public long getOver() {
		return over;
	}
	public void setOver(long over) {
		this.over = over;
	}
	public long getBall() {
		return ball;
	}
	public void setBall(long ball) {
		this.ball = ball;
	}
	public long getRuns() {
		return runs;
	}
	public void setRuns(long runs) {
		this.runs = runs;
	}
	public String getBatsman() {
		return batsman;
	}
	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}
	public String getBowler() {
		return bowler;
	}
	public void setBowler(String bowler) {
		this.bowler = bowler;
	}
	public String getNonStriker() {
		return nonStriker;
	}
	public void setNonStriker(String nonStriker) {
		this.nonStriker = nonStriker;
	}
}
public class Problem7 {

	public static void main(String[] args) {
		Delivery1 delivery= new Delivery1();
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the over : ");
		delivery.setOver(Long.parseLong(sc.nextLine()));
		System.out.print("Enter the ball : ");
		delivery.setBall(Long.parseLong(sc.nextLine()));
		System.out.print("Enter the runs: ");
		delivery.setRuns(Long.parseLong(sc.nextLine()));
		System.out.print("Enter the batsman name : ");
		delivery.setBatsman(sc.nextLine());
		System.out.print("Enter the bowler name : ");
		delivery.setBowler(sc.nextLine());
		System.out.print("Enter the nonStriker name : ");
		delivery.setNonStriker(sc.nextLine());
		
		System.out.println("Delivery Details : ");
		System.out.println("Over : "+delivery.getOver());
		System.out.println("Ball : "+delivery.getBall()); 
		System.out.println("Runs : "+delivery.getRuns()); 
		System.out.println("Batsman : "+delivery.getBatsman());
		System.out.println("Bowler : "+delivery.getBowler()); 
		System.out.println("NonStriker : "+delivery.getNonStriker()); 
	}

}
