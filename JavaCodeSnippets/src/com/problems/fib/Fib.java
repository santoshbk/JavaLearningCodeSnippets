package com.problems.fib;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Fib {

	public static void main(String[] args) {
		Fib f = new Fib();
		Scanner br = new Scanner(System.in);
		int k = br.nextInt();
		
		long x = new Date().getTime();
		System.out.println("Fibinocci of: " + k + " : " + f.fibMap(k));
		long y = new Date().getTime();
		System.out.println("Time: " + (y - x));
		
		long i = new Date().getTime();
		System.out.println("Fibinocci of: " + k + " : " + f.fibi(k));
		long j = new Date().getTime();
		System.out.println("Time: " + (j - i));

	}

	long fibi(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fibi(n - 1) + fibi(n - 2);
	}

	long fibMap(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		Map<Integer, Long> map = new HashMap<Integer, Long>();
		map.put(0, 0L);
		map.put(1, 1L);
		for (int i = 2; i <= n; i++) {
			map.put(i, (map.get(i - 1) + map.get(i - 2)));
		}
		return map.get(n);
	}

}
