package com.iu.s3.array;


public class Array1 {
	public static void main(String[] args) {
		//primitive
		//숫자(정수(byte short int long) 실수(float double))
		//문자(char) 논리(boolean)
		//reference - 그외(String)
		double d1 = 1.2;
		d1 = 5.3;
		if(d1 > 0) {
			int num = 10;
		}
		//변수 선언 공식 datatype 변수명;
		//배열 선언 공식 모으려고하는 데이터타입[] 변수명 참조
		//heap 생성 변수는 반자동초기화 stack은 수동
		double[] ar = new double[2];
		int[] ar2 = new int[3];
		System.out.println(d1);
		System.out.println(ar);
		ar[0] = 3.3;
		ar[1] = 5.2;
		System.out.println(ar[0]);
		System.out.println(ar2[0]);
		
		int [] ar3 = {1,2,3};
		int ar4[] = {3,4,5};
		
		for(int i = 0; i < 3; i++) {
			System.out.println(ar3[i]);
		}
	}
}
