//9. Wicket Details
//
// 
//
// 
//
//[Note :
//Strictly adhere to the object oriented specifications given as a part of the problem statement.
//Use the same class names and member variable names.
//Follow the naming conventions mentioned for getters / setters.
//Create 2 separate classes in 2 separate files.]
//
//Create a class named Wicket with the following private member variables / attributes
//
//1.        
//
//Long over
//
//2.        
//
//3.        
//
//Long ball
//
//4.        
//
//5.        
//
//String wicketType
//
//6.        
//
//7.        
//
//String playerName
//
//8.        
//
//9.        
//
//String bowlerName
//
//10.    
//
//
// 
//
//Include a 5-argument argument constructor in this class. The arguments passed to the constructor are in this order --- over, ball,wicketType,playerName,bowlerName.
//Include a default empty constructor.
// 
//
//
// 
//
// Include appropriate getters and setters.
//
//[Naming Convention:
//
//getters : getOver getBall ...
//
//setters : setOver, setBall...]
//
// 
//
//Create another class named Main and include a main method to test the above class(Print the output in Main Class).
//
//
// Input and Output Format:
//
// Refer sample input and output for formatting specifications.
//
//Use array of objects to read wicket details and use String.split() function to display the wicket details.
//
//All text in bold corresponds to input and the rest corresponds to output.
//
//
// 
//
// Sample Input and Output :
//
//Enter the number of wickets
//3
//Enter the details of wicket 1
//5,2,LBW,Gautam Gambir,Aswin
//Enter the details of wicket 2
//6,6,Bowled,Brad Hogg,Dwayne Bravo
//Enter the details of wicket 3
//7,3,Stumped,Robin Uthappa,Ravindra Jadeja
//Wicket Details
//Over : 5
//Ball : 2
//Wicket Type : LBW
//Player Name : Gautam Gambir
//Bowler Name : Aswin
//Over : 6
//Ball : 6
//Wicket Type : Bowled
//Player Name : Brad Hogg
//Bowler Name : Dwayne Bravo
//Over : 7
//Ball : 3
//Wicket Type : Stumped
//Player Name : Robin Uthappa
//Bowler Name : Ravindra Jadeja

package com.handson3;

import java.util.Scanner;

class Wicket{
	private long over;
	private long ball;
	private String wicketType;
	private String playerName;
	private String bowlerName;
	public Wicket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Wicket(long over, long ball, String wicketType, String playerName, String bowlerName) {
		super();
		this.over = over;
		this.ball = ball;
		this.wicketType = wicketType;
		this.playerName = playerName;
		this.bowlerName = bowlerName;
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
	public String getWicketType() {
		return wicketType;
	}
	public void setWicketType(String wicketType) {
		this.wicketType = wicketType;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getBowlerName() {
		return bowlerName;
	}
	public void setBowlerName(String bowlerName) {
		this.bowlerName = bowlerName;
	}
}
public class Problem9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of wickets : ");
		int N = Integer.parseInt(sc.nextLine());
		
		Wicket[] wicket = new Wicket[N]; 
		for( int i=0;i<N;++i) {
			System.out.println("Enter the details of wicket : "+(i+1));
			String[] result = sc.nextLine().split(",");
			wicket[i] = new Wicket(Long.parseLong(result[0]), Long.parseLong(result[1]),result[2],result[3],result[4]); 
		}
		
		for( int i=0;i<N;++i) {
			System.out.println("Wicket Details");
			System.out.println("Over : "+wicket[i].getOver());
			System.out.println("Ball : "+wicket[i].getBall());
			System.out.println("Wicket Type : "+wicket[i].getWicketType());
			System.out.println("Player Name :"+wicket[i].getPlayerName());
			System.out.println("Bowler Name : "+wicket[i].getBowlerName());
		}
		
	}
}
