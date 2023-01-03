package com.iu.s2.loops;

import java.util.Scanner;

public class Loopfor_1 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Start");
		System.out.println("반복문 횟수를 입력");
		
		int count = sc1.nextInt();
		int i = 0;
		for(; i < count; i++) {
			System.out.println("hello world");
			System.out.println("bye world");
			System.out.println(i);
		}
		
		System.out.println("Finish");
	}
}
