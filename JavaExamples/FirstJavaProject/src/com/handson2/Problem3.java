//Problem Statement:
//
//Find out whether the following file will compile. If it does not compile, how you would fix it?
//
// 
//
//                                                          class Loop {
//
//                  int x = 5;
//
//                             while (x  > 1) {
//
//                                   x = x - 1;
//
//                        if (x < 3) {
//
//                              System.out.println(?small x?);
//
//                        }
//
//                   }
//
//             }
//
// 

package com.handson2;

public class Problem3 {

	public static void main(String[] args) {
		int x = 5;
		
		                             while (x  > 1) {
		
		                                   x = x - 1;
		
		                        if (x < 3) {
		
		                              System.out.println("small x");
		
		                        }
		                             }
	}

}

//Answer: It complies twice and prints "small x" two times like this:
//small x
//small x

