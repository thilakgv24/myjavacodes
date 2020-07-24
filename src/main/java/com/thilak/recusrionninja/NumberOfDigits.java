package com.thilak.recusrionninja;

public class NumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count(165));

	}

	public static int count(int n){
		System.out.println(n);
		if(n == 0)
			return 0;
		
        int smallAns = count(n / 10);
		return smallAns + 1;
	}
}
