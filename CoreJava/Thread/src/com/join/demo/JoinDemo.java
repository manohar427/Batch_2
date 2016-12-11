package com.join.demo;


public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		Thread1 t1 = new Thread1(new PrintNumbners());
		t1.start();
		
		t1.join();//block
		System.out.println("Thread execution is completed.");
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
	PrintNumbners p;

	public Thread1(PrintNumbners p) {
		this.p = p;
	}

	public void run() {
		try {
			p.printMyNum(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}