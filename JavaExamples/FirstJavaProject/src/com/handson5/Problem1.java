//T20 IPL system stores the date of all the final matches in a particular format. 
//Check whether the date is set as per the following Validation Rule : 
//1. The date should be in the format dd-MM-yyyy. It is valid only when the date is in this format dd-MM-yyyy. 
//Include a class UserMainCode with a static method validateDate which accepts a string. In this method check 
//whether the given date is valid as per the validation rules mentioned above. 
//i.e the date should be a data in the format dd-mm-yyyy. The return type is Boolean. 
// 
//Create a Class Main which would be used to accept the string and call the static method present in UserMainCode. 
// 
//Input and Output Format: 
//Input consists of a string. 
//Output consists of a string ?Valid? or ?Invalid?. 
//Refer sample output for formatting specifications. 
// 
//Sample Input 1: 
//01-06-2008 
//Sample Output 1: 
//Valid 
// 
//Sample Input 2: 
//24/05/2009 
//Sample Output 2: 
//Invalid

package com.handson5;

import java.util.Scanner;

class UserMainCode{
	static boolean validateDate(String strDate) 
	{
		if(strDate.matches("([0-9]{2})\\-([0-9]{2})\\-([0-9]{4})"))
		{
			return true;
		}
		else {
			return false;
		}
	}
}


public class Problem1 {

	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
		UserMainCode umc = new UserMainCode();
		System.out.println("Enter the Input 1 :");
		System.out.println("Output 1 :"+(UserMainCode.validateDate(sc.nextLine())?"Valid":"Invalid"));
		
		System.out.println("Enter the Input 2 :");
		System.out.println("Output 2 :"+(UserMainCode.validateDate(sc.nextLine())?"Valid":"Invalid"));
	}

}
