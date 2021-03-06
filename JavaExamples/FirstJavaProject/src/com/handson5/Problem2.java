//In T20 IPL all the team names have their home ground .The city of their home ground is given in particular format. 
//Check whether the city name is set as per the following Validation Rule : 
//1. The city name should have only the first two characters and last two characters of the word and the remaining 
// letters should be replaced with asterisks (?*?) .The city name should contain only alphabets .
// It is valid only when the name is in this format. 
//Include a class UserMainCode with a static method validateCity which accepts a string. 
//In this method check whether the given city name is valid as per the validation rules mentioned above.
//The return type is Boolean. 
// 
// Create a Class Main which would be used to accept the string and call the static method present in UserMainCode. 
// 
//Input and Output Format: 
//Input consists of a string. 
//Output consists of a string ?Valid? or ?Invalid?. 
//Refer sample output for formatting specifications. 
//Sample Input 1: 
//Ch***ai 
//Sample Output 1: 
//Valid 
// 
//Sample Input 2: 
//Mum**i 
//Sample Output 2: 
//Invalid

package com.handson5;

import java.util.Scanner;

class UserMainCode1{
	static boolean validateDate(String strDate) 
	{
		
		// The city name should have only the first two characters and last two characters of the word and 
		// the remaining letters should be replaced with asterisks (?*?) .
		//The city name should contain only alphabets .
		if(strDate.matches("([a-zA-Z]{2})(\C\*)+([a-zA-Z]{2})"))
		{
			return true;
		}
		else {
			return false;
		}
	}
}

public class Problem2 {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
			UserMainCode1 umc = new UserMainCode1();
			System.out.println("Enter the Input 1 :");
			System.out.println("Output 1 :"+(UserMainCode1.validateDate(sc.nextLine())?"Valid":"Invalid"));
			
			System.out.println("Enter the Input 2 :");
			System.out.println("Output 2 :"+(UserMainCode1.validateDate(sc.nextLine())?"Valid":"Invalid"));

	}

}
