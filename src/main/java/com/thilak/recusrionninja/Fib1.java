package com.thilak.recusrionninja;

public class Fib1 {

	public static void main(String [] args) {
		System.out.println(fin(5));
	}
	
	public static int fin(int n) {
		if(n == 0 || n==1)
			return 1;
		
		System.out.println(n);
		int out = fin(n-1);
		return n + out ;
	}
}
