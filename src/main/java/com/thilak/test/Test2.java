package com.thilak.test;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] s = {1,2,3,4};
System.out.println(splitArray(s));
	}

	
	public static boolean splitArray(int input[]) {
		/* Your class should be named solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
        int [] divisiblethree = new int[input.length];
        int [] divisibletfive = new int[input.length];
        Arrays.sort(input);
        int sumofThree = 0;
        int sumOfFive = 0;
       int divisiblethreeIndex = 0; 
       int divisiblefiveIndex = 0; 
        
        /*for(int i = 0; i < input.length ; i++){
            if(input[i] % 3 == 0){
                divisiblethree[divisiblethreeIndex] = input[i];
                sumofThree += input[i];
                divisiblethreeIndex++;
            }else if(input[i] % 5 == 0){
                 divisibletfive[divisiblefiveIndex] = input[i];
                sumOfFive += input[i];
                divisiblefiveIndex++;
            }else{
                if(sumofThree  > sumOfFive){
                    divisibletfive[divisiblefiveIndex] = input[i];
                	sumOfFive += input[i];
                	divisiblefiveIndex++;
                }else{
                    divisiblethree[divisiblethreeIndex] = input[i];
                	sumofThree += input[i];
                	divisiblethreeIndex++;
                }
            }
        }
        
        */
       
       for(int i = input.length - 1; i >= 0 ; i--){
           if(input[i] % 3 == 0  && input[i] % 5 != 0 ){
               divisiblethree[divisiblethreeIndex] = input[i];
               sumofThree += input[i];
               divisiblethreeIndex++;
           }else if(input[i] % 5 == 0){
                divisibletfive[divisiblefiveIndex] = input[i];
               sumOfFive += input[i];
               divisiblefiveIndex++;
           }else{
               if(sumofThree  < sumOfFive){
                   divisiblethree[divisiblethreeIndex] = input[i];
               	sumofThree += input[i];
               	divisiblethreeIndex++;
               }else{                    
                   divisibletfive[divisiblefiveIndex] = input[i];
               	sumOfFive += input[i];
               	divisiblefiveIndex++;
               }
           }
       }
		if(sumofThree == sumOfFive){
            return true;
        }
        return false;
	}
}
