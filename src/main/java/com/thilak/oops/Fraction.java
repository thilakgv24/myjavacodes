package com.thilak.oops;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		simplify();
	}
	
	
	public void print() {
		System.out.println(this.numerator +"/"+this.denominator);;
	}
	
	public int getNumerator() {
		return this.numerator;
	}
	
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	
	public int getDenominator() {
		return this.denominator;
	}
	
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	

	private void simplify() {
		int gcd = 1;
		int smaller = Math.min(numerator, denominator);
		for( int i = 2; i <= smaller; i++) {
			if(numerator % i == 0 && denominator % i==0) {
				gcd = i;
			}
		}
		numerator = numerator /gcd;
		denominator = denominator/gcd;
	}
	
	public void addFraction(Fraction f) {
		this.numerator  = (this.numerator * f.denominator)+(f.numerator * this.denominator);
		this.denominator = this.denominator * f.denominator;
		simplify();
	}
	
	
}
