//Problem Statement:
//
//What is the output of the following program?
//
// 
//
//class Knowing {   
//
//    static final long tooth = 343L;
//
//    static long doIt(long tooth) {
//
//        System.out.print(++tooth + " ");
//
//        return ++tooth;
//
//    }   
//
//    public static void main(String[] args) {
//
//        System.out.print(tooth + " ");
//
//        final long tooth = 340L;
//
//        new Knowing().doIt(tooth);
//
//        System.out.println(tooth);
//
//    }
//
//}
//
// 
//
//A. 343  340  340
//B. 343  340  342
//C. 343  341  342
//D. 343  341  340
//E. 343  341  343
//F. Compilation fails.
//G. An exception is thrown at runtime.

package com.handon4;

public class Knowing {

  static final long tooth = 343L;

  static long doIt(long tooth) {

      System.out.print(++tooth + " ");

      return ++tooth;

  }   

  public static void main(String[] args) {

      System.out.print(tooth + " ");

      final long tooth = 340L;

      new Knowing().doIt(tooth);

      System.out.println(tooth);

  }

}

// Anwser: D. 343  341  340


