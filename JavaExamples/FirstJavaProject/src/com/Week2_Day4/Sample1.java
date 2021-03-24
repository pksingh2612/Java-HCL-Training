package com.Week2_Day4;

public interface Sample1 {
	void add();
	default public void show() {
		System.out.println("Default method");
	}
	public static void great() {
		System.out.println("Welcome");
	}
}
