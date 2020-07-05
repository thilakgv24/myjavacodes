package com.thilak.oops;

public class ComplexNumber {

	private double realNumber;
	private double imaginaryNumber;
	public static final String IMGVALUE = "i";

	public ComplexNumber() {

	}

	public ComplexNumber(double realNumber, double imaginaryNumber) {
		this.realNumber = realNumber;
		this.imaginaryNumber = imaginaryNumber;

	}

	public double getRealNumber() {
		return realNumber;
	}

	public void setRealNumber(double realNumber) {
		this.realNumber = realNumber;
	}

	public double getImaginaryNumber() {
		return imaginaryNumber;
	}

	public void setImaginaryNumber(double imaginaryNumber) {
		this.imaginaryNumber = imaginaryNumber;
	}

	public void addNumber(ComplexNumber c) {
		this.realNumber += c.getRealNumber();
		this.imaginaryNumber += c.getImaginaryNumber();
		if (this.imaginaryNumber > 0)
			if (this.imaginaryNumber > 0)
				System.out.println(fmt(this.realNumber) +" + "  + fmt(this.imaginaryNumber)+ IMGVALUE );
			else
				System.out.println(fmt(this.realNumber)+ " - "  + fmt(Math.abs(this.imaginaryNumber)) + IMGVALUE );

	}
	
	private void printNumber(){
		if (this.imaginaryNumber > 0)
			System.out.println(fmt(this.realNumber) +" + "  + fmt(this.imaginaryNumber)+ IMGVALUE );
		else
			System.out.println(fmt(this.realNumber)+ " - "  + fmt(Math.abs(this.imaginaryNumber)) + IMGVALUE );
	}

	public static ComplexNumber addNumber(ComplexNumber c1, ComplexNumber c2) {
		double realNumber = c1.getRealNumber() + c2.getRealNumber();
		double imaginaryNumber = c1.getImaginaryNumber() + c2.getImaginaryNumber();
		ComplexNumber cn = new ComplexNumber(realNumber, imaginaryNumber);
		return cn;
	}

	public void subtractNumber(ComplexNumber c) {
		this.realNumber = this.realNumber - c.getRealNumber();
		this.imaginaryNumber = this.imaginaryNumber - c.getImaginaryNumber();
		printNumber();
	}

	@Override
	public String toString() {
		return "ComplexNumber [realNumber=" + realNumber + ", imaginaryNumber=" + imaginaryNumber + "]";
	}

	public void subtractNumber(ComplexNumber c1, ComplexNumber c2) {
		this.realNumber = c1.realNumber - c2.getRealNumber();
		this.imaginaryNumber = c1.imaginaryNumber - c2.getImaginaryNumber();
		printNumber();
	}

	public static String fmt(double d) {
		if (d == (long) d)
			return String.format("%d", (long) d);
		else
			return String.format("%s", d);
	}

	public void mutiplytNumber(ComplexNumber c) {
		double num = (this.realNumber * c.realNumber) + (this.imaginaryNumber * c.imaginaryNumber * -1);
		this.imaginaryNumber = (this.realNumber * c.imaginaryNumber) + (this.imaginaryNumber * c.realNumber);
		this.realNumber = num;
		printNumber();

	}
	
	public ComplexNumber getComplexNumber() {
		
		return this;
	}

}
