package com.iu.s4.objects5.Characters;

public class Archer extends Character implements Attackable{

	private int dex;
	
	public Archer() {
		super("");
	}
	
	@Override
	public void attack() {
		System.out.println("활 공격");
	}
	
	public void shoot() {
		System.out.println("shoot");
		System.out.println(this.getName());
	}
	
	public void move() {
		System.out.println("move");
	}

	public int getDex() {
		return dex;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}
}
