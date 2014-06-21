package com.learn.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadFuture implements Callable<String>{
	
	public static void main(String[] args) {
		ExecutorService ex = Executors.newFixedThreadPool(10);
		List<Future<String>> list = new ArrayList<>();
		Callable<String> c = new ThreadFuture();
		for (int i = 0; i < 50; i++) {
			Future<String> future = ex.submit(c);
			list.add(future);
		}
		for (Future<String> future : list) {
			try {
				System.out.println(future.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		ex.shutdown();
	}
	
	
	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return Thread.currentThread().getName();
	}

}
