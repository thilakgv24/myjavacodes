package com.thilak.geeks;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,4,5,5,6,6,8};
		for(int i = a.length - 1; i >0; i--){
		    if(a[i] == a[i-1])
		        a[i] = 0;
		}

		List<Integer> l = new ArrayList<Integer>();

	}

}
