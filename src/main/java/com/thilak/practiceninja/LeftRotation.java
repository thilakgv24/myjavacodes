package com.thilak.practiceninja;

public class LeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7};
		rotate(arr, 2);
	}
	
	
	public static void rotate(int[] arr, int d) {
    	//Your code goes here
		//left rotation
		
		int temp [] = new int[d];
		for(int j = 0; j < temp.length;j++) {
			temp[j] = arr[j];
		}
       	int index = 0;
       	System.out.println(arr.length);
        for(int i = 0; i < arr.length; i++){
        	System.out.println(i);
            if(i>=arr.length - d){
                arr[i] = temp[index];
                index++;
            }else{
            	arr[i] = arr[d+i];
            }
            
        }
        
      	/*int i = 0;
        while(i < d){
            int temp = arr[0];
            for(int j = 0; j< arr.length - 1; j++){
                arr[j]= arr[j+1];
            }
            arr[arr.length - 1] = temp;            
            i++;
        }*/
        
        /*int result [] = new int[d];
        for(int i = 0; i < d; i++){
            result[i] = arr[i];
        }
        
        for(int j = 0; j < arr.length - (d); j++){
            arr[j] =arr[j+d];
        }
        int index = 0;
        for(int k = arr.length - d; k< arr.length ; k++){
           
            arr[k] = result[index];
            index++;
        }*/
    }

}
