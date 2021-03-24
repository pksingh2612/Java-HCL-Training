//Problem #4
//-----------
//3. Assume the number of matches in total played by CSK is “n” and the venues of each of these matches are given in a string list. Write a program to find the frequency of matches that CSK had played in a particular venue “x”.
//
//Input Format:
//First line of the input is an integer “n” that corresponds to the number of matches played by CSK.
//Next “n” lines contains each a string corresponding to the venues that CSK played in.
//Last line contains a string “x” that corresponds to the particular venue whose frequency has to be found.
//
//Output Format:
//Output should display an integer in a single line, that corresponds to the frequency of the matches played in a given venue “x”.
//
//Sample Input :
//8
//M. A. Chidambaram Stadium
//M. A. Chidambaram Stadium
//M. A. Chidambaram Stadium
//M. Chinnaswamy Stadium
//M. Chinnaswamy Stadium
//Wankhede Stadium
//Eden Gardens
//M. A. Chidambaram Stadium
//M. A. Chidambaram Stadium
//
//Sample Output :
//4

// Solution
//----------
package com.handsonWeek_2_Day_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sample Input :");
		int n = Integer.parseInt(sc.nextLine());
		//System.out.println(n);
		ArrayList<String> l1= new ArrayList<>();
		
		for ( int i =0; i<n;++i) {
			l1.add(sc.nextLine());
		}
		
		//System.out.println(l1);
		
		String s=sc.nextLine();
		//System.out.println(s);
		int count=0;
		for(String a:l1)
			if(a.equals(s))
				count++;

		System.out.println("Sample Output :");
		System.out.println(count);
	}

}
