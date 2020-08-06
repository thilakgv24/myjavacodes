package com.thilak.recusrionninja;

public class RecusrionString4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isStringPalindrome("racecar"));
	}
	
	public static boolean isStringPalindrome(String input) {
        System.out.println(input);
        System.out.println('1' - '0');
		if(input.length() <= 1)
            return true;
		
        if(input.charAt(0) == input.charAt(input.length()-1))
        return isStringPalindrome(input.substring(1, input.length()-1));
           
        return false;
	}

}
