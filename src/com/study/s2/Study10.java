package com.study.s2;

import java.util.Scanner;

public class Study10 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		while(true) {
			System.out.println("문자를입력하세요");
			
			char ch = sc1.next().charAt(0);
			String s1 = Character.toString(ch);

			System.out.println("숫자를 입력하세요");
			int key = sc1.nextInt();
		
			System.out.println(ch);
			System.out.println(key);
			
			if(s1.equals("q")) {
				sc1.close();
				break;
				
			}
		}

	}
}
