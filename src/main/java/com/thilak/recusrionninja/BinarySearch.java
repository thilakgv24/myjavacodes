package com.thilak.recusrionninja;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 5, 6, 8, 15, 4, 7, 2, 5, 10, 45, 28, 58 };
		int finmdNum = 5;
		Arrays.sort(a);
		System.out.println(bsearch(a, finmdNum));
	}

	public static int bsearch(int[] a, int num) {
		int midIndex = a.length / 2;

		if (a[midIndex] == num)
			return midIndex;

		int output = bsearch(a, num);

		return output;
	}
}
