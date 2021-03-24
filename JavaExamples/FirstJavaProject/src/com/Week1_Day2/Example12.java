package com.Week1_Day2;


class Outer{
	int var=100;
//	void show() {
//		Inner i =new Inner();
//		i.display(); //// call in inner method
//	}
	class Inner{
		int x=10;
		void display() {
			System.out.println(x);
			System.out.println(var);
		}
	}
}

class Outer1{
	static int var=100;
//	void show() {
//		Inner i =new Inner();
//		i.display(); //// call in inner method
//	}
	static class Inner{
		int x=10;
		void display() {
			System.out.println(x);
			System.out.println(var);
		}
	}
}
public class Example12 {

	public static void main(String[] args) {
//		Outer outer=new Outer();
//		outer.show(); // call in outer method
		
		//second approach
		Outer.Inner outerInner=new Outer().new Inner();
		outerInner.display();
		
		//static 
	}

}
