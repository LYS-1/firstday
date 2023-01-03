package com.iu.s4.objects2;

import java.util.Random;

public class ReturnTest {
	
	public void t1() {
		System.out.println("return이 없을 때는 void");
	}
	public int t2() {
		Random ran = new Random();
		System.out.println("return 은 int");
		return ran.nextInt(10);
	}
	public int[] t3() {
		Random ran = new Random();
		int num = ran.nextInt(0, 10);
		System.out.println(num);
		int test[] = new int[num];
		for(int i = 1; i <= num; i ++) {
			test[i-1] = i;
		}
		return test;
	}
}
