package com.Week1_Day5;

public class Example9 {

	static double withdraw(int balance, int amount) {
		assert balance>amount;
		return balance-amount;
	}
	public static void main(String[] args) {
		System.out.print(withdraw(1000,500));
		System.out.print(withdraw(1000,2000));
	}
}
