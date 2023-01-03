package com.iu.s2.loops;

public class Loopfor2 {
	public static void main(String[] args) {
		//반복문 내의 보조문 1. break : 만나면 즉시 반복문 종료
		for (int i = 0; i < 10; i ++) {		
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("반복문 종료");
		//2. continue : for - 증감식으로 / while - 조건식으로
	}
}


