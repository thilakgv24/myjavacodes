package com.thilak.recusrionninja;

public class FirstArrayIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 58;
		
		//int[] input = { 15,24,58,61,79,3,97,81,81,45,62,21,72,72,68,45,11,50,87,20,28,77,51,89,58,66 };
		int[] input = { 15,24,58,61 };
		System.out.println(firstIndex(input, x));

	}

	
	public static int firstIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		System.out.println();
		if(input.length == 0)
        	return - 1;
        
        if(input[0] == x)
            return 0;
        	
        
         int newArray [] = new int[input.length - 1];
        for(int i = 1; i < input.length; i++){
            newArray[i-1] = input[i];
        }
        System.out.println();
        int outputIndex = firstIndex(newArray, x);
        if(outputIndex == -1){
            return -1;
        }else{
           return outputIndex + 1;
        }
                
	}
}
