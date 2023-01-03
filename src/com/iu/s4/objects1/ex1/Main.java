package com.iu.s4.objects1.ex1;

public class Main {
	//main = 프로그램의 시작
	public static void main(String[] args) {
		System.out.println("Start");
		MenuController menuController = new MenuController();
	
		menuController.start();
		System.out.println("집에서 추가한 내용");
		System.out.println("Finish");
	}

}
