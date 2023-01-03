package com.study.s2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
public class Study4 {
	public static void main(String[] args) {
		System.out.println("Start");
		int sum = 0;
		boolean de;
		List<String> buy = new ArrayList<>(Arrays.asList());
		//무인 편의점
		Scanner sc1 = new Scanner(System.in);
		String[] product = {"p1","p2","p3","p4"};
		int[] price = {1500, 15000, 3990, 4990};
		//물건의 총합계
		String s1 = "no";
		while (! s1.equals("q")) {
			System.out.println("물건을 골라주세요. 그만고르면 q를 입력해주세요");
			System.out.print("물건목록 : ");
			for(int i=0; i<product.length; i++) {
				System.out.print(product[i] + " ");
				if(i == product.length-1) {
					System.out.println(product[i] + " ");
				}
			}
			s1 = sc1.next();
			
			
			if(s1.equals("q")) {
				break;
			}else {
				for(int i=0; i<4; i++) {
					String demo = product[i];
					de = s1.equals(demo);
					if(de == true) {
						buy.add(s1);
						System.out.println("상품을 담았습니다.");
						break;
					}
					if(i == 3 & de == false) {			
						System.out.println("존재하지않는 물건입니다.");
						break;		
					}
				}
			}
			
			
			
			
			
		}
		
		for(int i =0; i<buy.size(); i++) {
			int p = Arrays.asList(product).indexOf(buy.get(i));
			sum += price[p];
		}
		
		//낸돈
		System.out.println("합계금액은 " + sum +"입니다.");
		System.out.println("돈을내주세요");
		int money = sc1.nextInt();
		//잔돈
		int charge = money-sum;
		//코드 진행
		
		System.out.println(charge);
		
		int thou10 = charge/10000;
		int thou = (charge%10000) / 1000;
		int hund = (charge%1000) / 100;
		int ten = (charge%100) / 10;
		System.out.println("만원짜리 : " + thou10);
		System.out.println("천원짜리 : " + thou);
		System.out.println("백원짜리 : " + hund);
		System.out.println("십원짜리 : " + ten);
		sc1.close();
		System.out.println("Finish");
		
	}
}
