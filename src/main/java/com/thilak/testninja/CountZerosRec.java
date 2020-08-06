package com.thilak.testninja;

public class CountZerosRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countZerosRec(10204));
	}

	public static int countZerosRec(int input){
		// Write your code here
		System.out.println(input);
        if(input < 10)
            return 0;
        
        
        
       
        int finalnum = countZerosRec(input/10);
        System.out.println(input);
        if(input % 10 == 0)
        	finalnum += 1;
        
        return finalnum;
            
	}
}
