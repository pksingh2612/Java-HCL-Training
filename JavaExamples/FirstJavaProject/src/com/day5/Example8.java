package com.day5;
class MyException extends Exception{
	private int details;
	
	public MyException(int details) {
		super();
		this.details = details;
	}
}
public class Example8 {
	static void compute(int a) throws MyException {
		System.out.println("called compute"+a);
		if(a>10)
			throw new MyException(a);
		System.out.println("Normal exit");
	}
	public static void main(String[] args) {
		try {
			compute(1);
			compute(20);
		}
		catch(MyException e) {
			System.out.println("Caught"+e);
		}
	}

}
