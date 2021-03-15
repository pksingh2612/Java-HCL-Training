//What is the output of the following program?
//
// 
//
//class Top {
//
//    public Top(String s) {
//
//        System.out.println("B");
//
//    }
//
//   
//
//    public class Bottom2 extends Top {
//
//        public Bootom2(String s) {
//
//            System.out.println("D");
//
//        }
//
//        public static void main(String[] args) {
//
//            new Bottom2("C");
//
//            System.out.println(" ");
//
//        }
//
//    }
//
//}
//
// 
//
//A. BD
//B. DB
//C. BDC
//D. DBC
//E. Compilation fails.
package com.handson4;


class Top {

  public Top(String s) {

      System.out.println("B");

  }
}
public class Bottom2 {
	public Bootom2(String s) 
	{
		System.out.println("D");
	}
		
    public static void main(String[] args) {

        new Bottom2("C");

        System.out.println(" ");

    }

}

// Answer: E. Compilation fails.
// because 
//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//	The constructor Bottom2(String) is undefined
