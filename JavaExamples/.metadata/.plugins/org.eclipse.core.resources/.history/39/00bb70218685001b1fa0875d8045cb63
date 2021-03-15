//Problem Statement:
//
//What is the output of the following program?
//
// 
//
//class Eggs {   
//
//    int doX(Long x, Long y) { return 1;}
//
//    int doX(long... x) { return 2;}
//
//    int doX(Integer x, Integer y) { return 3; }
//
//    int doX(Number n, Number m) { return 4; }
//
//   
//    public static void main(String[ ] args) {
//
//        new Eggs().go();
//
//    }
//
// 
//
//    void go() {
//
//        short s = 7;
//
//        System.out.println(doX(s,s) + " ");
//
//        System.out.println(doX(7,7));
//
//    }
//
//}
//
// 
//
//A. 1  1
//B. 2  1
//C. 3  1
//D. 4  1
//E. 2  3
//F. 3  3
//G. 4  3

package com.handon4;

public class Eggs {
	int doX(Long x, Long y) { return 1;}

    int doX(long... x) { return 2;}

    int doX(Integer x, Integer y) { return 3; }

    int doX(Number n, Number m) { return 4; }
    
    
    void go() {

        short s = 7;

        System.out.println(doX(s,s) + " "); // calling int doX(Number n, Number m) { return 4; } because by default all short wrapper class present in Number Class

        System.out.println(doX(7,7));// 7 is int type but no method is their in Eggs for it. So A/c to auto-boxing concept it will call int doX(Integer x, Integer y) { return 3; }.
        //Because all the int convert to Interger wrapper class
        

    }

   
	public static void main(String[] args) {
		new Eggs().go();
	}

}

// Answer : G
