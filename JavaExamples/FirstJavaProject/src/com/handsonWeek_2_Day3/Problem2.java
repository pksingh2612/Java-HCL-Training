//
//2. Removing elements from HashMap
//
//Given a HashMap as input, write a program to perform the following operation :  If the keys are divisible by 3 then remove that key and its values and print the number 
// of remaining keys in the hashmap.
//Include a class UserMainCode with a static method afterDelete which accepts a HashMap as input.
//
// 
//
//The return type of the output is an integer which represents the count of remaining elements in the hashmap.
//
// 
//
//Create a class Main which would get the input and call the static method afterDelete present in the UserMainCode.
//
// 
//
//Input and Output Format:
//
//First input corresponds to the size of hashmap
//
//Input consists a HashMap
//
//Output is an integer which is the count of remaining elements in the hashmap.
//
//Refer sample output for formatting specifications.
//
// 
//
//Sample Input 1:
//
//4
//
//339
//
//RON
//
//1010
//
//JONS
//
//3366
//
//SMITH
//
//2020
//
//TIM
//
//Sample Output 1:
//
//2
//
// 
//
//Sample Input 2:
//
//5
//
//1010
//
//C2WE
//
//6252
//
//XY4E
//
//1212
//
//M2ED
//
//7070
//
//S2M41ITH
//
//8585
//
//J410N
//
//Sample Output 2:
//
//3

 

 

package com.handsonWeek_2_Day3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class UserMainCode1{
	static int afterDelete(HashMap<Integer,String> hm) {
		Set s=hm.keySet(); //convert both key value pair

        Iterator itr=s.iterator();

        while(itr.hasNext()) {

          int key=(int)itr.next();
          
          System.out.println(key);
          
          if(key%3==0) {
        	  hm.remove(key); // object key need to pass
          }
        }
        
        System.out.println(hm);
        
		return hm.size();
		
	}
}

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sample Input :");
		int n = Integer.parseInt(sc.nextLine());
		HashMap<Integer,String> hm= new HashMap<>();
		for ( int i =0; i<n;++i) {
			hm.put(Integer.parseInt(sc.nextLine()),sc.nextLine());
		}		
		
		System.out.println(hm);
	
		System.out.println("Sample Output :");
		System.out.println(UserMainCode1.afterDelete(hm));

	}

}
