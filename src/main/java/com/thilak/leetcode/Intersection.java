package com.thilak.leetcode;

import java.util.Arrays;


public class Intersection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums1 = {1,2};
		int [] nums2 = {2,1};
		Intersection sol = new Intersection();
		sol.intersection(nums1, nums2);

	}
	
	 public int[] intersection(int[] nums1, int[] nums2) {
	       	Arrays.sort(nums1);
			Arrays.sort(nums2);
			int  i = 0, j = 0;
	    
			if (nums1.length > nums2.length) {			
				int [] tempArray = nums1;
				nums1 = nums2;
				nums2 = tempArray;
			}// if
	        int [] resultArray = new int[0];
	        // will be executing O(n) times
	        int count = 0;
			while (i < nums1.length && j < nums2.length) {
				System.out.println(nums1[i] +"****"+ nums2[i]);
				if (nums1[i] <= nums2[j]) {
					if (nums1[i] == nums2[j]){           
	                    
	                    if(i == 0 ){
	                    	resultArray = increaseArraySize(resultArray.length + 1, resultArray);
	                           resultArray[count] = nums1[i];
	                           count++;
	                    }else if(i > 0 && nums1[i-1] != nums1[i]){
	                    	resultArray = increaseArraySize(resultArray.length + 1, resultArray);
	                        resultArray[count] = nums1[i];
	                        count++;
	                    }
	                }
						
					i++;
				} else {
					j++;
				}
			}  //while
	        return resultArray;
	    }
	    
	    public static int [] increaseArraySize(int size, int [] resultArray){
	        int [] arra = new int[size]  ;
	        for(int i = 0; i < resultArray.length; i++){
	            arra[i] = resultArray[i];
	        }
	        return arra;
	    }

}
