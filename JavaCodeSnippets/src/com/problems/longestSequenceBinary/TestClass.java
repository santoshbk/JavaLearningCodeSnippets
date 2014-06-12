package com.problems.longestSequenceBinary;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) throws Exception {

		Scanner br = new Scanner(new InputStreamReader(System.in));
		int N = br.nextInt();
		long d[] = new long[N];
		for (int i = 0; i < N; i++) {
			d[i] = br.nextLong();
		}
		int p[] = new int[d.length];

		for (int i = 0; i < d.length; i++) {
			p[i] = 1;
		}

		for (int i = 1; i < d.length; i++) {
			for (int j = 0; j < i; j++) {
				if (d[i] > d[j] && p[i] < p[j] + 1) {
					p[i] = p[j] + 1;
				}
			}
		}

		int max = 0;

		for (int i = 0; i < p.length; i++) {
			max = Math.max(p[i], max);
		}
		System.out.println(Integer.toBinaryString(max));

	}
}
