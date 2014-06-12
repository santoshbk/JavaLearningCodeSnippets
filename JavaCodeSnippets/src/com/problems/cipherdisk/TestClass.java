package com.problems.cipherdisk;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
	
	public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*String line1 = br.readLine();
        int N = Integer.parseInt(line1);*/
        
        for (int i = 0; i < 1; i++) {
        	String line = "correct";
            char arr[] = line.toCharArray();
            int cipher[] = new int[arr.length]; 
            for(int j=0;j<arr.length-1;j++){
            	if(j==0){
            		cipher[j]=ascii(arr[j]);
            	}
            	int k = j+1;
            	int diff = ascii(arr[j]) - ascii(arr[k]);
            	int temp = 0;
            	if(Math.abs(diff)>13){
            		if(diff<0){
            			temp = (diff+26);
            		} else {
            			temp = (diff-26);
            		}
            	} else if (diff==13) {
            		temp = diff;
            	} else {
            		temp = diff;
            	}
            	if(ascii(arr[j])>ascii(arr[k])){
            		if(ascii(arr[j])>13 && diff>13){
            			cipher[k] = -temp;
            		} else if(ascii(arr[j])>13){
            			
            		} else {
            			cipher[k] = temp;
            		}
            	} else {
            		if(ascii(arr[j])>13 && diff>13){
            			cipher[k] = temp;
            		} else {
            			cipher[k] = -temp;
            		}
            	}
            }
            for (int j : cipher) {
				System.out.print(j+" ");
			}
            System.out.println();
        }
    }
	
	static int ascii(char c){
		return ((int)c)-97;
	}

}
