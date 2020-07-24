package com.thilak.practiceninja;

import java.util.Arrays;

public class FindUnique {
	public static void main(String[] args) {

		int[] arr = { 2, 3, 1, 6, 3, 6, 2 };
		System.out.println(findUnique(arr));
	}

	public static int findUnique(int[] arr) {
		/*
		 * Your class should be named FindUnique Don't write main(). Don't read input,
		 * it is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */
		Arrays.sort(arr);
		int[] resultArray = new int[arr[arr.length - 1] + 1];

		for (int i = 0; i < arr.length; i++) {
			resultArray[arr[i]] = resultArray[arr[i]] + 1;
		}
		int j = 0;
		while (j < resultArray.length) {
			if (resultArray[j] == 1)
				return j;
			j++;
		}

		return -1;
	}

}
