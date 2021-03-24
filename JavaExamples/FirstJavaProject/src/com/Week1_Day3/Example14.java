package com.Week1_Day3;

interface arthimatic {
    void operation(int a,int b);
    int c=14;
}
class Test1 implements arthimatic{

 

    @Override
    public void operation(int a, int b) {
        System.out.println(a+b);
        System.out.println(arthimatic.c);
    }
    
}
class Test2 implements arthimatic{

 

    @Override
    public void operation(int a, int b) {
        System.out.println(a-b);
    }
    void show () {
        System.out.println("normal method");
    }
    
}
public class Example14 {
	
	public static void main(String[] args) {
		
		arthimatic a= new Test1();
        a.operation(6, 4);
        a=new Test2();
        a.operation(10, 5);
	}

}
