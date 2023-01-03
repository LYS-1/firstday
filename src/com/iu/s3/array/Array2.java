package com.iu.s3.array;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		int ar[] = new int[3];
		int ar2[] = new int[2];
		Scanner sc1 = new Scanner(System.in);
		System.out.println("정수 입력");
		int size = sc1.nextInt();
		int ar3[] = new int[size];
		for (int i = 0; i < ar3.length; i ++) {
			System.out.println("값 입력");
			ar3[i] = sc1.nextInt();
		}
		for (int i = 0; i < ar3.length; i ++) {
			System.out.print("ar3[" + i + "] : " + ar3[i] + " ");
		}
	}
}
