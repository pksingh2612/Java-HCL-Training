package com.Week2_Day5;

interface Addable{
	int add(int a,int b);
}
public class Example8 {

	public static void main(String[] args) {
		Addable ad=(a,b)->a+b;
		System.out.println(ad.add(20, 30));
	}
}
