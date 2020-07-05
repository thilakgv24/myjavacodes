package com.thilak.oops;

public class Student {

	private static int rollNumber;
	int rollNo;
	String name;
	int age;
	final static String PREFIX ="MR";

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		rollNumber++;
		this.rollNo = rollNumber;
	}
	@Override
	public String toString() {
		return rollNumber + " " + name + " " + age;

	}
	
	public int getAger() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public int getRollNumber() {
		return Student.rollNumber;
	}
}
