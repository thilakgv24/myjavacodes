package com.thilak.practiceninja;

import java.util.Arrays;

public class DuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int duplicate(int[] arr) {
		/*
		 * Your class should be named DuplicateInArray Don't write main(). Don't read
		 * input, it is passed as function argument. Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */

		Arrays.sort(arr);
		int i = 0;
		while (i < arr.length) {
			if (arr[i] == arr[i + 1])
				return arr[i];

			i++;
		}
		return -1;
	}
}
