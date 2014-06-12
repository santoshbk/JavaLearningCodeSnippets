package com.problems.sumof2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestClass {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
        	String line1 = br.readLine();
        	long d[] = new long[2];
        	String a[] = line1.split(" ");
            d[0] = Integer.parseInt(a[0]);
            d[1] = Integer.parseInt(a[1]);
            System.out.println(d[0]+d[1]);
        }
		
	}

}
