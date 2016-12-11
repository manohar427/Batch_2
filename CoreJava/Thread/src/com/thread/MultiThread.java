package com.thread;

public class MultiThread {

	public static void main(String[] args) {

		Thread1 th1 = new Thread1();//1
		th1.start();//2
		System.out.println("STATUS Thread1 :"+th1.getState());
		System.out.println("Priority Thread1 :"+th1.getPriority());
		th1.setPriority(0);
		
		Thread2 th2 = new Thread2();
		th2.start();
		
	}
}

class Thread1 extends Thread
{
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println("Thread1:"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Thread2 extends Thread
{
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println("Thread2:"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
