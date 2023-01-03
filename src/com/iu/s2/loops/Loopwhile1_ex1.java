package com.iu.s2.loops;

import java.util.Scanner;

public class Loopwhile1_ex1 {
	public static void main(String[] args) {
		boolean check = true;
		Scanner sc1 = new Scanner(System.in);
		while(check) {
			System.out.println("1. 짜장 2. 짬뽕 3.탕수육 4.프로그램 종료");
			int a = sc1.nextInt();
			switch(a){
			case 1:
				System.out.println("짜장 선택");
				break;
			case 2:
				System.out.println("짬뽕 선택");
				break;
			case 3:
				System.out.println("탕수육 선택");
				break;
			default:
				check = false;
				break;
			}
		}System.out.println("프로그램 종료");
		sc1.close();
	}
}
