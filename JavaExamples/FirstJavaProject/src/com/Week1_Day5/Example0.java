package com.Week1_Day5;

public class Example0 {

	public static void main(String[] args) {
		String queryString= "PK where Singh";
		String [] StartIndex = queryString.split("where");
		System.out.println(StartIndex[0]);
	}

}
