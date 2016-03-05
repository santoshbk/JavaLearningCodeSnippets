package com.learn.hackerrank.algo;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		double countPositive = 0;
		double countNegetive = 0;
		double countZero = 0;
		for (int i : arr) {
			if (i > 0)
				countPositive++;
			else if (i < 0)
				countNegetive++;
			else
				countZero++;
		}
		System.out.println(String.format("%.6f", countPositive / n));
		System.out.println(String.format("%.6f", countNegetive / n));
		System.out.println(String.format("%.6f", countZero / n));

	}

}
