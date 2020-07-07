package com.thilak.oops;



public class Polynomial {

	
	/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
	 *  then corresponding term(with specified degree and value is added int the polynomial. If the degree
	 *  is already present in the polynomial then previous coefficient is replaced by
	 *  new coefficient value passed as function argument
	*/
    
    //data members
    private int [] polynomialValue;
    
    //Constructor
    public Polynomial(){
        polynomialValue = new int[1];
    }
    
	public void setCoefficient(int degree, int coeff){
		if(this.polynomialValue.length < degree + 1){
            this.increaseSize(degree + 1);
        }
		this.polynomialValue[degree] = coeff;
	}
	
    	
    public void increaseSize(int size){
        int [] temp = this.polynomialValue;
        this.polynomialValue = new int [size];
        for(int index = 0; index < temp.length; index++){
            this.polynomialValue[index] = temp[index];
        }
    }
    
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
		StringBuilder build = new StringBuilder();
		for(int index = 0; index < this.polynomialValue.length; index++){
            if( this.polynomialValue[index] != 0)
                build.append(this.polynomialValue[index]+"x"+index+" ");
        }        
        System.out.println(build);
	}

	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
        Polynomial result = new Polynomial();  
        result.polynomialValue = this.polynomialValue;
        for(int index = 0; index < p.polynomialValue.length; index++){
            if(result.polynomialValue.length < index + 1)
                result.increaseSize(index + 1);            
            result.polynomialValue[index] += p.polynomialValue[index];
        }
		return result;
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
        Polynomial result =new Polynomial();
        result.polynomialValue = this.polynomialValue;
        for(int index = 0; index < p.polynomialValue.length; index++){
            if(result.polynomialValue.length < index + 1)
                result.increaseSize(index + 1);             
            result.polynomialValue[index] -= p.polynomialValue[index];
        }		
		return result;
    }
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
		Polynomial result = new Polynomial();
         for(int index = 0; index < p.polynomialValue.length; index++){             
             if(p.polynomialValue[index] != 0){
                 int currentValue = p.polynomialValue[index];                 
                 for(int muIndex = 0; muIndex < this.polynomialValue.length; muIndex++){                     
                     if(this.polynomialValue[muIndex] != 0){
                         int resultDegree = index + muIndex;
                         int coeffValue = currentValue * this.polynomialValue[muIndex];
                     if(result.polynomialValue.length < resultDegree + 1)
                         result.increaseSize(resultDegree + 1);                         
                         result.polynomialValue[resultDegree] += coeffValue;
                     }//if
                     
                 }//for
        	}       
		}
    return result;
    }
}
