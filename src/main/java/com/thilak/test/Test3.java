package com.thilak.test;

import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 4,2,0,3,2,5,2,8,9,7,4,9,8,3,8,9,7,0,2,6,5,3,5,5,7,2,8,4,8,3,6,4,6,2,1,1,0,2,7,3,7,7,1,8,9,4,1,2,5,7,6,8,5,3,1,3,4,1,6,8,4,1,5,7,3,0,9,8,1,1,0,6,1,2,3,9,4,5,9,8,9,7,2,1,9,7,2,6,2,9,1,6,6,8,5,2,6,3,8,5};
		System.out.println(maximumProfit(a));
	}

	public static int maximumProfit(int budget[]) {
		// Write your code here
		Arrays.sort(budget);
		int maxProfit = 0;
		int numberOfBuyers = budget.length;
		int sumofValues = 0;
		for (int i = 0; i < budget.length; i++) {
			sumofValues += budget[i];
		}

		int avgValue = sumofValues / numberOfBuyers;
		int count = budget.length - 1;
		for (int j = 0; j < budget.length; j++) {
			System.out.println(count);
			count--;
			System.out.println(budget[j] + "****" + budget[j + 1]);
			if (j < budget.length - 1) {
				if (budget[j] <= avgValue && budget[j + 1] >= avgValue) {
					if (budget[j] - avgValue > budget[j + 1] - avgValue) {
						return budget[j] * (budget.length - 1 - j);
					} else {
						return budget[j + 1] * ((budget.length) - j);
					}
				}
			} else {
				return budget[budget.length - 1];
			}
		}
		return maxProfit;
	}
}
