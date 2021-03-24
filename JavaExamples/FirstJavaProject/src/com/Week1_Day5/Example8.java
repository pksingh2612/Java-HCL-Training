package com.Week1_Day5;
class MyException extends Exception{
    private int details;
    
    public MyException(int details) {
        super();
        this.details=details;
        
    }

 

    @Override
    public String toString() {
        return "MyException [details=" + details + "]";
    }
}
public class Example8 {
	static void compute(int a) throws MyException {
	     System.out.println("Called compute " +a);
	     if(a>10)
	         throw new MyException(a);
	     System.out.println("Normal exit");
	 }
	public static void main(String[] args) {
		try {
            compute(1);
            compute(20);
            
        }
        catch(MyException e) {
            System.out.println("Caught "+e);
            
        }
	}

}
