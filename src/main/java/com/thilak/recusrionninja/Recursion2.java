package com.thilak.recusrionninja;

public class Recursion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getRecusrion2(5);

	}

	static void getRecusrion2(int n) {
		if(n > 0) {
			
			getRecusrion2(n-1);
			System.out.println(n +" Println");
			
		}
		
	}
}
