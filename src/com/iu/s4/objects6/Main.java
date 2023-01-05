package com.iu.s4.objects6;

public class Main {
	public static void main(String[] args) {
		System.out.println("시작");
		Robot robot = new Robot();
		ArmLeft armLeft = new ArmLeft();
		robot.setArmLeft(armLeft);
		System.out.println(robot.getArmLeft());
		System.out.println(robot.getArmRight());
		System.out.println("addrobot작업");
		System.out.println("종료");
	}
}
