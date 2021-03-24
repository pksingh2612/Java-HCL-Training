package com.Week1_Day3;

interface A6{
    void meth1();
}
interface B6{
    void meth2();
}
interface C6 extends A6,B6{
    void meth3();
    
}
class Test3 implements C6{

 

    @Override
    public void meth1() {
        System.out.println("inside of meth1");
        
    }

 

    @Override
    public void meth2() {
        System.out.println("inside of meth2");
        
    }

 

    @Override
    public void meth3() {
        System.out.println("inside of meth3");
    }
    
}

public class Example15 {

	public static void main(String[] args) {
		Test3 t= new Test3();
        t.meth1();
        t.meth2();
        t.meth3();

	}

}
