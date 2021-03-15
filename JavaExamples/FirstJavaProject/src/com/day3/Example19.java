package com.day3;

public class Example19 {

	public static void main(String[] args) {
		Example19 e= new Example19();
		e=null; //do garbage collection
        // we implement this
		System.gc(); // it automatically call finalize method
	}

	protected void finalize() {
		System.out.println("finalize method called");
	}
}
