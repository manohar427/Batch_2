package com.thread.staticsy;


public class StaticSynchro {


	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.start();
		
		Thread2 t2 = new Thread2();
		t2.start();
	}

}
class PrintNumbners {
	public static synchronized void printMyNum(int input) throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + ":"
					+ (i * input));
			Thread.sleep(1000);
		}
	}
}

class Thread1 extends Thread {

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

class Thread2 extends Thread {

	public Thread2() {
	}

	public void run() {
		try {
			PrintNumbners.printMyNum(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}