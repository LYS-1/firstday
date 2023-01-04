package com.iu.s4.objects3.p1;

public class Member {
	//비만관리 회원등록
	private String name;
	private int age;
	private double height;
	private double kg;
	private boolean check;
	public Member() {}
	
	public Member(int age) {
		if(age > 0 && age < 200) {
			this.age = age;
		}
	}
	public void isCheck() {
		
	}
	
	public void setCheck(boolean check) {
		this.check = check;
	}
	//setter 메서드 : set + 변수명의 첫 글자를 대문자로 바꾼것
	public void setAge(int age) {
		if(age > 0 && age < 200) {
			this.age = age;
		}
	}
	//getter 메서드 : get + 변수명의 첫 글자를 대문자로 바꾼것
	public int getAge() {
		return this.age;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setKg(double kg) {
		this.kg = kg;
	}
	
	public double getKg() {
		return this.kg;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void info() {
		System.out.println("Name : " + this.name);
		System.out.println("Age : " + this.age);
	}
}
