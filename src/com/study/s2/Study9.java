package com.study.s2;

import java.util.Scanner;

public class Study9 {
	public static void main(String[] args) {
		int age = 18;
		String result = age>=20? "성인" : "미성년";
		System.out.println(result);
		
		//물건의 가격 입력 
		//30000원이상이면 5%할인 아니면 3%할인
		//택배비 별도 2500
		//최종 출력 : 물건의 최종가격과 택배비가 포함된가격
		Scanner sc1 = new Scanner(System.in);
		System.out.println("가격을 입력하세요.");
		int price = sc1.nextInt();
		if(price >= 30000) {
			price *= 0.95;
		}else {
			price *= 0.97;
		}
		int total = price+2500;
		System.out.println("물건 가격 : " + price);
		System.out.println("최종 가격 : " + total);
		
		
		double discount = price>=30000? 0.5:0.3;
		price = (int)(price - price * discount);
		total = price + 2500;
		System.out.println("물건 가격 : " + price);
		System.out.println("최종 가격 : " + total);
		
		double discount2 = price>=30000? 0.95:0.97;
		int price2 = (int)(price * discount2);
		int total2 = price2 + 2500;
		System.out.println("물건 가격 : " + price2);
		System.out.println("최종 가격 : " + total2);
		
		sc1.close();
	}
}
