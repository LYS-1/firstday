package com.iu.s3.array;

import java.util.Scanner;

public class Array6 {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int ar[] = {8, 5, 13, 9, 6};
		int delN = 0;
		int k = 0;
		//키보드로 삭제하고싶은 값 입력
		System.out.print("삭제하고 싶은 값 입력 : ");
		for( int i = 0; i < ar.length; i ++) {
			if( i == ar.length-1) {
				System.out.println(ar[i]);
			}else {
				System.out.print(ar[i] + ", ");
			}		
		}
		int getN = sc1.nextInt();
		for( int i = 0; i < ar.length; i ++) {
			if(ar[i] == getN) {
				delN = i;
				break;
			}	
		}
		int cp[] = new int[ar.length-1];
		
//		for( int i = 0; i < ar.length; i ++) {	
//			if(i != delN) {
//				cp[k] = ar[i];
//				k ++;
//			}			
//		}
		for( int i = 0; i < ar.length; i ++) {
			if(i == delN) {
				continue;
			}
			cp[k] = ar[i];
			k++;
		}

//		System.out.print("삭제된 배열 : ");
//		for( int i = 0; i < cp.length; i ++) {
//			System.out.print(cp[i] + "  ");
//		}
		
		ar = cp;
		for( int i = 0; i < ar.length; i ++) {
			System.out.print(ar[i] + "  ");
		}
		sc1.close();
	}
}
