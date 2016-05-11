package com.learn.practice;

import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestFinally {

	public static void main(String[] args) {
babc(new TestFinally());
		TestFinally f = new TestFinally();
		System.out.println(f.testFinally());
	}
	
	static public  int getI(){
		return Integer.SIZE;
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
	
	public <U extends ActionListener & Runnable> void go(U u){
		
	}
	
	static void babc(TestFinally a){
		
	/*	int i = 2;
		int j = 5;
		double d;
		d = 3 + i/j +2;
		System.out.println("d"+d);*/
		ByteArrayOutputStream b = new ByteArrayOutputStream();
		try {
			ObjectOutputStream o = new ObjectOutputStream(b);
			o.writeObject(new StringBuffer("Hello"));
			byte[] x = b.toByteArray();
			System.out.println(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("'''");
		System.out.println(a.getClass().getName());
		
	}

}

interface abcd{
	//public static transient int a=3;
	//public final int get();
	
}