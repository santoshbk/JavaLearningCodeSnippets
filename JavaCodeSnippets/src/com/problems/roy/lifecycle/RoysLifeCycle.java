package com.problems.roy.lifecycle;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

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
		int[] counts = new int[N];
		Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
		int i=0;
		int largeDay = 0;
		for (String day : days) {
			int count = 0;
			for (char c : day.toCharArray()) {
				if(c=='C' || c=='c')
					count++;
			}
			counts[i++]=count;
			
		}
		
		
		
		/* */
	}

}
