package com.iu.s1.controls;

public class Control1 {
	public static void main(String[] args) {
		//단일 if if(조건식){true실행}
		//졸업시혐 / 무조건 통과 / 평균 90이상시 우등상
		System.out.println("프로그램 시작");
		double avg = 95.12;
		int money = 0;
		if(avg >= 90) {
			System.out.println("우등상 수상");
			money = 1000000;
		}
		System.out.println("졸업을 축하");
		System.out.println("장학금 : " + money);
		System.out.println("프로그램 종료");
	}
}
