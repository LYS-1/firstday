package com.iu.s4.objects2;

public class Car {
	String name;
	String company;
	int price;
	String color;
	public Car() {
		this("black");//생성자 내에서 다른 생성자 호출
//		this.company = "kia";
//		this.name = "스포티지";
//		this.price = 3500;
//		this.color = "black";
	}
	public Car(String color) {
		this(color, 3500);
//		this.company = "kia";
//		this.name = "스포티지";
//		this.price = 3500;
//		this.color = color;
	}
	public Car(String color, int price) {
		this(color, price, "스포티지");
//		this.company = "kia";
//		this.name = "스포티지";
//		this.price = price;
//		this.color = color;
	}
	public Car(String color, int price, String name) {
		this.company = "kia";
		this.name = name;
		this.price = price;
		this.color = color;
	}
	
	public void info() {
		System.out.println("Name : " + this.name);
		System.out.println("company : " + this.company);
		System.out.println("price : " + this.price);
		System.out.println("color : " + this.color);
	}
}
