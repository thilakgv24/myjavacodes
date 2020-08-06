package com.thilak.recusrionninja;

public class CheckAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkAB("abbaabb"));
		
	}

	
	public static boolean checkAB(String input) {
		System.out.println(input+""+input.length());
		// Write your code here
	       if(input.length() <= 3)
	         return true;
	        
	        if(input.charAt(0) != 'a')
	            return false;
	        
	        if(input.charAt(input.length() -1) == 'a' && (input.charAt(input.length() - 2 )== 'a' ||  input.charAt(input.length() - 2) == 'b') 
                    && (input.charAt(input.length() - 3) == 'a' ||  input.charAt(input.length() - 3 ) == 'b'))
	          checkAB(input.substring(0, input.length() - 1));
	           
	         if(input.charAt(input.length() -1) == 'b' && (input.charAt(input.length() - 2 )== 'a' ||  input.charAt(input.length() - 2) == 'b') 
	                                                    && (input.charAt(input.length() - 3) == 'a' ||  input.charAt(input.length() - 3 ) == 'b'))
	                                                        checkAB(input.substring(0, input.length() - 1));  
	        
	           
	        return true;
	        

		}
}
