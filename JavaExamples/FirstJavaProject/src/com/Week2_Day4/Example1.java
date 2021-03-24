package com.Week2_Day4;
class Q{
    int n;
    boolean valueSet=false;
    
    synchronized void get() {
        if(!valueSet)
            try {
                wait();
                
            }
        catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("Got: "+n);
        valueSet=false;
        notify();        
    }
    synchronized void put(int n) {
        if(valueSet)
            try {
                wait();
            }
        catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
        this.n=n;
        valueSet=true;
        System.out.println("Put: "+n);
        notify();
        
    }
}
class Producer implements Runnable{
    Q q;
    Thread t;
    Producer(Q q){
        this.q=q;
        t=new Thread(this,"Producer");
        t.start();
    }

 

    @Override
    public void run() {
        int i=0;
        while(true) {
            q.put(i++);
        }
    }
    
}
class Consumer implements Runnable{
    Q q;
    Thread t;
    Consumer(Q q){
        this.q=q;
        t=new Thread(this,"Consumer");
        
    }
    @Override
    public void run() {
        while(true) {
            q.get();
        }
        
    }
    
}
public class Example1 {

	public static void main(String[] args) {
		Q q=new Q();
        new Producer (q);
        new Consumer(q);
        System.out.println("Press ctrl+c to quit");
	}

}
