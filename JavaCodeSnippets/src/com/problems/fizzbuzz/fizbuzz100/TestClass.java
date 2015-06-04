package com.problems.fizzbuzz.fizbuzz100;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestClass {
	

    public static void main(String args[] ) throws Exception {
        
        
        for (int j = 1; j <= 100; j++) {
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
