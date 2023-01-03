package com.study.s2;

public class Study6 {
	public static void main(String[] args) {
		int num1 = 20;
		double f1 = 1.2;
		//형변환(cascading)- 형태의 변환
		//primitive type끼리만 형변환 가능
		//boolean제외
		//어떤 타입이 수를 표현하는 경우의 수가 더 많은가
		
		//num1 = f1;
		
		f1 = num1; //자동형 변환(묵시적형변환)
	
		//자동형변환은 값이 변화가 없음
		//강제형변환은 값의 변화가 있을수도있다.
		
		System.out.println(f1);
		f1 = 1.123456;
		num1 =(int)f1;  //강제형변환(명시적형변환)
		System.out.println(num1);
		
		//String str = "1";
		//f1 = str;
		
		//byte -> short(char) -> int ->long -> float -> double
		//자동형변환 반대는 강제
		char ch = 'a';
		num1 = ch;
		num1 = 'b';
		System.out.println(num1);
		char ch2 = (char)59;
		System.out.println(ch2);
		
		int total = 151;
		double avg = (double)total/3;
		System.out.println(avg);
	}
}
