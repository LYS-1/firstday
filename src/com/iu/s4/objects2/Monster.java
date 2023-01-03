package com.iu.s4.objects2;

public class Monster {
	
	//멤버 변수, instance변수
	String name;
	int hp;
	int power;
	//멤버메서드, instance method
	public boolean checkValue(Monster monster) {
		//나의 파워와 같고, 나의 hp와 같으면 true , 아니면 false
		if(this.hp == monster.hp && this.power == monster.power) {
			return true;
		}else {
			return false;
		}		
	}
	public void info() {
		//참조변수 this : class 내부에서만 사용 가능.
		//생성된 객체 주소를 담고있음.
		System.out.println(this);
		//this는 생략가능.
		System.out.println(name);
		System.out.println(hp);
		
		this.attack();
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public void attack() {
		System.out.println("공격합니다.");
		//this.info();
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
