//Problem Statement:
//
//What is the output of the following program?
//
// 
//
//import java.util.*;
//public class Area {
//      public static void main(String[ ] args){
//          double a;
//    double r;
//    final double pi = Math.PI;
//
//    r = 1.0;
//    a = pi * r * r;
//    display(r,a);
//
//    r = 1.5;
//    a = pi * r * r;
//    display(r,a);
//
//    r = 2.0;
//     a = pi * r * r;
//    display(r,a);
//      }//end main
//      //-------------------------------------------//
//      static void display(double r, double a){
//           System.out.println("For radius = " + r +
//                                ", area = " + a);
//      }//end print
//}//end Area class
package com.handson2;

public class Problem10 {
	
	static void display(double r, double a){
        System.out.println("For radius = " + r +
                             ", area = " + a);
   }

	public static void main(String[] args) {
		double a;
	    double r;
	    final double pi = Math.PI;

	    r = 1.0;
	    a = pi * r * r;
	    display(r,a);

	    r = 1.5;
	    a = pi * r * r;
	    display(r,a);

	    r = 2.0;
	     a = pi * r * r;
	    display(r,a);
	}

}

// Answer
//For radius = 1.0, area = 3.141592653589793
//For radius = 1.5, area = 7.0685834705770345
//For radius = 2.0, area = 12.566370614359172

