package com.thilak.recusrionninja;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getFibonacci(10));

	}
	
	static int getFibonacci(int n) {
		if(n == 1 || n==2)
			return 1;
			
		int fib1 = getFibonacci(n-1);
		int fib2 = getFibonacci(n-2);
		int output =  fib1 + fib2;
		return output;
	}

}
