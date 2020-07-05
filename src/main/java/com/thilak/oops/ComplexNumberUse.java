package com.thilak.oops;

public class ComplexNumberUse {

	public static void main(String [] args) {
		ComplexNumber cn1 = new ComplexNumber();
		cn1.setRealNumber(4);
		cn1.setImaginaryNumber(5);
		
		ComplexNumber cn2 = new ComplexNumber();
		cn2.setRealNumber(4);
		cn2.setImaginaryNumber(6);
		
		//cn1.addNumber(cn2);
		cn1.mutiplytNumber(cn2);
		System.out.println();
		
		ComplexNumber c4 = ComplexNumber.addNumber(cn1, cn2);
		System.out.println(c4);
	}
}
