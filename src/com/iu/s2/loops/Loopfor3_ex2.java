package com.iu.s2.loops;

import java.util.Scanner;

public class Loopfor3_ex2 {
	public static void main(String[] args) {
		//fps 30발 1탄창 총 3탄창
		//1. 단발 2. 점사
		//1번 => "탕" 30번 반복출력
		//2번 => "타타탕" 10번 반복출력
		int tp = 0;
		Scanner sc1 = new Scanner(System.in);
		for( int i = 0; i < 3; i ++) {
			System.out.println((i + 1) + "번째 탄창");
			System.out.println("사격 방식 1. 단발 2. 점사");
			tp = sc1.nextInt();
			if(tp == 1) {
				for( int j = 30; j >= 0; j --) {
					System.out.println("탕");
					System.out.println("잔탄 " + j + "발");
				}
			}else if(tp == 2) {
				for( int k = 30; k >= 0; k -=3) {
					System.out.println("타타탕");
					System.out.println("잔탄 " + k + "발");
				}
			}
			System.out.println("장전");
		}
		sc1.close();
		System.out.println("사격 종료");
	}
}
