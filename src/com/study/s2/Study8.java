package com.study.s2;

public class Study8 {
	public static void main(String[] args) {
		int count = 1;
		System.out.println("count : " + count);
		count = count +1;
		System.out.println("count : " + count);
		count++; // count = count + 1
		System.out.println("count : " + count);
		int result = count++;
		System.out.println("result : " + result);
		System.out.println("count : " + count);
		
		System.out.println(count++);
		System.out.println(count);
		
		
		count--;//count= count-1

		count = count+1;
		count += 1;
		count = count*3;
		count *= 3;
		count = count/2;
		count /= 2;
		count = count%3;
		count %= 3;
		
	}
}
