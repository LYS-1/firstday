package com.iu.s1.controls;

import java.util.Scanner;

public class Control1_ex {
	public static void main(String[] args) {
		//키보드로 국어 영어 수학 입력 총점과 평균계산
		//90이상 A 80 이상 B 70 이상 C 나머지 F
		Scanner sc1 = new Scanner(System.in);
		int language = 0;
		int eng = 0;
		int math = 0;
		double avg = 0;
		int sum = 0;
		String score;
		System.out.println("국어 점수를 입력하세요");
		language = sc1.nextInt();
		System.out.println("영어점수를 입력하세요");
		eng = sc1.nextInt();
		System.out.println("수학점수를 입력하세요");
		math = sc1.nextInt();
		
		sum = language + eng + math;
		avg = (double)sum/3;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		if (avg >= 90) {
			score = "A";
		}else if(avg < 90 && avg >= 80) {
			score = "B";
		}else if(avg < 80 && avg >= 70) {
			score = "C";
		}else {
			score = "D";
		}
		System.out.println("학점 : " + score);
		
		if (avg >= 90) {
			System.out.println("학점 : A");
		}else if(avg < 90 && avg >= 80) {
			System.out.println("학점 : B");
		}else if(avg < 80 && avg >= 70) {
			System.out.println("학점 : C");
		}else {
			System.out.println("학점 : F");
		}
		sc1.close();
	}
}
