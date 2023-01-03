package com.iu.s1.controls;

import java.util.Scanner;

public class Control2_ex {
	public static void main(String[] args) {
		int id = 1234;
		int pw = 5678;
		//키보드로부터 id, pw 입력해서 로그인처리
		Scanner sc1 = new Scanner(System.in);
		System.out.println("아이디를 입력해 주세요");
		if(id == sc1.nextInt()) {
			System.out.println("비밀번호를 입력해 주세요");
			if(pw == sc1.nextInt()) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else {
			System.out.println("아이디가 틀렸습니다.");
		}
		sc1.close();
	}
}
