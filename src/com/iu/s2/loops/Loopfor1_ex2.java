package com.iu.s2.loops;

import java.util.Scanner;

public class Loopfor1_ex2 {
	public static void main(String[] args) {
//		int score = 0;
//		int student = 0;
//		int sum = 0;
//		double avg = 0;
		int time = 0;
		Scanner sc1 = new Scanner(System.in);
//		//학생수 입력 - 학생수만큼 점수 입력 - 총합계
//		System.out.println("학생수 입력");
//		student = sc1.nextInt();
//		for (int i = 0; i < student; i++) {
//			System.out.println("점수 입력");
//			score = sc1.nextInt();
//			sum += score;
//		}
//		avg = Math.round((double)(sum/student)*10)/10;
//		System.out.println("점수 총합 : " + sum);
//		System.out.println("평균 : " + avg);
//		
		System.out.println("초를 입력하세요");
		time = sc1.nextInt();
		for (int i = 0; i < 60; i++) {
			if (i <= time) {
				System.out.println(i + "초");
			}
		}System.out.println("종료");
	}
}
