//3. Largest Key in HashMap
//
// 
//
//Write a program that construts a hashmap and returns the value corresponding to the largest key.
//
//Include a class UserMainCode with a static method getMaxKeyValue which accepts a string. The return type (String) should be the value corresponding to the largest key.
//
//Create a Class Main which would be used to accept Input string and call the static method present in UserMainCode.
//
//Input and Output Format:
//
//Input consists of 2n+1 values. The first value corresponds to size of the hashmap. The next n pair of numbers equals the integer key and value as string.
//
//Output consists of a string which is the value of largest key.
//
//Refer sample output for formatting specifications.
//
//Sample Input 1:
//
//3
//
//12
//
//amron
//
//9
//
//Exide
//
//7
//
//SF
//
//Sample Output 1:
//
//Amron
//
// 
package com.handsonWeek_2_Day3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

class UserMainCode2{
	static String getMaxKeyValue(Map<Integer,String> hm) {
		TreeSet<Integer> t= new TreeSet<>();
		Set s1=hm.entrySet(); //convert both key value pair
		Set s=hm.keySet(); //convert both key value pair

        Iterator itr=s.iterator();

        while(itr.hasNext()) {
          int key=(int)itr.next();
          t.add(key);
        }
        
        int largestKey = (t.size()-1);
        
        //convert TreeSet to an 1D Array
        Integer[] numberArray = t.toArray( new Integer[t.size()] );
        
        Iterator itr1=s1.iterator();
        String result = null;
        while(itr1.hasNext()) {
        	 Map.Entry me1=(Map.Entry)itr1.next();
             
             if(me1.getKey()==numberArray[largestKey]) {
           	  result=(String) me1.getValue();
           	  break;
             }
          }
        
		return result;
	}
}

public class Problem3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sample Input :");
		int n = Integer.parseInt(sc.nextLine());
		Map<Integer,String> hm= new HashMap<>();
		for ( int i =0; i<n;++i) {
			hm.put(Integer.parseInt(sc.nextLine()),sc.nextLine());
		}		
		
		System.out.println("Sample Output :");
		System.out.println(UserMainCode2.getMaxKeyValue(hm));
	}
}
