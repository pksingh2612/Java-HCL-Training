package com.Week1_Day2;

class A1{
	int i,j;
	void showij() {
		System.out.println("i = "+i);
	}
}

class B extends A1{
	int k;
	public B(int a, int b, int c)
	{
		i=a;
		j=b;
		k=c;
	}
	void subk() {
		System.out.println(k);
	}
	
}
public class Example13 {

	public static void main(String[] args) {
		B b = new B(10,20,30);
		b.showij();
		b.subk();
	}

}
