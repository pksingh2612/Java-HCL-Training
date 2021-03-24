package com.Week2_Day3;


//This class just acts like child thread class but yet
//the thread is not created. In order to create Thread
//we have to any one of 7 constructor
class NewThread implements Runnable{
  Thread t;
  NewThread(){
      t=new Thread(this,"Demo thread");
      System.out.println("Child Thread "+t);//Thread[Demo thread,5,main]
      t.start(); //it creates new child thread put in Runnable stage and comes to main thread
  }



  @Override
  public void run() {
      //operation of child thread
      try {
          for(int i=5;i>0;i--) {
              System.out.println("Child thread "+i);
              Thread.sleep(500);        
          }
      }
      catch(InterruptedException e) {
          System.out.println("Child thread interrupted");
      }
      System.out.println("Exiting child thread");
  }
  
}
public class Example4 {

	public static void main(String[] args) {
        NewThread n=new NewThread();
        
        try {
            for(int i=5;i>0;i--) {
                System.out.println("Main Thread "+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting");

	}

}
