package com.thilak.recusrionninja;

public class RecusrionString5 {
	static int counter = 0;

	public static void main(String[] args) {
		System.out.println(convertStringToInt("123456"));
	}

	public static int convertStringToInt(String input) {
		if (input.length() == 1)
			return input.charAt(0) - '0';

		int value = convertStringToInt(input.substring(0, input.length() - 1));
		counter++;
		return value * 10 + input.charAt(counter) - '0';

	}
}
