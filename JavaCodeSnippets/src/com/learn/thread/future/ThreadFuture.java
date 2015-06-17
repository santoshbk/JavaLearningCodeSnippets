package com.learn.thread.future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadFuture implements Callable<String> {

	public static void main(String[] args) {
		ExecutorService ex = Executors.newFixedThreadPool(4);
		ExecutorService ex1 = Executors.newFixedThreadPool(4);
		List<Future<String>> list = new ArrayList<>();
		Callable<String> c = new ThreadFuture();
		for (int i = 0; i < 50; i++) {
			if (i % 2 == 0) {
				Future<String> future = ex.submit(c);
				list.add(future);
			} else {
				Future<String> future1 = ex1.submit(c);
				list.add(future1);
			}
		}
		for (Future<String> future : list) {
			try {
				System.out.println(future.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
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
