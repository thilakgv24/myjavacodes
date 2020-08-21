package com.thilak.test;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(checkSequence("abchjsgsuohhdhyrikkknddg", "coding"));
	}
	
	public static boolean checkSequence(String a, String b) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
        
        char [] arrayValues = a.toCharArray();
        char [] checkValue = b.toCharArray();
        int startIndex = 0;
        boolean result = true;
        for(int i = 0; i <checkValue.length; i++){
            for(int j = startIndex; j < arrayValues.length; j++){
            	System.out.println(arrayValues[j]);
                if(arrayValues[j] == checkValue[i]){
                    startIndex = j;
                    break;
                }else if(j == arrayValues.length - 1){
                    result = false;
                    break;
                }
            }            
        }
	return result;
	}

}
