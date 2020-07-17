package com.thilak.practiceninja;

public class Car extends Vehicle {
	int doors;
	
	public void print() {
		super.print();
		System.out.println(this.colour+this.number);
	}
	public static void main(String[] args) {
		Vehicle v = new Car();
		v.colour = "white";
		v.number = 10;
		v.print();
		
		Car c = new Car();
		c.print();		
	} 
}
