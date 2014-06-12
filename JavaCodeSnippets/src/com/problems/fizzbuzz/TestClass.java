package com.problems.fizzbuzz;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestClass {
	

    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        String line2 = br.readLine();
        String arr[] = line2.split(" ");
        int numbers[] = new int[N];
        for (int i = 0; i < N; i++) {
        	numbers[i] = Integer.parseInt(arr[i]);
        }
        for (int i = 0; i < N; i++) {
        	int K = numbers[i];
        	for(int j = 1; j <= K; j++){
        		if(j%3==0){
        			if(j%5==0){
        				System.out.println("FizzBuzz");
        			} else{
        				System.out.println("Fizz");
        			}
        		} else if(j%5==0){
        			System.out.println("Buzz");
        		} else{
        			System.out.println(j);
        		}
        	}
        }
    }


}
