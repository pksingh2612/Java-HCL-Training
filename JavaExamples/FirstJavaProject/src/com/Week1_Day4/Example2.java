package com.Week1_Day4;

public class Example2 {

	public static void main(String[] args) {
		Double d1=new Double(45.6);
        System.out.println(d1);
        
        Double d2=d1.doubleValue();
        System.out.println(d2);
        
        Double d3=new Double("55.6");
        System.out.println(d3);
        
        String s="66.7";
        double d4=Double.parseDouble(s);
        System.out.println(d4);
        
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.TYPE);
	}

}
