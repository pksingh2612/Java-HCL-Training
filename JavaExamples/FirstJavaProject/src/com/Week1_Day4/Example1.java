package com.Week1_Day4;

public class Example1 {

	public static void main(String[] args) {
		float f1=3.14f;
        float f2=3.14f;
        
        System.out.println(Float.compare(f1, f2));
       
        Float f3= new Float(3.14f);
        Float f4= new Float(3.14f);
        System.out.println(f3.compareTo(f4));
    
        String s="3.14";
        float f5=Float.parseFloat(s);
        System.out.println(f5);
        
        Float f6=Float.valueOf(f5);
        System.out.println(f6);
        
        float f7=f6.floatValue();
        System.out.println(f7);
        
        System.out.println(Float.MAX_VALUE);
System.out.println(Float.MIN_VALUE);
System.out.println(Float.TYPE);

 

Float f8=new Float("abc");
System.out.println(f8);
          
          
	}

}
