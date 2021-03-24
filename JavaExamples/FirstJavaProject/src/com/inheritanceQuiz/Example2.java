package com.inheritanceQuiz;
abstract class demo
{
    public int a;
    demo()
    {
        a = 10;
    }
 
    abstract public void set();
     
    abstract public void get();
//    abstract final public void get();
    
    //abstract function cannot be final
 
}
public class Example2 {
	
	private int a;

	public void set(int a)
    {
        this.a = a;
    }
 
    final public void get()
    {
        System.out.println("a = " + a);
    }

	public static void main(String[] args) {
		Example2 obj = new Example2();
        obj.set(20);
        obj.get();

	}

}
