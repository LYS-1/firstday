package com.iu.s2.loops;

import java.util.Random;
import java.util.Scanner;

public class Loopwhile1 {
	public static void main(String[] args) {
		Random ran = new Random();
		boolean check = true;
		Scanner sc1 = new Scanner(System.in);
		int num = ran.nextInt(15);
		while(check) {
			System.out.println("숫자를 입력하세요");
			int a = sc1.nextInt();
			if(num == a) {
				System.out.println("일치합니다.");
				break;
			}else {
				System.out.println("불일치합니다.");
			}
		}
	}
}
