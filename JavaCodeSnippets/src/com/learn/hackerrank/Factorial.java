package com.learn.hackerrank;

import java.math.BigInteger;

public class Factorial {

	public static void main(String[] args) {
		int a = factor(25);
		System.out.println(a);
		System.out.println(calculateFactorial(100));

		System.out.println(pali("abcd"));
	}

	static int factor(int j) {
		BigInteger one = BigInteger.ONE;
		BigInteger fact = one;
		if (j == 1)
			return one.intValue();
		for (int i = 2; i <= j; i++) {
			fact = fact.multiply(one);
			one = one.add(one);
		}
		return fact.intValue();
	}

	static int calculateFactorial(int number) {
		if (number == 1)
			return 1;
		int fact = 1;
		for (int i = 2; i <= number; i++) {
			fact = fact * i;
		}
		if (fact > Integer.MAX_VALUE || fact < Integer.MIN_VALUE)
			return -fact;
		return fact;
	}

	static String pali(String s) {

		/*
		 * if (createPalin == null) return createPalin; int n =
		 * createPalin.length(); if ((n == 0) || (n == 1)) return createPalin;
		 */
		int length = s.length();
		StringBuilder strBuilder = new StringBuilder(s);
		int i = 0;
		int j = length - 1;
		int count = 0;
		while (i < j) {
			if (s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			} else {
				count++;
				i++;
			}
		}
		System.out.println("C:" + count);
		return strBuilder.toString();
	}

}
