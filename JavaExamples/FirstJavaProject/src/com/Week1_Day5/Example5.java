package com.Week1_Day5;

public class Example5 {
	static void demo() {
        throw new NullPointerException("example");
        
      }
   
	public static void main(String[] args) {
		try {
            demo();
            
        }
        catch(NullPointerException e)
        {
            System.out.println("Recaught " +e);
        }
	}

}
