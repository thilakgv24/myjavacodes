package com.thilak.linkedlist;

public class Solution {

	public static int length(LinkedListNode<Integer> head){
		//Your code goes here
        int size = 0;
        LinkedListNode<Integer> temp = head;
        while(temp.data != -1 ){
        	System.out.print(temp.data+"\t");
            size++;
            temp = temp.next;
            System.out.println(temp.data);
            
        }
        return size;
	}

}
