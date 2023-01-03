package com.study.s2;


import java.util.Scanner;

public class Study5 {
	public static void main(String[] args) {
		//+,-,*,/,%
		//암호화
		// 1->1 2->2 5-> 11 7-> 13 12-> 30
		int input, output;
		Scanner sc1 = new Scanner(System.in);
		System.out.print("숫자를입력하세요");
		input = sc1.nextInt();
		System.out.print("입력값 : " + input);
		
		//System.out.println(input);
		output = (input/4*10) + (input%4);
		System.out.print("출력값 : " + output);
		
		//System.out.println(output);
		sc1.close();
	}
}
