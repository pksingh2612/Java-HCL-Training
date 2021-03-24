// Problem #1
// ------------
//1. Calculate Average – Hash Map
//
//Write a method that accepts the input data as a hash map and finds out the avg of all values whose keys are odd numbers.
//
//
//Include a class UserMainCode with a static method calculateAverage which accepts a HashMap<Integer,Double> and the size of 
// the HashMap. 
//The return type (Double) should return the calculated average. Round the average to two decimal places and return it.
//
//Create a Class Main which would be used to accept Input values and store it as a hash map, and call the static method present 
//in UserMainCode.
//
//Input and Output Format:
//
//Input consists of an integer n corresponds to number of hash map values, followed by 2n values. (index followed by value).
//
//Output consists of a Double.
//
//Refer sample input and output for formatting specifications.
//
//Sample Input :
//
//4
//
//1
//
//3.41
//
//2
//
//4.1
//
//3
//
//1.61
//
//4
//
//2.5
//
//Sample Output :
//
//2.51

// Solution
//-------------
package com.handsonWeek_2_Day3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.text.DecimalFormat;

class UserMainCode{
	static double calculateAverage(Map<Integer,Double> hm, int size) {
		Set s=hm.entrySet(); //convert both key value pair

        Iterator itr=s.iterator();

        double sum=0;
        int count=0;
        while(itr.hasNext()) {

          Map.Entry me=(Map.Entry)itr.next();
          
          
          if((int) me.getKey()%2==1) {
        	  count++;
        	  sum+=(double)me.getValue();
          }
        }
        
        DecimalFormat df = new DecimalFormat("0.00");
        
		return Double.parseDouble(df.format(sum/count));
		
	}
}

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sample Input :");
		int n = sc.nextInt();
		Map<Integer,Double> hm= new HashMap<>();
		for ( int i =0; i<n;++i) {
			hm.put(sc.nextInt(),sc.nextDouble());
		}		
	
//        double Final =Math.round((sum/count)*100)/100;
		System.out.println("Sample Output :");
		System.out.println(UserMainCode.calculateAverage(hm,hm.size()));
	}

}
