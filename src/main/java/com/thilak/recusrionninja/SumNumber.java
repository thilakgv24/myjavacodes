package com.thilak.recusrionninja;

public class SumNumber {

	public static void main(String[] args) {
		System.out.println(sumNYmbergetSumNumbers(168));
	}

	static int sumNYmbergetSumNumbers(int number) {
		System.out.println(number);
		if (number == 0)
			return 0;
		int smallOutput = sumNYmbergetSumNumbers(number / 10);
		return number % 10 + smallOutput;
	}
}
