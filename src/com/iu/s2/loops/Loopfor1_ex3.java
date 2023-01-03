package com.iu.s2.loops;

import java.util.Scanner;

public class Loopfor1_ex3 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int id = 1234;
		int pw = 5678;
		boolean login = false;
		int i = 0;
		//로그인 시도 5번가능 반복문 종료후 로그인 성공 = 환영합니다
		//실패 = 은행을 방문하세요
		for (; i < 5; i ++) {
			System.out.println("id를 입력하세요");
			int inputID = sc1.nextInt(); 
			System.out.println("pw를 입력하세요");
			int inputPW = sc1.nextInt();
			if(inputID == id && inputPW == pw) {
				System.out.println("로그인 성공");
				login = true;
				i = 1000;
			}
			System.out.println("로그인 실패");
		}
		
		if(i == 1000) {
			System.out.println("환영합니다.");
		}else {
			System.out.println("은행을 방문하세요.");
		}
	}
}
