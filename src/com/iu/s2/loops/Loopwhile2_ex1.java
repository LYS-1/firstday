package com.iu.s2.loops;

import java.util.Scanner;

public class Loopwhile2_ex1 {
	public static void main(String[] args) {
		//게임 1. 로그인 2. 로그인 한 사용자만 게임가능
		//--로그인--
		//1.1 로그인 id/pw 입력 후 판단 1.2 종료
		//--게임진행--
		//2.1 로그인 성공 시 진행
		//레벨 1로 시작 모든 몬스터의 경험치 동일
		//레벨 1->2 3마리 / 2->3 6마리 / 3->4 9마리 / 4->5 12마리
		//레벨 15달성시 종료
		//초기gold = 0, 5렙 달성시 1000gold 지급 10렙 달성시 2000골드 15렙 달성시 3000골드
		//만렙달성축하 현재골드 출력
		Scanner sc1 = new Scanner(System.in);
		boolean chPlay = true;
		boolean login = false;
		int id = 1234;
		int pw = 5678;
		int level = 1;
		int monCount = 0;
		int gold = 0;
		int exp = 0;
		
		while(chPlay) {
			System.out.println("1. 게임실행 2. 종료");
			int play = sc1.nextInt();
			switch(play) {
			case 1:
				System.out.println("아이디를 입력해주십시오.");
				int inputID = sc1.nextInt();
				System.out.println("비밀번호를 입력해주십시오.");
				int inputPW = sc1.nextInt();
				if( inputID == id && inputPW == pw) {
					System.out.println("로그인 성공");
					login = true;
					chPlay = false;
					break;
				}else {
					System.out.println("로그인 실패");
				}
				break;
			case 2:
				System.out.println("프로그램을 종료합니다.");
				chPlay = false;
				break;
			default:
				System.out.println("다시 입력해주세요");
				break;
			}
		}
		while(login) {
			System.out.println("현재 레벨 : " + level + " 현재 경험치 : " + exp + " 현재 골드 : " + gold);
			System.out.println("행동을 선택하세요 : 1. 몬스터 사냥 2. 아무것도안함 3. 게임종료(초기화)");
			int action = sc1.nextInt();
			
			switch(action) {
			case 1:
				System.out.println("몬스터 사냥");
				monCount += 3;
				exp += 25;
				break;
			case 2:
				System.out.println("아무것도 안했습니다.");
				break;
			case 3:
				System.out.println("현재 레벨 : " + level + " 현재 경험치 : " + exp + " 현재 골드 : " + gold);
				System.out.println("총 잡은 몬스터 수 : " + monCount);
				System.out.println("게임 종료");
				login = false;
			}
			
			for(;exp >= level*3;exp -= (level*3)) {
				System.out.println("레벨 업");
				level++;
				System.out.println("현재 레벨 : " + level);
				switch(level){
				case 5 :
					gold += 1000;
					break;
				case 10 :
					gold += 2000;
					break;
				case 15 :
					gold += 3000;
					break;
				}
				if(level == 15) {
					break;
				}
			}
			
			if(level == 15) {
				System.out.println(level + "레벨 달성 축하");
				System.out.println("소지 골드 : " + gold);
				System.out.println("총 잡은 몬스터 : " + monCount);
				login = false;
			}
		}
		
		// 자동사냥
//		while(login) {
//			for( int i = 1; i < 15; i ++) {
//				for (int j = 0; j < i*3; j ++) {
//					monCount++;
//					//System.out.println(monCount + "마리째 사냥");
//					System.out.println("현재 레벨에서 잡은 몬스터 수 : " + (j+1));
//				}
//				level++;
//				System.out.println("레벨업");
//				System.out.println("현재 레벨 : " + level);
//				switch(level){
//				case 5 :
//					gold += 1000;
//					break;
//				case 10 :
//					gold += 2000;
//					break;
//				case 15 :
//					gold += 3000;
//					break;
//				}
//			}
//			System.out.println(level + "레벨 달성 축하");
//			System.out.println("소지 골드 : " + gold);
//			login = false;
//		}
		sc1.close();
	}
}
