package com.iu.s4.objects5.Characters;

public abstract class Magition extends Character {

	private int mp;
	
	public Magition() {
		super("");
		System.out.println();
	}
	
	public abstract void spell();
	
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
}
