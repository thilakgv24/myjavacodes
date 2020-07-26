package com.thilak.recusrionninja;

public class astLsArrayIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 58;
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
		
		if(input.length == 0)
        	return - 1;
		System.out.println(input[input.length - 1]);
        if(input[input.length - 1] == x)
            return input.length - 1;
        	
        
         int newArray [] = new int[input.length - 1];
        for(int i = 0; i < input.length-1; i++){
            newArray[i] = input[i];
        }
        System.out.println();
        int outputIndex = firstIndex(newArray, x);
        if(outputIndex == -1){
            return -1;
        }else{
           return outputIndex;
        }
                
	}

}
