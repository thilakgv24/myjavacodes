package com.thilak.recusrionninja;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		towerofHanoi(3, 's', 'h', 'd');
		towerOfHanoi(3, 's', 'h', 'd');
	}

	
	public static void towerofHanoi(int n, char s, char h, char d) {
		if(n == 1) {
			System.out.println("move 1st disk from "+s+" to "+d);
			return;
			
		}
		
		towerofHanoi(n-1, s,d,h);
		System.out.println("move "+n+"th disk from "+s+" to "+d);
		towerofHanoi(n-1, h,s,d);
	}
	
	public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
		// Write your code here
        if(disks == 1){
            System.out.println("a c");
        	return;
    	}
        
        towerOfHanoi(disks-1, source, destination, auxiliary);
        System.out.println("b c");
        towerOfHanoi(disks-1, auxiliary, source, destination);   

	}
}
