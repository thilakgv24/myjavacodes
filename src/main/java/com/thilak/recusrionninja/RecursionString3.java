package com.thilak.recusrionninja;

public class RecursionString3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(addStars("hello"));
	}
	
	public static String addStars(String s) {
		// Write your code hee
        System.out.println(s);
        if(s.length() == 1)
            return s;
        
        String value = addStars(s.substring(1));
        if(s.charAt(0) == s.charAt(1)){
            return s.charAt(0) +"*"+value;
        }else{
        	System.out.println(value + s.charAt(0));
        	 return s.charAt(0) +""+value;
        }
		
	}

}
