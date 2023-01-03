package com.study.s2;

import java.util.Scanner;

public class Study7 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		boolean check1 = num1 == num2;
		System.out.println(check1);
		
		long num3 = 10L;
		check1 = num1 == num3;
		System.out.println(check1);
		num1 = 1;
		check1 = num1 == '1';
		System.out.println(check1);
		
		String str1 = "abc";
		String str2 = "abc";
		check1 = str1 == str2;
		System.out.println(check1);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("입력하세요");
		String str3 = sc1.next();//abc
		check1 = str1.equals(str3);
		System.out.println(check1);
		sc1.close();
	}
}
