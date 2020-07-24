package com.thilak.practiceninja;

import java.util.Arrays;

public class PairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, 6, 2, 5, 4, 3, 2, 4 };
		PairSum.pairSum(arr, 7);
	}

	public static void pairSum(int[] arr, int num) {

		if (num > 100)
			System.out.println(-1);

		Arrays.sort(arr);
		/*int startINdex = 0;
		int endIndex = arr.length - 1;
		while(startINdex < endIndex){
	        if(arr[startINdex] + arr[endIndex] == num) 
	           System.out.println(arr[startINdex]+" "+arr[endIndex]); 
	       else if(arr[startINdex] + arr[endIndex] < num)
	           startINdex++;
	       else
	           endIndex--;
   		}*/

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == num)
					System.out.println(arr[i] + " " + arr[j]);
			}
		}
	}
}
