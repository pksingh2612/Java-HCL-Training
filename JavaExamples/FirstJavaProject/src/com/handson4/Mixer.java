//Problem Statement:
//
//What is the output of the following program?
//
// 
//
//class Mixer {   
//
//    Mixer() { }
//
//    Mixer(Mixer m) { m1 = m; }
//
//    Mixer m1;
//
//    public static void main(String[ ] args) {
//
//        Mixer m2 = new Mixer();
//
//        Mixer m3 = new Mixer(m2);
//
//        m3.go();
//
//        Mixer m4 = m3.m1;
//
//        m4.go();
//
//        Mixer m5 = m2.m1;
//
//        m5.go();
//
//    }
//
//    void go() {
//
//        System.out.println("hi ");
//
//    }
//
//}
//
// 
//
//A. hi
//B. hi hi
//C. hi hi hi
//D. Compilation fails
//E. hi, followed by an exception
//F. hi hi, followed by an exception
// 
package com.handson4;

public class Mixer {

	Mixer() { }

    Mixer(Mixer m) { m1 = m; }

    Mixer m1;
    
    void go() {

        System.out.println("hi ");

    }
    
	public static void main(String[] args) {
		Mixer m2 = new Mixer();

        Mixer m3 = new Mixer(m2);

        m3.go();

        Mixer m4 = m3.m1;

        m4.go();

        Mixer m5 = m2.m1;
        
        m5.go();
	}

}

// Answer: F hi hi, followed by an exception. And the exception is
//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "com.handon4.Mixer.go()" 
//because "m5" is null at com.handon4.Mixer.main(Mixer.java:79)


