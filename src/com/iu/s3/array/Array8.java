package com.iu.s3.array;

public class Array8 {
	public static void main(String[] args) {
		//내림차순 = 98653
		//오름차순 = 35689
		//0 : 1,2,3,4	95836
		//1 : 2,3,4		98536
		//2 : 3,4		98635
		//3 : 4 		98653
		int ar[] = {5, 9, 8, 3, 6};
		int num = 0;
		for( int i = 0; i < ar.length; i ++) {
			for( int j = i+1; j < ar.length; j ++) {
				if(ar[i] < ar[j]) {
					num = ar[i];
					ar[i] = ar[j];
					ar[j] = num;
				}
			}
			System.out.print("중간점검 : ");
			for( int j = 0; j < ar.length; j ++) {
				System.out.print(ar[j] + "  ");
			}
			System.out.println();
			
		}
		System.out.print("최종 결과 : ");
		for( int i = 0; i < ar.length; i ++) {
			System.out.print(ar[i] + "  ");
		}
	}
}
