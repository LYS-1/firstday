package com.iu.s3.array;

import java.util.Scanner;

public class Array7 {
	//1. 데이터 추가(맨앞에) 2. 데이터 삭제(맨앞) 3. 종료
	public static void main(String[] args) {
		int ar[] = {5, 1, 4};
		int act = 0;
		boolean exit = false;
		Scanner sc1 = new Scanner(System.in);
		while(exit == false) {
			System.out.println("행동을 선택하십시오");
			System.out.println("1. 데이터 추가(맨앞에) 2. 데이터 삭제(맨앞) 3. 종료");
			act = sc1.nextInt();
			switch(act) {
			case 1:
				System.out.println("추가할 값을 입력하세요");
				int getN = sc1.nextInt();
				int cp[] = new int[ar.length+1];
				cp[0] = getN;
				
				for (int i = 0; i < ar.length; i++) {
					cp[i+1] = ar[i];
					
				}
				ar = cp;
				System.out.print("ar[] = ");
				for( int i = 0; i < ar.length; i ++) {	
					if(i == (ar.length-1)) {
						System.out.println(ar[i]);
						break;
					}
					System.out.print(ar[i] + "  ");
				}
				break;
			
			case 2:
				int cp2[] = new int[ar.length-1];
				for (int i = 0; i < cp2.length; i++) {
					cp2[i] = ar[i+1];
				}
				ar = cp2;
				System.out.print("ar[] = ");
				for( int i = 0; i < ar.length; i ++) {
					if(i == (ar.length-1)) {
						System.out.println(ar[i]);
					}else {
						System.out.print(ar[i] + "  ");
					}
				}
				break;
			
			case 3:
				System.out.println("프로그램 종료");
				exit = true;
				break;
			
			default:
				System.out.println("잘못입력함");
				break;
			}
		}
		System.out.print("ar[] = ");
		for( int i = 0; i < ar.length; i ++) {
			if(i == (ar.length-1)) {
				System.out.println(ar[i]);
			}else {
				System.out.print(ar[i] + "  ");
			}
		}
		sc1.close();
	}
}
