package com.problems.bestbrowser;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestClass {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		String []arr = new String[N];
		for (int i = 0; i < N; i++) {
			String a = br.readLine();
			int len = a.length();
			arr[i] = a.substring(4, len-4);
			int count = 0;
			for (char c : arr[i].toCharArray()) {
				if(c=='a' || c =='e' || c == 'i' || c == 'o' || c == 'u'){
					continue;
				}else{
					count++;
				}
			}
			count+=4;
			System.out.println(count+"/"+len);
		}
		
	}

}
