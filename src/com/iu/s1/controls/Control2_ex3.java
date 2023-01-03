package com.iu.s1.controls;

import java.util.Scanner;

public class Control2_ex3 {
	public static void main(String[] args) {
		int id = 1234;
		int pw = 5678;
		boolean lg = false;
		int pay = 0;
		int wType = 0; 
		double rPay = 0;
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
		//로그인이 성공하면 실행 -> 급여 입력 -> 정규직이면 1, 계약직이면 2입력
		//실급여 계산 - 정규직 : 고용보험2%, 의료보험3%, 국민연금 1%, 산재보험 1%
		//계약직 : 원천징수 3.3%
		
		if(id == sc1.nextInt() && pw == sc1.nextInt()) {
			System.out.println("로그인 성공");
			lg = true;
		}else {
			System.out.println("로그인 실패");
			lg = false;
		}
		
		if(lg = true) {
			System.out.println("급여 입력(단위 만)");
			pay = sc1.nextInt();
			System.out.println("정규직이면 1을 계약직이면 2를 입력해주세요");
			wType = sc1.nextInt();
			if(wType == 1) {
				System.out.println("정규직");
				int tax = (int)(pay*0.02);
				tax += (int)(pay*0.03);
				tax += (int)(pay*0.01);
				tax += (int)(pay*0.01);
				rPay = pay - (tax);
				//rPay = pay*0.93;
			}else if(wType == 2) {
				System.out.println("계약직");
				int tax1 = (int)(pay*0.033);
				rPay = pay - tax1;
				//rPay = pay*0.967;
			}
			System.out.println("당신의 실급여는 " + (int)rPay + "만원입니다.");
		}
		sc1.close();
	}
}
