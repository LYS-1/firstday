package com.study.s2;

import java.util.Scanner;

public class Study2 {
	public static void main(String[] args) {
		System.out.println("Start");
		//키보드 연결 준비
		Scanner scan1 = new Scanner(System.in);
		
		//변수 선언, 대입, 출력
		//이름, 나이, 좌/우 시력
		System.out.println("이름을 입력하세요.");
		String name = scan1.next();
		System.out.println("나이를 입력하세요.");
		int age = scan1.nextInt();
		System.out.println("좌측 시력을 입력하세요.");
		double left = scan1.nextDouble();
		System.out.println("우측 시력을 입력하세요.");
		double right = scan1.nextDouble();
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("좌/우 시력 : " + left + "/" + right);
		System.out.println("Finish");
		scan1.close();
	}
}
