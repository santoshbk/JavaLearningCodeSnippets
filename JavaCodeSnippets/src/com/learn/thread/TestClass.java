package com.learn.thread;

public class TestClass {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Thread1());
		Thread t2 = new Thread(new Thread1());
		t1.start();
		t2.start();
		t1.run();
		try {
			Thread.sleep(10000);
			t2.run();
			System.out.println("1");
			System.out.println("joining");
			t2.join();
			Thread.sleep(7000);
			System.out.println("waiting");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("done");
	}
}
