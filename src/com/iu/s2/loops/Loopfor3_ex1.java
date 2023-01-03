package com.iu.s2.loops;

import java.util.Scanner;

public class Loopfor3_ex1 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		//분과 초를 입력하고 해당 시간이 되면 반복문 종료
		System.out.println("분을 입력하세요");
		int min = sc1.nextInt();
		System.out.println("초을 입력하세요");
		int sec = sc1.nextInt();
		int m = 0;
		int s = 0;
		boolean check = false;
		for (m = 0; m < 60; m ++) {
			for (s = 0; s < 60; s ++) {
				if(m == min && s == sec) {
					check = true;
					break;
				}
				System.out.println(m + " 분 " + s + " 초 ");
			}if (check == true) {
				System.out.println(m + " 분 " + s + " 초 ");
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
