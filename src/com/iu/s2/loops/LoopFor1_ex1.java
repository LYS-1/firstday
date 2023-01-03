package com.iu.s2.loops;

public class LoopFor1_ex1 {
	public static void main(String[] args) {
		int sum = 0;
		int first = 1;
		int end = 4;
		//0~100 사이 짝수
//		for(int i = 0; i < 100; i++) {
//			if(i == 0) {
//				System.out.println(i);
//			}else if(i%2 == 0) {
//				System.out.println("짝수" + i);
//			}
//		}
//		for(int i = 0; i < 100; i += 2) {			
//			System.out.println(i);			
//		}
		
		//0~100미만의 합계
		for(int i = first; i < end+1; i++) {
			sum += i;
		}
		System.out.println(first +"부터" + end +"까지의 합계 : " + sum);
	}
}
