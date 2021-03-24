//Problem Statement:
//
//What is the output of the following program?
//
// 
//
//class Clidder {
//
//    private final void flipper() {
//
//        System.out.println("Clidder");
//
//    }
//
//}
//
// 
//
//public class Clidlet  extends Clidder {
//
//    public final void flipper() {
//
//        System.out.println("Clidlet");
//
//    }
//
//    public static void main(String[] args) {
//
//        new Clidlet().flipper();
//
//    }   
//
//}
//
// 
//
//A. Clidlet
//B. Clidder
//C. Clidder
//Clidlet
//
//D. Clidlet
//Clidder
//
//E. Compilation fails.
package com.handson4;

class Clidder {

  private final void flipper() {

      System.out.println("Clidder");

  }

}

public class Clidlet1 extends Clidder {
	
  public final void flipper() {

      System.out.println("Clidlet");

  }

  public static void main(String[] args) {

      new Clidlet1().flipper();

  }   

}


// Answer) A. Clidlet