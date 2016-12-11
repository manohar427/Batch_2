package com.thread.group;


public class ThreadGroupDemo {

	public static void main(String[] args) {
		
		
		
		ThreadGroup tg = new ThreadGroup("My Group");
		
		Thread1 tt1 = new Thread1();
		Thread t1 = new Thread(tg,tt1);
		t1.start();
		
		Thread t2 = new Thread(tg,tt1);
		t2.start();
		
		Thread t3 = new Thread(tg,tt1);
		t3.start();
		
		System.out.println("Active Count:"+tg.activeCount());
	}

}

class PrintNumbners {
	public static synchronized void printMyNum(int input)
			throws InterruptedException {

		System.out.println(Thread.currentThread().getName() + " Started");
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + ":"
					+ (i * input));
			Thread.sleep(1000);
		}
	}

}

class Thread1 implements Runnable {

	public Thread1() {
	}

	public void run() {
		try {
			PrintNumbners.printMyNum(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

