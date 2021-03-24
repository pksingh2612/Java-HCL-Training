package com.Week1_Day3;
class A2{
    A2(int a){
        System.out.println("1");
    }
    /*A2(){
        System.out.println("0");
    }*/
}
class B2 extends A2{
    B2(){
        super(10);
        System.out.println("2");
    }
}
class C2 extends B2{
    C2(){
        System.out.println("3");
    }
}
public class Example6 {

	public static void main(String[] args) {
		 C2 c=new C2();
	}

}
