package com.handsonWeek_2_Day_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sample Input :");
		int n = sc.nextInt();
		//System.out.println(n);
		ArrayList<Integer> l1= new ArrayList<>();
		for ( int i =0; i<n;++i) {
			l1.add(sc.nextInt());
		}
		System.out.println("Sample Output :");
		System.out.println((int)sum(l1)+"\n"+(sum(l1)/n));
	}
	
	static float sum(ArrayList<Integer> m) {
		float sum = 0F;
		for(int i = 0; i < m.size(); i++)
		    sum += m.get(i);
		return sum;
	}

}
