package com.thilak.recusrionninja;

public class Recursion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(4));
	}

	
	public static int fact(int n) {
		System.out.println(n);
		if(n ==0)
			return 1;
		int smllOutput = fact(n-1);
		int outPut = n * smllOutput;
		System.out.println(n);
		return outPut;
	}
	
	/*public static int fact(int n) {
		if(n == 0)
			return 0;
		
		System.out.println(n);
		
		
		System.out.println();
		return n + fact(n-1);
		
	}*/
	
/*	public static int fact(int n) {
		int output;
		System.out.println(165/10);
		
	if(n == 0) {
		return 1;
	}else {
		output =  n * fact(n-1);
	}
	return output;
	}*/
}
