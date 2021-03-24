package com.Week2_Day5;

interface MyLambda{
	int getLength(String s);
}
interface MyLambda2{
	void add();
}
public class Example6 {

	public static void main(String[] args) {
		MyLambda m=(String s) -> s.length();
		System.out.println(m.getLength("hello"));
		MyLambda2 m2 = () -> System.out.println("welcome");
		m2.add();
	}
}
