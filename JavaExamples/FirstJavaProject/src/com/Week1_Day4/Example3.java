package com.Week1_Day4;

public class Example3 {

	public static void main(String[] args) 
	{
		Integer i1=new Integer(42);
        System.out.println(i1);
        
        String s="42";
        int i2=Integer.parseInt(s);
        System.out.println(i2);
        
        int i3=Integer.parseInt(s,5);
        System.out.println(i3); //22
        
        System.out.println(Integer.toBinaryString(i3));
        System.out.println(Integer.toOctalString(i3));
        System.out.println(Integer.toHexString(i3));
        
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.TYPE);
    
	    Long l1=new Long(42);
	    Long l2=new Long("42");
	    Short s1=new Short((short)42);
	    Short s2=new Short("42");
	    Long l3=l2;
	    Short s3=s1;
	    int r=0;
	    if(l1.equals(l2)) r=0;
	    if(l2.equals(l3)) r=r+1;
	    if(l3==l1) r=r+10;
	    if(l3.equals(s3)) r=r+100; //false
	    if(s3==s1) r=r+1000;
	    System.out.println(r);
	    
	    Integer i4=new Integer(128);
	    Byte b1=new Byte((byte)128);//-128 to 127
	    if(i4.intValue()==b1.byteValue()) {
	        System.out.println("same");
	    }
	    else {
	        System.out.println("Different");
	    }
	    
	}
 

}
