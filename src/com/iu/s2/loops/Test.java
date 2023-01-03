package com.iu.s2.loops;



public class Test {
	public static void main(String[] args) {
		Employee[] tekcom = new Employee[5];
		tekcom[0] = new Employee("a", 1);
		tekcom[1] = new Employee("b", 2);
		tekcom[2] = new Employee("c", 3);
		tekcom[3] = new Employee("d", 4);
		tekcom[4] = new Employee("e", 5);
				
		
		
		num[] numO = new num[5];
		numO[0] = new num(1);
		numO[1] = new num(2);
		numO[2] = new num(3);
		numO[3] = new num(4);
		numO[4] = new num(5);
		
		for (int i = 0 ; i < tekcom.length; i++) {
			for (int j = 0 ; j < numO.length; j++) {
				System.out.println(tekcom[i].getAge() + "  " + numO[j].getnumber());
			}
		}
		
		
		
	}
}
class num{
	private int number;
	
	public num() {}
	
	public num(int number) {
		this.setnum(number);
	}

	public int getnumber() {
		return number;
	}

	public void setnum(int number) {
		this.number = number;
	}
}
class Employee{
	private String name;
	private int age;
	
	public Employee() {}
	
	public Employee(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}