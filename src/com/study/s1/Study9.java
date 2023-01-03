package com.study.s1;

public class Study9 {
	public static void main(String[] args) {
		//변수 선언 = 메모리에 저장공간 확보
		//데이터타입 변수명
		//숫자 정수형 = byte short int long
		
		//512
		int numA = 512;
		
		//변수 사용
		//사용 시 데이터타입x
		System.out.println(numA*2);
		
		long numB = 2000L;
		numB = 1000l;
		
		System.out.println(numB);
		
		//초기화 = 변수 선언후 변수에 최초로 값넣기
		//모든 변수는 초기화 하지않으면 사용X
		int numC;
		numC = 423;
		System.out.println(numC);
		
		//같은 타입의 변수를 여러개 선언
		int n1;
		int n2;
		int n3;
		int m1,m2,m3;
		
		//소수점이 있는숫자 실수형
		//float(4) double(8)
		float f1 =1.24F;
		double d1 = 1.24;
		
		//문자형 한글자
		//리터럴 앞뒤로'' 사용
		//char
		char ch = 'a';
		ch = '한';
		ch = '2';
		ch = '한';
		char ch2 = '글';
		
		//논리형
		boolean check = true;
		check = false;
		
		//변수에는 같은 데이터타입만 대입가능
		int p1 =100;
		long p2 = 1L;
		/*
		p1 = p2;
		ch = p1;
		check = 1.2;
		*/
		
	}
}
