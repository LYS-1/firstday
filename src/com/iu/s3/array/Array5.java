package com.iu.s3.array;

public class Array5 {
	public static void main(String[] args) {
		int ar1[] = {1,2,3};
		int ar2[] = new int[2];
		for ( int i = 0; i < ar2.length; i ++) {
			ar2[i] = ar1[i];
		}
		ar1 = ar2;
		for ( int i = 0; i < ar1.length; i ++) {
			System.out.println(ar1[i]);
		}
//		for ( int i = 0; i < ar1.length-1; i ++) {
//			System.out.println(ar1[i]);
//		}
	}
}
