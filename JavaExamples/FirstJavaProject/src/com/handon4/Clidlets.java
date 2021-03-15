//Problem Statement:
//
//What is the output of the following program?
//
// 
//
//class Clidders {
//
//    public final void flipper() {
//
//        System.out.println("Clidder");
//
//    }
//
//}
//
// 
//
//public class Clidlets  extends Clidders {
//
//    public void flipper() {
//
//        System.out.println("Flip a Clidlet");
//
//        super.flipper();
//
//    }   
//
//    public static void main(String[] args) {
//
//        new Clidlets().flipper();
//
//    }   
//
//}
//
// 
//
//A. Flip a Clidlet
//B. Flip  a Clidder
//C. Flip a Clidder
//   Flip a Clidlet
//
//D. Flip a Clidlet
//   Flip a Clidder
//
//E. Compilation fails.

package com.handon4;

class Clidders {

  public final void flipper() {

      System.out.println("Clidder");

  }

}

public class Clidlets {

	public void flipper() {
		
		        System.out.println("Flip a Clidlet");
		
		        super.flipper();
		
		    }   
		
		    public static void main(String[] args) {
		
		        new Clidlets().flipper();
		
		    }   

}

//Answer) E. Compilation fails.
// because
//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//	The method flipper() is undefined for the type Object


