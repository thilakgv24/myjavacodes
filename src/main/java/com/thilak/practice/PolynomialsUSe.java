package com.thilak.practice;

public class PolynomialsUSe {
	
	public static void main(String[] args) {
	
		Polynomials ply = new Polynomials();
		ply.setCoefficinets(0,3);
			
		ply.setCoefficinets(2, 2);
		ply.printolynomial();	
		
		//System.out.println(ply.execute(100));
		Polynomials ply2 = new Polynomials();
		ply2.setCoefficinets(0,3);
		ply2.setCoefficinets(2,2);
		ply2.setCoefficinets(1,4);
		ply2.setCoefficinets(2,5);
		ply2.printolynomial();
		ply.addPolynomial(ply2);
		ply.printolynomial();
		
		
		Polynomials ply3 = new Polynomials();
		ply3.setCoefficinets(0,3);
		ply3.setCoefficinets(1,2);
		
		Polynomials ply4 = new Polynomials();
		ply4.setCoefficinets(0,3);
		ply4.setCoefficinets(1,2);
		ply4.setCoefficinets(2,6);
		
		ply3.multiplyPolynomoal(ply4);
		ply3.printolynomial();
		
		
	}
}
