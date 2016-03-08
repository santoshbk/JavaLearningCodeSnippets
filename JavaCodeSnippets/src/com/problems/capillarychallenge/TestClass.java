package com.problems.capillarychallenge;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestClass {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		char[] values = { 'O', 'Z' };
		for (int z = 0; z < T; z++) {
			Set<String> set = new TreeSet<>();

			int N = in.nextInt();
			long K = in.nextLong();
			char[] c = new char[N];
			int i[] = new int[N];
			int count = 0;
			for (int j = 0; j < Math.pow(2, N); j++) {
				count = 0;
				while (count < N) {
					c[count] = values[i[count]];
					count++;
				}
				set.add(new String(c));
				count = 0;
				while (count < N) {
					if (i[count] < 1) {
						i[count]++;
						break;
					} else {
						i[count] = 0;
					}
					count++;
				}
			}
			
			for (Iterator<String> it = set.iterator(); it.hasNext();) {
				String s = it.next();
				if (s.contains("ZZ"))
					it.remove();
			}
			if (K > set.size()) {
				System.out.println("-1");
			} else {
				int a = 0;
				for (String string : set) {
					if (a == K - 1) {
						System.out.println(string);
						break;
					}
					a++;
				}
			}
		}
	}
}
