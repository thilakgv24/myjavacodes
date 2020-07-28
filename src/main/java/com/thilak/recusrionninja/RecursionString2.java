package com.thilak.recusrionninja;

public class RecursionString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(repalceChar("xaxbxc", 'x', 'y'));
		System.out.println(removeConsecutiveDuplicates("xxxyyyzwwzzz"));
	}

	public static String removeConsecutiveDuplicates(String s) {
		System.out.println(s);
		if (s.length() <= 1)
			return s;

		System.out.println();
		/*if(s.charAt(s.length() - 1) == s.charAt(s.length() - 2)) {
			String output = removeConsecutiveDuplicates(s.substring(0, s.length() - 2));
			return s.charAt(s.length() - 2) + output;
		}else {
			String output = removeConsecutiveDuplicates(s.substring(0, s.length()-1));
			return s.charAt(s.length() - 1)+output;
		}*/
		
		while(s.length() > 1 ){
            if(s.charAt(0) == s.charAt(1)){
                s = s.substring(1);
                
            }else {
            	break;
            }
        }
        
        
        String smalloutput = removeConsecutiveDuplicates( s.substring(1));
        return s.charAt(0) + smalloutput;
		
	}

}
