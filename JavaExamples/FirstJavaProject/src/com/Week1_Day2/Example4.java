package com.Week1_Day2;

class Box1
{
    double width;
    double height;
    double depth;
    
    double volume()
    {
        return width*height*depth;
    }

 

    
}
public class Example4 
{

 

    public static void main(String[] args) {
        Box1 b1=new Box1();
        
        b1.width=10;
        b1.height=20;
        b1.depth=15;
        
    double vol=    b1.volume();
    System.out.println("Volume is " + vol);
    

 

    }

 

}