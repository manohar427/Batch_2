package com.staticblock;


public class StaticBlockDemo {

	public static void main(String[] args) {
		PrintNumbners p = new PrintNumbners();
		Thread1 t1 = new Thread1(p);
		t1.start();
		
		Thread2 t2 = new Thread2(p);
		t2.start();
	}

}
class PrintNumbners {
	public  void printMyNum(int input) throws InterruptedException {
		
		System.out.println(Thread.currentThread().getName()+" Started");
		synchronized(this){
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + ":"
					+ (i * input));
			Thread.sleep(1000);
		}
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

class Thread2 extends Thread {
	PrintNumbners p;

	public Thread2(PrintNumbners p) {
		this.p = p;
	}

	public void run() {
		try {
			p.printMyNum(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}