package com.iu.s4.objects5.Characters;

public class Knight extends Character implements Attackable{
	
	int str;
	
	Item item = new Sword();
	
	@Override
	public void attack() {
		item.a();
	}
	
}
