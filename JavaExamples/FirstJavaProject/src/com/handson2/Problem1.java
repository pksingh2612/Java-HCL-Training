//Problem Statement 1:
//
//Find out whether the following file will compile. If it does not compile, how you would fix it?
//
// 
//
// public static void main(String[ ] args) {
//
//      int x = 5;
//
//      while (x > 1) {
//
//          x = x + 1;
//
//          if (x < 3) {
//
//               System.out.println(“small x”);
//
//          }
//
//      }
//
// }

package com.handson2;

public class Problem1 {

	public static void main(String[] args) {
		int x = 5;
		
      while (x > 1) {
          x = x + 1;
          if (x < 3) {
               System.out.println("small x");
          }

      }

	}
}

// Answer: Yes it is compiled, its prints the "small x".
// Beacaue x executes upto max range of  int datatype of 2^31 and -2^31. where - 2 ^ 31 is <(1 or 2) 
// that why it - 2 ^ 31 < 3 so it prints "small x".
