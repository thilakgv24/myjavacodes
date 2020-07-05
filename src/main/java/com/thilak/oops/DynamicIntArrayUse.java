package com.thilak.oops;


public class DynamicIntArrayUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynamicIntArray array = new DynamicIntArray();
		System.out.println(array.getSize());
		for(int i = 0; i <= 3; i++) {
			array.addElement(i);
		}
		System.out.println(array);
	}

}
