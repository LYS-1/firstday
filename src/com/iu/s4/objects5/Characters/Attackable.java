package com.iu.s4.objects5.Characters;

public interface Attackable {
	
	//상수
	public static final int DAMAGE = 1;
	//추상메서드
	//접근 지정자는 무조건 public / 그 외 지정자는 모두 abstract / 나머지 동일
	public abstract void attack();
//	void attack2();
//	abstract void attack3();
//	public void attack4();
	
}
