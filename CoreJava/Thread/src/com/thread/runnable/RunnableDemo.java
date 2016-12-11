package com.thread.runnable;

public class RunnableDemo {

	public static void main(String[] args) {
    
		MyThread mt1 = new MyThread();
		Thread th1 = new Thread(mt1);
		th1.setName("First Thread");
		th1.start();
		
		Thread th2 = new Thread(mt1);
		th2.setName("Second Thread");
		th2.start();
	}

}
class MyThread implements Runnable
{
	public void run() {
        for(int i=0;i<10;i++){
        	
        	System.out.println(Thread.currentThread().getName()+":"+i);
        }
	}
}