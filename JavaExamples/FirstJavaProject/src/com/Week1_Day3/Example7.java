package com.Week1_Day3;

class  X{
    static {
        System.out.println("1");
    }
    {
        System.out.println("2");
    }
    X(){
        this(34);
        System.out.println("3");
    }
    X(int a){
        
        System.out.println("4");
    }
    {
        System.out.println("5");
    }
    static {
        System.out.println("6");
    }

 

}
class Y extends X{
    {
        System.out.println("7");
    }
    {
        System.out.println("8");
    }
    Y(){
        System.out.println("9");
    }
    Y(String s){
        this();
        System.out.println("10");
    }
    static {
        System.out.println("11");
    }
    
}
class Z extends Y{
    static {
        System.out.println("12");
    }
    Z(){
        this(23);
        System.out.println("13");
    }
    {
        System.out.println("14");
    }
    Z(int a){
        super("hello");
        System.out.println("15");
    }
    {
        System.out.println("16");
    }
    static {
        System.out.println("17");
    }
}
public class Example7 {
	
	static {
        System.out.println("18");
    }
    public static void main(String[] args) {
    System.out.println("19");    
    Z z= new Z();
    System.out.println("20");
    }
static {
    System.out.println("21");
}
}
