package com.problems.capillarychallenge;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int z = 0; z < T; z++) {
			Deque<Character> dq = new ArrayDeque<>();
			String s = in.nextLine();
			int l = s.length();
			for (int i = 0, j = l - 1; i < l; i++, j--) {
				char c = s.charAt(i);
				if (c == 'R')
					dq.addFirst(c);
				if (j < (l / 2)) {
					char d = s.charAt(j);
					if (c == 'K')
						dq.addFirst(d);
				}
			}
			System.out.println(dq.size());
		}
	}

}
