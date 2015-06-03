package com.problems.roy.lifecycle;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RoysLifeCycle {

	public static void main(String args[]) throws Exception {
		/*
		 * Read input from stdin and provide input before running
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		String[] days = new String[N];
		for (int i = 0; i < N; i++) {
			days[i] = br.readLine();
		}
		// int[] counts = new int[N];
		// Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
		int i = 0;
		int largeDay = 0;
		int maxStreak = 0;
		int streak = 0;
		boolean flag = false;
		for (String day : days) {
			int count = 0;
			for (char c : day.toCharArray()) {
				if (c == 'C' || c == 'c') {
					count++;
					streak++;
				} else {
					flag = true;
				}
				if (flag) {
					if (count != 0)
						largeDay = largeDay(largeDay, count);
					count = 0;
					flag = false;
					maxStreak = largeDay(maxStreak, streak);
					streak = 0;
				}
			}
			largeDay = largeDay(largeDay, count);
			if (i == 0) {
				maxStreak = largeDay(maxStreak, streak);
			}
			if (flag) {
				maxStreak = largeDay(maxStreak, streak);
				streak = 0;
			}
			i++;
			largeDay = largeDay(largeDay, count);
			maxStreak = largeDay(maxStreak, streak);

		}
		System.out.println(largeDay + " " + maxStreak);

		/* */
	}

	private static int largeDay(int largeDay, int count) {
		if (largeDay < count) {
			largeDay = count;
		}
		return largeDay;
	}

}
