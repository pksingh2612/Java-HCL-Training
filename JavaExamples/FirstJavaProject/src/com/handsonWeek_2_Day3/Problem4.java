//4. Employees & Designations
//
//A Company wants to obtain employees of a particular designation. You have been assigned as the programmer to build this package. 
// You would like to showcase your skills by creating a quick prototype. The prototype consists of the following steps:
//
//    Read Employee details from the User. The details would include name and designaton in the given order. The datatype for name and designation is string.
//
//    Build a hashmap which contains the name as key and designation as value.
//
//    You decide to write a function obtainDesignation which takes the hashmap and designation as input and returns a 
//string List of employee names who belong to that designation as output. Include this function in class UserMainCode. 
//Display employee name's in ascending order.
//
//Create a Class Main which would be used to read employee details in step 1 and build the hashmap. Call the static method present in UserMainCode.
//
// 
//
//Input and Output Format:
//
//Input consists of employee details. The first number indicates the size of the employees. The next two values indicate the employee name employee designation. The last string would be the designation to be searched.
//
//Output consists of a array values containing employee names.
//
//Refer sample output for formatting specifications.
//
// 
//
//Sample Input 1:
//
//4
//
//Manish
//
//MGR
//
//Babu
//
//CLK
//
//Rohit
//
//MGR
//
//Viru
//
//PGR
//
//MGR
//
// 
//
//Sample Output 1:
//
//Manish
//
//Rohit
package com.handsonWeek_2_Day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class UserMainCode3{
	static TreeSet<String> obtainDesignation(Map<String,String> hm,String d) {
		TreeSet<String> t= new TreeSet<>();
		Set s=hm.entrySet(); //convert both key value pair

        Iterator itr=s.iterator();

        while(itr.hasNext()) {

          Map.Entry me=(Map.Entry)itr.next();
          
          if(me.getValue().equals(d)) {
        	  t.add((String)me.getKey());
          }
        }
		return t;
	}
}


public class Problem4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sample Input :");
		int n = Integer.parseInt(sc.nextLine());
		Map<String,String> hm= new HashMap<>();
		for ( int i =0; i<n;++i) {
			hm.put(sc.nextLine(),sc.nextLine());
		}	
		String desg=sc.nextLine();
	
		System.out.println("Sample Output :");
		for(String a:UserMainCode3.obtainDesignation(hm,desg)) {
			System.out.println(a);
		}

	}

}
