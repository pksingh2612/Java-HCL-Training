//Problem Statement:
//
//What is the output of the following program?
//
// 
//
//class Alien {
//
//    String invade(short ships) {
//
//        return " a few";
//
//    }
//
//}
//
// 
//
//class Defender {   
//
//    public static void main(String[] args) {
//
//        System.out.println(new Alien().invade(7));
//
//    }
//
//}
//
// 
//
//A. many
//b. a few
//C. Compilation fails
//D. The output is not predictable
//E. An exception is thrown at runtime

package com.handon4;

class Alien {

  String invade(short ships) {

      return " a few";

  }

}

public class Defender {

	public static void main(String[] args) {
		System.out.println(new Alien().invade(7));

	}

}

//
//Answer: C. Compilation fails
// because
//	Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//		The method invade(short) in the type Alien is not applicable for the arguments (int)
//
//		at com.handon4.Defender.main(Defender.java:52)
