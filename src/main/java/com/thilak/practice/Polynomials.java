package com.thilak.practice;

public class Polynomials {

	private int[] exponents;

	public Polynomials() {
		exponents = new int[0];
	}

	public void setCoefficinets(int exponent, int constant) {
		if (this.exponents.length == 0) {
			this.exponents = new int[exponent + 1];
		}
		if (this.exponents.length < exponent + 1) {
			int temp[] = this.exponents;
			this.exponents = new int[exponent + 1];
			for (int i = 0; i < temp.length; i++) {
				this.exponents[i] = temp[i];
			}
		}

		exponents[exponent] = constant;

	}

	public void printolynomial() {
		StringBuilder build = new StringBuilder();
		for (int i = 0; i < this.exponents.length; i++) {
			if (this.exponents[i] != 0)
				build.append(this.exponents[i] + "x^" + i + "+");
		}
		System.out.println(build.substring(0, build.length() - 1));
	}

	public int execute(int value) {
		if (this.exponents.length == 0)
			return 0;
		int product = 0;
		for (int i = 0; i <= this.exponents.length - 1; i++) {
			if (this.exponents[i] != 0) {
				int indexValue = this.exponents[i];
				int index = i;
				int newVlaue = 1;
				while (index != 0) {
					newVlaue = newVlaue * value;
					index--;
				}
				product += (indexValue * newVlaue);
			}

		}

		return product;
	}

	public void addPolynomial(Polynomials poly) {
		int index = this.exponents.length;
		if (this.exponents.length > poly.exponents.length)
			index = poly.exponents.length;

		for (int i = 0; i < index; i++) {
			this.exponents[i] = this.exponents[i] + poly.exponents[i];
		}

	}

	public void multiplyPolynomoal(Polynomials poly) {
		int[] newValue = new int[this.exponents.length];
		for (int i = 0; i < this.exponents.length; i++) {

			int arrayValue = this.exponents[i];
			for (int j = 0; j <= poly.exponents.length - 1; j++) {
				if (this.exponents[i] != 0) {

					int resultIndex = i + j;
					int prodValues = arrayValue * poly.exponents[j];

					if (newValue.length <= resultIndex) {
						int[] temp = newValue;
						newValue = new int[resultIndex + 1];
						for (int k = 0; k < temp.length; k++) {
							newValue[k] = temp[k];
						}

					}
					newValue[resultIndex] = newValue[resultIndex] + prodValues;
				}
			}
		}
		this.exponents = newValue;

	}
}
