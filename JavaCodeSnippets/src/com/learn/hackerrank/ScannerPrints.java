package com.learn.hackerrank;

import java.util.Scanner;

public class ScannerPrints {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		double y = sc.nextDouble();
		sc.nextLine();
		String z = sc.nextLine();

		System.out.println("String: " + z);
		System.out.println("Double: " + y);
		System.out.println("Int: " + x);
	}

}
