package com.thilak.testninja;

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);        
        int number = sc.nextInt();
        int choice = sc.nextInt();
        System.out.println(getValue(choice, number));
	}
    
    public static int getValue(int choice, int number){
        int result = 1;
        if(1 == choice){
            for(int i = 2; i <= number ; i++){
                result += i;
            }
            
        }else if (2 == choice){
            for(int i = 2; i <= number ; i++){
                result *= i;
            }
        }else{
            return -1;
        }
        
        return result;
    }
}
