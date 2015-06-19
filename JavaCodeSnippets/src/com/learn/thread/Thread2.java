package com.learn.thread;

public class Thread2 extends Thread {
	
	public Thread2() {
	}

	public Thread2(String x) {
		super(x);
	}
	
	@Override
	public void run(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
	}
}
