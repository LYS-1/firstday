package com.iu.s3.array;

public class Array4 {
	public static void main(String[] args) {
		int ar1[] = {1,2,3};
		int cp[] = new int[ar1.length + 1];
		
		for ( int i = 0; i < ar1.length; i ++) {
			cp[i] = ar1[i];
		}
		
		for( int i = 0; i < ar1.length; i ++){
			System.out.println(ar1[i]);
		}
		cp[cp.length - 1] = 4;
	}
}
