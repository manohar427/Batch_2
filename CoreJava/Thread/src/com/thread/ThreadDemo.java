package com.thread;

public class ThreadDemo {


	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		thread1.start();
		thread1.setName("PPPPPPPPP");
		//thread1.run();
		//1.Register :236487234687234623
		//System.out.println("ID:"+thread1.getId());
		
		System.out.println("Main thread Name:"+Thread.currentThread().getName());
		System.out.println("Main thread ID:"+Thread.currentThread().getId());
		
	}

}
class MyThread extends Thread
{
	public void run() {
		System.out.println("MyThread thread Name:"+Thread.currentThread().getName());
		System.out.println("MyThread thread ID:"+Thread.currentThread().getId());
		for(int i=0;i<10;i++){
			System.out.println("i:"+i);
			/*try {
				//Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
		}
	}
}