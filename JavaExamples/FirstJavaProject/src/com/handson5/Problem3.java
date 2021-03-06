//In T20 IPL, a player name is considered as lucky based on some constraints.
// 
//Check whether the player name is set as per the following Validation Rule :
//1. The player name is a string, it should have alphabet 'a' only at odd occurrences It is valid only when 
//the player name is in this format. 
//If the alphabet 'a' is not present in the whole string also it is valid only.
// 
//2. If it present in even occurrence, the output must be invalid.
// 
//Note: The starting index of the string is 1.
// 
//Include a class UserMainCode with a static method validatePlayer which accepts a string. In this method check whether the given player name is valid as per the validation rules mentioned above. The return type is Boolean.
// 
// Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.
//Input and Output Format:
//Input consists of a string.
// 
//The output consists of a string ?Valid? or ?Invalid?.
//Refer sample output for formatting specifications.
// 
//Sample Input 1:
//Albie Morkel
//Sample Output 1:
//Valid
//Sample Input 2:
//Suresh Raina
//Sample Output 2:
//Invalid

package com.handson5;

import java.util.Scanner;

class UserMainCode2{
	static boolean validateDate(String strDate) 
	{
		
		//1. The player name is a string, it should have alphabet 'a' only at odd occurrences It is valid only when 
		//the player name is in this format. 
		//If the alphabet 'a' is not present in the whole string also it is valid only.
		boolean result = false;
		
		char c[]=strDate.toCharArray();

        for(char c1:c)
        {        	    	
        	if(c1!='a')
    		{
        		if(strDate.indexOf(c1)%2!=0)
            	{
            		result=true;	
            	}
    		}
    		else {
    			result= false;
    			break;
    		}
        }
     return result;
        
	}
}

public class Problem3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		UserMainCode2 umc = new UserMainCode2();
		System.out.println("Enter the Input 1 :");
		System.out.println("Output 1 :"+(UserMainCode2.validateDate(sc.nextLine())?"Valid":"Invalid"));
		
		System.out.println("Enter the Input 2 :");
		System.out.println("Output 2 :"+(UserMainCode2.validateDate(sc.nextLine())?"Valid":"Invalid"));

	}

}
