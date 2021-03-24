// Problem #2
//-----------
//2. The vice-captain and the leading run-scorer of the team CSK is Suresh Raina.
//One of the best fielders in world cricket, Raina is considered as the finest T20 batsman.
//Given the number of matches “n” that Raina has played in IPL and his individual score in the matches as a list,
//write a program to sort the runs scored by him.
//
//
//Input Format:
//
//First line of the input is an integer “n” that corresponds to the number of matches played by Raina.
//
//Next “n” lines contains an integer in each line, that corresponds to the runs scored by Raina in each of the “n” matches.
//
//Output Format:
//
//Output should print the runs scored by Raina in sorted order, in “n” lines.
//
//Sample Input :
//
//6
//
//101
//78
//90
//59
//77
//67
//
//Sample Output :
//
//59
//67
//77
//78
//90
//101

//Solution
//----------
package com.handsonWeek_2_Day_2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
public class Problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sample Input :");
		int n = sc.nextInt();
		TreeSet<Integer> t= new TreeSet<>();
		for ( int i =0; i<n;++i) {
			t.add(sc.nextInt());
		}
		System.out.println("Sample Output :");
		Iterator<Integer> itr= t.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
