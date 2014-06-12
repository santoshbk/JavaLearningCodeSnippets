package com.problems.reversePrime;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class Primes {

	static final int COUNT = 1000000;

	static boolean[] a = new boolean[COUNT];
	
	static Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();

	public static void main(String[] args) {
		long t1 = new Date().getTime();
		fill();
		Vector<Integer> good = new Vector<Integer>();
		Vector<Integer> bad = new Vector<Integer>();
		for (int i = 11; i < COUNT; i++) {
			if (good.contains(i) || bad.contains(i)) {
				continue;
			}
			if (isPrime(i)) {
				int j = reverse(i);
				if (i == j) {
					continue;
				}
				if (isPrime(j)) {
					good.add(i);
					bad.add(j);
				}
			}
		}
		for (int i = 0; i < good.size(); i++) {
				System.out.println(good.get(i));
		}
		long t2 = new Date().getTime();
		System.out.println("Time:"+ (t2-t1));

	}
	
	static int reverse(int n) {
		StringBuilder s = new StringBuilder(String.valueOf(n)).reverse();
		return Integer.parseInt(s.toString());
	}

	int reverseL(int input) {
		long reversedNum = 0;

		while (input != 0) {
			reversedNum = reversedNum * 10 + input % 10;
			input = input / 10;
		}
		return (int) reversedNum;
	}

	static void fill() {
		Arrays.fill(a, true);
		a[0] = a[1] = false;
		for (int i = 2; i < a.length; i++) {
			if (a[i]) {
				for (int j = 2; i * j < a.length; j++) {
					a[i * j] = false;
				}
			}
		}
	}
	
	static void filler() {
		for (int i = 0; i < COUNT; i++) {
			map.put(i, true);
		}
		map.put(0, false);
		map.put(1, false);
		for (int i = 2; i < COUNT; i++) {
			if (map.get(i)) {
				for (int j = 2; i * j < a.length; j++) {
					map.put(i*j, false);
				}
			}
		}
	}

	static boolean isPrime(int n) {
		return a[n];
	}

}
