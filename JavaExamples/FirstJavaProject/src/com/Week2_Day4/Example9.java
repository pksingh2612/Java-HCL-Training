package com.Week2_Day4;

class Sample2 implements Sample1{
	@Override
	public void add() {
		System.out.println("Add method");
	}
}
public class Example9 {

	public static void main(String[] args) {
		Sample1 s = new Sample2();
		s.add();
		s.show();
		Sample1.great();

	}

}
