package com.thilak.oops;

public class FractionUse {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(4, 6);
		f1.print();
		Fraction f2 = new Fraction(5, 10);
		f2.print();
		f1.addFraction(f2);
		f1.print();
		int gcd = gcd(6,8);
		System.out.println(gcd);
		
		
	}
	
	public static int gcd(int a , int b) {
		 if (a == 0)
		        return b;

		    while (b != 0) {
		        if (a > b)
		            a = a - b;
		        else
		            b = b - a;
		    }

		    return a;
	}

}
