package com.problems.cipherdisk;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RoyDisk {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		for (int i = 0; i < N; i++) {
			String word = br.readLine();
			char[] arr = word.toCharArray();
			int len = arr.length;

			if (len == 1) {
				int x = ascii(arr[0]);
				if (x > 13) {
					x -= 26;
				}
				System.out.println(x);
				continue;
			}

			int cipher[] = new int[len];
			int aj = ascii(arr[0]);
			if (aj > 13) {
				aj -= 26;
			}
			cipher[0] = aj;
			for (int j = 0; j < len - 1; j++) {
				int k = j + 1;
				int ref = ascii(arr[j]);
				aj = rotatedVal(arr[j], ref);
				int ak = rotatedVal(arr[k], ref);
				int diff = aj - ak;
				if (diff < -13) {
					cipher[k] = -(diff + 26);
				} else {
					cipher[k] = -diff;
				}
			}
			for (int c : cipher) {
				System.out.print(c + " ");
			}
			System.out.println();
		}

	}

	static int ascii(char c) {
		return ((int) c) - 97;
	}

	static int rotatedVal(char c, int r) {
		int a = ascii(c) - r;
		if (a < 0) {
			return a + 26;
		}
		return a;
	}

}
