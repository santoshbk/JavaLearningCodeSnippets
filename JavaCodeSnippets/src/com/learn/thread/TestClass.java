package com.learn.thread;

public class TestClass {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Thread1(), "abcd");
		Thread t2 = new Thread(new Thread1(), "efgh");
		t1.start();
		t2.start();
		
		Thread t3 = new Thread2("xx");
		Thread t4 = new Thread2();
		t3.start();
		t4.start();
		
		try {
			Thread.sleep(10000);
			System.out.println("1");
			System.out.println("joining");
			t2.join();
			t3.join();
			System.out.println("waiting");
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("done");
	}
}
