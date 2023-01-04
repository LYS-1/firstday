package com.iu.s4.objects5.Characters;

public abstract class Character { //추상 클래스
	
	private String name;
	private int hp;
	private int level;
	
	public Character() {
		
	}
	
	public Character(String name) {
		this.name = name;
	}
	
	
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
}
