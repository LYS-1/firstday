package com.iu.s1.controls;

import java.util.Random;
import java.util.Scanner;

public class Control3_ex1 {
	public static void main(String[] args) {
		//턴제 mmorpg 법사
		String name = "핫팩";
		Random random = new Random();
		int hp = 20;
		int mp = 20;
		int damage = 0;
		int count = 1;
		String monsterName = "오크";
		int monsterHp = 10;
		
		//1. HP보충 2. MP보충 3.마법1 4.마법2 5.턴넘김
		//HP/MP 보충 40이 최대 , 보충시 0~40사이의 숫자를 받아서 보충
//		int test= random.nextInt(5); // 0~5미만의 정수
//		int test2 = random.nextInt(30); // 0~30미만의 정수
//		System.out.println(test);
//		System.out.println(test2);
		Scanner sc1 = new Scanner(System.in);

		while(monsterHp > 0 && hp > 0) {
			System.out.println("현재 턴 : " + count);
			System.out.println(name + " HP : " + hp +" mp : " + mp);
			System.out.println(monsterName + " HP : " + monsterHp);
			System.out.println("행동을 입력해 주세요(숫자)");
			System.out.println("1.HP보충 2.MP보충 3.마법1 4.마법2 5.턴넘김");
			int selec = sc1.nextInt();
			if (selec==1) {
				int healHP = random.nextInt(41);
				System.out.println("HP회복");
				hp = hp + healHP;
				if(hp > 40) {
					hp = 40;
				}
			}else if (selec==2) {
				int healMP = random.nextInt(41);
				System.out.println("MP회복");
				mp = mp + healMP;
				if(mp > 40) {
					mp = 40;
				}
			}else if (selec==3) {
				System.out.println("마법공격1");
				if(mp > 3) {
					damage = random.nextInt(2,4);
					monsterHp -=damage;
					mp -= 3; 
				}else {
					System.out.println("마나가 부족함");
				}
			}else if(selec == 4) {
				System.out.println("마법공격2");
				if(mp > 5) {
					damage = random.nextInt(1,5);
					monsterHp -=damage;
					mp -= 5; 
				}else {
					System.out.println("마나가 부족함");
				}
			}else if(selec == 5) {
				System.out.println("턴 넘김");
				damage = random.nextInt(5,10);
				hp -= damage;
				count ++;
			}else {
				System.out.println("잘못입력함");
			}
			if(hp <= 0) {
				System.out.println("패배");
				hp = 0;
			}else if(monsterHp <= 0) {
				System.out.println("승리");
				monsterHp = 0;
			}
//			System.out.println("현재 체력 : " + hp);
//			System.out.println("현재 마나 : " + mp);
//			System.out.println("현재 몬스터체력 : " + monsterHp);
		}
		sc1.close();
	}
}
