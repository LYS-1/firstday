package com.study.s2;

import java.util.Scanner;

public class Study11 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("소문자를입력하세요");
		char ch1 = sc1.next().charAt(0);
		int ask = (int)ch1;
		System.out.println("숫자를 입력하세요");
		int key1 = sc1.nextInt();
		int sum = ask + key1;
		char result =' ';
		int over = sum > 122 ? 97 + (sum - 97) % 26 : sum;
		result = (char)(over);
		System.out.println("입력 결과 : " + result);
		sc1.close();
	}
}
