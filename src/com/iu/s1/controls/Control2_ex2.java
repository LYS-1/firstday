package com.iu.s1.controls;

import java.util.Scanner;

public class Control2_ex2 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int language = 0;
		int eng = 0;
		int math = 0;
		double avg = 0;
		int sum = 0;
		
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
		//과목당 40점 미만이면 불합격
		//평균이 60점 이상
		if(language > 40 && eng > 40 && math > 40) {
			if(avg >= 60 ) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
		}else {
			System.out.println("불합격");
		}
		
		boolean flag;
		
		if(avg >= 60) {
			flag = true;
		}
		if(flag = true) {
			if(language < 40 || eng < 40 || math < 40) {
				flag = false;
			}else {
				flag = true;
			}
			if(flag) {
				System.out.println("합격");
			}
		}
		sc1.close();
	}
}
