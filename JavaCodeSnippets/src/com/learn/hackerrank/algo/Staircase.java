package com.learn.hackerrank.algo;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		one(n);
	}
	
	static void one(int n){
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if((i+j)>n){
					System.out.print("#");
				}
			}
		}
	}
}
