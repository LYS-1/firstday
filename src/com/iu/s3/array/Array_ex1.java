package com.iu.s3.array;

import java.util.Scanner;

public class Array_ex1 {
	//1. 학생 수 입력 2. 학생의 수만큼 이름을 입력 a, b
	//3. 학생의 번호, 국어, 영어, 수학 입력 
	//a 번호 : / 국어 : / 영어 : / 수학 : 입력후 총점 평균 배열도추가
	//모든 학생의 정보 출력
	public static void main(String[] args) {
		int sTotal;
		String name;		
		int num, kor, eng, math, sum;
		double avg;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("학생 수 입력");
		sTotal = sc1.nextInt();
		String nameA[] = new String[sTotal];
		int numA[] = new int[sTotal];
		int korA[] = new int[sTotal];
		int engA[] = new int[sTotal];
		int mathA[] = new int[sTotal];
		int sumA[] = new int[sTotal];
		double avgA[] = new double[sTotal];
		
		for ( int i = 0; i < sTotal; i ++) {
			System.out.println((i+1) + "번째 학생의 이름을 입력해 주세요");
			name = sc1.next();
			nameA[i] = name;
			numA[i] = i;
		}
		for ( int i = 0; i < nameA.length; i ++) {
			System.out.println(nameA[i] + " 학생의 국어점수 : ");
			kor = sc1.nextInt();
			korA[i] = kor;
			System.out.println(nameA[i] + " 학생의 영어점수 : ");
			eng = sc1.nextInt();
			engA[i] = eng;
			System.out.println(nameA[i] + " 학생의 수학점수 : ");
			math = sc1.nextInt();
			mathA[i] = math;
			
			sum = kor + eng + math;
			sumA[i] = sum;
			avg = (double)sum/3;
			avgA[i] = avg;
		}
		
		System.out.println("이름 \t 번호 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
		
		for( int i = 0; i < nameA.length; i ++) {
			System.out.println(nameA[i] + " \t " + numA[i] + " \t " + korA[i] 
					+ " \t " + engA[i] + " \t " + mathA[i] + " \t " + sumA[i] 
							+ " \t " + avgA[i]);			
		}
	}
}
