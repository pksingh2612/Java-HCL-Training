package com.Week1_Day2;

// Base class
class Box
{
	double width;
	double height;
	double depth;
}

public class Example3 {

    public static void main(String[] args) 
    {
        Box b1=new Box();
        Box b2=new Box();
        b1.width=10;
        b1.height=20;
        b1.depth=15;
        
        b2.width=5;
        b2.height=6;
        b2.depth=7;
        double vol;
        vol=b1.width*b1.height*b1.depth;
        System.out.println("volume is " +vol);
        
        vol=b2.width*b2.height*b2.depth;
        System.out.println("volume is" +vol);

    }
}