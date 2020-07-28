package com.thilak.recusrionninja;

public class RecursionString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(repalceChar("xaxbxc", 'x', 'y'));
		System.out.println(removeX("xaxbxc"));
	}

	public static String repalceChar(String s, char a, char b) {
		if (s.length() == 0)
			return s;

		String smallOutput = repalceChar(s.substring(1), a, b);
		if (s.charAt(0) == a) {
			return b + smallOutput;
		} else {
			return s.charAt(0) + smallOutput;
		}
	}

	public static String removeX(String s) {
		System.out.println(s);
		if (s.length() == 0)
			return s;

		String smallOutput = removeX(s.substring(1));
		if (s.charAt(0) == 'x') {
			return "" + smallOutput;
		} else {
			return s.charAt(0) + smallOutput;
		}
	}
}
