package com.learn.practice;

public class TestFinally {

	public static void main(String[] args) {

		TestFinally f = new TestFinally();
		System.out.println(f.testFinally());
	}

	int testFinally() {
		System.out.println("Testing");
		try {
			System.out.println("Inside try ");
			throw new IllegalArgumentException();
		} catch (Exception e) {
			System.out.println("Inside catch ");
			return 2;
		} finally {
			System.out.println("Inside finl");
			return 3;
		}

	}

}
