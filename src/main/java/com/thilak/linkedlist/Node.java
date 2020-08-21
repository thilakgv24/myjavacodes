package com.thilak.linkedlist;

public class Node<T> {

	T data;
	Node<T> next;

	public Node(T data) {
		this.data = data;
	}
	
	public static void print(Node<?> head) {
		/*
		 * System.out.println(head.data); Node<?> address = head.next; while(address !=
		 * null) { System.out.println(address.data); address = address.next;
		 * 
		 * }
		 */

		Node<?> temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
		
	}
	
	public static void increment(Node<Integer> head){
	    Node<Integer> temp = head;
	    while(temp != null){
	        temp.data++;
	        temp = temp.next;
	    }
	}
	
	public static int length(Node<Integer> head){
		//Your code goes here
        int size = 0;
        Node<Integer> temp = head;
        while(temp != null ){
        	System.out.println(temp.data);
            size++;
            temp = temp.next;
            
        }
        return size;
	}
}
