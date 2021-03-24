package com.Week3_Day2;
//POJO 
public class MessageUtil {
	private String message;

	public MessageUtil(String message) {
		super();
		this.message = message;
	}
	public String printMessage() {
		System.out.println(message);
		return message;
		
	}
	public int addNumber(int a, int b) {
		return a+b;
	}
  public void getMessage() {
        int a=0;
        int b=10/a;
  }
}