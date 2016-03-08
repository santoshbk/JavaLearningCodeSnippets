package com.problems.sirJadeja;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TestClass {
	public static void main(String args[]) throws Exception {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String[] arrS = { "Rohit", "Dhawan", "Kohli", "Yuvraj", "Raina", "Dhoni", "Sir Jadeja" };
		List<String> list = new LinkedList<>();
		for (int i = 0; i < arrS.length; i++) {
			list.add(arrS[i]);
		}
		for (int i = 0; i < N; i++) {
			int pos = in.nextInt();
			if(pos<8){
				System.out.println(arrS[pos-1]);
				continue;
			}
			int rot = (pos / 7) + 1;
			List<String> list1 = new LinkedList<>();
			for (int j = 0; j < arrS.length; j++) {
				for (int k = 0; k < rot; k++) {
					list1.add(arrS[j]);
				}
			}
			list1.addAll(0,list);
			System.out.println(list1.get(pos-1));
		}
	
    }

}
