package com.thilak.oops;

import java.util.Scanner;

public class ComaplexNumberNinja {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		int choice = s.nextInt();
		 
		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
	}
}

class ComplexNumbers {
	private int real;
    private int imaginary;
    public static final String IMGVALUE = " i";
    
    public ComplexNumbers(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    
    public void print(){
        if(this.imaginary == 0)
            System.out.println(this.real);
        else if(this.imaginary > 0)
            System.out.println(this.real + " +"+ IMGVALUE + this.imaginary);
        else
            System.out.println(this.real + " -"+ IMGVALUE + (this.imaginary * -1));
    }
    
    public void plus(ComplexNumbers cn){
        this.real = this.real + cn.real;
        this.imaginary = this.imaginary + cn.imaginary;
    }
	
    public void multiply(ComplexNumbers cn){
        int realValue = (this.real * cn.real) - (this.imaginary * cn.imaginary);
        int imaginaryValue = (this.real * cn.imaginary) + (this.imaginary * cn.real);
        this.real = realValue;
        this.imaginary = imaginaryValue;
    }
}

