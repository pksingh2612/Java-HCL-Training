//Problem Statement:
//
//What is wrong with this program?
//
// 
//
//// This is the Hello program in Java
//
//class Hello {
//
//      public static void main (String args[ ]) {   
//
//                    int i;   
//
//                    System.out.print("Hello ");       // Say Hello
//
//               i = 0;                               // Initialize loop counter
//
//                       while (i <= args.length) {    // Test and Loop
//
//                    System.out.print(args[i] + " "); 
//
//                     i = i + 1;                     // Increment Loop Counter
//
//                     }
//
//                        System.out.println();             // Finish the line
//
//         }
//
//}

package com.handson2;

public class Problem9 {

	public static void main(String args[]) {
      int i;   

      System.out.print("Hello ");       // Say Hello

 i = 0;                               // Initialize loop counter

         while (i <= args.length) {    // Test and Loop

      System.out.print(args[i] + " "); 

       i = i + 1;                     // Increment Loop Counter

       }

          System.out.println();             // Finish the line
	}

}

// Answer : Exception occurs java.lang.ArrayIndexOutOfBoundsException. 
// this error occurs beacuse Index 1 out of bounds for length 1
