package com.iu.s4.objects6;

public class Robot {//defendency 의존성
	
	private ArmRight armRight;
	private ArmLeft armLeft;
	
	public Robot() {
		this.armRight = new ArmRight();//defendency injection 의존성 주입
	}
	
	public Robot(ArmRight armRight) {
		this.armRight = armRight;
	}
	
	public ArmRight getArmRight() {
		return armRight;
	}
	public void setArmRight(ArmRight armRight) {
		this.armRight = armRight;
	}
	public ArmLeft getArmLeft() {
		return armLeft;
	}
	public void setArmLeft(ArmLeft armLeft) {
		this.armLeft = armLeft;
	}
	
	
}
