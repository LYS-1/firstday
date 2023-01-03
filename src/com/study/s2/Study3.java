package com.study.s2;

import java.util.Scanner;

public class Study3 {
	public static void main(String[] args) {
		int language, math, eng, sum;
		double average;
		// 산술 연산자 = +,-,*,/,%
		// 5/3 = 1 5%3 = 2
		Scanner sc1 = new Scanner(System.in);
		//국어 수학 영어 점수 입력 총점 평균 출력
		System.out.println("국어 점수를 입력");
		language = sc1.nextInt();
		System.out.println("수학 점수를 입력");
		math = sc1.nextInt();
		System.out.println("영어 점수를 입력");
		eng = sc1.nextInt();
		sum = language + math + eng;
		average = sum/3;
		System.out.println("총점수 : " + sum);
		System.out.println("평균점수 : "+ average);
		sc1.close();
	}
}
