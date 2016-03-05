package com.learn.hackerrank.algo;

import java.util.Scanner;

public class DiagDiff {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = in.nextInt();
			}
		}
		long sumDiagPrim = 0;
		long sumDiagSec = 0;
		for (int i = 0; i < n; i++) {
			int j = 0;
			while (j < n) {
				if (i == j) {
					sumDiagPrim += a[i][j];
				}
				j++;
				if (i == (n - j)) {
					sumDiagSec += a[i][j-1];
				}
			}
		}
		System.out.println(Math.abs(sumDiagPrim - sumDiagSec));
	}
}
