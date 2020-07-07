package com.thilak.oops;

import java.util.Scanner;

public class PolyUse {
	/*
	 * 3 3 1 7 1 2 3 2 2 1 7 8 2
	 */
	public static void main(String[] args) {		
		Scanner s = new Scanner(System.in);
		int degree1[] = new int[2];
		degree1[0] = 0;
		degree1[1] = 1;

		int coeff1[] = new int[2];
		coeff1[0] = 1;
		coeff1[1] = 2;

		Polynomial first = new Polynomial();

		first.setCoefficient(degree1[0], coeff1[0]);
		first.setCoefficient(degree1[1], coeff1[1]);

		int degree2[] = new int[3];
		degree2[0] = 0;
		degree2[1] = 1;
		degree2[2] = 2;
		int coeff2[] = new int[3];
		coeff2[0] = 3;
		coeff2[1] = 4;
		coeff2[2] = 5;
		
		Polynomial second = new Polynomial();
		second.setCoefficient(degree2[0], coeff2[0]);
		second.setCoefficient(degree2[1], coeff2[1]);
		second.setCoefficient(degree2[2], coeff2[2]);
		
		
		int choice = s.nextInt();
		Polynomial result;
		switch (choice) {
		// Add
		case 1:
			result = first.add(second);	
			//6x0 8x1 5x2 
			//result = second.add(first);	
			//4x0 6x1 5x2 
			result.print();
			break;
		// Subtract
		case 2:
			result = first.subtract(second);
			//result = second.subtract(first);
			result.print();
			break;
		// Multiply
		case 3:
			result = first.multiply(second);
			result.print();
			break;
		}
	}
}
