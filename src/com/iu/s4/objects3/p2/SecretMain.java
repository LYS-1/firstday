package com.iu.s4.objects3.p2;

import com.iu.s4.objects3.p1.Secret;

public class SecretMain {
	public static void main(String[] args) {
		Secret secret = new Secret();
		com.iu.s4.objects3.p2.Secret secret2 = new com.iu.s4.objects3.p2.Secret();
		secret.money = 1;
		Test test = new Test();
		secret.s1();
//		secret.s2();
		System.out.println(secret.point);
		System.out.println(test.point);
	}
}
