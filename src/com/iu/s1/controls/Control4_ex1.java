package com.iu.s1.controls;

import java.util.Scanner;

public class Control4_ex1 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("평균을 입력");
		int avg = sc1.nextInt();
		int demo = avg/10;
		if(avg>100 || avg<0) {
			System.out.println("값을 잘못입력함");
		}else {
			switch (demo) {
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			default:
				System.out.println("F");
				break;
			}
		}
		sc1.close();
	}
}
