package com.iu.s2.loops;

public class Loopfor3 {
	public static void main(String[] args) {
		//구구단
		for (int i = 1; i < 10; i ++) {
			for (int j = 1; j < 10; j ++) {
				if(i*j/10 >= 1) {
					System.out.print(j + "*" + i +" = "+ i*j + " ");
				}else {
					System.out.print(j + "*" + i +" = "+ i*j + "  ");
				}
				
			}
			System.out.println();
		}
	}
}
