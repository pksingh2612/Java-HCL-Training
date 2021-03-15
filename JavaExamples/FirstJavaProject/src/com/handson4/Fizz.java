//Problem Statement:
//
//What is the output of the following program?
//
// 
//
//class Fizz {
//
//    int x = 5;
//
//    public static void main(String[] args) {
//
//        final Fizz f1 = new Fizz();
//
//        Fizz f2 = new Fizz();
//
//        Fizz f3 = FizzSwitch(f1, f2);
//
//        System.out.println((f1 == f3) + " " + (f1.x == f3.x));
//
//    }
//
//    static Fizz FizzSwitch(Fizz x, Fizz y) {
//
//        final Fizz z = x;
//
//        z.x = 6;
//
//        return z;
//
//    }
//
//}
//
// 
//
//A. true true
//B. false true
//C. true false
//D. false false
//E. Compilation fails.
//F. An exception is thrown at runtime.

package com.handson4;

public class Fizz {
	
	
	static Fizz FizzSwitch(Fizz x, Fizz y) {
      final Fizz z = x;
      z.x = 6;
      return z;
	}

	public static void main(String[] args) {
		final Fizz f1 = new Fizz();
		
        Fizz f2 = new Fizz();

        Fizz f3 = FizzSwitch(f1, f2);

        System.out.println((f1 == f3) + " " + (f1.x == f3.x));

	}

}

// Answer : E. Compilation fails.
// Because 
//Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
//	x cannot be resolved or is not a field
//	x cannot be resolved or is not a field

