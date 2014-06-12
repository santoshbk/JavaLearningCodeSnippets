package com.problems.profilePicIssue;


import java.io.BufferedReader;
import java.io.InputStreamReader;


class TestClass {
    public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        int L = Integer.parseInt(line1);
        String line2 = br.readLine();
        int N = Integer.parseInt(line2);
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            String arr[] = line.split(" ");
        	int W = Integer.parseInt(arr[0]);
        	int H = Integer.parseInt(arr[1]);
        	if(W<L || H<L){
        	 	System.out.println("UPLOAD ANOTHER");
        	} else {
        		if(W==H){
        			System.out.println("ACCEPTED");
        		} else {
        			System.out.println("CROP IT");
        		}
        	}
        }
       
    }
}
