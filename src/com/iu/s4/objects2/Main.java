package com.iu.s4.objects2;

public class Main {
	public static void main(String[] args) {
		ReturnTest returnTest = new ReturnTest();
		returnTest.t1();
		int random = returnTest.t2();
		System.out.println(random);
		
		int ar[] = returnTest.t3();
		System.out.println(ar.length);
		for(int i = 0; i < ar.length; i ++) {
			if( ar[i] == ar.length ) {
				System.out.println(ar[i]);
				break;
			}
			System.out.print(ar[i] + ", ");
		}
	}
}
