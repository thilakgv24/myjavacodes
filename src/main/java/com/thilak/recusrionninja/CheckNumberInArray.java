package com.thilak.recusrionninja;

public class CheckNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 61;
		// int[] input = { 15, 24, 58, 61, 79, 3, 97, 81, 81, 45, 62, 21, 72, 72, 68,
		// 45, 11, 50, 87, 20, 28, 77, 51, 89,
		// 58, 66 };
		int[] input = { 34, 57, 82, 41, 65, 35, 82, 27, 36, 12, 6, 40, 66, 99, 25, 29, 22, 25, 12, 24, 65, 15, 5, 43,
				28, 33, 76, 32, 13, 95, 22, 84, 71, 23, 28, 7, 65, 94, 18, 47, 9, 42, 61, 73 };
		boolean boo = checkNumber(input, x);
		System.out.println(boo);

	}

	public static boolean checkNumber(int input[], int x) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */
		if (input.length >= 1 && input[0] == x) {
			return true;
		}

		if (input.length == 1 && input[0] != x) {
			return false;
		}

		int newArray[] = new int[input.length - 1];
		for (int i = 1; i < input.length; i++) {
			newArray[i - 1] = input[i];
		}

		boolean value = checkNumber(newArray, x);
		return value;
	}

}
