//. 5. Create a class named Venue with the following private member variables / attributes 
//String name 
//String city 
//
//Include appropriate getters and setters. 
//[Naming Convention: 
//getters : getName getCity... 
//setters : setName setCity...] 
//
//Create another class and write a main method to test the above class. In the main method, get the choice from the user and update the corresponding venue details. 
// 
//Input and Output Format: 
// Refer sample input and output for formatting specifications. 
//All text in bold corresponds to input and the rest corresponds to output. 
//  
//Sample Input and Output : 
//Enter the venue name 
//Green Park Stadium 
//Enter the city name 
//Kanpur 
//Venue Details 
//Venue Name : Green Park Stadium 
//City Name : Kanpur 
//Verify and Update Venue Details 
//Menu 
//1.Update Venue Name 
//2.Update City Name 
//3.All informations Correct/Exit 
//Type 1 or 2 or 3 
//2 
//Enter the city name 
//Chennai 
//Venue Details 
//Venue Name : Green Park Stadium 
//City Name : Chennai 
//Verify and Update Venue Details 
//Menu 
//1.Update Venue Name 
//2.Update City Name 
//3.All informations Correct/Exit 
//Type 1 or 2 or 3 
//1 
//Enter the venue name 
//Chidambaram Stadium 
//Venue Details 
//Venue Name : Chidambaram Stadium 
//City Name : Chennai 
//Verify and Update Venue Details 
//Menu 
//1.Update Venue Name 
//2.Update City Name 
//3.All informations Correct/Exit 
//Type 1 or 2 or 3 
//3 
//Venue Details 
//Venue Name : Chidambaram Stadium 
//City Name : Chennai 

 
package com.handson3;
import java.util.*;  
class Venue{
	private String name;
	private String city;
	
	  public String getCity() {
		return city;
	  }

	  public String getName() {
	    return name;
	  }  
	
	  // Setter
	  void setCity(String newCity) {
	    this.city = newCity;
	  }
	  void setName(String newName) {
	    this.name = newName;
	  }
	  
}
public class Problem5 {

	public static void main(String[] args) {
		Venue venue= new Venue();
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the venue name : ");
		venue.setName(sc.nextLine());
		System.out.print("Enter the city name : ");
		venue.setCity(sc.nextLine());
		System.out.println("Venue Details :");
		System.out.println("Venue Name : "+venue.getName());
		System.out.println("City Name : "+venue.getCity()); 
		System.out.println("Verify and Update Venue Details "); 
		int ch;
		do
		{  
			System.out.println("Menu "); 
			System.out.println("1.Update Venue Name "); 
			System.out.println("2.Update City Name  "); 
			System.out.println("3.Show All informations"); 
			System.out.println("4.Exit");
			System.out.println("Type 1 or 2 or 3 or 4");
			ch=sc.nextInt();
		    switch(ch) {
		    case 1:
		    	System.out.print("Enter the venue name : ");
		    	venue.setName(sc.nextLine()); 
		    	break;
		    case 2:
		    	System.out.print("Enter the city name : ");
		    	venue.setCity(sc.nextLine());
		    	break;
		    case 3:
		    	System.out.println("Venue Details :");
				System.out.println("Venue Name : "+venue.getName());
				System.out.println("City Name : "+venue.getCity());  
		    	break;
		    case 4:
		    	System.out.println("Venue Details :");
				System.out.println("Venue Name : "+venue.getName());
				System.out.println("City Name : "+venue.getCity()); 
		    	System.exit(0); 
		    	break;
		    default:
		    	System.out.println("Wrong Key Pressed!!"); 
		    	break;
		    }
		}while(true);  
	}
}