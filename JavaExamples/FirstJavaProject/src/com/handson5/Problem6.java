//3. TeamNameNotFound Exception
//
//Write a program to get the two team names i.e expected Runner and Winner team of IPL
//
//season 4 and display it.
//
//Team name is a string
//
//Note : The team name given below are only eligible to take part in IPL season 4
//
//Chennai Super Kings
//
//Deccan Chargers
//
//Delhi Daredevils
//
//Kings XI Punjab
//
//Kolkata Knight Riders
//
//Mumbai Indians
//
//Rajasthan Royals
//
//Royal Challengers Bangalore
//
//This program may generate TeamNameNotFound Custom Exception when the expected
//
//team entered is not present in the above eligible teams list for IPL season 4.
//
//Use exception handling mechanisms to handle these exceptions
//
// 
//
//Input and Output Format:
//
//Refer sample input and output for formatting specifications.
//
//All text in bold corresponds to input and the rest corresponds to output.
//
//Sample Input and Output 1:
//
//Enter the expected winner team of IPL Season 4
//
//Chennai Super Kings
//
//Enter the expected runner Team of IPL Season 4
//
//Mumbai Indians
//
//Expected IPL Season 4 winner: Chennai Super Kings
//
//Expected IPL Season 4 runner: Mumbai Indians
//
// 
//Sample Input and Output 1:
//
//Enter the expected winner team of IPL Season 4
//
//Pune Warriors
//
//TeamNameNotFoundException: Entered team is not a part of IPL Season 4

package com.handson5;

import java.util.Scanner;

class TeamNameNotFoundException extends Exception{
	TeamNameNotFoundException(String s){  
	 super(s);  
	}  
}


public class Problem6 {
	
	static void check(String teamName) throws TeamNameNotFoundException{ 
		String[] teamList = new String[]{ "Chennai Super Kings","Deccan Chargers","Delhi Daredevils","Kings XI Punjab",
				"Kolkata Knight Riders","Mumbai Indians","Rajasthan Royals","Royal Challengers Bangalore"};
		boolean flag=true; 
		for (String element : teamList) { 
            if (element.equals(teamName)) { 
            	flag=false;
            	break;
            }
            else {
            	flag=true;
            }
        } 
		
		if(flag)
		{
			throw new TeamNameNotFoundException("Entered team is not a part of IPL Season 4");
		}
		
	}
	     

	public static void main(String[] args) {
		try{  
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the expected winner team of IPL Season 4 :");
			String teamWinner = sc.nextLine();
			System.out.println("Enter the expected runner Team of IPL Season 4 :");
			String teamRunner = sc.nextLine();
			check(teamWinner);
		    System.out.println("Expected IPL Season 4 winner:" + teamWinner);
		    check(teamRunner);
			System.out.println("Expected IPL Season 4 runner:" + teamRunner);
		}
		catch(Exception e){
			System.out.println(e);
		}  
		

	}

}
